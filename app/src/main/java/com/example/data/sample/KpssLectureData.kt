package com.example.data.sample

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssLectureData {

    val lectures: List<TopicLecture> = listOf(
        TopicLecture(
            id = "tar_01",
            subject = Subject.TARIH,
            title = "Kurtuluş Savaşı Muharebeler & Antlaşmalar",
            summary = "Batı, Doğu ve Güney Cepheleri'ndeki askerî mücadeleler, İnönü savaşları, Sakarya ve Başkomutanlık Meydan Muharebesi ile Mudanya ve Lozan diplomasi süreci.",
            keyPoints = listOf(
                "Doğu Cephesi: Kazım Karabekir komutasında Ermenilere karşı savaşıldı. Gümrü Antlaşması TBMM'nin ilk askerî ve siyasî zaferidir.",
                "Güney Cephesi: Düzenli ordu yerine Kuvay-ı Milliye savaştı (Maraş, Antep, Urfa). Ankara Antlaşması (1921) ile kapandı.",
                "Batı Cephesi: Düzenli ordunun ilk zaferi I. İnönü Muharebesi'dir.",
                "Sakarya Meydan Muharebesi: 1683 Viyana bozgunundan beri süren Türk geri çekilişi sona erdi. Mustafa Kemal'e 'Gazi' ve 'Mareşal' unvanı verildi."
            ),
            kpssCodes = listOf(
                "MİLAT Şifresi (I. İnönü Sonuçları): Moskova Antlaşması, İstiklal Marşı, Londra Konferansı, Afganistan Dostluk, Teşkilat-ı Esasiye",
                "KARA Şifresi (Doğu Sınırı Çizen Antlaşmalar sırasıyla): Kars (kesin çizildi), Ankara (Güney), Rusya-Moskova, Antlaşma-Gümrü",
                "Gazi Mustafa Kemal Paşa'nın 'Hatt-ı müdafaa yoktur, sath-ı müdafaa vardır...' sözü Sakarya Meydan Muharebesi'nde söylenmiştir."
            ),
            highYieldFacts = listOf(
                "İtalya ve Fransa Sakarya Zaferi'nden sonra Anadolu'dan çekilmeye başlamıştır.",
                "Lozan'da Boğazlar için uluslararası komisyon kurulması tam bağımsızlığa aykırıydı; bu durum 1936 Montrö ile lehimize düzeltildi."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "tar_02",
            subject = Subject.TARIH,
            title = "Osmanlı Devleti Kültür, Teşkilat ve Toprak Sistemi",
            summary = "Divan-ı Hümayun üyeleri, Taşra teşkilatı (Salyaneli, Salyanesiz eyaletler), Tımar ve İltizam sistemi, Seyfiye, İlmiye, Kalemiye sınıfları.",
            keyPoints = listOf(
                "Seyfiye (Kılıç Ehli - Yönetim & Asker): Sadrazam, Vezirler, Kaptan-ı Derya, Yeniçeri Ağası, Beylerbeyi, Sancakbeyi.",
                "İlmiye (Din, Hukuk, Eğitim): Şeyhülislam, Kazasker, Kadı, Müderris.",
                "Kalemiye (Bürokrasi ve Maliye): Defterdar, Nişancı, Reisülküttab.",
                "Tımar Sistemi: Devlete masraf olmadan ordunun asker ihtiyacını (cebelü) karşılar ve tarımda sürekliliği garanti altına alırdı."
            ),
            kpssCodes = listOf(
                "Dirlik Arazileri: Has (padişah/yüksek rütbe), Zeamet (orta düzey), Tımar (asker/memur).",
                "Divan Üyeleri Sınıf Ayrımı: Kazasker ilmiyedir ama divan üyesidir! Şeyhülislam kanun çıkaramaz, sadece dine uygunluk fetvası verir."
            ),
            highYieldFacts = listOf(
                "İlk Osmanlı parası (bakır) Osman Bey döneminde; ilk gümüş akçe Orhan Bey, ilk altın para Fatih Sultan Mehmet döneminde basılmıştır.",
                "Müsadere Sistemi: Devletin haksız kazanç sağlayan memurun malına el koymasıdır (II. Mahmut kaldırmıştır)."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "cog_01",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Yer Şekilleri & Karstik Arazi",
            summary = "Orojenez (kıvrım ve kırık dağlar), Epirojenez, Volkanizma ve Karstlaşma. Platolar, ovalar ve akarsu şekilleri.",
            keyPoints = listOf(
                "Kırık Dağlar (Horst-Graben): Kaz, Madra, Yunt, Bozdağlar, Aydın, Menteşe dağları ve Nur (Amanos) Dağları (Şifre: KAZMA YUTMUŞ BOZ AYI).",
                "Volkanik Dağlar (İç Anadolu): Erciyes, Hasan, Melendiz, Karacadağ, Karadağ.",
                "Karstik Şekiller: Kalker (Kireçtaşı), Jips (Alçıtaşı) ve Kaya tuzu erimesiyle oluşur. Akdeniz ve Sivas havzasında yoğunlaşır.",
                "Polye Gölleri (Karstik Ovalar): Tefenni, Acıpayam, Korkuteli, Kestel, Elmalı (Şifre: TAKKE)."
            ),
            kpssCodes = listOf(
                "Horst Dağları: 'KAZMA YUTMUŞ BOZ AYI Menteşe'de' (Kaz, Madra, Yunt, Bozdağlar, Aydın, Menteşe).",
                "Karstik Ovalar: 'TAKKE' (Tefenni, Acıpayam, Korkuteli, Kestel, Elmalı)."
            ),
            highYieldFacts = listOf(
                "Türkiye'nin en genç volkanik arazisi Manisa Kula yöresidir (Kula Volkanları Jeoparkı).",
                "Falez (yalıyar) oluşumu dağların kıyıya paralel ve hemen kıyıdan yükseldiği Karadeniz ve Akdeniz'de fazladır; Ege'de seyrektir."
            ),
            readTimeMinutes = 6
        ),
        TopicLecture(
            id = "vat_01",
            subject = Subject.VATANDASLIK,
            title = "1982 Anayasası - Temel Esaslar & Yasama",
            summary = "Devletin şekli ve nitelikleri, Değiştirilemez maddeler, Temel hak ve hürriyetler, TBMM'nin oluşumu, görevleri ve kanun yapma süreci.",
            keyPoints = listOf(
                "İlk 3 Madde: 1. Devletin şekli Cumhuriyettir. 2. Demokratik, lâik ve sosyal bir hukuk devletidir. 3. Resmî dili Türkçe, başkenti Ankara, marşı İstiklal Marşı, bayrağı ay yıldızlı al bayraktır. 4. madde bu ilk 3 maddenin değiştirilemeyeceğini belirtir.",
                "TBMM Seçimleri: 5 yılda bir yapılır. 600 milletvekilinden oluşur. Seçilme yaşı 18'dir.",
                "Milletvekilliğinin Düşmesi: İstifa halinde TBMM Genel Kurulu kararıyla; devamsızlık durumunda üye tamsayısının salt çoğunluğu ile düşer.",
                "Cumhurbaşkanlığı Kararnamesi: Yürütme yetkisine ilişkin konularda çıkarılır. Anayasada münhasıran kanunla düzenlenmesi öngörülen konularda çıkarılamaz."
            ),
            kpssCodes = listOf(
                "Yüksek Mahkemeler: Anayasa Mahkemesi, Yargıtay, Danıştay, Uyuşmazlık Mahkemesi (Sayıştay ve HSK yüksek mahkeme DEĞİLDİR).",
                "TBMM Nitelikli Çoğunlukları: Anayasa Değişikliği teklifi için en az 200 (1/3), kabulü için en az 360 (3/5) vekil oyu gerekir."
            ),
            highYieldFacts = listOf(
                "Olağanüstü Hal (OHAL) Cumhurbaşkanı tarafından ilan edilir ve süresi 6 ayı geçemez. TBMM bu süreyi her defasında 4 ayı geçmemek üzere uzatabilir.",
                "Siyasi partilerin kapatılması davasını Yargıtay Cumhuriyet Başsavcısı açar, kararı Anayasa Mahkemesi verir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "trk_01",
            subject = Subject.TURKCE,
            title = "KPSS Paragraf Taktikleri & Yazım Kuralları",
            summary = "Paragrafta ana düşünce, yardımcı düşünce, akışı bozan cümleler, anlatım teknikleri ve TDK'nin en çok sorduğu bitişik/ayrı yazım kuralları.",
            keyPoints = listOf(
                "Paragrafta soru köküne dikkat edin: 'değinilmemiştir / çıkarılamaz' sorularında önce seçenekleri hızlıca okuyup anahtar kelimeleri tespit edin.",
                "Akışı bozan cümle sorularında konunun yönünün veya bakış açısının değiştiği yeri arayın.",
                "Bitişik Yazılan Birleşik Kelimeler: Somut yer belirtmeyen alt, üst, üzeri sözleri (akşamüstü, bilinçaltı, suçüstü).",
                "Ayrı Yazılanlar: Dış, iç, sıra sözleriyle oluşturulanlar: çağ dışı, hafta içi, aklı sıra, peşi sıra, ardı sıra."
            ),
            kpssCodes = listOf(
                "'Şey' her zaman ayrı yazılır: Bir şey, her şey, çok şey.",
                "'Ki' Bağlacı İstisnaları: SOMBAHÇEMİ (Sanki, Oysaki, Mademki, Belki, Halbuki, Çünkü, Meğerki, İllaki)."
            ),
            highYieldFacts = listOf(
                "Unvan ve saygı sözcükleri özel isimle birlikte büyük harfle başlar: Avukat Kemal Bey, Sayın Bakan.",
                "Gök cisimlerinin adları terim anlamında kullanıldığında büyük harfle yazılır (Dünya, Güneş, Ay)."
            ),
            readTimeMinutes = 6
        ),
        TopicLecture(
            id = "mat_01",
            subject = Subject.MATEMATIK,
            title = "KPSS Problem Çözme Stratejileri & Hızlı Hesaplamalar",
            summary = "Sayı-kesir problemleri, yaş problemleri, yüzde-kâr-zarar formülleri, işçi problemleri ve pratik sadeleştirme yöntemleri.",
            keyPoints = listOf(
                "Denklem Kurma: İstenen niceliğe daima 'x' veya kesirlerin paydalarının EKOK'unu verin (örneğin 1/3'ü ve 1/5'i denildiğinde bütüne 15x deyin).",
                "Yaş Problemleri: Kişiler arasındaki yaş farkı hiçbir zaman değişmez! Bugünden t yıl sonra herkes t yaş büyür.",
                "Yüzde ve Kâr: Maliyete her zaman 100x deyin. %20 kârlı satış fiyatı 120x, %10 zararlı satış 90x olur.",
                "Hız Problemleri: Yol = Hız x Zaman (x = V . t). Karşılıklı harekette hızlar toplanır, aynı yönde harekette hızlar çıkarılır."
            ),
            kpssCodes = listOf(
                "Ortalama Hız Formülü: V_ort = Toplam Yol / Toplam Zaman (Asla hızların aritmetik ortalamasını almayın!).",
                "EBOB-EKOK Kuralı: İki sayının çarpımı, o iki sayının EBOB'u ile EKOK'unun çarpımına eşittir (a . b = EBOB . EKOK)."
            ),
            highYieldFacts = listOf(
                "Ardışık tek veya çift sayılar ikişer ikişer artar: x, x+2, x+4...",
                "KPSS'de soruların zorluğuna göre değil, soru başına düşen süreye göre strateji belirleyin; turlama tekniğini uygulayın."
            ),
            readTimeMinutes = 8
        )
    )

    fun getLecturesBySubject(subject: Subject): List<TopicLecture> {
        return lectures.filter { it.subject == subject }
    }
}
