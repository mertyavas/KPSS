package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wrong_questions")
data class WrongQuestionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val questionId: Int,
    val subjectName: String, // from Subject.name
    val topic: String,
    val questionText: String,
    val optionsJoined: String, // Delimited by "|||"
    val correctAnswerIndex: Int,
    val userWrongIndex: Int,
    val explanation: String,
    val timestamp: Long = System.currentTimeMillis(),
    val isMastered: Boolean = false,
    val userNote: String = ""
) {
    fun getOptionsList(): List<String> {
        return optionsJoined.split("|||")
    }
}
