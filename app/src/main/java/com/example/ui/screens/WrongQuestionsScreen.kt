package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkRemove
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.SentimentSatisfied
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Subject
import com.example.data.model.WrongQuestionEntity
import com.example.ui.theme.AmberAccent
import com.example.ui.theme.AmberDark
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.NavyPrimary

@Composable
fun WrongQuestionsScreen(
    wrongQuestions: List<WrongQuestionEntity>,
    onMarkMastered: (Long, Boolean) -> Unit,
    onSaveNote: (Long, String) -> Unit,
    onDeleteQuestion: (Long) -> Unit,
    onStartTrialExam: () -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedSubjectName by remember { mutableStateOf<String?>(null) }
    var showOnlyUnmastered by remember { mutableStateOf(false) }

    // Re-solving modal state
    var reSolvingQuestion by remember { mutableStateOf<WrongQuestionEntity?>(null) }
    var reSolveSelectedOption by remember { mutableStateOf<Int?>(null) }
    var reSolveChecked by remember { mutableStateOf(false) }

    // Note editing modal state
    var editingNoteQuestion by remember { mutableStateOf<WrongQuestionEntity?>(null) }
    var noteText by remember { mutableStateOf("") }

    val filtered = remember(wrongQuestions, selectedSubjectName, showOnlyUnmastered) {
        wrongQuestions.filter {
            val matchesSubject = selectedSubjectName == null || it.subjectName == selectedSubjectName
            val matchesMastered = !showOnlyUnmastered || !it.isMastered
            matchesSubject && matchesMastered
        }
    }

    val unmasteredCount = wrongQuestions.count { !it.isMastered }
    val masteredCount = wrongQuestions.count { it.isMastered }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("wrong_questions_lazy_column"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Header
        item {
            Text(
                text = "📖 Hatalı Soru Defterim",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Çözdüğün deneme ve testlerde yanlış yaptığın sorular burada toplanır. Tekrar çözerek netlerini yükselt.",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Stats summary card
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = unmasteredCount.toString(),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFDC2626)
                        )
                        Text(
                            text = "Gözden Geçirilecek",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                Card(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = masteredCount.toString(),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = EmeraldSuccess
                        )
                        Text(
                            text = "Öğrenilen / Çözülen",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        // Filter chips and switch
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Switch(
                        checked = showOnlyUnmastered,
                        onCheckedChange = { showOnlyUnmastered = it }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Sadece Hatalıları Göster",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        // Subject filter chips
        item {
            val subjectsList = remember {
                listOf("Tümü") + Subject.values().map { it.displayName }
            }
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(subjectsList) { subj ->
                    val isSelected = (selectedSubjectName == null && subj == "Tümü") || selectedSubjectName == subj
                    FilterChip(
                        selected = isSelected,
                        onClick = {
                            selectedSubjectName = if (subj == "Tümü") null else subj
                        },
                        label = { Text(subj) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }
        }

        if (filtered.isEmpty()) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.SentimentSatisfied,
                            contentDescription = null,
                            tint = EmeraldSuccess,
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Harika! Burada soru yok.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Deneme veya test çözdükçe yanlış yaptığın sorular otomatik olarak buraya eklenecektir.",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = onStartTrialExam,
                            colors = ButtonDefaults.buttonColors(containerColor = NavyPrimary)
                        ) {
                            Text("Hemen Deneme Çöz")
                        }
                    }
                }
            }
        } else {
            items(filtered, key = { it.id }) { question ->
                WrongQuestionCard(
                    question = question,
                    onReSolve = {
                        reSolvingQuestion = question
                        reSolveSelectedOption = null
                        reSolveChecked = false
                    },
                    onToggleMastered = { isMastered ->
                        onMarkMastered(question.id, isMastered)
                    },
                    onEditNote = {
                        editingNoteQuestion = question
                        noteText = question.userNote
                    },
                    onDelete = {
                        onDeleteQuestion(question.id)
                    }
                )
            }
        }
    }

    // Re-Solve Dialog Modal
    if (reSolvingQuestion != null) {
        val q = reSolvingQuestion!!
        val options = q.getOptionsList()

        AlertDialog(
            onDismissRequest = { reSolvingQuestion = null },
            title = {
                Text(
                    text = "🔄 Soruyu Tekrar Çöz: ${q.subjectName}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            },
            text = {
                Column {
                    Text(
                        text = q.questionText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    options.forEachIndexed { idx, opt ->
                        val isSelected = reSolveSelectedOption == idx
                        val isCorrect = idx == q.correctAnswerIndex

                        val bgColor = when {
                            reSolveChecked && isCorrect -> EmeraldSuccess.copy(alpha = 0.2f)
                            reSolveChecked && isSelected && !isCorrect -> Color(0xFFDC2626).copy(alpha = 0.2f)
                            isSelected -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
                            else -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
                        }

                        Surface(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 3.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .clickable(enabled = !reSolveChecked) {
                                    reSolveSelectedOption = idx
                                },
                            color = bgColor,
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = opt,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }

                    if (reSolveChecked) {
                        Spacer(modifier = Modifier.height(8.dp))
                        val isSuccess = reSolveSelectedOption == q.correctAnswerIndex
                        Text(
                            text = if (isSuccess) "🎉 Tebrikler! Doğru cevapladınız." else "❌ Yanlış cevap! Çözümü tekrar gözden geçirin.",
                            color = if (isSuccess) EmeraldSuccess else Color(0xFFDC2626),
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp
                        )
                    }
                }
            },
            confirmButton = {
                if (!reSolveChecked) {
                    Button(
                        onClick = { reSolveChecked = true },
                        enabled = reSolveSelectedOption != null
                    ) {
                        Text("Cevabı Onayla")
                    }
                } else {
                    val isSuccess = reSolveSelectedOption == q.correctAnswerIndex
                    if (isSuccess && !q.isMastered) {
                        Button(
                            onClick = {
                                onMarkMastered(q.id, true)
                                reSolvingQuestion = null
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = EmeraldSuccess)
                        ) {
                            Text("Öğrenildi Olarak İşaretle")
                        }
                    } else {
                        Button(onClick = { reSolvingQuestion = null }) {
                            Text("Kapat")
                        }
                    }
                }
            },
            dismissButton = {
                TextButton(onClick = { reSolvingQuestion = null }) {
                    Text("Vazgeç")
                }
            }
        )
    }

    // Edit Note Dialog
    if (editingNoteQuestion != null) {
        val q = editingNoteQuestion!!
        AlertDialog(
            onDismissRequest = { editingNoteQuestion = null },
            title = { Text("Soruna Not Ekle") },
            text = {
                Column {
                    Text(
                        text = "Bu soruda takıldığın noktayı veya unutmaman gereken kuralı yaz:",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = noteText,
                        onValueChange = { noteText = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = { Text("Örn: İstisnalara dikkat et, Sayıştay yüksek mahkeme değil!") },
                        maxLines = 4
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        onSaveNote(q.id, noteText)
                        editingNoteQuestion = null
                    }
                ) {
                    Text("Kaydet")
                }
            },
            dismissButton = {
                TextButton(onClick = { editingNoteQuestion = null }) {
                    Text("İptal")
                }
            }
        )
    }
}

@Composable
fun WrongQuestionCard(
    question: WrongQuestionEntity,
    onReSolve: () -> Unit,
    onToggleMastered: (Boolean) -> Unit,
    onEditNote: () -> Unit,
    onDelete: () -> Unit
) {
    var showExplanation by remember { mutableStateOf(false) }
    val options = question.getOptionsList()

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("wrong_card_${question.id}"),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            // Subject & Mastered Status
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "${question.subjectName} • ${question.topic}",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                if (question.isMastered) {
                    Surface(
                        color = EmeraldSuccess.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Check, contentDescription = null, tint = EmeraldSuccess, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(3.dp))
                            Text("Öğrenildi", color = EmeraldSuccess, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                } else {
                    Surface(
                        color = Color(0xFFDC2626).copy(alpha = 0.12f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Tekrar Edilmeli",
                            color = Color(0xFFDC2626),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = question.questionText,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Display choices summary
            if (question.userWrongIndex in options.indices) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Yanlış Seçilen: ", fontSize = 12.sp, color = Color(0xFFDC2626), fontWeight = FontWeight.Bold)
                    Text(
                        text = options[question.userWrongIndex],
                        fontSize = 12.sp,
                        color = Color(0xFFDC2626)
                    )
                }
            }

            if (question.correctAnswerIndex in options.indices) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Doğru Cevap: ", fontSize = 12.sp, color = EmeraldSuccess, fontWeight = FontWeight.Bold)
                    Text(
                        text = options[question.correctAnswerIndex],
                        fontSize = 12.sp,
                        color = EmeraldSuccess,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            // User Note if available
            if (question.userNote.isNotBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Surface(
                    color = AmberAccent.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Edit, contentDescription = null, tint = AmberDark, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Notunuz: ${question.userNote}",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            // Expandable explanation
            AnimatedVisibility(visible = showExplanation) {
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.Lightbulb, contentDescription = null, tint = AmberAccent, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("ÖSYM Çözüm ve Açıklaması:", fontWeight = FontWeight.Bold, fontSize = 12.sp)
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = question.explanation,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Action Buttons Strip
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    Button(
                        onClick = onReSolve,
                        colors = ButtonDefaults.buttonColors(containerColor = NavyPrimary),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Icon(Icons.Default.Replay, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Tekrar Çöz", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    OutlinedButton(
                        onClick = { showExplanation = !showExplanation },
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(if (showExplanation) "Gizle" else "Çözüm", fontSize = 12.sp)
                    }
                }

                Row {
                    IconButton(onClick = onEditNote) {
                        Icon(Icons.Default.Edit, contentDescription = "Not Ekle", modifier = Modifier.size(20.dp))
                    }
                    IconButton(
                        onClick = { onToggleMastered(!question.isMastered) }
                    ) {
                        Icon(
                            imageVector = if (question.isMastered) Icons.Default.CheckCircle else Icons.Default.Check,
                            contentDescription = "Öğrenildi Durumu",
                            tint = if (question.isMastered) EmeraldSuccess else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    IconButton(onClick = onDelete) {
                        Icon(Icons.Default.Delete, contentDescription = "Sil", tint = Color(0xFFDC2626), modifier = Modifier.size(20.dp))
                    }
                }
            }
        }
    }
}
