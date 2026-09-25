package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.model.Subject
import com.example.reminder.NotificationHelper
import com.example.ui.screens.AiAnalysisScreen
import com.example.ui.screens.CurrentAffairsScreen
import com.example.ui.screens.ExamScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.LecturesScreen
import com.example.ui.screens.RemindersSettingsScreen
import com.example.ui.screens.WrongQuestionsScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.theme.NavyPrimary
import com.example.ui.viewmodel.KpssViewModel

enum class AppDestination(val label: String, val icon: ImageVector) {
    HOME("Ana Sayfa", Icons.Default.Home),
    LECTURES("Konular", Icons.AutoMirrored.Filled.MenuBook),
    WRONG_QUESTIONS("Hata Defteri", Icons.Default.Bookmark),
    AI_ANALYSIS("AI Analiz", Icons.Default.AutoAwesome),
    CURRENT_AFFAIRS("Güncel", Icons.Default.Newspaper),
    REMINDERS("Hatırlatıcı", Icons.Default.Notifications)
}

class MainActivity : ComponentActivity() {

    private val viewModel: KpssViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Initialize reminder notification channel
        NotificationHelper.createNotificationChannel(this)

        setContent {
            MyApplicationTheme {
                MainAppContent(viewModel = viewModel)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppContent(viewModel: KpssViewModel) {
    var currentDestination by remember { mutableStateOf(AppDestination.HOME) }

    val examResults by viewModel.examResults.collectAsStateWithLifecycle()
    val wrongQuestions by viewModel.wrongQuestions.collectAsStateWithLifecycle()
    val unmasteredCount = wrongQuestions.count { !it.isMastered }

    val isExamActive by viewModel.isExamActive.collectAsStateWithLifecycle()
    val activeTitle by viewModel.activeExamTitle.collectAsStateWithLifecycle()
    val activeQuestions by viewModel.currentQuestions.collectAsStateWithLifecycle()
    val currentQIndex by viewModel.currentQuestionIndex.collectAsStateWithLifecycle()
    val userAnswers by viewModel.userAnswers.collectAsStateWithLifecycle()
    val isExamFinished by viewModel.isExamFinished.collectAsStateWithLifecycle()
    val lastSummary by viewModel.lastExamSummary.collectAsStateWithLifecycle()

    val aiReport by viewModel.aiReport.collectAsStateWithLifecycle()
    val isAiAnalyzing by viewModel.isAiAnalyzing.collectAsStateWithLifecycle()
    val chatMessages by viewModel.aiChatMessages.collectAsStateWithLifecycle()
    val isChatLoading by viewModel.isAiChatLoading.collectAsStateWithLifecycle()

    // If an exam is currently running, show ExamScreen full view
    if (isExamActive) {
        ExamScreen(
            title = activeTitle,
            questions = activeQuestions,
            currentIndex = currentQIndex,
            userAnswers = userAnswers,
            isFinished = isExamFinished,
            lastSummary = lastSummary,
            onSelectOption = { qId, optIdx -> viewModel.selectOption(qId, optIdx) },
            onClearOption = { qId -> viewModel.clearOption(qId) },
            onGoToIndex = { idx -> viewModel.goToQuestion(idx) },
            onNext = { viewModel.nextQuestion() },
            onPrevious = { viewModel.previousQuestion() },
            onSubmit = { duration -> viewModel.submitExam(duration) },
            onExit = { viewModel.exitExam() }
        )
        return
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = when (currentDestination) {
                            AppDestination.HOME -> "KPSS Hazırlık"
                            AppDestination.LECTURES -> "Konu Anlatımları"
                            AppDestination.WRONG_QUESTIONS -> "Hatalı Soru Defteri"
                            AppDestination.AI_ANALYSIS -> "Yapay Zeka KPSS Koçu"
                            AppDestination.CURRENT_AFFAIRS -> "Güncel Bilgiler"
                            AppDestination.REMINDERS -> "Çalışma Hatırlatıcıları"
                        },
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                actions = {
                    if (currentDestination != AppDestination.REMINDERS) {
                        IconButton(
                            onClick = { currentDestination = AppDestination.REMINDERS },
                            modifier = Modifier.testTag("open_reminders_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Hatırlatıcı Ayarları",
                                tint = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                modifier = Modifier.testTag("main_bottom_nav")
            ) {
                val navItems = listOf(
                    AppDestination.HOME,
                    AppDestination.LECTURES,
                    AppDestination.WRONG_QUESTIONS,
                    AppDestination.AI_ANALYSIS,
                    AppDestination.CURRENT_AFFAIRS
                )

                navItems.forEach { destination ->
                    val isSelected = currentDestination == destination

                    NavigationBarItem(
                        selected = isSelected,
                        onClick = { currentDestination = destination },
                        icon = {
                            if (destination == AppDestination.WRONG_QUESTIONS && unmasteredCount > 0) {
                                BadgedBox(
                                    badge = {
                                        Badge {
                                            Text(unmasteredCount.toString())
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector = destination.icon,
                                        contentDescription = destination.label,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            } else {
                                Icon(
                                    imageVector = destination.icon,
                                    contentDescription = destination.label,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        },
                        label = {
                            Text(
                                text = destination.label,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                fontSize = 11.sp
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = NavyPrimary,
                            indicatorColor = MaterialTheme.colorScheme.primaryContainer
                        ),
                        modifier = Modifier.testTag("nav_item_${destination.name}")
                    )
                }
            }
        }
    ) { innerPadding ->
        Crossfade(
            targetState = currentDestination,
            modifier = Modifier.padding(innerPadding)
        ) { destination ->
            when (destination) {
                AppDestination.HOME -> HomeScreen(
                    examResults = examResults,
                    wrongQuestions = wrongQuestions,
                    onStartTrialExam = { viewModel.startGeneralTrialExam(examNumber = 1) },
                    onStartSubjectQuiz = { subject -> viewModel.startSubjectQuiz(subject) },
                    onStartPastExamQuiz = { year -> viewModel.startPastExamQuiz(year) },
                    onStartHardQuestionsQuiz = { viewModel.startHardQuestionsQuiz() },
                    onNavigateToLectures = { currentDestination = AppDestination.LECTURES },
                    onNavigateToCurrentAffairs = { currentDestination = AppDestination.CURRENT_AFFAIRS },
                    onNavigateToWrongQuestions = { currentDestination = AppDestination.WRONG_QUESTIONS },
                    onNavigateToAiAnalysis = { currentDestination = AppDestination.AI_ANALYSIS },
                    onNavigateToReminders = { currentDestination = AppDestination.REMINDERS }
                )

                AppDestination.LECTURES -> LecturesScreen(
                    onStartSubjectQuiz = { subject -> viewModel.startSubjectQuiz(subject) }
                )

                AppDestination.WRONG_QUESTIONS -> WrongQuestionsScreen(
                    wrongQuestions = wrongQuestions,
                    onMarkMastered = { id, mastered -> viewModel.markQuestionMastered(id, mastered) },
                    onSaveNote = { id, note -> viewModel.saveQuestionNote(id, note) },
                    onDeleteQuestion = { id -> viewModel.deleteWrongQuestion(id) },
                    onStartTrialExam = { viewModel.startGeneralTrialExam(examNumber = 1) }
                )

                AppDestination.AI_ANALYSIS -> AiAnalysisScreen(
                    examResults = examResults,
                    wrongQuestions = wrongQuestions,
                    aiReport = aiReport,
                    isAnalyzing = isAiAnalyzing,
                    chatMessages = chatMessages,
                    isChatLoading = isChatLoading,
                    onTriggerAnalysis = { viewModel.triggerAiAnalysis() },
                    onAskCoach = { question -> viewModel.askAiCoach(question) }
                )

                AppDestination.CURRENT_AFFAIRS -> CurrentAffairsScreen(
                    onStartQuiz = { viewModel.startSubjectQuiz(Subject.GUNCEL_BILGILER) }
                )

                AppDestination.REMINDERS -> RemindersSettingsScreen(
                    onNavigateBack = { currentDestination = AppDestination.HOME }
                )
            }
        }
    }
}
