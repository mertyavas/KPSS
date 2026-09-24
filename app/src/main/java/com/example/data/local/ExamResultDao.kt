package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.model.ExamResult
import kotlinx.coroutines.flow.Flow

@Dao
interface ExamResultDao {
    @Query("SELECT * FROM exam_results ORDER BY timestamp DESC")
    fun getAllResults(): Flow<List<ExamResult>>

    @Query("SELECT * FROM exam_results ORDER BY timestamp DESC LIMIT :limit")
    fun getRecentResults(limit: Int): Flow<List<ExamResult>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertResult(result: ExamResult): Long

    @Query("DELETE FROM exam_results")
    suspend fun clearAll()

    @Query("SELECT COUNT(*) FROM exam_results")
    suspend fun getTotalExamsCount(): Int
}
