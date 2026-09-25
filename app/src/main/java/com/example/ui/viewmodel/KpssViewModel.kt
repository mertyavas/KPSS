package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ai.GeminiService
import com.example.data.local.AppDatabase
import com.example.data.local.KpssRepository
import com.example.data.model.ExamResult
import com.example.data.model.Question
import com.example.data.model.Subject
import com.example.data.model.WrongQuestionEntity
import com.example.data.sample.KpssQuestionsData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class KpssViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: KpssRepository
    private val geminiService = GeminiService()

    init {
        val db = AppDatabase.getDatabase(application)
        repository = KpssRepository(db.examResultDao(), db.wrongQuestionDao())
    }

    val examResults: StateFlow<List<ExamResult>> = repository.allExamResults
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val wrongQuestions: StateFlow<List<WrongQuestionEntity>> = repository.allWrongQuestions
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val unmasteredWrongQuestions: StateFlow<List<WrongQuestionEntity>> = repository.unmasteredWrongQuestions
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Exam / Quiz runner state
    private val _isExamActive = MutableStateFlow(false)
    val isExamActive: StateFlow<Boolean> = _isExamActive.asStateFlow()

    private val _activeExamTitle = MutableStateFlow("KPSS Deneme Sınavı")
    val activeExamTitle: StateFlow<String> = _activeExamTitle.asStateFlow()

    private val _activeExamSubject = MutableStateFlow<Subject?>(null)
    val activeExamSubject: StateFlow<Subject?> = _activeExamSubject.asStateFlow()

    private val _currentQuestions = MutableStateFlow<List<Question>>(emptyList())
    val currentQuestions: StateFlow<List<Question>> = _currentQuestions.asStateFlow()

    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex.asStateFlow()

    // Map: questionId -> selectedOptionIndex (0..4)
    private val _userAnswers = MutableStateFlow<Map<Int, Int>>(emptyMap())
    val userAnswers: StateFlow<Map<Int, Int>> = _userAnswers.asStateFlow()

    private val _isExamFinished = MutableStateFlow(false)
    val isExamFinished: StateFlow<Boolean> = _isExamFinished.asStateFlow()

    private val _lastExamSummary = MutableStateFlow<ExamResult?>(null)
    val lastExamSummary: StateFlow<ExamResult?> = _lastExamSummary.asStateFlow()

    // AI Analysis State
    private val _aiReport = MutableStateFlow<String?>(null)
    val aiReport: StateFlow<String?> = _aiReport.asStateFlow()

    private val _isAiAnalyzing = MutableStateFlow(false)
    val isAiAnalyzing: StateFlow<Boolean> = _isAiAnalyzing.asStateFlow()

    private val _aiChatMessages = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val aiChatMessages: StateFlow<List<Pair<String, String>>> = _aiChatMessages.asStateFlow()

    private val _isAiChatLoading = MutableStateFlow(false)
    val isAiChatLoading: StateFlow<Boolean> = _isAiChatLoading.asStateFlow()

    fun startGeneralTrialExam(examNumber: Int = 1) {
        val selected = KpssQuestionsData.getQuestionsForExam(examNumber, limit = 15)
        _activeExamTitle.value = "Genel Yetenek - Genel Kültür Denemesi #$examNumber"
        _activeExamSubject.value = null
        _currentQuestions.value = selected
        _currentQuestionIndex.value = 0
        _userAnswers.value = emptyMap()
        _isExamFinished.value = false
        _isExamActive.value = true
    }

    fun startSubjectQuiz(subject: Subject) {
        val selected = KpssQuestionsData.getQuestionsBySubject(subject)
        _activeExamTitle.value = "${subject.displayName} Özel Testi"
        _activeExamSubject.value = subject
        _currentQuestions.value = selected
        _currentQuestionIndex.value = 0
        _userAnswers.value = emptyMap()
        _isExamFinished.value = false
        _isExamActive.value = true
    }

    fun startPastExamQuiz(year: String? = null) {
        val selected = KpssQuestionsData.getPastExamQuestionsForExam(year)
        _activeExamTitle.value = if (year != null) "$year KPSS Çıkmış Soruları (${selected.size} Soru)" else "Geçmiş Yıllarda Çıkmış KPSS Soruları (${selected.size} Soru)"
        _activeExamSubject.value = null
        _currentQuestions.value = selected
        _currentQuestionIndex.value = 0
        _userAnswers.value = emptyMap()
        _isExamFinished.value = false
        _isExamActive.value = true
    }

    fun startHardQuestionsQuiz() {
        val selected = KpssQuestionsData.getHardQuestions().shuffled()
        _activeExamTitle.value = "🔥 KPSS Zor & Eleme Soruları (${selected.size} Soru)"
        _activeExamSubject.value = null
        _currentQuestions.value = selected.ifEmpty { KpssQuestionsData.questions }
        _currentQuestionIndex.value = 0
        _userAnswers.value = emptyMap()
        _isExamFinished.value = false
        _isExamActive.value = true
    }

    fun selectOption(questionId: Int, optionIndex: Int) {
        if (_isExamFinished.value) return
        val current = _userAnswers.value.toMutableMap()
        current[questionId] = optionIndex
        _userAnswers.value = current
    }

    fun clearOption(questionId: Int) {
        if (_isExamFinished.value) return
        val current = _userAnswers.value.toMutableMap()
        current.remove(questionId)
        _userAnswers.value = current
    }

    fun goToQuestion(index: Int) {
        if (index in 0 until _currentQuestions.value.size) {
            _currentQuestionIndex.value = index
        }
    }

    fun nextQuestion() {
        if (_currentQuestionIndex.value < _currentQuestions.value.size - 1) {
            _currentQuestionIndex.value += 1
        }
    }

    fun previousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value -= 1
        }
    }

    fun submitExam(durationSeconds: Int = 180) {
        val questionsList = _currentQuestions.value
        if (questionsList.isEmpty()) return

        var correctCount = 0
        var wrongCount = 0
        var emptyCount = 0

        viewModelScope.launch {
            for (q in questionsList) {
                val selected = _userAnswers.value[q.id]
                when {
                    selected == null -> {
                        emptyCount++
                    }
                    selected == q.correctAnswerIndex -> {
                        correctCount++
                    }
                    else -> {
                        wrongCount++
                        // Save to wrong questions notebook!
                        val wrongEntity = WrongQuestionEntity(
                            questionId = q.id,
                            subjectName = q.subject.displayName,
                            topic = q.topic,
                            questionText = q.questionText,
                            optionsJoined = q.options.joinToString("|||"),
                            correctAnswerIndex = q.correctAnswerIndex,
                            userWrongIndex = selected,
                            explanation = q.explanation,
                            isMastered = false
                        )
                        repository.saveWrongQuestion(wrongEntity)
                    }
                }
            }

            // KPSS net formula: Net = Doğru - (Yanlış / 4)
            val netScore = (correctCount - (wrongCount * 0.25)).coerceAtLeast(0.0)

            val result = ExamResult(
                title = _activeExamTitle.value,
                subjectTag = _activeExamSubject.value?.displayName ?: "GENEL",
                totalQuestions = questionsList.size,
                correctCount = correctCount,
                wrongCount = wrongCount,
                emptyCount = emptyCount,
                netScore = netScore,
                durationSeconds = durationSeconds
            )

            repository.saveExamResult(result)
            _lastExamSummary.value = result
            _isExamFinished.value = true
        }
    }

    fun exitExam() {
        _isExamActive.value = false
        _isExamFinished.value = false
    }

    // Wrong Questions Actions
    fun markQuestionMastered(id: Long, isMastered: Boolean) {
        viewModelScope.launch {
            repository.setQuestionMastered(id, isMastered)
        }
    }

    fun saveQuestionNote(id: Long, note: String) {
        viewModelScope.launch {
            repository.saveQuestionNote(id, note)
        }
    }

    fun deleteWrongQuestion(id: Long) {
        viewModelScope.launch {
            repository.deleteWrongQuestion(id)
        }
    }

    fun clearMasteredQuestions() {
        viewModelScope.launch {
            repository.clearMastered()
        }
    }

    fun clearExamHistory() {
        viewModelScope.launch {
            repository.clearExamHistory()
        }
    }

    // AI Coaching & Performance Analysis
    fun triggerAiAnalysis() {
        viewModelScope.launch {
            _isAiAnalyzing.value = true
            val results = examResults.value
            val wrongs = wrongQuestions.value
            val result = geminiService.analyzePerformance(results, wrongs)
            result.onSuccess { report ->
                _aiReport.value = report
            }.onFailure { err ->
                _aiReport.value = "Analiz sırasında bir bağlantı hatası oluştu: ${err.message}. Lütfen internet bağlantınızı ve ayarlarınızı kontrol edin."
            }
            _isAiAnalyzing.value = false
        }
    }

    fun askAiCoach(question: String) {
        if (question.isBlank()) return
        val currentHistory = _aiChatMessages.value.toMutableList()
        currentHistory.add(Pair(question, "..."))
        _aiChatMessages.value = currentHistory
        _isAiChatLoading.value = true

        viewModelScope.launch {
            val results = examResults.value
            val wrongs = wrongQuestions.value
            val res = geminiService.askCoach(question, results, wrongs)
            val updated = _aiChatMessages.value.toMutableList()
            if (updated.isNotEmpty()) {
                val answer = res.getOrElse { "Koç şu anda meşgul: ${it.message}" }
                updated[updated.size - 1] = Pair(question, answer)
                _aiChatMessages.value = updated
            }
            _isAiChatLoading.value = false
        }
    }
}
