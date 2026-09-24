package com.example.data.model

data class CurrentAffair(
    val id: String,
    val category: String, // "Uluslararası Örgütler & Zirveler", "Milli Projeler & İlkler", "UNESCO & Kültür Mirası", "2024-2026 Olayları"
    val title: String,
    val dateOrPeriod: String,
    val details: String,
    val examImportance: String,
    val tags: List<String>
)
