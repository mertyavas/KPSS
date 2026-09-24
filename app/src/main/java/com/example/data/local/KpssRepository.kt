package com.example.data.local

import com.example.data.model.ExamResult
import com.example.data.model.WrongQuestionEntity
import kotlinx.coroutines.flow.Flow

class KpssRepository(
    private val examResultDao: ExamResultDao,
    private val wrongQuestionDao: WrongQuestionDao
) {
    val allExamResults: Flow<List<ExamResult>> = examResultDao.getAllResults()
    val allWrongQuestions: Flow<List<WrongQuestionEntity>> = wrongQuestionDao.getAllWrongQuestions()
    val unmasteredWrongQuestions: Flow<List<WrongQuestionEntity>> = wrongQuestionDao.getUnmastered()

    fun getWrongQuestionsBySubject(subjectName: String): Flow<List<WrongQuestionEntity>> {
        return wrongQuestionDao.getBySubject(subjectName)
    }

    suspend fun saveExamResult(result: ExamResult): Long {
        return examResultDao.insertResult(result)
    }

    suspend fun saveWrongQuestion(wrongQuestion: WrongQuestionEntity): Long {
        return wrongQuestionDao.insertWrongQuestion(wrongQuestion)
    }

    suspend fun setQuestionMastered(id: Long, mastered: Boolean) {
        wrongQuestionDao.updateMasteredStatus(id, mastered)
    }

    suspend fun saveQuestionNote(id: Long, note: String) {
        wrongQuestionDao.updateUserNote(id, note)
    }

    suspend fun deleteWrongQuestion(id: Long) {
        wrongQuestionDao.deleteById(id)
    }

    suspend fun clearMastered() {
        wrongQuestionDao.clearMastered()
    }

    suspend fun clearExamHistory() {
        examResultDao.clearAll()
    }
}
