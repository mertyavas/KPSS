package com.example.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.Public
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

enum class Subject(
    val displayName: String,
    val shortName: String,
    val questionCount: Int,
    val category: String, // "Genel Yetenek" or "Genel Kültür"
    val color: Color
) {
    TURKCE(
        displayName = "Türkçe",
        shortName = "TRK",
        questionCount = 30,
        category = "Genel Yetenek",
        color = Color(0xFF2563EB) // Blue
    ),
    MATEMATIK(
        displayName = "Matematik & Geometri",
        shortName = "MAT",
        questionCount = 30,
        category = "Genel Yetenek",
        color = Color(0xFF7C3AED) // Purple
    ),
    TARIH(
        displayName = "Tarih",
        shortName = "TAR",
        questionCount = 27,
        category = "Genel Kültür",
        color = Color(0xFFB45309) // Amber/Bronze
    ),
    COGRAFYA(
        displayName = "Coğrafya",
        shortName = "COĞ",
        questionCount = 18,
        category = "Genel Kültür",
        color = Color(0xFF0D9488) // Teal
    ),
    VATANDASLIK(
        displayName = "Vatandaşlık & Anayasa",
        shortName = "VAT",
        questionCount = 9,
        category = "Genel Kültür",
        color = Color(0xFFDC2626) // Crimson
    ),
    GUNCEL_BILGILER(
        displayName = "Güncel Bilgiler",
        shortName = "GÜN",
        questionCount = 6,
        category = "Genel Kültür",
        color = Color(0xFF059669) // Emerald
    );

    val icon: ImageVector
        get() = when (this) {
            TURKCE -> Icons.AutoMirrored.Filled.MenuBook
            MATEMATIK -> Icons.Default.Calculate
            TARIH -> Icons.Default.HistoryEdu
            COGRAFYA -> Icons.Default.Public
            VATANDASLIK -> Icons.Default.AccountBalance
            GUNCEL_BILGILER -> Icons.Default.Newspaper
        }
}
