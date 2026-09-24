package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.model.WrongQuestionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WrongQuestionDao {
    @Query("SELECT * FROM wrong_questions ORDER BY timestamp DESC")
    fun getAllWrongQuestions(): Flow<List<WrongQuestionEntity>>

    @Query("SELECT * FROM wrong_questions WHERE subjectName = :subjectName ORDER BY timestamp DESC")
    fun getBySubject(subjectName: String): Flow<List<WrongQuestionEntity>>

    @Query("SELECT * FROM wrong_questions WHERE isMastered = 0 ORDER BY timestamp DESC")
    fun getUnmastered(): Flow<List<WrongQuestionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWrongQuestion(wrongQuestion: WrongQuestionEntity): Long

    @Query("UPDATE wrong_questions SET isMastered = :isMastered WHERE id = :id")
    suspend fun updateMasteredStatus(id: Long, isMastered: Boolean)

    @Query("UPDATE wrong_questions SET userNote = :note WHERE id = :id")
    suspend fun updateUserNote(id: Long, note: String)

    @Query("DELETE FROM wrong_questions WHERE id = :id")
    suspend fun deleteById(id: Long)

    @Query("DELETE FROM wrong_questions WHERE isMastered = 1")
    suspend fun clearMastered()

    @Query("SELECT COUNT(*) FROM wrong_questions WHERE questionId = :questionId AND isMastered = 0")
    suspend fun countUnmasteredByQuestionId(questionId: Int): Int
}
