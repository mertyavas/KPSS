package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssGeographyLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "cog_01",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Coğrafi Konumu & Jeopolitiği",
            summary = "Matematik (Mutlak) Konum ve Özel (Göreceli) Konum sonuçları, enlem ve boylam etkileri, sınır kapıları ve komşular.",
            keyPoints = listOf(
                "Matematik Konum: 36°-42° Kuzey paralelleri, 26°-45° Doğu meridyenleri. Kuzey Yarımküre'de ve Orta Kuşak'ta (Ilıman kuşak) yer alır.",
                "Orta Kuşakta Olmanın Sonuçları: 'A-B-C-D' -> Akdeniz İklim kuşağında olması, Batı rüzgarları etkisinde olması, Cephesel yağışların görülmesi, Dört mevsimin belirgin yaşanması.",
                "Güneye Doğru: Sıcaklık artar, yerçekimi azalır, çizgisel hız artar, gece-gündüz süre farkı azalır, gölge boyu kısalır.",
                "Sınır Kapıları: En uzun kara sınırımız Suriye, en kısa sınırımız Nahçıvan (Dilucu). En işlek kapı Kapıkule (Bulgaristan)."
            ),
            kpssCodes = listOf(
                "Orta Kuşak Kodlaması: 'A-B-C-D' (Akdeniz iklimi, Batı rüzgârı, Cephe yağışı, Dört mevsim belirgin).",
                "Demiryolu Bağlantısı Olmayan Sınır Kapıları: Sarp (Gürcistan), Gürbulak (İran), Esendere (İran), Dereköy (Bulgaristan), Cilvegözü (Suriye) kapılarında tren yolu YOKTUR."
            ),
            highYieldFacts = listOf(
                "Aynı enlem üzerindeki noktalarda: Çizgisel hız, yerçekimi, gece-gündüz süreleri, güneş ışınlarının geliş açısı ve gölge boyları YIL BOYUNCA AYNIDIR.",
                "Türkiye'de hiçbir zaman güneş ışınları dik açıyla (90°) düşmez; dönencelerin dışındadır. Bu yüzden gölge boyu asla sıfır olmaz ve gölge daima kuzeyi gösterir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "cog_02",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Yer Şekilleri & Dağları",
            summary = "Orojenez (kıvrım ve kırık dağlar), Volkanik dağlar, Horst-Graben sistemleri ve Masif araziler.",
            keyPoints = listOf(
                "Kıvrım Dağları: Alp-Himalaya orojenezinin bir parçasıdır. Kuzey Anadolu Dağları (Kaçkarlar, Canik, Küre, Ilgaz) ve Toroslar (Batı, Orta ve Güneydoğu Toroslar).",
                "Kırık Dağlar (Horst-Graben Sistemi): Ege Bölgesi'nde sertleşmiş tabakaların kırılmasıyla oluşur. Horstlar: Kaz, Madra, Yunt, Bozdağlar, Aydın, Menteşe Dağları ve Hatay'daki Nur (Amanos) Dağı. Grabenler: Bakırçay, Gediz, Küçük Menderes, Büyük Menderes, Amik Ovası.",
                "Volkanik Dağlar (İç Anadolu): Erciyes, Hasan Dağı, Melendiz, Karacadağ, Karadağ. Doğu Anadolu: Ağrı (Türkiye'nin en yüksek zirvesi 5137 m), Tendürek, Süphan, Nemrut (kaldera gölü vardır). Güneydoğu Anadolu: Karacadağ (kalkan volkan).",
                "Masif Araziler: I. Jeolojik zamanda oluşmuş sert, oturmuş ve deprem riski düşük kütlelerdir: Yıldız Dağları, Menderes, Kırşehir, Bitlis, Mardin-Derik, Alanya-Anamur masifleri."
            ),
            kpssCodes = listOf(
                "Horst Dağları: 'KAZMA YUTMUŞ BOZ AYI Menteşe'de' (Kaz, Madra, Yunt, Boz, Aydın, Menteşe).",
                "İç Anadolu Volkanları: 'K-E-K-H-A-M' -> Karadağ, Erciyes, Karacadağ, Hasan, Melendiz."
            ),
            highYieldFacts = listOf(
                "Kula Volkanları (Manisa): Türkiye'nin en genç volkanik sahasıdır (IV. Zaman) ve ilk jeopark alanıdır ('Yanık Ülke' - Katakekaumene).",
                "Kuzey Anadolu Fay Hattı (KAF) Saros Körfezi'nden başlar, Marmara Denizi, İzmit, Bolu, Tokat, Erzincan üzerinden Van Gölü'ne uzanan dünyanın en aktif doğrultu atımlı fay hatlarındandır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "cog_03",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Ovaları ve Platoları",
            summary = "Delta ovaları, Tektonik ovalar, Karstik ovalar (Polye) ve Platoların oluşum türleri ve ekonomik faaliyetleri.",
            keyPoints = listOf(
                "Delta Ovaları: Akarsuların taşıdığı alüvyonları kıyıda biriktirmesiyle oluşur. Şartlar: Kıyıda dalga ve akıntı az olmalı, gelgit az olmalı, kıta sahanlığı (şelf) geniş olmalı, akarsu bol alüvyon taşımalıdır.",
                "Başlıca Deltalar: Karadeniz'de Çarşamba (Yeşilırmak) ve Bafra (Kızılırmak). Ege'de Dikili (Bakırçay), Menemen (Gediz), Selçuk (Küçük Menderes), Balat (Büyük Menderes). Akdeniz'de Çukurova (Seyhan ve Ceyhan - Türkiye'nin en büyük deltası) ve Silifke (Göksu).",
                "Karstik Ovalar (Polye / Gölova): Tefenni, Acıpayam, Korkuteli, Kestel, Elmalı (TAKKE şifresi).",
                "Platolarımız:",
                "- Lav Platoları: Erzurum-Kars ve Ardahan (Büyükbaş hayvancılık ve mera),",
                "- Karstik Platolar: Taşeli ve Teke Platoları (Kıl keçisi yetiştiriciliği, nüfus seyrektir),",
                "- Aşınım Platoları: Çatalca-Kocaeli (Sanayi, ticaret, yoğun nüfus),",
                "- Yatay Duruşlu (Tabaka Düzlüğü) Platolar: Haymana, Cihanbeyli, Obruk, Bozok, Uzunyayla, Yazılıkaya, Gaziantep, Şanlıurfa (Tahıl tarımı ve küçükbaş hayvancılık)."
            ),
            kpssCodes = listOf(
                "Karstik Ovalar: 'T-A-K-K-E' -> Tefenni, Acıpayam, Korkuteli, Kestel, Elmalı.",
                "Karstik Platolar: Teke ve Taşeli (Akdeniz).",
                "Türkiye'nin En Büyük Deltası: ÇUKUROVA."
            ),
            highYieldFacts = listOf(
                "Plato: Akarsular tarafından derin vadilerle yarılmış, çevresine göre yüksekte kalan geniş düzlüklerdir.",
                "Erzurum-Kars platosunda yaz yağışları sebebiyle çayırlar ve çernezyom (kara toprak) oluşur; bu nedenle büyükbaş mera hayvancılığı gelişmiştir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "cog_04",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin İklimi, Sıcaklık ve Yağış Dağılışı",
            summary = "Akdeniz, Karadeniz, Karasal ve Sert Karasal iklim tipleri; 'e' kuralı, bağıl ve mutlak nem, fön rüzgarı.",
            keyPoints = listOf(
                "Karadeniz İklimi: Her mevsim yağışlı, yıllık sıcaklık farkı en az, kimyasal çözünme ve bağıl nem en yüksek iklimdir. En çok yağış SONBAHARDA düşer (yamaç/orografik yağışlar).",
                "Akdeniz İklimi: Yazlar sıcak ve kurak, kışlar ılık ve yağışlıdır. En çok yağış KIŞIN düşer (cephesel/frontral yağışlar). Don olayı ve kar çok nadirdir.",
                "Ilıman Karasal (Step): Yazlar sıcak ve kurak, kışlar soğuk ve kar yağışlıdır. En çok yağış İLKBAHARDA konveksiyonel (kırkikindi) yağışları olarak düşer. Bozkır bitki örtüsü hakimdir.",
                "Sert Karasal (Erzurum-Kars): Kışlar çok sert, uzun ve karlıdır. En çok yağış YAZIN konveksiyonel olarak düşer. Çayırlar hakimdir."
            ),
            kpssCodes = listOf(
                "Mevsimlik Yağış 'e' Kuralı: İç Anadolu (İlkbahar) -> Erzurum-Kars (Yaz) -> Karadeniz (Sonbahar) -> Akdeniz/Ege/Marmara (Kış).",
                "Rüzgarlar: 'K-A-Y-I-P  S-A-K-A-L' -> Karayel, Yıldız, Poyraz (Kuzeyden soğuk getirir) - Samyeli/Keşişleme, Kıble, Lodos (Güneyden sıcak getirir)."
            ),
            highYieldFacts = listOf(
                "Bağıl Nemin en yüksek olduğu yer Doğu Karadeniz; en düşük olduğu yer ise yaz aylarında şiddetli buharlaşmadan dolayı Güneydoğu Anadolu'dur.",
                "Fön Rüzgarı: Dağ yamacından aşağı inen havanın sürtünmeyle her 100 m'de 1°C ısınmasıdır. Rize'de turunçgil ve çay yetiştirilmesini sağlar."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "cog_05",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Su Varlığı, Akarsuları ve Gölleri",
            summary = "Akarsuların özellikleri, havzaları, rejimleri, döküldükleri denizler; Tektonik, Karstik, Volkanik, Buzul ve Set Gölleri.",
            keyPoints = listOf(
                "Akarsularımızın Genel Özellikleri: Yatak eğimleri ve akış hızları fazladır, hidroelektrik potansiyelleri yüksektir, aşındırma güçleri fazladır, debileri düşüktür, boyları genellikle kısadır ve akarsu taşımacılığına elverişli değillerdir (Bartın Çayı istisnadır).",
                "Sınırlarımızdan Doğup Dışarı Dökülenler: Fırat ve Dicle (Basra Körfezi), Aras ve Kura (Hazar Gölü kapalı havzası), Çoruh (Gürcistan üzerinden Karadeniz).",
                "Dışarıdan Doğup Ülkemize Dökülenler: Meriç (Bulgaristan'dan doğar, Ege'ye dökülür), Asi (Lübnan'dan doğar, Akdeniz'e dökülür).",
                "Göl Çeşitleri:",
                "- Tektonik Göller: Tuz, Manyas (Kuş), Ulubat, İznik, Sapanca, Burdur, Eğirdir, Eber, Hazar, Akşehir,",
                "- Karstik Göller: Salda (Türkiye'nin Maldivleri - Mars toprağına benzer magnezyum hidroksit yapısı), Avlan, Kestel, Elmalı,",
                "- Volkanik Göller: Nemrut Kalderası (dünyanın 2. büyük kalderası), Meke Tuzlası (Dünyanın Nazar Boncuğu - maar gölü), Gölcük (Isparta),",
                "- Buzul (Sirk) Gölleri: Aynalı, Kilimli, Karagöl (Kaçkar, Cilo ve Uludağ'da yükseklerde bulunur; Karadeniz ve Akdeniz kıyısında buzul gölü OLMAZ!),",
                "- Heyelan Set Gölleri (TUYASS): Tortum, Uzungöl, Yedigöller, Abant, Sera, Sülüklügöl (Hepsi Karadeniz'dedir!).",
                "- Kıyı Set (Lagün): Büyükçekmece, Küçükçekmece, Terkos (Durusu), Akyayan."
            ),
            kpssCodes = listOf(
                "Heyelan Set Gölleri: 'T-U-Y-A-S-S' -> Tortum, Uzungöl, Yedigöller, Abant, Sera, Sülüklügöl.",
                "Lav Set Gölleri (Van Çevresi): 'B-A-H-Ç-E-V-A-N' -> Balık, Çıldır, Erçek, Nazik, Van, Haçlı."
            ),
            highYieldFacts = listOf(
                "Van Gölü: Türkiye'nin en büyük gölüdür. Hem volkanik set hem tektonik kökenlidir (karma göl). Suları sodalıdır ve içinde sadece İnci Kefali yaşar.",
                "Eğirdir ve Beyşehir Gölleri'nin suları tatlıdır çünkü gideğeni (çıkış ayağı) vardır; bu sayede tarımda sulamada ve tatlı su balıkçılığında kullanılır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "cog_06",
            subject = Subject.COGRAFYA,
            title = "Türkiye'nin Toprak Tipleri ve Bitki Örtüsü",
            summary = "Zonal (Terra Rossa, Kahverengi Orman, Çernezyom, Bozkır), İntrazonal ve Azonal (Alüvyal, Kolüvyal, Regosol) topraklar; Orman, Maki ve Bozkır.",
            keyPoints = listOf(
                "Zonal Topraklar (İklim ve bitki örtüsüne bağlı katmanlı topraklar):",
                "- Terra Rossa (Kırmızı Akdeniz Toprağı): Kalker üzerinde oluşur, demir oksit içerdiği için kırmızı renklidir. Akdeniz ve Ege'de yaygındır.",
                "- Çernezyom (Kara Toprak): Erzurum-Kars platosunda çayır örtüsü altında oluşur. Humus bakımından dünyanın en verimli toprağıdır ancak iklim soğuk olduğu için tarım kısıtlıdır.",
                "- Kahverengi Orman Toprağı: Karadeniz'in gür ormanları altında, yıkanmış ve verimlidir.",
                "- Kahverengi ve Kestane Renkli Bozkır Toprakları: İç Anadolu ve Güneydoğu'da bozkır altında oluşur; kireç ve tuz oranı yüksektir.",
                "Azonal Topraklar (Taşınmış Topraklar - Horizonları / Katmanları Yoktur!):",
                "- Alüvyal (Akarsuların biriktirdiği verimli topraklar),",
                "- Kolüvyal (Dağ eteğinde birikenler),",
                "- Moren (Buzul taşıması),",
                "- Lös (Rüzgar taşıması),",
                "- Regosol (Volkanik kum depoları üzerinde oluşan - bağcılık ve patates tarımına uygun).",
                "Bitki Örtüsü:",
                "- Orman: En fazla Karadeniz (%25), ardından Akdeniz'dedir. Ağaç türleri: Meşe (en yaygın), Kızılçam (Akdeniz - dünyada en çok bizde), Sarıçam (yüksek soğuk yerler - Sarıkamış), Kayın (Karadeniz).",
                "- Maki: Akdeniz iklimi çalı formasyonudur (Zeytin, zakkum, mersin, defne, kocayemiş, lavanta, sandal). Makinin tahribiyle Garig (Frigana) oluşur.",
                "- Bozkır (Step): İlkbahar yağışlarıyla yeşeren, yazın kuruyan ot topluluğu (Geven, gelincik, yavşan otu, üzerlik). Ormanların tahribiyle Antropojen Bozkır oluşur."
            ),
            kpssCodes = listOf(
                "En Yaygın Ağacımız: MEŞE (Türkiye'nin hemen her bölgesinde yetişir).",
                "En Verimli Toprak: ÇERNEZYOM (Erzurum-Kars).",
                "Akdeniz Toprağı: TERRA ROSSA (Kireçtaşı + Demir Oksit)."
            ),
            highYieldFacts = listOf(
                "Endemik Bitki: Dünyada yalnızca belirli bir yörede yetişen bitkidir. Türkiye'de en fazla endemik bitki Toros Dağları kuşağındadır (Kazdağı Göknarı, Kasnak Meşesi, Sığla/Günlük Ağacı - Muğla Köyceğiz).",
                "Relikt (Kalıntı) Bitki: Eski jeolojik dönemlerden günümüze iklim şartlarının değişmesine rağmen korunaklı vadilerde hayatta kalmış bitkidir."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "cog_07",
            subject = Subject.COGRAFYA,
            title = "Türkiye'de Nüfus, Yerleşme ve Göç Politikaları",
            summary = "Nüfus yoğunluğu, seyrek ve yoğun nüfuslu alanlar, göç hareketleri, kır yerleşmeleri (divan, mezra, kom, yayla).",
            keyPoints = listOf(
                "Nüfus Yoğunluğu: Aritmetik nüfus yoğunluğu en yüksek bölge Marmara (özellikle Çatalca-Kocaeli); en düşük bölge Doğu Anadolu'dur.",
                "Nüfusun Seyrek Olduğu Alanlar ve Nedenleri:",
                "- Teke ve Taşeli Platoları: Karstik arazi ve engebe,",
                "- Menteşe Yöresi (Muğla): Dağlık ve engebeli arazi,",
                "- Yıldız Dağları (Kırklareli): Ana ulaşım yollarına sapa kalması ve engebe,",
                "- Tuz Gölü Çevresi: Aşırı kuraklık ve su yetersizliği,",
                "- Hakkari Yöresi: Şiddetli karasallık ve sarp dağlık arazi.",
                "Geçici Köy Altı Yerleşmeleri: Yayla (en yaygın), Kom (büyükbaş - Doğu Anadolu), Ağıl (küçükbaş), Oba (göçebe çadır - Toroslar), Dam (Ege/Marmara).",
                "Kalıcı Köy Altı Yerleşmeleri: Çiftlik, Mahalle, Mezra (tarım ve hayvancılık - Güneydoğu/Doğu), Divan (Batı Karadeniz'de birkaç mahallenin birleşimi)."
            ),
            kpssCodes = listOf(
                "Kalıcı Köy Altı Yerleşmeleri Şifresi: 'Ç-İ-M-D' -> Çiftlik, Mahalle, Mezra, Divan.",
                "Batı Karadeniz'e Özgü Yerleşme: DİVAN."
            ),
            highYieldFacts = listOf(
                "Türkiye nüfusunun yaklaşık %93'ü il ve ilçe merkezlerinde yaşamakta olup nüfus artış hızı son yıllarda belirgin şekilde düşmektedir.",
                "Sinop ve Rize kıyılarında yer şekilleri ve yağış rejimi nedeniyle 'Dağınık Kır Yerleşmesi'; İç ve Güneydoğu Anadolu'da su kaynaklarının kıt olması nedeniyle 'Toplu Kır Yerleşmesi' görülür."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "cog_08",
            subject = Subject.COGRAFYA,
            title = "Madenler, Enerji Kaynakları ve Sanayi Merkezleri",
            summary = "Bor, Demir, Bakır, Boksit, Krom, Mermer, Linyit, Taşkömürü, Petrol, Jeotermal, Rüzgar ve Güneş santralleri.",
            keyPoints = listOf(
                "Bor: Dünya rezervlerinin %73'ü Türkiye'dedir. Balıkesir (Bigadiç, Susurluk), Kütahya (Emet), Bursa (Mustafakemalpaşa), Eskişehir (Seyitgazi - Kırka). Bandırma ve Kırka'da işlenir.",
                "Demir: Sivas (Divriği), Malatya (Hekimhan, Hasançelebi). Demir-çelik fabrikaları: Karabük ve Ereğli (Taşkömürüne yakınlık - enerji kaynağı), İskenderun (Liman ve ulaşım kolaylığı).",
                "Bakır (KADER): Kastamonu (Küre), Artvin (Murgul), Diyarbakır (Ergani), Elazığ (Maden), Rize (Çayeli). Samsun'da işlenir (ulaşım/liman).",
                "Krom: Paslanmaz çelik yapımında kullanılır. Elazığ (Guleman), Muğla (Fethiye-Köyceğiz). Antalya ve Elazığ Ferrokrom tesislerinde işlenir.",
                "Boksit (Alüminyum hammaddesi): Konya (Seydişehir) ve Antalya (Akseki). Seydişehir Alüminyum Tesisleri'nde işlenir.",
                "Mermer: Türkiye'nin ihracatta 1 numaralı madenidir (Afyonkarahisar, Marmara Adası, Bursa, Muğla).",
                "Enerji Kaynakları:",
                "- Taşkömürü: Yalnızca Zonguldak havzası (Çatalağzı termik santrali),",
                "- Linyit: Soma (Manisa), Tunçbilek, Seyitömer (Kütahya), Yatağan (Muğla), Afşin-Elbistan (Kahramanmaraş),",
                "- Petrol: Batman (Raman, Garzan), Adıyaman, Diyarbakır, Şırnak (Gabar). Rafineriler: Batman, Aliağa (İzmir), İpraş (Kocaeli), Orta Anadolu (Kırıkkale).",
                "- Jeotermal: Sarayköy (Denizli), Germencik (Aydın)."
            ),
            kpssCodes = listOf(
                "Bakır Şifresi: 'K-A-D-E-R' (Kastamonu, Artvin, Diyarbakır, Elazığ, Rize).",
                "İhracat Şampiyonu Maden: MERMER.",
                "Doğalgaz Santralleri: Hamitabat (Kırklareli), Ambarlı (İstanbul), Ovaakça (Bursa)."
            ),
            highYieldFacts = listOf(
                "Asfaltit: Şırnak ve Silopi yöresinde çıkarılan yüksek kalorili katı petrol türevidir; Şırnak Silopi Termik Santrali'nde elektrik üretilir.",
                "Rüzgar Enerjisi: Türkiye'de ilk rüzgar santrali İzmir Çeşme (Alaçatı)'de kurulmuştur; en çok Ege ve Marmara'da yoğundur."
            ),
            readTimeMinutes = 10
        )
    )
}
