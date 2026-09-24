package com.example.data.sample

import com.example.data.model.CurrentAffair

object CurrentAffairsData {

    val affairs: List<CurrentAffair> = listOf(
        CurrentAffair(
            id = "guncel_01",
            category = "Milli Savunma & Havacılık",
            title = "KAAN - Türkiye'nin İlk Millî Muharip Uçağı",
            dateOrPeriod = "2024 - 2026",
            details = "TUSAŞ tarafından millî imkanlarla üretilen 5. nesil savaş uçağı KAAN, ilk uçuşunu başarıyla tamamladı. Radara yakalanmama (hayalet uçak), süpersonik hız ve gelişmiş yapay zeka aviyoniklerine sahiptir.",
            examImportance = "KPSS'de savunma sanayii ve yerli teknoloji sorularında (HÜRJET, ANKA-3, KIZILELMA, KAAN) sıkça sorgulanır.",
            tags = listOf("TUSAŞ", "KAAN", "Havacılık", "Savunma")
        ),
        CurrentAffair(
            id = "guncel_02",
            category = "Uluslararası Örgütler & Zirveler",
            title = "Türk Devletleri Teşkilatı (TDT)",
            dateOrPeriod = "Güncel Dönem",
            details = "Üye ülkeler: Türkiye, Azerbaycan, Kazakistan, Kırgızistan, Özbekistan. Gözlemci üyeler: Macaristan, Türkmenistan, Kuzey Kıbrıs Türk Cumhuriyeti (KKTC). Genel Sekreterliği İstanbul'dadır.",
            examImportance = "TDT ve gözlemci üyeleri (özellikle KKTC ve Macaristan) son KPSS sınavlarında doğrudan soru olarak sorulmuştur.",
            tags = listOf("TDT", "Uluslararası", "İstanbul", "Avrasya")
        ),
        CurrentAffair(
            id = "guncel_03",
            category = "UNESCO & Dünya Mirası",
            title = "Gordion Antik Kenti & Ahşap Hipostil Camiler",
            dateOrPeriod = "Son UNESCO Listeleri",
            details = "Ankara Polatlı'da bulunan Frig Krallığı'nın başkenti Gordion Antik Kenti ve Anadolu'nun Orta Çağ Dönemi Ahşap Direkli ve Kirişli Camileri UNESCO Dünya Mirası Kalıcı Listesi'ne alınmıştır.",
            examImportance = "UNESCO Kalıcı Miras Listesi'ne en son giren yerler ÖSYM'nin KPSS Güncel Bilgiler'de en sevdiği soru türüdür.",
            tags = listOf("UNESCO", "Gordion", "Ankara", "Tarihi Miras")
        ),
        CurrentAffair(
            id = "guncel_04",
            category = "Bilim & Uzay",
            title = "Türkiye'nin İlk İnsanlı Uzay Misyonu (Alper Gezeravcı)",
            dateOrPeriod = "2024",
            details = "Alper Gezeravcı, Ax-3 misyonu kapsamında Uluslararası Uzay İstasyonu'na (ISS) giderek Türkiye'nin ilk astronotu unvanını kazandı ve uzayda 13 farklı bilimsel deney gerçekleştirdi.",
            examImportance = "İlk astronotumuz Alper Gezeravcı ve uzay misyonu adı (Ax-3) Genel Kültür alanında yüksek soru potansiyeline sahiptir.",
            tags = listOf("Astronot", "Uzay", "ISS", "TÜBİTAK")
        ),
        CurrentAffair(
            id = "guncel_05",
            category = "Kültür, Sanat & Spor",
            title = "Avrupa Kültür Başkentleri ve Türk Dünyası Kültür Başkenti",
            dateOrPeriod = "2024 - 2025",
            details = "TÜRKSOY tarafından Türk Dünyası Kültür Başkenti seçilen şehirler ve Avrupa Birliği Kültür Başkentleri kültür sorularının başında gelir. Anev (Türkmenistan) ve Aktau (Kazakistan) son dönemde seçilen şehirler arasındadır.",
            examImportance = "Kültür başkentleri ve TÜRKSOY anma yılları KPSS'de her yıl en az 1 soruyla karşılık bulur.",
            tags = listOf("TÜRKSOY", "Kültür Başkenti", "Sanat")
        ),
        CurrentAffair(
            id = "guncel_06",
            category = "Uluslararası Örgütler & Temsilciler",
            title = "Birleşmiş Milletler ve NATO Üst Yönetimi",
            dateOrPeriod = "2024 - 2026",
            details = "BM Genel Sekreteri: Antonio Guterres (Portekiz). NATO Genel Sekreteri görevi Mark Rutte (Hollanda eski Başbakanı) tarafından devralındı. AB Konseyi ve Komisyonu yönetimleri.",
            examImportance = "Uluslararası kuruluş genel sekreterleri ve başkanları KPSS'nin değişmez klasik soru tiplerindendir.",
            tags = listOf("NATO", "BM", "Uluslararası İlişkiler")
        )
    )
}
