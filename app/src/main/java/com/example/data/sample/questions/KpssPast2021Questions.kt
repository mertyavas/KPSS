package com.example.data.sample.questions

import com.example.data.model.Question
import com.example.data.model.Subject

object KpssPast2021Questions {
    val list: List<Question> = listOf(
        Question(
            id = 2101,
            subject = Subject.TARIH,
            topic = "Kurtuluş Savaşı Lojistiği",
            questionText = "Kurtuluş Savaşı sırasında Sovyet Rusya ve İstanbul'dan deniz yoluyla gelen silah ve cephanelerin Anadolu içlerine taşındığı 'İstiklal Yolu' güzergahı hangi iki merkez arasında uzanmaktadır?",
            options = listOf(
                "A) İnebolu - Ankara",
                "B) Samsun - Amasya",
                "C) Trabzon - Erzurum",
                "D) Mudanya - Eskişehir",
                "E) Sinop - Kastamonu"
            ),
            correctAnswerIndex = 0,
            explanation = "İstiklal Yolu: Kastamonu İnebolu Limanı'ndan başlayıp Kastamonu, Ilgaz, Çankırı ve Kalecik üzerinden Ankara'ya ulaşan ve cepheye cephane taşınan tarihî güzergahtır.",
            difficulty = "Zor",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2102,
            subject = Subject.TARIH,
            topic = "Atatürk İnkılapları",
            questionText = "Türkiye'de kadınlara siyasi hakların (Belediye, Muhtarlık ve Milletvekilliği) verilme sırası aşağıdakilerden hangisinde kronolojik olarak doğru verilmiştir?",
            options = listOf(
                "A) Milletvekili (1930) - Muhtarlık (1933) - Belediye (1934)",
                "B) Belediye (1930) - Muhtarlık (1933) - Milletvekili (1934)",
                "C) Muhtarlık (1930) - Belediye (1933) - Milletvekili (1934)",
                "D) Belediye (1930) - Milletvekili (1933) - Muhtarlık (1934)",
                "E) Medeni Kanun (1926) ile hepsi aynı anda verilmiştir."
            ),
            correctAnswerIndex = 1,
            explanation = "Kadınlara siyasi hakların veriliş sırası '034 BMW' şifresiyle kodlanır: 1930 Belediye, 1933 Muhtarlık, 1934 Vekillik (Milletvekili). 1926 Medeni Kanun'da siyasi hak YOKTUR!",
            difficulty = "Orta",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2103,
            subject = Subject.COGRAFYA,
            topic = "Karstik Aşınım Şekilleri",
            questionText = "Karstik arazilerde kireç taşının erimesiyle oluşan karstik aşınım şekillerinin KÜÇÜKTEN BÜYÜĞE doğru sıralanışı hangisidir?",
            options = listOf(
                "A) Polye - Uvala - Dolin - Lapya",
                "B) Lapya - Dolin - Uvala - Polye",
                "C) Dolin - Lapya - Polye - Uvala",
                "D) Lapya - Uvala - Dolin - Polye",
                "E) Uvala - Dolin - Lapya - Polye"
            ),
            correctAnswerIndex = 1,
            explanation = "Karstik aşınım şekilleri küçükten büyüğe: Lapya -> Dolin -> Uvala -> Polye (Gölova) şeklinde sıralanır.",
            difficulty = "Orta",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2104,
            subject = Subject.COGRAFYA,
            topic = "Rüzgar Erozyonu",
            questionText = "Türkiye'de rüzgâr erozyonunun, kumul oluşumlarının ve çölleşme tehlikesinin en şiddetli görüldüğü yöre hangisidir?",
            options = listOf(
                "A) Konya - Karapınar",
                "B) Rize - Çamlıhemşin",
                "C) Antalya - Manavgat",
                "D) Muğla - Datça",
                "E) Kars - Sarıkamış"
            ),
            correctAnswerIndex = 0,
            explanation = "Bitki örtüsünün cılızlığı, kuraklık ve gevşek toprak yapısı nedeniyle Türkiye'de rüzgâr erozyonunun en etkili olduğu yer Konya-Karapınar yöresidir.",
            difficulty = "Orta",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2105,
            subject = Subject.VATANDASLIK,
            topic = "Yasama Nisapları",
            questionText = "1982 Anayasası'na göre TBMM Genel Kurulu'nun toplantı ve karar yeter sayıları hakkında aşağıdakilerden hangisi DOĞRUDUR?",
            options = listOf(
                "A) En az 151 vekille toplanır, salt çoğunlukla karar verir.",
                "B) En az 200 vekille toplanır, karar yeter sayısı 151'den az olamaz.",
                "C) En az 300 vekille toplanır, karar yeter sayısı 200'den az olamaz.",
                "D) En az 180 vekille toplanır, karar yeter sayısı 91'dir.",
                "E) En az 400 vekille toplanır, 3/5 ile karar verir."
            ),
            correctAnswerIndex = 1,
            explanation = "1982 Anayasası m. 96 uyarınca: TBMM üye tamsayısının en az 1/3'üyle (200 milletvekili) toplanır. Karar yeter sayısı katılanların salt çoğunluğudur; ancak hiçbir şekilde üye tamsayısının 1/4'ünün 1 fazlasından (151) az olamaz.",
            difficulty = "Zor",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2106,
            subject = Subject.TURKCE,
            topic = "Anlatım Bozuklukları",
            questionText = "'Bu ameliyatın başarı şansı yüzde ellidir, hastanın ölüm riski ise daha yüksektir.' Bu cümledeki anlatım bozukluğunun nedeni hangisidir?",
            options = listOf(
                "A) Gereksiz sözcük kullanımı",
                "B) Mantık ve sıralama hatası",
                "C) Özne-yüklem uyuşmazlığı",
                "D) Kelimenin yanlış anlamda kullanılması ('şans' yerine 'ihtimal')",
                "E) Tamlama yanlışlığı"
            ),
            correctAnswerIndex = 3,
            explanation = "'Şans' kelimesi sadece olumlu durumlar için kullanılır. Olumsuz ihtimaller için 'ihtimal / risk / olasılık' denmelidir. Sözcüğün yanlış anlamda kullanımı mevcuttur.",
            difficulty = "Zor",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        ),
        Question(
            id = 2107,
            subject = Subject.MATEMATIK,
            topic = "Yüzde ve Kâr-Zarar",
            questionText = "Bir tüccar bir malın etiket fiyatına %20 zam yaptıktan sonra, satışların düşmesi üzerine yeni fiyat üzerinden %20 indirim yapmıştır. Tüccarın bu maldaki kâr-zarar durumu nedir?",
            options = listOf(
                "A) Ne kâr ne zarar etmiştir.",
                "B) %2 kâr etmiştir.",
                "C) %4 zarar etmiştir.",
                "D) %4 kâr etmiştir.",
                "E) %5 zarar etmiştir."
            ),
            correctAnswerIndex = 2,
            explanation = "100x kuralı: Başlangıç fiyatı 100 TL olsun. %20 zam ile fiyat: 120 TL olur. 120 TL'nin %20 indirimi: 120 * 0.20 = 24 TL indirim demektir. Yeni fiyat: 120 - 24 = 96 TL olur. 100 TL'lik mal 96 TL'ye düştüğü için tüccar %4 ZARAR etmiştir.",
            difficulty = "Orta",
            examOrigin = "2021 KPSS Lisans",
            year = "2021"
        )
    )
}
