package com.example.data.ai

import com.example.BuildConfig
import com.example.data.model.ExamResult
import com.example.data.model.WrongQuestionEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

class GeminiService {

    private val client = OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build()

    private val jsonMediaType = "application/json; charset=utf-8".toMediaType()

    suspend fun analyzePerformance(
        examResults: List<ExamResult>,
        wrongQuestions: List<WrongQuestionEntity>,
        userGoalScore: String = "85+ Net Hedefi"
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = BuildConfig.GEMINI_API_KEY
        if (apiKey.isBlank() || apiKey == "MY_GEMINI_API_KEY") {
            // Provide a rich, smart local analysis if API key is not yet set in Secrets
            return@withContext Result.success(
                generateLocalAnalysisFallback(examResults, wrongQuestions)
            )
        }

        val prompt = buildAnalysisPrompt(examResults, wrongQuestions, userGoalScore)

        try {
            val responseText = executeGeminiRequest(apiKey, prompt)
            Result.success(responseText)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun askCoach(
        question: String,
        recentResults: List<ExamResult>,
        wrongQuestions: List<WrongQuestionEntity>
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = BuildConfig.GEMINI_API_KEY
        if (apiKey.isBlank() || apiKey == "MY_GEMINI_API_KEY") {
            return@withContext Result.success(
                "Yapay zeka koçunuzdan canlı yanıt alabilmek için lütfen AI Studio Secrets panelinden 'GEMINI_API_KEY' anahtarınızı tanımlayın. Şu anlık yerel analiz modundasınız: Soru defterinizdeki ${wrongQuestions.size} hatalı soruyu tekrar çözerek en az %20 net artışı sağlayabilirsiniz!"
            )
        }

        val contextInfo = "Öğrencinin çözdüğü test sayısı: ${recentResults.size}, biriken hatalı soru sayısı: ${wrongQuestions.size}. " +
                "En çok hata yapılan konular: " + wrongQuestions.take(5).joinToString(", ") { "${it.subjectName}: ${it.topic}" }

        val prompt = """
            Sen Türkiye'deki KPSS (Kamu Personel Seçme Sınavı - Lisans / Önlisans / Ortaöğretim) alanında uzman, tecrübeli ve motivasyon verici bir KPSS Rehberlik & Eğitim Koçusun.
            Adayın profili: $contextInfo
            
            Adayın sana sorusu: "$question"
            
            Lütfen adaya KPSS sınav formatına, ÖSYM'nin soru tarzına ve pedagojik öğrenme tekniklerine uygun, son derece net, somut, pratik tavsiyeler ve hafıza teknikleri (kodlama/şifreleme önerileri) içeren Türkçe bir cevap ver.
        """.trimIndent()

        try {
            val responseText = executeGeminiRequest(apiKey, prompt)
            Result.success(responseText)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun executeGeminiRequest(apiKey: String, prompt: String): String {
        val url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-3.5-flash:generateContent?key=$apiKey"

        val jsonBody = JSONObject().apply {
            val contentsArray = JSONArray().apply {
                val contentObj = JSONObject().apply {
                    val partsArray = JSONArray().apply {
                        val partObj = JSONObject().apply {
                            put("text", prompt)
                        }
                        put(partObj)
                    }
                    put("parts", partsArray)
                }
                put(contentObj)
            }
            put("contents", contentsArray)

            val systemInstruction = JSONObject().apply {
                val partsArray = JSONArray().apply {
                    put(JSONObject().apply {
                        put("text", "Sen Türkiye KPSS sınavına hazırlanan adaylar için kıdemli bir yapay zeka sınav koçu ve analiz uzmanısın. Yanıtlarını Türkçe, yapılandırılmış, profesyonel ve cesaret verici bir dille hazırla.")
                    })
                }
                put("parts", partsArray)
            }
            put("systemInstruction", systemInstruction)
        }

        val request = Request.Builder()
            .url(url)
            .post(jsonBody.toString().toRequestBody(jsonMediaType))
            .build()

        val response = client.newCall(request).execute()
        if (!response.isSuccessful) {
            throw Exception("Gemini API isteği başarısız oldu: HTTP ${response.code} ${response.message}")
        }

        val responseBody = response.body?.string() ?: throw Exception("Boş yanıt alındı")
        val jsonResponse = JSONObject(responseBody)
        val candidates = jsonResponse.optJSONArray("candidates")
        if (candidates == null || candidates.length() == 0) {
            throw Exception("Gemini yanıt üretemedi")
        }

        val firstCandidate = candidates.getJSONObject(0)
        val content = firstCandidate.getJSONObject("content")
        val parts = content.getJSONArray("parts")
        val textBuilder = StringBuilder()
        for (i in 0 until parts.length()) {
            val part = parts.getJSONObject(i)
            textBuilder.append(part.optString("text", ""))
        }

        return textBuilder.toString()
    }

    private fun buildAnalysisPrompt(
        examResults: List<ExamResult>,
        wrongQuestions: List<WrongQuestionEntity>,
        userGoalScore: String
    ): String {
        val totalExams = examResults.size
        val avgNet = if (totalExams > 0) examResults.map { it.netScore }.average() else 0.0
        val lastNet = examResults.firstOrNull()?.netScore ?: 0.0

        val wrongBySubject = wrongQuestions.groupBy { it.subjectName }
            .map { (subj, list) -> "$subj: ${list.size} hatalı soru" }
            .joinToString("; ")

        val wrongTopics = wrongQuestions.take(8).map { "${it.subjectName} -> ${it.topic}" }.distinct()

        return """
            Aşağıdaki KPSS adayının deneme sınavı ve test verilerini analiz et ve kapsamlı bir KPSS Performans Raporu ve Yol Haritası çıkar:
            
            - Çözülen Deneme / Test Sayısı: $totalExams
            - Ortalama Net: ${"%.2f".format(avgNet)} Net
            - Son Sınav Neti: ${"%.2f".format(lastNet)} Net
            - Hedef: $userGoalScore
            - Hata Yapılan Dersler: $wrongBySubject
            - Soru Defterinde Biriken Hatalı Konular: ${wrongTopics.joinToString(", ")}
            
            Lütfen yanıtında şu başlıkları belirgin ve detaylı olarak sun:
            1. 📊 Genel Durum & Seviye Tespiti (ÖSYM skalasında tahmini durum)
            2. ⚠️ Kritik Eksik Konular & Acil Müdahale Listesi
            3. 🎯 Ders Bazlı Başarı Analizi (Türkçe, Matematik, Tarih, Coğrafya, Vatandaşlık, Güncel)
            4. 📅 7 Günlük Kişiye Özel Çalışma Programı (Hangi gün hangi konuya odaklanmalı)
            5. 💡 KPSS Sınav Stratejisi (Turlama tekniği, zaman yönetimi, 4 yanlış 1 doğru kuralı)
        """.trimIndent()
    }

    private fun generateLocalAnalysisFallback(
        examResults: List<ExamResult>,
        wrongQuestions: List<WrongQuestionEntity>
    ): String {
        val totalExams = examResults.size
        val avgNet = if (totalExams > 0) examResults.map { it.netScore }.average() else 0.0
        val totalWrongs = wrongQuestions.size

        val subjectGroups = wrongQuestions.groupBy { it.subjectName }
        val weakSubject = subjectGroups.maxByOrNull { it.value.size }?.key ?: "Tarih & Vatandaşlık"

        return """
            📊 KPSS Performans Analiz Raporu (Akıllı Değerlendirme)
            
            🎯 Genel Değerlendirme:
            Şu ana kadar $totalExams sınav/test tamamladınız. Ortalama netiniz ${"%.2f".format(avgNet)} olarak hesaplandı. Soru defterinizde toplam $totalWrongs adet hatalı soru kayıtlı.
            
            ⚠️ Öncelikli Gelişim Alanı:
            En fazla hata yaptığınız ders: $weakSubject. Bu alandaki hatalarınızı gidermek genel KPSS puanınızı doğrudan 6-10 puan yukarı taşıyacaktır.
            
            🎯 Ders Bazlı Öneriler:
            • Tarih & Vatandaşlık: Kodlama ve şifreleme yöntemleriyle kavramları pekiştirin. Anayasa'da 1982 anayasa değişikliklerine ve yüksek mahkemelere dikkat edin.
            • Coğrafya: Harita çalışması yapın; platolar ve madenler harita üzerinden görsel hafıza ile çok daha kalıcı öğrenilir.
            • Türkçe & Matematik: Her gün en az 20 paragraf ve 15 problem çözerek hız ve kondisyon kazanın.
            
            📅 Tavsiye Edilen 7 Günlük Plan:
            • Pazartesi & Salı: $weakSubject konu tekrarı ve hata defterindeki soruları baştan çözme.
            • Çarşamba: Coğrafya harita çalışması + 30 soru.
            • Perşembe: Vatandaşlık kavram haritaları + 20 soru.
            • Cuma: Türkçe Paragraf taktikleri + Matematik Problemler.
            • Cumartesi: 1 Adet Tam Genel Yetenek - Genel Kültür Denemesi.
            • Pazar: Yanlış analizi ve dinlenme.
            
            💡 İpucu: AI Studio Secrets panelinden GEMINI_API_KEY anahtarınızı ekleyerek canlı derinlemesine yapay zeka analizine geçiş yapabilirsiniz.
        """.trimIndent()
    }
}
