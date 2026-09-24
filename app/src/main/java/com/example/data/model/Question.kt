package com.example.data.model

data class Question(
    val id: Int,
    val subject: Subject,
    val topic: String,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    val difficulty: String = "Orta", // Kolay, Orta, Zor
    val examOrigin: String = "ÖSYM Tarzı"
)
