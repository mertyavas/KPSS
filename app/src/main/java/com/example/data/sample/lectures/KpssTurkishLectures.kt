package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssTurkishLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "trk_01",
            subject = Subject.TURKCE,
            title = "KPSS Paragraf Taktikleri & Hızlı Çözüm Yolları",
            summary = "Paragrafta ana düşünce, yardımcı düşünce, akışı bozan cümleler, ikiye bölme ve anlatım teknikleri.",
            keyPoints = listOf(
                "Ana Düşünce: Paragrafın yazılış amacıdır. Genellikle son cümlelerde 'özetle, kısacası, sonuç olarak, o halde, bence' gibi bağlayıcı sözlerden sonra gelir.",
                "Akışı Bozan Cümle: Metinde genel olarak konunun bir yönü (örn: yazarın üslubu) anlatılırken, aniden başka bir yönüne (örn: biyografisine) geçen cümledir.",
                "İkiye Bölme: Metinde ikinci bir konuya veya konunun farklı bir boyutuna geçildiği cümleden itibaren ikinci paragraf başlar.",
                "Olumsuz Soru Kökleri ('Değinilmemiştir / Çıkarılamaz'): Önce soru kökünü okuyun, ardından 5 seçeneğin altını çizin ve metni tarayarak eleyin."
            ),
            kpssCodes = listOf(
                "Düşünceyi Geliştirme Yolları: Tanımlama ('Bu nedir?' cevabı), Karşılaştırma ('en, daha, göre, ise'), Örnekleme, Tanık Gösterme (doğrudan söz aktarımı), Sayısal Verilerden Yararlanma.",
                "Asla kendi yorumunuzu katmayın; metnin sınırları içinde kalın!"
            ),
            highYieldFacts = listOf(
                "Öykülemede olay akışı ve hareket vardır; Betimlemede niteleme sıfatlarıyla kelimelerle resim çizilir; Açıklamada bilgi verilir; Tartışmada okuyucunun fikri değiştirilmeye çalışılır.",
                "Tanık göstermede yalnızca kişinin isminin geçmesi yetmez, ona ait bir düşünce veya söz aktarılmalıdır."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "trk_02",
            subject = Subject.TURKCE,
            title = "Yazım Kuralları & TDK'nin En Çok Sorduğu İstisnalar",
            summary = "Bitişik ve ayrı yazılan birleşik sözcükler, büyük harflerin yazımı, sayıların ve kısaltmaların yazımı, de/da ve ki bağlaçları.",
            keyPoints = listOf(
                "Bitişik Yazılanlar: Somut olarak yer bildirmeyen alt, üst, üzeri sözleriyle kurulanlar (akşamüstü, ayaküstü, suçüstü, bilinçaltı, olağanüstü). Hane, zade, name, perver ile kurulanlar (dershane, beyanname, vatanperver).",
                "Ayrı Yazılanlar: Dış, iç, sıra sözleriyle kurulanlar: çağ dışı, din dışı, hafta içi, yurt içi, aklı sıra, peşi sıra, ardı sıra. İkilemeler daima ayrı yazılır: el ele, art arda, yan yana, baş başa.",
                "Kurum, Kuruluş ve Kurul Adları: Gelen ekler kesme işaretiyle AYRILMAZ! (Türkiye Büyük Millet Meclisine, Türk Dil Kurumundan, Ankara Üniversitesine).",
                "Unvan ve Saygı Sözcükleri: Özel adla kullanılırsa büyük (Doktor Kemal Bey, Sayın Vali, Ayşe Teyze). Akrabalık bildirenler küçük yazılır (Ahmet amcam)."
            ),
            kpssCodes = listOf(
                "'Ki' Bağlacının Bitişik Yazıldığı İstisnalar: 'SOMBAHÇEMİ' -> Sanki, Oysaki, Mademki, Belki, Halbuki, Çünkü, Meğerki, İllaki.",
                "'Şey' Her Zaman Ayrı Yazılır: Bir şey, her şey, çok şey, hiçbir şey."
            ),
            highYieldFacts = listOf(
                "Tarihlerin Yazımı: Belirli bir tarihi bildiren ay ve gün adları büyük başlar: '29 Ekim 1923 Pazartesi günü' (ama 'Gelecek yıl ekim ayında' küçük yazılır).",
                "Yön Adları: Özel isimden önce gelirse büyük (Doğu Karadeniz), sonra gelirse küçük yazılır (Karadeniz'in doğusu)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "trk_03",
            subject = Subject.TURKCE,
            title = "Noktalama İşaretleri & ÖSYM Tuzakları",
            summary = "Virgülün kullanılmadığı yerler, noktalı virgül ile iki noktanın farkı, kesme işareti ve iki nokta kuralları.",
            keyPoints = listOf(
                "Virgülün Asla Konulmadığı Yerler:",
                "1) Şart ekinden (-se, -sa) sonra ASLA virgül konmaz (Gidersen, üzülürüm - YANLIŞ!),",
                "2) Metin içinde tek zarf-fiil ekinden (-ip, -erek, -ince, -ken) sonra virgül konmaz,",
                "3) İkilemelerin arasına hiçbir işaret girmez,",
                "4) Bağlaçlardan önce ve sonra virgül konmaz (ve, veya, ya da, ama, hem... hem...).",
                "Noktalı Virgül (;): Cümlede virgülle ayrılmış tür ve takımları ayırmak için veya ögeleri arasında virgül bulunan sıralı cümleleri ayırmak için konur. Cümlede virgül yoksa noktalı virgül ASLA KULLANILAMAZ!",
                "İki Nokta (:): Kendisinden sonra açıklama yapılacak veya örnek verilecek cümlenin sonuna konur. İki noktadan sonra tam bir cümle gelirse büyük harfle başlar; sadece örnekler sıralanıyorsa küçük harfle başlar."
            ),
            kpssCodes = listOf(
                "Noktalı Virgül Formülü: Virgül olmadan noktalı virgül doğamaz!",
                "Sonunda 3. tekil iyelik eki olan özel ada başka iyelik eki gelirse kesme işareti konmaz: 'Boğaz Köprümüzün ışıkları' (Boğaz Köprüsü'nün değil!)."
            ),
            highYieldFacts = listOf(
                "Ünlem ve soru işaretinden sonra üç nokta yerine iki nokta konur: (?..) veya (!..).",
                "Kısaltmalara gelen ekler kısaltmanın okunuşuna göre gelir: TBMM'ye (T-Be-Me-Me'ye), MEB'e, THY'de (Asla 'Te-Ka-Se' gibi sessiz harfe 'ka' denmez, Türkçede harfler 'ke' diye okunur: TDK'nin!)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "trk_04",
            subject = Subject.TURKCE,
            title = "Cümlenin Ögeleri ve Sözcük Türleri",
            summary = "Yüklem, özne, nesne, dolaylı tümleç, zarf tümleci bulma sırası (Y-Ö-N); İsim, Sıfat, Zamir, Zarf, Edat ve Bağlaç.",
            keyPoints = listOf(
                "Öge Bulma Sırası (Y-Ö-N): 1. Yüklem, 2. Özne (Yükleme sorulan 'Kim / Ne?'), 3. Nesne (Belirtili: 'Kimi/Neyi?', Belirtisiz: 'Ne?').",
                "Dolaylı Tümleç (Yer Tamlayıcısı): -e, -de, -den hal eklerini alır (Nereye, Nerede, Nereden, Kime, Kimde, Kimden).",
                "Zarf Tümleci: Yükleme sorulan 'Nasıl, Ne zaman, Ne kadar, Neden, Niçin, Niye?' sorularının cevabıdır.",
                "Sözcük Türleri:",
                "- Sıfat (Önad): İsmi niteleyen veya belirten sözcüktür (Kırmızı elma, üç kişi, bu kitap).",
                "- Zamir (Adıl): İsmin yerini tutan sözcüktür (O geldi, bunu aldım, herkes katıldı).",
                "- Zarf (Belirteç): Fiili, fiilimsiyi, sıfatı durum, zaman, miktar, yer-yön bakımından tamamlar (Hızlı koştu, çok güzel konuştu).",
                "- Edat (İlgeç): Tek başına anlamı olmayan, cümle içinde anlam ilgisi kuran sözcüklerdir (gibi, için, kadar, göre, rağmen)."
            ),
            kpssCodes = listOf(
                "Y-Ö-N Kuralı: Özne bulunmadan nesne aranmaz!",
                "İle: 've' yerine geçiyorsa bağlaçtır; geçmiyorsa edattır.",
                "Yalnız / Ancak: 'Sadece' anlamına geliyorsa edattır; 'ama / fakat' anlamına geliyorsa bağlaçtır."
            ),
            highYieldFacts = listOf(
                "Tamlamalar, deyimler, birleşik fiiller ve fiilimsi grupları bir bütündür; cümle ögeleri ayrılırken asla bölünemezler!",
                "Cümle dışı unsur: Hitaplar, seslenmeler ve bağlaçlar cümle ögesi sayılmaz."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "trk_05",
            subject = Subject.TURKCE,
            title = "Ses Bilgisi & ÖSYM Kuralları",
            summary = "Ünlü düşmesi, Ünlü daralması, Ünsüz benzeşmesi (sertleşme), Ünsüz yumuşaması ve Ünsüz türemesi.",
            keyPoints = listOf(
                "Ünlü Düşmesi: İkinci hecesinde dar ünlü (ı, i, u, ü) bulunan sözcük ünlüyle başlayan ek aldığında düşer: burun-u -> burnu, akıl-ı -> aklı, kayıp olmak -> kaybolmak, devir-im -> devrim.",
                "Ünlü Daralması: 'a, e' geniş ünlüleri ile biten fiillere '-yor' eki geldiğinde 'ı, i, u, ü'ye daralır: başlı-yor -> başlıyor, bekle-yor -> bekliyor. İstisnalar: 'de-' ve 'ye-' fiilleri (diye, yiyen).",
                "Ünsüz Benzeşmesi (Sertleşme): Sert ünsüzle (FıSTıKÇı ŞaHaP: f, s, t, k, ç, ş, h, p) biten sözcüğe 'c, d, g' ile başlayan ek geldiğinde 'ç, t, k'ye dönüşür: sınıf-da -> sınıfta, sokak-dan -> sokaktan, 1923-de -> 1923'te.",
                "Ünsüz Yumuşaması: 'p, ç, t, k' ünsüzleri ünlüyle başlayan ek aldığında 'b, c, d, ğ/g'ye dönüşür: kitap-ı -> kitabı, ağaç-a -> ağaca, renk-i -> rengi.",
                "Ulama: Ünsüzle biten sözcükten sonra ünlüyle başlayan sözcük geldiğinde bitişik gibi okunmasıdır (Arada noktalama işareti varsa ulama olmaz!)."
            ),
            kpssCodes = listOf(
                "Sert Ünsüzler: 'F-S-T-K-Ç-Ş-H-P' (Fıstıkçı Şahap).",
                "Daralma Tuzağı: Her '-yor' eki daralma yapmaz! Gel-i-yor (yardımcı ünlü girmiştir, daralma yoktur). Daralma için fiilin kökü a veya e ile bitmelidir (başla-yor -> başlıyor)."
            ),
            highYieldFacts = listOf(
                "Özel isimlerde yazımda yumuşama gösterilmez; sadece telaffuzda yumuşatılır: 'Mehmet'e' yazılır, 'Mehmede' okunur.",
                "Tek heceli sözcüklerin çoğunda yumuşama olmaz: top-u -> topu, süt-ü -> sütü, saç-ı -> saçı."
            ),
            readTimeMinutes = 7
        )
    )
}
