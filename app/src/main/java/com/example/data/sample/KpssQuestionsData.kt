package com.example.data.sample

import com.example.data.model.Question
import com.example.data.model.Subject
import com.example.data.sample.questions.KpssHardTrialQuestions
import com.example.data.sample.questions.KpssPast2021Questions
import com.example.data.sample.questions.KpssPast2022Questions
import com.example.data.sample.questions.KpssPast2023Questions
import com.example.data.sample.questions.KpssPast2024Questions
import com.example.data.sample.questions.KpssPastEarlierQuestions

object KpssQuestionsData {

    val questions: List<Question> =
        KpssPast2024Questions.list +
        KpssPast2023Questions.list +
        KpssPast2022Questions.list +
        KpssPast2021Questions.list +
        KpssPastEarlierQuestions.list +
        KpssHardTrialQuestions.list

    fun getQuestionsBySubject(subject: Subject): List<Question> {
        return questions.filter { it.subject == subject }
    }

    fun getPastExamQuestions(yearFilter: String? = null): List<Question> {
        return questions.filter { q ->
            q.isPastExam && (yearFilter == null || q.year == yearFilter)
        }
    }

    fun getHardQuestions(): List<Question> {
        return questions.filter { it.difficulty == "Zor" || it.difficulty == "Çok Zor" }
    }

    fun getAvailableYears(): List<String> {
        return questions.mapNotNull { it.year }.distinct().sortedDescending()
    }

    fun getQuestionsForExam(examIndex: Int, limit: Int = 30): List<Question> {
        val shuffled = questions.shuffled()
        return shuffled.take(limit)
    }

    fun getPastExamQuestionsForExam(year: String? = null): List<Question> {
        val filtered = getPastExamQuestions(year)
        return filtered.ifEmpty { questions }
    }

    fun getQuestionById(id: Int): Question? {
        return questions.firstOrNull { it.id == id }
    }
}
