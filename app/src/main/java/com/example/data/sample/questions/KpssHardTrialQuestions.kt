package com.example.data.sample.questions

import com.example.data.model.Question
import com.example.data.model.Subject

object KpssHardTrialQuestions {
    val list: List<Question> = listOf(
        Question(
            id = 5001,
            subject = Subject.TARIH,
            topic = "I. Dünya Savaşı & Gizli Antlaşmalar",
            questionText = "I. Dünya Savaşı sırasında İtilaf Devletleri arasında imzalanan ve Boğazlar ile İstanbul'un Çarlık Rusyası'na verilmesini öngören ilk gizli antlaşma hangisidir?",
            options = listOf(
                "A) Londra Antlaşması (1915)",
                "B) Boğazlar (İstanbul) Antlaşması (1915)",
                "C) Sykes-Picot Antlaşması (1916)",
                "D) Saint-Jean de Maurienne Antlaşması (1917)",
                "E) Petrograd Protokolü (1916)"
            ),
            correctAnswerIndex = 1,
            explanation = "1915 Boğazlar (İstanbul) Antlaşması ile İngiltere ve Fransa, savaşa devam etmesini sağlamak amacıyla İstanbul, Boğazlar ve Marmara kıyılarını Çarlık Rusyası'na vadetmiştir. Bolşevik İhtilali sonrası Rusya bu gizli antlaşmaları 'Sarı Kitap' ile dünyaya ifşa etmiştir.",
            difficulty = "Çok Zor",
            examOrigin = "ÖSYM Tarzı Zor Soru",
            year = "2024"
        ),
        Question(
            id = 5002,
            subject = Subject.COGRAFYA,
            topic = "Toprak Tipleri ve Bitki Örtüsü",
            questionText = "Doğu Anadolu'da Erzurum-Kars ve Ardahan platolarında gür çayır örtüsü altında gelişen, organik madde ve humus bakımından dünyanın en verimli toprağı olmasına karşın iklim koşulları nedeniyle tarımsal kullanım alanı sınırlı olan zonal toprak türü hangisidir?",
            options = listOf(
                "A) Terra Rossa",
                "B) Podzol",
                "C) Çernezyom (Kara Toprak)",
                "D) Kahverengi Orman",
                "E) Regosol"
            ),
            correctAnswerIndex = 2,
            explanation = "Çernezyom (Kara toprak), sert karasal iklimin hüküm sürdüğü yaz yağışlı dağ çayırları altında oluşur. Humus bakımından dünyanın en verimli toprağıdır ancak kışlar çok sert ve uzun sürdüğü için tarım yerine büyükbaş mera hayvancılığı yapılır.",
            difficulty = "Zor",
            examOrigin = "ÖSYM Tarzı Zor Soru",
            year = "2024"
        ),
        Question(
            id = 5003,
            subject = Subject.VATANDASLIK,
            topic = "Anayasa Yargısı - Soyut Norm",
            questionText = "1982 Anayasası'na göre kanunların Resmî Gazete'de yayımlanmasından itibaren Anayasa Mahkemesinde İPTAL DAVASI (Soyut Norm Denetimi) açabilme süresi EN FAZLA kaç gündür?",
            options = listOf(
                "A) 15 gün",
                "B) 30 gün",
                "C) 45 gün",
                "D) 60 gün",
                "E) 90 gün"
            ),
            correctAnswerIndex = 3,
            explanation = "Kanunların, CBK'ların ve TBMM İçtüzüğünün iptali için doğrudan doğruya iptal davası açma hakkı, Resmî Gazete'de yayımlandıkları günden başlayarak 60 GÜN sonra düşer. (Şekil bozukluğu iddiasıyla anayasa değişikliklerinde ise süre 10 gündür).",
            difficulty = "Zor",
            examOrigin = "ÖSYM Tarzı Zor Soru",
            year = "2023"
        ),
        Question(
            id = 5004,
            subject = Subject.TURKCE,
            topic = "Sözel Mantık",
            questionText = "A, B, C, D, E adlı beş kişi bir yarışta ilk 5 dereceyi paylaşmıştır. C yarışı B'den hemen sonra, A'dan ise önce bitirmiştir. E yarışı sonuncu bitirmemiştir ve D birinci değildir. Bu bilgilere göre yarışın BİRİNCİSİ kesinlikle kimdir?",
            options = listOf(
                "A) A",
                "B) B",
                "C) C",
                "D) E",
                "E) D"
            ),
            correctAnswerIndex = 1,
            explanation = "Blok sıralama kuralı: 'C yarışı B'den hemen sonra bitirmiştir' => [B - C] ayrılmaz bloğu vardır. 'A'dan önce bitirmiştir' => A C'den sonradır: [B - C ... A]. D 1. değil, E sonuncu değil. B'nin 1. olması halinde [1: B, 2: C, 3: E, 4: D, 5: A] tüm koşullar eksiksiz sağlanır. Yarışın birincisi B'dir.",
            difficulty = "Zor",
            examOrigin = "ÖSYM Tarzı Zor Soru",
            year = "2023"
        ),
        Question(
            id = 5005,
            subject = Subject.MATEMATIK,
            topic = "Kombinasyon ve Olasılık",
            questionText = "5 doktor ve 4 hemşire arasından 4 kişilik bir sağlık ekibi seçilecektir. Ekipte EN AZ 2 doktorun bulunması şartıyla bu seçim kaç farklı şekilde yapılabilir?",
            options = listOf(
                "A) 95",
                "B) 105",
                "C) 115",
                "D) 120",
                "E) 126"
            ),
            correctAnswerIndex = 1,
            explanation = "Tüm durumlar C(9, 4) = (9*8*7*6) / (4*3*2*1) = 126.\nİstenmeyen durumlar: En az 2 doktorun OLMADIĞI durumlar (0 doktor veya 1 doktor):\n- 0 doktor (4 hemşire): C(5, 0) * C(4, 4) = 1 * 1 = 1.\n- 1 doktor (1 doktor, 3 hemşire): C(5, 1) * C(4, 3) = 5 * 4 = 20.\nİstenmeyen toplam = 1 + 20 = 21.\nİstenen durum sayısı = 126 - 21 = 105 bulunur.",
            difficulty = "Zor",
            examOrigin = "ÖSYM Tarzı Zor Soru",
            year = "2024"
        ),
        Question(
            id = 5006,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Milli Savunma & Havacılık",
            questionText = "21 Şubat 2024 tarihinde ilk uçuşunu başarıyla gerçekleştiren, Türkiye'nin 5. nesil milli muharip savaş uçağının resmi adı hangisidir?",
            options = listOf(
                "A) HÜRJET",
                "B) KAAN",
                "C) KIZILELMA",
                "D) ANKA-3",
                "E) ŞİMŞEK"
            ),
            correctAnswerIndex = 1,
            explanation = "TUSAŞ tarafından üretilen ve radar görünmezliğine sahip Türkiye'nin 5. nesil milli muharip savaş uçağının adı KAAN'dır.",
            difficulty = "Kolay",
            examOrigin = "2024 Güncel",
            year = "2024"
        )
    )
}
