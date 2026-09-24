package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exam_results")
data class ExamResult(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val subjectTag: String, // "GENEL" or subject displayName
    val totalQuestions: Int,
    val correctCount: Int,
    val wrongCount: Int,
    val emptyCount: Int,
    val netScore: Double,
    val durationSeconds: Int,
    val timestamp: Long = System.currentTimeMillis()
)
