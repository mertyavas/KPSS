package com.example.data.sample

import com.example.data.model.Question
import com.example.data.model.Subject

object KpssQuestionsData {

    val questions: List<Question> = listOf(
        // TARİH
        Question(
            id = 1,
            subject = Subject.TARIH,
            topic = "Kurtuluş Savaşı Muharebeler Dönemi",
            questionText = "Kurtuluş Savaşı'nda düzenli ordunun Batı Cephesi'nde kazandığı ilk askerî zafer aşağıdakilerden hangisidir?",
            options = listOf(
                "A) I. İnönü Muharebesi",
                "B) II. İnönü Muharebesi",
                "C) Sakarya Meydan Muharebesi",
                "D) Başkomutanlık Meydan Muharebesi",
                "E) Aslıhanlar - Dumlupınar Muharebesi"
            ),
            correctAnswerIndex = 0,
            explanation = "I. İnönü Muharebesi (6-10 Ocak 1921), TBMM tarafından kurulan düzenli ordunun Batı Cephesi'ndeki ilk askerî zaferidir. Bu zaferin ardından Londra Konferansı toplanmış, İstiklal Marşı kabul edilmiş, Teşkilat-ı Esasiye (1921 Anayasası) ilan edilmiş ve Sovyet Rusya ile Moskova Antlaşması imzalanmıştır (Şifre: MİLAT).",
            difficulty = "Kolay",
            examOrigin = "KPSS Lisans / Çıkmış Soru Tarzı"
        ),
        Question(
            id = 2,
            subject = Subject.TARIH,
            topic = "Osmanlı Devleti Kültür ve Medeniyeti",
            questionText = "Osmanlı Devleti'nde padişahın mutlak vekili olup padişahın mührünü taşıyan ve 'serdar-ı ekrem' unvanıyla sefere komutanlık eden devlet adamı kimdir?",
            options = listOf(
                "A) Şeyhülislam",
                "B) Sadrazam (Vezir-i Azam)",
                "C) Defterdar",
                "D) Nişancı",
                "E) Kazasker"
            ),
            correctAnswerIndex = 1,
            explanation = "Sadrazam (Vezir-i Azam), padişahtan sonraki en yetkili devlet adamı olup padişahın mührünü taşır. Padişah sefere katılmadığında orduya 'Serdar-ı Ekrem' unvanıyla komutanlık eder. Şeyhülislam fetva verir, Defterdar maliyeden sorumludur, Nişancı tuğra çeker ve dirlikleri kaydeder, Kazasker adalet ve eğitim işlerine bakar.",
            difficulty = "Orta",
            examOrigin = "KPSS Genel Kültür"
        ),
        Question(
            id = 3,
            subject = Subject.TARIH,
            topic = "İlk Türk Devletleri",
            questionText = "İslamiyet öncesi Türk devletlerinde 'hükümdara devleti yönetme yetkisinin Tanrı tarafından verildiğine' inanılan anlayışa ne ad verilir?",
            options = listOf(
                "A) Kurultay",
                "B) Töre",
                "C) Kut",
                "D) Yargu",
                "E) Balbal"
            ),
            correctAnswerIndex = 2,
            explanation = "Kut inancı, devleti yönetme yetkisinin Gök Tanrı tarafından hükümdara verildiği inancıdır. Bu yetkinin kan yoluyla hanedanın tüm erkek üyelerine geçtiğine inanıldığı için taht kavgalarına ve devletlerin kısa sürede yıkılmasına sebep olmuştur.",
            difficulty = "Kolay",
            examOrigin = "KPSS Çıkmış Benzeri"
        ),
        Question(
            id = 4,
            subject = Subject.TARIH,
            topic = "Atatürk İlkeleri ve İnkılapları",
            questionText = "1924 yılında kabul edilen Tevhid-i Tedrisat Kanunu ile aşağıdakilerden hangisi doğrudan amaçlanmıştır?",
            options = listOf(
                "A) Aşar vergisinin kaldırılması",
                "B) Eğitim ve öğretimin millîleştirilerek birleştirilmesi",
                "C) Çok partili hayata geçiş denemeleri",
                "D) Soyadı Kanunu'nun yürürlüğe konulması",
                "E) Yeni Türk harflerinin kabulü"
            ),
            correctAnswerIndex = 1,
            explanation = "3 Mart 1924 tarihli Tevhid-i Tedrisat (Öğretim Birliği) Kanunu ile Türkiye'deki tüm okullar Millî Eğitim Bakanlığı'na bağlanmış, medreseler kapatılmış, eğitim laik ve millî temellere oturtularak öğretimde birlik sağlanmıştır.",
            difficulty = "Orta",
            examOrigin = "KPSS Lisans"
        ),
        Question(
            id = 5,
            subject = Subject.TARIH,
            topic = "Kurtuluş Savaşı Hazırlık Dönemi",
            questionText = "'Milletin bağımsızlığını yine milletin azim ve kararı kurtaracaktır.' maddesiyle Kurtuluş Savaşı'nın amacı, gerekçesi ve yöntemi ilk kez nerede belirtilmiştir?",
            options = listOf(
                "A) Havza Genelgesi",
                "B) Amasya Genelgesi",
                "C) Erzurum Kongresi",
                "D) Sivas Kongresi",
                "E) Misak-ı Millî Kararları"
            ),
            correctAnswerIndex = 1,
            explanation = "22 Haziran 1919'da yayımlanan Amasya Genelgesi'nde Kurtuluş Savaşı'nın gerekçesi ('Vatanın bütünlüğü, milletin bağımsızlığı tehlikededir') ve yöntemi ile amacı ('Milletin bağımsızlığını yine milletin azim ve kararı kurtaracaktır') ilk kez net bir ihtilal bildirisi şeklinde ilan edilmiştir.",
            difficulty = "Orta",
            examOrigin = "KPSS Standart"
        ),

        // COĞRAFYA
        Question(
            id = 6,
            subject = Subject.COGRAFYA,
            topic = "Türkiye'nin Yer Şekilleri",
            questionText = "Türkiye'de karstik aşınım ve birikim şekillerinin (laponya, dolin, uvala, polye, traverten) en yaygın olarak görüldüğü coğrafi bölge aşağıdakilerden hangisidir?",
            options = listOf(
                "A) Karadeniz Bölgesi",
                "B) Akdeniz Bölgesi (Toroslar)",
                "C) İç Anadolu Bölgesi",
                "D) Güneydoğu Anadolu Bölgesi",
                "E) Marmara Bölgesi"
            ),
            correctAnswerIndex = 1,
            explanation = "Kalker (kireçtaşı) kayaçlarının yoğun olarak bulunduğu Akdeniz Bölgesi (Teke ve Taşeli Platoları, Batı ve Orta Toroslar), karstik şekillerin Türkiye'de en belirgin ve yaygın görüldüğü sahadır. Pamukkale travertenleri de Denizli'de bu kuşağa yakındır.",
            difficulty = "Kolay",
            examOrigin = "KPSS Coğrafya"
        ),
        Question(
            id = 7,
            subject = Subject.COGRAFYA,
            topic = "Türkiye'nin İklimi",
            questionText = "Karadeniz kıyılarında Rize ve çevresinde turunçgil, Doğu Anadolu'da ise Iğdır Ovası'nda pamuk yetiştirilebilmesi hangi coğrafi kavram ile açıklanır?",
            options = listOf(
                "A) Mutlak Konum",
                "B) Çölleşme",
                "C) Mikroklima (Dar alan iklimi)",
                "D) Muson etkisi",
                "E) Ekinoks etkisi"
            ),
            correctAnswerIndex = 2,
            explanation = "Çevresine göre çukurda kalan veya fön rüzgârları sayesinde çevresinden daha ılık ve korunaklı bir iklim özelliği sergileyen alanlarda normalde yetişmeyen ürünlerin yetişmesine mikroklima denir (Örn: Rize'de turunçgil, Iğdır'da pamuk, Artvin Çoruh vadisinde zeytin).",
            difficulty = "Orta",
            examOrigin = "KPSS Çıkmış Tarzı"
        ),
        Question(
            id = 8,
            subject = Subject.COGRAFYA,
            topic = "Madenler ve Enerji Kaynakları",
            questionText = "Dünya rezervlerinin yaklaşık %73'ü Türkiye'de bulunan; Balıkesir (Bigadiç), Kütahya (Emet), Bursa (Mustafakemalpaşa) ve Eskişehir (Seyitgazi)'de çıkarılan stratejik maden hangisidir?",
            options = listOf(
                "A) Bor mineralleri",
                "B) Boksit (Alüminyum)",
                "C) Krom",
                "D) Bakır",
                "E) Mermer"
            ),
            correctAnswerIndex = 0,
            explanation = "Bor mineralleri dünya rezervlerinin büyük çoğunluğu Türkiye'dedir. Başlıca yatakları Susurluk, Bigadiç (Balıkesir), Emet (Kütahya), Seyitgazi (Kırka - Eskişehir) ve Kestelek (Bursa)'tedir. Sanayi, uzay teknolojisi, cam ve savunma alanlarında kullanılır.",
            difficulty = "Kolay",
            examOrigin = "KPSS Temel Bilgi"
        ),
        Question(
            id = 9,
            subject = Subject.COGRAFYA,
            topic = "Türkiye'de Nüfus ve Yerleşme",
            questionText = "Aşağıdaki platolarımızdan hangisi, yükseltisi ve sert karasal iklim koşulları nedeniyle nüfus yoğunluğunun en düşük olduğu platolar arasında yer alır?",
            options = listOf(
                "A) Çatalca-Kocaeli Platosu",
                "B) Haymana Platosu",
                "C) Erzurum-Kars Platosu",
                "D) Gaziantep Platosu",
                "E) Cihanbeyli Platosu"
            ),
            correctAnswerIndex = 2,
            explanation = "Erzurum-Kars ve Ardahan platoları lav platoları olup ortalama 2000 m üzerindedir. Sert karasal iklim nedeniyle tarım imkanları kısıtlıdır, bu nedenle Türkiye'de nüfus yoğunluğu çok düşüktür. Çatalca-Kocaeli ise nüfus yoğunluğu en yüksek platodur.",
            difficulty = "Orta",
            examOrigin = "KPSS Coğrafya"
        ),

        // VATANDAŞLIK & ANAYASA
        Question(
            id = 10,
            subject = Subject.VATANDASLIK,
            topic = "1982 Anayasası - Temel Hükümler",
            questionText = "1982 Anayasası'na göre Türkiye Cumhuriyeti Anayasası'nda 'değiştirilemez ve değiştirilmesi teklif dahi edilemez' olan ilk kaç madde koruma altındadır?",
            options = listOf(
                "A) İlk 1 madde",
                "B) İlk 2 madde",
                "C) İlk 3 madde",
                "D) İlk 4 madde",
                "E) İlk 5 madde"
            ),
            correctAnswerIndex = 2,
            explanation = "1982 Anayasası'nın 4. maddesi uyarınca; 1. madde (Devletin şeklinin Cumhuriyet olduğu), 2. madde (Cumhuriyetin nitelikleri) ve 3. maddede (Devletin bütünlüğü, resmî dili, bayrağı, millî marşı ve başkenti) yer alan hükümler değiştirilemez ve değiştirilmesi teklif edilemez.",
            difficulty = "Kolay",
            examOrigin = "KPSS Vatandaşlık"
        ),
        Question(
            id = 11,
            subject = Subject.VATANDASLIK,
            topic = "Yasama Organı (TBMM)",
            questionText = "1982 Anayasası'na göre Türkiye Büyük Millet Meclisi (TBMM) kaç milletvekilinden oluşur?",
            options = listOf(
                "A) 450",
                "B) 500",
                "C) 550",
                "D) 600",
                "E) 650"
            ),
            correctAnswerIndex = 3,
            explanation = "2017 Anayasa değişikliği ile TBMM üye tamsayısı 550'den 600'e çıkarılmıştır. Milletvekili seçilme yaşı ise 18'e indirilmiştir.",
            difficulty = "Kolay",
            examOrigin = "KPSS Güncel Anayasa"
        ),
        Question(
            id = 12,
            subject = Subject.VATANDASLIK,
            topic = "Yargı ve Yüksek Mahkemeler",
            questionText = "1982 Anayasası'na göre aşağıdakilerden hangisi yüksek mahkemeler arasında yer almaz?",
            options = listOf(
                "A) Anayasa Mahkemesi",
                "B) Yargıtay",
                "C) Danıştay",
                "D) Uyuşmazlık Mahkemesi",
                "E) Sayıştay"
            ),
            correctAnswerIndex = 4,
            explanation = "1982 Anayasası'na göre Türkiye'deki 4 yüksek mahkeme: Anayasa Mahkemesi, Yargıtay, Danıştay ve Uyuşmazlık Mahkemesi'dir. Sayıştay ve HSK (Hâkimler ve Savcılar Kurulu) anayasal kurumlardır ancak yüksek mahkeme statüsünde değildirler.",
            difficulty = "Zor",
            examOrigin = "KPSS Çok Sorulan Çeldirici"
        ),
        Question(
            id = 13,
            subject = Subject.VATANDASLIK,
            topic = "İdare Hukuku",
            questionText = "Bir yerleşim yerinde belediye kurulabilmesi için asgari nüfusun en az kaç olması gerekmektedir?",
            options = listOf(
                "A) 2.000",
                "B) 5.000",
                "C) 10.000",
                "D) 20.000",
                "E) 50.000"
            ),
            correctAnswerIndex = 1,
            explanation = "5393 sayılı Belediye Kanunu'na göre nüfusu 5.000 ve üzerinde olan yerleşim yerlerinde belediye kurulabilir. Büyükşehir belediyesi kurulabilmesi için ise toplam nüfusun en az 750.000 olması şarttır (kanunla kurulur).",
            difficulty = "Orta",
            examOrigin = "KPSS İdare Hukuku"
        ),

        // TÜRKÇE
        Question(
            id = 14,
            subject = Subject.TURKCE,
            topic = "Yazım Kuralları",
            questionText = "Aşağıdaki cümlelerin hangisinde büyük harflerin veya birleşik sözcüklerin yazımı ile ilgili bir yazım yanlışı vardır?",
            options = listOf(
                "A) Türk Dil Kurumu Başkanı önemli açıklamalarda bulundu.",
                "B) Van Gölü havzası son yağışlarla canlandı.",
                "C) Hafta sonu Boğaz Köprüsü'nden geçerken manzarayı seyrettik.",
                "D) Akşam üzeri arkadaşlarla tarihi konakta bir araya geldik.",
                "E) Resmi Gazete'de yayımlanan kararla yeni atamalar gerçekleşti."
            ),
            correctAnswerIndex = 3,
            explanation = "TDK kurallarına göre 'alt, üst, üzeri' sözlerinin somut bir yer bildirmeyen durumlarda sona gelmesiyle kurulan birleşik kelimeler bitişik yazılır: 'akşamüstü / akşamüzeri', 'öğleüzeri', 'ayaküstü', 'suçüstü' bitişik yazılmalıdır. Cümlede ayrı yazılarak yazım yanlışı yapılmıştır.",
            difficulty = "Zor",
            examOrigin = "KPSS Türkçe / Yazım Kuralları"
        ),
        Question(
            id = 15,
            subject = Subject.TURKCE,
            topic = "Anlatım Bozuklukları",
            questionText = "'Bu konudaki çekimserliğini korumaya devam edersen hiçbir sonuca varamazsın.' cümlesindeki anlatım bozukluğunun nedeni aşağıdakilerden hangisidir?",
            options = listOf(
                "A) Gereksiz sözcük kullanımı",
                "B) Sözcüğün yanlış anlamda kullanılması",
                "C) Mantık hatası",
                "D) Özne-yüklem uyuşmazlığı",
                "E) Çelişen sözlerin bir arada kullanılması"
            ),
            correctAnswerIndex = 1,
            explanation = "Cümlede 'çekimser' (kararsız, oy vermekten kaçınan) sözcüğü yanlış kullanılmıştır; yerine 'çekingen' (ürkek, sıkılgan) sözcüğü getirilmelidir. Dolayısıyla sözcüğün yanlış anlamda kullanımı mevcuttur.",
            difficulty = "Orta",
            examOrigin = "KPSS Türkçe"
        ),
        Question(
            id = 16,
            subject = Subject.TURKCE,
            topic = "Cümlede Anlam",
            questionText = "'Eleştirmen, yazarın eserini değerlendirirken kendi beğenilerini değil, eserin objektif kriterlere uygunluğunu merkeze almalıdır.' Bu cümlede vurgulanan nitelik aşağıdakilerden hangisidir?",
            options = listOf(
                "A) Özgünlük",
                "B) Nesnellik (Tarafsızlık)",
                "C) Yalınlık",
                "D) Yoğunluk",
                "E) Evrensellik"
            ),
            correctAnswerIndex = 1,
            explanation = "Kişisel duygu, beğeni ve önyargılardan uzak durup objektif kriterlere dayanmak 'nesnellik' (tarafsızlık) ilkesidir.",
            difficulty = "Kolay",
            examOrigin = "KPSS Türkçe"
        ),

        // MATEMATİK & GEOMETRİ
        Question(
            id = 17,
            subject = Subject.MATEMATIK,
            topic = "Problemler - Yüzde ve Kâr",
            questionText = "Bir mağaza maliyeti 400 TL olan bir pantolona önce %30 kâr ekleyerek etiket fiyatı belirliyor. Daha sonra bu etiket fiyatı üzerinden %20 indirim uyguluyor. Mağazanın bu satıştan kârı kaç TL'dir?",
            options = listOf(
                "A) 12 TL",
                "B) 16 TL",
                "C) 20 TL",
                "D) 24 TL",
                "E) 32 TL"
            ),
            correctAnswerIndex = 1,
            explanation = "1) Maliyet = 400 TL.\n2) %30 kâr eklenmiş etiket fiyatı = 400 + (400 * 0.30) = 400 + 120 = 520 TL.\n3) Etiket fiyatından %20 indirim = 520 * 0.20 = 104 TL indirim.\n4) İndirimli satış fiyatı = 520 - 104 = 416 TL.\n5) Kâr = Satış Fiyatı - Maliyet = 416 - 400 = 16 TL.",
            difficulty = "Kolay",
            examOrigin = "KPSS Matematik"
        ),
        Question(
            id = 18,
            subject = Subject.MATEMATIK,
            topic = "Bölme ve Bölünebilme Kuralları",
            questionText = "Dört basamaklı 4a7b sayısı hem 5 hem de 9 ile tam bölünebilen rakamları farklı bir tek sayıdır. Buna göre a'nın alabileceği değer kaçtır?",
            options = listOf(
                "A) 1",
                "B) 2",
                "C) 3",
                "D) 6",
                "E) 8"
            ),
            correctAnswerIndex = 1,
            explanation = "1) 5 ile bölünebilmesi için birler basamağı (b) 0 veya 5 olmalıdır. Sayı tek sayı dendiğinden b = 5 olmalıdır.\n2) Sayımız: 4a75 oldu. Rakamları farklı şartı: a; 4, 7, 5 olamaz.\n3) 9 ile bölünebilme kuralı: Rakamları toplamı 9'un katı olmalıdır:\n4 + a + 7 + 5 = 16 + a.\n16 + a, 9'un katı olması için a = 2 olmalıdır (16+2=18).\n4) a=2 şartları sağlar (rakamları farklıdır). Dolayısıyla a = 2.",
            difficulty = "Orta",
            examOrigin = "KPSS Temel Matematik"
        ),
        Question(
            id = 19,
            subject = Subject.MATEMATIK,
            topic = "Hız - Hareket Problemleri",
            questionText = "A ve B şehirleri arasındaki mesafe 360 km'dir. A'dan saatte 80 km, B'den ise saatte 40 km hızla birbirlerine doğru aynı anda hareket eden iki araç kaç saat sonra karşılaşırlar?",
            options = listOf(
                "A) 2 saat",
                "B) 2.5 saat",
                "C) 3 saat",
                "D) 3.5 saat",
                "E) 4 saat"
            ),
            correctAnswerIndex = 2,
            explanation = "Birbirine doğru gelen iki aracın hızları toplanır: V_toplam = 80 + 40 = 120 km/sa.\nKarşılaşma süresi t = Yol / V_toplam = 360 / 120 = 3 saat bulunur.",
            difficulty = "Kolay",
            examOrigin = "KPSS Matematik"
        ),

        // GÜNCEL BİLGİLER
        Question(
            id = 20,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Uluslararası Örgütler & Temsilciler",
            questionText = "Birleşmiş Milletler (BM) Genel Sekreterliği görevini günümüzde yürüten Portekizli diplomat kimdir?",
            options = listOf(
                "A) Antonio Guterres",
                "B) Ban Ki-moon",
                "C) Kofi Annan",
                "D) Jens Stoltenberg",
                "E) Tedros Adhanom"
            ),
            correctAnswerIndex = 0,
            explanation = "Birleşmiş Milletler Genel Sekreteri Antonio Guterres'tir (Portekiz eski Başbakanı). Jens Stoltenberg NATO eski genel sekreteridir, Tedros Adhanom DSÖ Başkanıdır.",
            difficulty = "Kolay",
            examOrigin = "KPSS Güncel Bilgiler"
        ),
        Question(
            id = 21,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Kültür ve UNESCO Dünya Mirası",
            questionText = "Şanlıurfa'da yer alan, 'Tarihin Sıfır Noktası' olarak kabul edilen ve 2018 yılında UNESCO Dünya Miras Listesi'ne alınan dünyanın bilinen en eski kült yapılar topluluğu hangisidir?",
            options = listOf(
                "A) Çatalhöyük",
                "B) Göbeklitepe",
                "C) Alacahöyük",
                "D) Karahantepe",
                "E) Çayönü"
            ),
            correctAnswerIndex = 1,
            explanation = "Göbeklitepe, Şanlıurfa il merkezinin yaklaşık 18 km kuzeydoğusunda Örencik köyü yakınlarında yer alan, yaklaşık 12.000 yıl öncesine dayanan dünyanın bilinen en eski megalitik anıtsal tapınak kompleksidir. 2018'de UNESCO Dünya Miras Listesi'ne girmiştir.",
            difficulty = "Kolay",
            examOrigin = "KPSS Çok Çıkan Güncel"
        ),
        Question(
            id = 22,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Milli Savunma & Havacılık",
            questionText = "TUSAŞ tarafından geliştirilen, Türkiye'nin ilk millî muharip uçağına verilen isim aşağıdakilerden hangisidir?",
            options = listOf(
                "A) ANKA",
                "B) HÜRJET",
                "C) KAAN",
                "D) KIZILELMA",
                "E) AKSUNGUR"
            ),
            correctAnswerIndex = 2,
            explanation = "Türkiye'nin 5. nesil çok rollü millî muharip savaş uçağının resmî adı KAAN'dır. İlk uçuşunu 2024 başında başarıyla gerçekleştirmiştir.",
            difficulty = "Kolay",
            examOrigin = "KPSS Güncel Bilgiler"
        ),
        Question(
            id = 23,
            subject = Subject.GUNCEL_BILGILER,
            topic = "Edebiyat ve Sanat",
            questionText = "İstiklal Marşı şairimiz Mehmet Akif Ersoy, İstiklal Marşı'nı hangi eserine 'O benim değil, kahraman ordumuzun ve milletimindir' diyerek dahil etmemiştir?",
            options = listOf(
                "A) Safahat",
                "B) Gölgeler",
                "C) Süleymaniye Kürsüsünde",
                "D) Asım",
                "E) Fatih Kürsüsünde"
            ),
            correctAnswerIndex = 0,
            explanation = "Mehmet Akif Ersoy, tüm şiirlerini topladığı 7 kitaptan oluşan 'Safahat' adlı ölümsüz eserine İstiklal Marşı'nı 'Milletime ve kahraman orduma hediyemdir' diyerek almamıştır.",
            difficulty = "Orta",
            examOrigin = "KPSS Genel Kültür"
        ),
        Question(
            id = 24,
            subject = Subject.TARIH,
            topic = "Lozan Barış Antlaşması",
            questionText = "Lozan Barış Antlaşması'nda çözülemeyip Türkiye ile İngiltere arasında ikili görüşmelere bırakılan ve sonradan Milletler Cemiyeti gündemine gelen mesele hangisidir?",
            options = listOf(
                "A) Hatay Meselesi",
                "B) Musul Meselesi (Irak Sınırı)",
                "C) Boğazlar Meselesi",
                "D) Dış Borçlar Meselesi",
                "E) Nüfus Mübadelesi"
            ),
            correctAnswerIndex = 1,
            explanation = "Lozan'da Türkiye ile İngiltere arasında çözülemeyen tek sınır Musul (Irak) sınırıdır. 9 ay içinde ikili görüşmelerle çözülmesi kararlaştırılmış, çözülemeyince Milletler Cemiyeti'ne gitmiş ve 1926 Ankara Antlaşması ile çözümlenmiştir. Hatay ise 1939'da anavatana katılmıştır.",
            difficulty = "Orta",
            examOrigin = "KPSS Lisans"
        ),
        Question(
            id = 25,
            subject = Subject.COGRAFYA,
            topic = "Türkiye'nin Gölleri ve Barajları",
            questionText = "Fırat Nehri üzerinde kurulu olup gövde hacmi ve elektrik üretim kapasitesi bakımından Türkiye'nin en büyük hidroelektrik barajı hangisidir?",
            options = listOf(
                "A) Keban Barajı",
                "B) Karakaya Barajı",
                "C) Atatürk Barajı",
                "D) Deriner Barajı",
                "E) Ilısu (Veysel Eroğlu) Barajı"
            ),
            correctAnswerIndex = 2,
            explanation = "GAP projesinin kilit noktası olan Atatürk Barajı, Şanlıurfa ile Adıyaman arasında Fırat Nehri üzerinde kurulmuş olup Türkiye'nin en büyük hidroelektrik baraj gölüne ve elektrik üretim kapasitesine sahiptir.",
            difficulty = "Kolay",
            examOrigin = "KPSS Coğrafya"
        )
    )

    fun getQuestionsBySubject(subject: Subject): List<Question> {
        return questions.filter { it.subject == subject }
    }

    fun getQuestionsForExam(examIndex: Int, limit: Int = 15): List<Question> {
        // Return a balanced mix of subjects for trial exam
        val shuffled = questions.shuffled()
        return shuffled.take(limit)
    }

    fun getQuestionById(id: Int): Question? {
        return questions.firstOrNull { it.id == id }
    }
}
