package com.example.data.model

data class TopicLecture(
    val id: String,
    val subject: Subject,
    val title: String,
    val summary: String,
    val keyPoints: List<String>,
    val kpssCodes: List<String>, // KPSS Şifreleri / Kodlamaları
    val highYieldFacts: List<String>,
    val readTimeMinutes: Int
)
