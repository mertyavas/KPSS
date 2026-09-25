package com.example.data.sample.questions

import com.example.data.model.Question
import com.example.data.model.Subject

object KpssPast2022Questions {
    val list: List<Question> = listOf(
        Question(
            id = 2201,
            subject = Subject.TARIH,
            topic = "Osmanlı Toprak Sistemi",
            questionText = "Osmanlı Devleti'nde dirlik topraklarının gelirlerine göre ayrımında; geliri 100.000 akçenin üzerinde olan ve padişah, şehzadeler ile divan üyelerine tahsis edilen toprak türü hangisidir?",
            options = listOf(
                "A) Zeamet",
                "B) Tımar",
                "C) Has",
                "D) Yurtluk",
                "E) Paşmaklık"
            ),
            correctAnswerIndex = 2,
            explanation = "Dirlik arazileri:\n1) Has: Geliri 100.000 akçeden fazla olan (padişah, hanedan ve sadrazam),\n2) Zeamet: Geliri 20.000 - 100.000 akçe arası (orta kademe bürokrat),\n3) Tımar: Geliri 3.000 - 20.000 akçe arası (sipahi ve memurlara).",
            difficulty = "Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2202,
            subject = Subject.TARIH,
            topic = "Atatürk Dönemi Dış Politika",
            questionText = "1936 yılında imzalanan Montrö Boğazlar Sözleşmesi ile ilgili aşağıdaki ifadelerden hangisi DOĞRUDUR?",
            options = listOf(
                "A) Boğazlar Komisyonu varlığını sürdürmüştür.",
                "B) Türkiye Boğazlar bölgesinde asker bulundurma hakkını kesin olarak elde etmiştir.",
                "C) Savaş gemilerinin geçişi tamamen yasaklanmıştır.",
                "D) Ticaret gemilerinin geçişi ücretli hale getirilmiştir.",
                "E) Sözleşmeye İtalya ilk gün imza koymuştur."
            ),
            correctAnswerIndex = 1,
            explanation = "Montrö Boğazlar Sözleşmesi ile Lozan'daki Uluslararası Boğazlar Komisyonu kaldırılmış, Boğazların tüm yetki ve egemenliği Türkiye'ye devredilmiş ve Türkiye Boğazlar bölgesini silahlandırma/asker bulundurma hakkını resmen kazanmıştır.",
            difficulty = "Orta",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2203,
            subject = Subject.COGRAFYA,
            topic = "İklim ve Fön Rüzgârı",
            questionText = "Türkiye'de kış mevsiminde Sibirya Yüksek Basıncı etkili olduğunda Doğu Anadolu'da şiddetli ayaz yaşanırken, Doğu Karadeniz kıyılarında (Rize) kış sıcaklıklarının normallerin üzerinde olması hangi yerel rüzgârın etkisiyle açıklanır?",
            options = listOf(
                "A) Karayel",
                "B) Fön Rüzgârı",
                "C) Lodos",
                "D) Etezyen",
                "E) Poyraz"
            ),
            correctAnswerIndex = 1,
            explanation = "Kuzeydoğudan gelen hava kütleleri Kaçkar Dağları'nı aşıp Rize kıyılarına doğru alçalırken her 100 metrede 1°C ısınır. Bu fön etkisi sayesinde Rize'de kış ılıklığı oluşur ve mikroklima turunçgil tarımı yapılabilir.",
            difficulty = "Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2204,
            subject = Subject.VATANDASLIK,
            topic = "Devlet Memurları Kanunu",
            questionText = "657 sayılı Devlet Memurları Kanunu'na göre aşağıdakilerden hangisi devlet memurlarına uygulanan bir DİSİPLİN CEZASI DEĞİLDİR?",
            options = listOf(
                "A) Uyarma",
                "B) Kınama",
                "C) Aylıktan Kesme",
                "D) Kademe İlerlemesinin Durdurulması",
                "E) Görevden Uzaklaştırma"
            ),
            correctAnswerIndex = 4,
            explanation = "657 sayılı DMK'daki disiplin cezaları 5 tanedir: Uyarma, Kınama, Aylıktan Kesme, Kademe İlerlemesinin Durdurulması ve Devlet Memurluğundan Çıkarma. 'Görevden Uzaklaştırma' bir disiplin cezası değil; soruşturmanın selameti için uygulanan idari bir tedbirdir.",
            difficulty = "Çok Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2205,
            subject = Subject.VATANDASLIK,
            topic = "Temel Haklar Sınıflandırması",
            questionText = "1982 Anayasası'na göre aşağıdakilerden hangisi Anayasa'da düzenlenen 'Siyasi Hak ve Ödevler' (Aktif Statü Hakları) grubunda YER ALMAZ?",
            options = listOf(
                "A) Türk Vatandaşlığı",
                "B) Seçme ve Seçilme Hakkı",
                "C) Kamu Hizmetlerine Girme Hakkı",
                "D) Dilekçe ve Bilgi Edinme Hakkı",
                "E) Mülkiyet Hakkı"
            ),
            correctAnswerIndex = 4,
            explanation = "Mülkiyet Hakkı, Jellinek kamu hakları ayrımına göre 'Kişi Hak ve Ödevleri' (Negatif Statü - Koruyucu Haklar) grubunda yer alır; Siyasi hak değildir.",
            difficulty = "Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2206,
            subject = Subject.TURKCE,
            topic = "Noktalama İşaretleri",
            questionText = "Aşağıdaki cümlelerin hangisinde virgülün (,) kullanımı noktalama kurallarına AYKIRIDIR?",
            options = listOf(
                "A) Fırtına dindiğinde, limana yanaşan balıkçılar derin bir nefes aldı.",
                "B) Genç adam, elindeki kitabı heyecanla açıp okumaya koyuldu.",
                "C) Kitapları, defterleri ve kalemleri masanın üstüne düzenlice bıraktı.",
                "D) Bu zorlu sınavı kazanırsan, hayalindeki mesleğe bir adım daha yaklaşacaksın.",
                "E) Evet, ben de sizinle aynı fikirdeyim."
            ),
            correctAnswerIndex = 3,
            explanation = "TDK kuralı gereğince: Şart ekinden (-se, -sa) sonra ASLA virgül konmaz! 'kazanırsan,' ifadesindeki virgül noktalama yanlışıdır.",
            difficulty = "Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2207,
            subject = Subject.MATEMATIK,
            topic = "Hareket Problemleri",
            questionText = "Saatteki hızı 90 km olan bir tren, 750 metre uzunluğundaki bir tüneli 36 saniyede tamamen geçtiğine göre, bu trenin boyu kaç metredir?",
            options = listOf(
                "A) 120 m",
                "B) 150 m",
                "C) 180 m",
                "D) 200 m",
                "E) 250 m"
            ),
            correctAnswerIndex = 1,
            explanation = "1) 90 km/sa = 90 / 3.6 = 25 m/sn.\n2) Trenin tüneli tamamen geçmesi için aldığı yol = Trenin Boyu (x) + Tünel Boyu (750 m).\n3) Yol = Hız * Zaman => x + 750 = 25 * 36 = 900 m.\n4) x = 900 - 750 = 150 metre bulunur.",
            difficulty = "Zor",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        ),
        Question(
            id = 2208,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Kültür Başkenti",
            questionText = "TÜRKSOY tarafından '2022 Türk Dünyası Kültür Başkenti' ilan edilen ve 4. Dünya Göçebe Oyunları'na ev sahipliği yapan Türkiye şehri hangisidir?",
            options = listOf(
                "A) Konya",
                "B) Bursa",
                "C) Edirne",
                "D) Trabzon",
                "E) Antalya"
            ),
            correctAnswerIndex = 1,
            explanation = "Bursa, 2022 yılında TÜRKSOY tarafından Türk Dünyası Kültür Başkenti ilan edilmiş ve İznik ilçesinde 4. Dünya Göçebe Oyunları gerçekleştirilmiştir.",
            difficulty = "Kolay",
            examOrigin = "2022 KPSS Lisans",
            year = "2022"
        )
    )
}
