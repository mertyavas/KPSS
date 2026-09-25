package com.example.data.model

data class Question(
    val id: Int,
    val subject: Subject,
    val topic: String,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    val difficulty: String = "Orta", // Kolay, Orta, Zor, Çok Zor
    val examOrigin: String = "ÖSYM Tarzı",
    val year: String? = null // e.g. "2024", "2023", "2022", "2021", "2020", "2019", "2018"
) {
    val isPastExam: Boolean
        get() = !year.isNullOrBlank() || examOrigin.contains("KPSS", ignoreCase = true)

    val formattedExamBadge: String
        get() = if (!year.isNullOrBlank()) {
            if (examOrigin.contains("KPSS", ignoreCase = true)) examOrigin else "$year KPSS"
        } else {
            examOrigin
        }
}

