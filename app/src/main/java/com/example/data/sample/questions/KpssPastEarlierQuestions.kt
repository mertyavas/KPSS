package com.example.data.sample.questions

import com.example.data.model.Question
import com.example.data.model.Subject

object KpssPastEarlierQuestions {
    val list: List<Question> = listOf(
        // --- 2020 KPSS ---
        Question(
            id = 2001,
            subject = Subject.TARIH,
            topic = "Lozan Barış Antlaşması",
            questionText = "24 Temmuz 1923'te imzalanan Lozan Barış Antlaşması'nda çözülemeyip Türkiye ile İngiltere arasında ikili görüşmelere bırakılan sınır meselesi aşağıdakilerden hangisidir?",
            options = listOf(
                "A) Suriye Sınırı (Hatay)",
                "B) Irak Sınırı (Musul Meselesi)",
                "C) Batı Trakya (Yunanistan Sınırı)",
                "D) Boğazlar Bölgesi",
                "E) Doğu Sınırı (Kars)"
            ),
            correctAnswerIndex = 1,
            explanation = "Lozan'da karara bağlanamayan tek sınır Irak (Musul) sınırıdır. 9 ay içinde Türkiye ile İngiltere'nin ikili müzakerelerine bırakılmıştır. 1926 Ankara Antlaşması ile çözümlenmiştir.",
            difficulty = "Orta",
            examOrigin = "2020 KPSS Lisans",
            year = "2020"
        ),
        Question(
            id = 2002,
            subject = Subject.COGRAFYA,
            topic = "Madenler ve Enerji",
            questionText = "Elektrik ve elektronik sanayisinde iletkenliği nedeniyle yoğun olarak kullanılan; Artvin (Murgul), Rize (Çayeli), Kastamonu (Küre) ve Elazığ (Maden)'da çıkarılan maden hangisidir?",
            options = listOf(
                "A) Boksit",
                "B) Bakır",
                "C) Krom",
                "D) Manganez",
                "E) Kurşun-Çinko"
            ),
            correctAnswerIndex = 1,
            explanation = "Bakır (KADER şifresi: Kastamonu-Küre, Artvin-Murgul, Diyarbakır-Ergani, Elazığ-Maden, Rize-Çayeli). Çıkarılan bakır Samsun Bakır İşletmeleri'nde ve Murgul'da işlenir.",
            difficulty = "Orta",
            examOrigin = "2020 KPSS Lisans",
            year = "2020"
        ),
        Question(
            id = 2003,
            subject = Subject.VATANDASLIK,
            topic = "Temel Hukuk - Ehliyetler",
            questionText = "Türk Medeni Kanunu'na göre ayırt etme gücüne sahip ve 18 yaşını doldurmuş, hakkında kısıtlılık kararı bulunmayan bir kişi hangi ehliyet grubundadır?",
            options = listOf(
                "A) Tam Ehliyetli",
                "B) Sınırlı Ehliyetli",
                "C) Sınırlı Ehliyetsiz",
                "D) Tam Ehliyetsiz",
                "E) Yarı Ehliyetli"
            ),
            correctAnswerIndex = 0,
            explanation = "Fiil ehliyetinin üç şartına (Ayırt etme gücü, erginlik, kısıtlı olmama) eksiksiz sahip olan ve kendisine yasal danışman atanmamış kişiler 'Tam Ehliyetli' grubundadır.",
            difficulty = "Kolay",
            examOrigin = "2020 KPSS Lisans",
            year = "2020"
        ),
        Question(
            id = 2004,
            subject = Subject.TURKCE,
            topic = "Cümlenin Ögeleri",
            questionText = "'Akşamın kızıllığı gökyüzünü kapladığında küçük kulübenin penceresinden ince bir duman yükseliyordu.' Bu cümlenin ögelerinin doğru sıralanışı hangisidir?",
            options = listOf(
                "A) Zarf Tümleci - Dolaylı Tümleç - Özne - Yüklem",
                "B) Özne - Dolaylı Tümleç - Zarf Tümleci - Yüklem",
                "C) Zarf Tümleci - Belirtili Nesne - Özne - Yüklem",
                "D) Dolaylı Tümleç - Zarf Tümleci - Özne - Yüklem",
                "E) Zarf Tümleci - Özne - Dolaylı Tümleç - Yüklem"
            ),
            correctAnswerIndex = 0,
            explanation = "Yüklem: yükseliyordu.\nYükselen ne?: ince bir duman (Özne).\nNereden yükseliyordu?: küçük kulübenin penceresinden (Dolaylı Tümleç).\nNe zaman yükseliyordu?: Akşamın kızıllığı gökyüzünü kapladığında (Zarf Tümleci).\nSıralama: Zarf Tümleci - Dolaylı Tümleç - Özne - Yüklem.",
            difficulty = "Zor",
            examOrigin = "2020 KPSS Lisans",
            year = "2020"
        ),

        // --- 2019 KPSS ---
        Question(
            id = 1901,
            subject = Subject.TARIH,
            topic = "Osmanlı Dağılma Dönemi",
            questionText = "Osmanlı Devleti'nde ilk kez iç borçlanmaya gidilerek çıkarılan ve faizli kâğıt para niteliği taşıyan borçlanma senetlerine ne ad verilmiştir?",
            options = listOf(
                "A) Kaime",
                "B) Esham Senetleri",
                "C) Akçe",
                "D) Sikke-i Hasene",
                "E) Düyun-u Umumiye"
            ),
            correctAnswerIndex = 1,
            explanation = "İlk iç borçlanma I. Abdülhamit döneminde 'Esham Sistemi' (pay senetleri) adıyla uygulamaya konulmuştur. Kaime ise Abdülmecit döneminde basılan ilk kâğıt paradır.",
            difficulty = "Zor",
            examOrigin = "2019 KPSS Lisans",
            year = "2019"
        ),
        Question(
            id = 1902,
            subject = Subject.COGRAFYA,
            topic = "Göller ve Oluşumları",
            questionText = "Nemrut Kaldera Gölü, Isparta Gölcük Maar Gölü ve Meke Maarı oluşum kökeni bakımından hangi göl türüne örnektir?",
            options = listOf(
                "A) Karstik Göller",
                "B) Volkanik Göller",
                "C) Tektonik Göller",
                "D) Heyelan Set Gölleri",
                "E) Buzul Gölleri"
            ),
            correctAnswerIndex = 1,
            explanation = "Nemrut (kaldera), Gölcük (maar/krater) ve Konya Karapınar'daki Meke Tuzlası (maar gölü) volkanik patlamalar sonucu çukurluklarda su birikmesiyle oluşan volkanik göllerdir.",
            difficulty = "Orta",
            examOrigin = "2019 KPSS Lisans",
            year = "2019"
        ),
        Question(
            id = 1903,
            subject = Subject.VATANDASLIK,
            topic = "İdare Hukuku - Yetki Genişliği",
            questionText = "Türkiye'de anayasal bir ilke olan 'Yetki Genişliği' yetkisi YALNIZCA kime tanınmıştır?",
            options = listOf(
                "A) İl Valisine",
                "B) İlçe Kaymakamına",
                "C) Büyükşehir Belediye Başkanına",
                "D) İl İdare Kurulu Başkanına",
                "E) Danıştay Başkanına"
            ),
            correctAnswerIndex = 0,
            explanation = "Yetki Genişliği yalnızca İL VALİSİNE aittir. Merkeze danışmadan devlet adına karar alma ve harcama yapabilme yetkisidir. Kaymakamın yetki genişliği YOKTUR.",
            difficulty = "Orta",
            examOrigin = "2019 KPSS Lisans",
            year = "2019"
        ),

        // --- 2018 KPSS ---
        Question(
            id = 1801,
            subject = Subject.TARIH,
            topic = "Balkan Savaşları",
            questionText = "I. Balkan Savaşı'na katılmadığı halde, savaştan en kârlı çıkan Bulgaristan'a karşı savaşa girerek II. Balkan Savaşı'nın başlamasına yol açan Balkan devleti hangisidir?",
            options = listOf(
                "A) Sırbistan",
                "B) Karadağ",
                "C) Yunanistan",
                "D) Romanya",
                "E) Arnavutluk"
            ),
            correctAnswerIndex = 3,
            explanation = "Romanya, I. Balkan Savaşı'nda yer almamıştır. Ancak Bulgaristan'ın aşırı büyümesi ve Dobruca bölgesi anlaşmazlıkları nedeniyle II. Balkan Savaşı'nda Bulgaristan'a karşı savaşa katılmıştır.",
            difficulty = "Zor",
            examOrigin = "2018 KPSS Lisans",
            year = "2018"
        ),
        Question(
            id = 1802,
            subject = Subject.COGRAFYA,
            topic = "Türkiye'nin Akarsuları",
            questionText = "Türkiye topraklarından doğup komşu ülkeler üzerinden Basra Körfezi'ne dökülen nehirler aşağıdakilerden hangisinde birlikte verilmiştir?",
            options = listOf(
                "A) Aras ve Kura",
                "B) Fırat ve Dicle",
                "C) Seyhan ve Ceyhan",
                "D) Çoruh ve Kelkit",
                "E) Meriç ve Ergene"
            ),
            correctAnswerIndex = 1,
            explanation = "Fırat ve Dicle nehirleri Türkiye'den doğar, Suriye ve Irak topraklarından geçerek Şattülarap'ta birleşir ve Basra Körfezi'ne dökülür.",
            difficulty = "Kolay",
            examOrigin = "2018 KPSS Lisans",
            year = "2018"
        ),
        Question(
            id = 1803,
            subject = Subject.VATANDASLIK,
            topic = "Anayasa Tarihi",
            questionText = "Türkiye Cumhuriyeti tarihinde kabul edilen anayasalar arasında tek 'Yumuşak ve Çerçeve' anayasa olma özelliğine sahip anayasa hangisidir?",
            options = listOf(
                "A) 1876 Kanun-i Esasi",
                "B) 1921 Anayasası (Teşkilat-ı Esasiye)",
                "C) 1924 Anayasası",
                "D) 1961 Anayasası",
                "E) 1982 Anayasası"
            ),
            correctAnswerIndex = 1,
            explanation = "1921 Teşkilat-ı Esasiye Kanunu 23 madde ve 1 ek maddeden oluşan, değiştirilmesi adi kanunlarla aynı usule tabi olan tek yumuşak ve kısa (çerçeve) anayasamızdır.",
            difficulty = "Orta",
            examOrigin = "2018 KPSS Lisans",
            year = "2018"
        )
    )
}
