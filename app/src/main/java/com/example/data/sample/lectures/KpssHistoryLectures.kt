package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssHistoryLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "tar_01",
            subject = Subject.TARIH,
            title = "İslamiyet Öncesi Türk Devletleri & Kültür Medeniyet",
            summary = "Orta Asya ilk Türk devletleri (Asya Hun, Köktürk, Uygur), Kut inancı, ikili teşkilat, ordu-millet anlayışı, töre ve kurultay yapısı.",
            keyPoints = listOf(
                "Kut İnancı: Yönetme yetkisinin Gök Tanrı tarafından hükümdara verildiğine inanılmasıdır. Kan yoluyla hanedan üyelerine geçtiğinden taht kavgalarına yol açmıştır.",
                "İkili Teşkilat: Devletin Doğu (Kağan) ve Batı (Yabgu) olarak federatif yönetilmesidir.",
                "Uygurlar: Maniheizm dinini kabul ederek yerleşik hayata geçen, tarım yapan, matbaayı ve ilk yazılı hukuku kullanan ilk Türk devletidir.",
                "Ordu Sistemi: Mete Han tarafından MÖ 209'da kurulan Onlu Teşkilat Türk Kara Kuvvetleri'nin kuruluş yılı kabul edilir. Hazarlar hariç ücretli askerlik yoktur."
            ),
            kpssCodes = listOf(
                "Kültür Merkezleri: 'A-K-A-T-A' -> Anav (en eski), Kelteminar, Afanasyevo (Türklere ait en eski), Tagar (en gelişmiş).",
                "Hükümdarlık Sembolleri: Otağ, Tuğ, Nevbet (davul), Örgin (taht), Kotuz (sorguç), Yarlığ (emir), Kemer (kur)."
            ),
            highYieldFacts = listOf(
                "Hazarlar: Museviliği kabul eden tek Türk devletidir ve ordusunda paralı asker bulundurmuştur.",
                "Avarlar: Hem Orta Asya'da hem Avrupa'da devlet kurmuş, İstanbul'u kuşatan ilk Türk devletidir (Sasani ittifakıyla)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "tar_02",
            subject = Subject.TARIH,
            title = "İlk Türk-İslam Devletleri & Büyük Selçuklu",
            summary = "Talas Savaşı, Karahanlılar, Gazneliler, Büyük Selçuklu Devleti, Dandanakan, Pasinler ve Malazgirt Savaşları.",
            keyPoints = listOf(
                "Karahanlılar: Orta Asya'da kurulan ilk Müslüman Türk devletidir (Satuk Buğra Han). Resmi dilleri Türkçedir.",
                "Gazneliler: Sultan unvanını ilk kez kullanan hükümdar Gazneli Mahmut'tur (Hindistan'a 17 sefer düzenledi).",
                "Büyük Selçuklu Devleti: Dandanakan Savaşı (1040) ile resmen kuruldu. Pasinler (1048) Bizans ile ilk savaş; Malazgirt (1071 - Sultan Alparslan) Anadolu'nun kapılarını Türklere açan savaştır.",
                "Nizamülmülk: Siyasetname eserinin yazarıdır ve ilk üniversite niteliğindeki Nizamiye Medreselerini kurmuştur."
            ),
            kpssCodes = listOf(
                "İlk Türk-İslam Eserleri: 'K-D-A-D' -> Kutadgu Bilig (Yusuf Has Hacip), Divan-ı Lügat'it Türk (Kaşgarlı Mahmut), Atabetü'l Hakayık (Edip Ahmet), Divan-ı Hikmet (Hoca Ahmet Yesevi).",
                "Selçuklu Divanları: Divan-ı Tuğra (yazışma), Divan-ı İstifa (maliye), Divan-ı İşraf (denetim), Divan-ı Arz (askerlik)."
            ),
            highYieldFacts = listOf(
                "Kaşgarlı Mahmut'un eseri Abbasi Halifesine sunulmuş, ilk Türkçe sözlük ve ilk Türk dünyası haritasını içerir.",
                "Büyük Selçuklu Devleti 1141 Katvan Savaşı'nda Karahitaylara yenilerek yıkılış sürecine girmiştir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "tar_03",
            subject = Subject.TARIH,
            title = "Anadolu Selçuklu Devleti & İlk Türk Beylikleri",
            summary = "Malazgirt sonrası 1. Beylikler (DSMAÇ), Miryokefalon Savaşı, Kösedağ Savaşı ve 2. Beylikler dönemi.",
            keyPoints = listOf(
                "1. Beylikler Şifresi: Danişmentliler (Tokat/Sivas - Yağıbasan Medresesi ilk Anadolu medresesidir), Saltuklular (Erzurum - Mama Hatun), Mengücekliler (Erzincan - Divriği Ulu Cami), Artuklular (Mardin - Malabadi Köprüsü & El-Cezeri), Çaka Beyliği (İzmir - ilk Türk denizcisi).",
                "Miryokefalon Savaşı (1176): II. Kılıç Arslan Bizans'ı yenmiş; Anadolu'nun Türk yurdu olduğu kesinleşmiştir (Yurttutan Savaş).",
                "Kösedağ Savaşı (1243): Moğol İlhanlılara karşı kaybedilmiş ve Anadolu Selçuklu Devleti dağılma sürecine girerek 2. Beylikler dönemi başlamıştır.",
                "Ahi Teşkilatı: Ahi Evran tarafından Kırşehir'de kurulan esnaf ve meslek dayanışma örgütüdür (Letaif-i Hikmet eseri)."
            ),
            kpssCodes = listOf(
                "1. Beylikler: 'D-S-M-A-Ç' -> Danişment, Saltuk, Mengücek, Artuk, Çaka.",
                "Anadolu Savaşları Sırası: Pasinler (Keşif) -> Malazgirt (Kapı Açan) -> Miryokefalon (Yurt Tutan) -> Başkomutanlık (Yurt Kurtaran)."
            ),
            highYieldFacts = listOf(
                "Karamanoğulları: Karamanoğlu Mehmet Bey 1277'de Türkçeyi resmi dil ilan etmiştir.",
                "Karesioğulları: Osmanlı'ya katılan ilk beyliktir; Osmanlı donanmasının temelini oluşturmuştur."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "tar_04",
            subject = Subject.TARIH,
            title = "Osmanlı Devleti Kuruluş ve Yükselme Dönemi",
            summary = "Osman Bey'den Kanuni Sultan Süleyman'a fetihler, İskân ve İstimalet politikaları, İstanbul'un Fethi ve Preveze.",
            keyPoints = listOf(
                "Kuruluş Padişahları: Osman Bey (Bağımsızlık, ilk bakır para, Koyunhisar savaşı), Orhan Bey (Bursa fethi, ilk düzenli ordu Yaya-Müsellem, Divan teşkilatı, Rumeli'ye geçiş Çimpe Kalesi), I. Murat (Sancak sistemi, Yeniçeri ocağı, Edirne başkent, Sırpsındığı ve I. Kosova).",
                "Yıldırım Bayezid: Anadolu Türk siyasi birliğini büyük ölçüde sağladı; 1402 Ankara Savaşı'nda Timur'a yenilince Fetret Devri başladı.",
                "Fatih Sultan Mehmet (II. Mehmet): İstanbul'u fethetti (1453), Orta Çağ kapandı Yeni Çağ başladı. Kanunname-i Âli Osman ile kardeş katlini yasallaştırdı, Topkapı Sarayı'nı yaptırdı.",
                "Yavuz Sultan Selim: Çaldıran, Turnadağ (Dulkadiroğulları son buldu, Anadolu birliği kesinleşti), Mercidabık ve Ridaniye ile Memlükleri yıktı; Halifelik Osmanlı'ya geçti ve Baharat Yolu denetime girdi.",
                "Kanuni Sultan Süleyman: Mohaç Meydan Muharebesi (dünyanın en kısa meydan savaşı - 2 saat), Preveze Deniz Zaferi (1538 - Barbaros Hayrettin Paşa ile Akdeniz Türk gölü haline geldi)."
            ),
            kpssCodes = listOf(
                "İskân: Rumeli'ye Türkmenleri yerleştirme siyaseti.",
                "İstimalet: Hoşgörü ve adaletle fethedilen halkı kendine bağlama politikası."
            ),
            highYieldFacts = listOf(
                "İlk Osmanlı-Safevi antlaşması Kanuni döneminde imzalanan 1555 Amasya Antlaşması'dır.",
                "1533 İstanbul (İbrahim Paşa) Antlaşması ile Avusturya arşidükü protokolde Osmanlı sadrazamına denk sayılmıştır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "tar_05",
            subject = Subject.TARIH,
            title = "Osmanlı Kültür, Medeniyet ve Teşkilat Yapısı",
            summary = "Divan-ı Hümayun üyeleri, Taşra ve Eyalet sistemi (Salyaneli, Salyanesiz), Seyfiye, İlmiye, Kalemiye sınıfları ve Tımar sistemi.",
            keyPoints = listOf(
                "Yönetici Sınıflar: Seyfiye (Kılıç ehli: Sadrazam, Vezirler, Yeniçeri Ağası, Kaptan-ı Derya), İlmiye (Din, hukuk, eğitim: Şeyhülislam, Kazasker, Kadı, Müderris), Kalemiye (Bürokrasi, maliye: Defterdar, Nişancı, Reisülküttab).",
                "Divan Üyeleri: Kazasker (kadı ve müderris atar, şer'i davalara bakar), Nişancı (padişahın tuğrasını çeker, tahrir defterlerini tutar), Reisülküttab (dışişleri bakanı).",
                "Eyaletler: Salyanesiz (Maaşsız / Tımar uygulanan eyaletler: Rumeli, Anadolu), Salyaneli (Yıllıklı / İltizam uygulanan merkeze uzak eyaletler: Mısır, Tunus, Cezayir, Trablusgarp), Özel Statülü Eyaletler (Kırım, Eflak, Boğdan, Hicaz - Hicaz vergi ve asker vermez).",
                "Toprak Sistemi: Miri (Devlet), Mülk (Şahıs), Vakıf (Sosyal hizmetler). Miri toprakların en önemlisi Dirlik arazileridir (Has, Zeamet, Tımar)."
            ),
            kpssCodes = listOf(
                "Dirlik Arazileri: Has (100 bin akçe üstü), Zeamet (20-100 bin), Tımar (3-20 bin).",
                "Kazasker ve Şeyhülislam İLMİYE sınıfındadır! Şeyhülislam sadece dine uygunluk fetvası verir, kanun yapamaz."
            ),
            highYieldFacts = listOf(
                "Devşirme Sistemi: Hristiyan çocukların alınıp yetiştirilmesidir. Zeki olanlar Enderun mektebine bürokrat, güçlü olanlar Acemi Ocağı'na Yeniçeri olarak ayrılır.",
                "Müsadere Sistemi: Devletin haksız kazanç sağlayan veya vefat eden memurun malına el koymasıdır (II. Mahmut kaldırmıştır)."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "tar_06",
            subject = Subject.TARIH,
            title = "Osmanlı Duraklama ve Gerileme Dönemi (17 & 18. Yüzyıl)",
            summary = "Duraklama nedenleri, 17. yüzyıl ıslahatları (Genç Osman, IV. Murat), Lale Devri, Patrona Halil İsyanı, III. Selim ve Nizam-ı Cedit.",
            keyPoints = listOf(
                "17. Yüzyıl Islahatçıları (TOKMAC): Tarhuncu Ahmet (ilk denk bütçe), Genç Osman (II. Osman - Yeniçerileri kaldırmayı ilk düşünen, saray dışı evlenen), Kuyucu Murat, IV. Murat (içki-tütün yasağı, Koçi Bey Risalesi), I. Ahmet (Ekber ve Erşed sistemi, Şehzadeler için Kafes usulü). 17. yüzyılda BATI ETKİSİ KESİNLİKLE YOKTUR!",
                "18. Yüzyıl ve Batılılaşma: 1718 Pasarofça Antlaşması ile Batı'nın üstünlüğü ilk kez kabul edildi ve Lale Devri başladı (1718-1730).",
                "Lale Devri: Padişah III. Ahmet, Sadrazam Nevşehirli Damat İbrahim Paşa, şair Nedim, minyatürcü Levni. İlk geçici elçilik Paris'e açıldı (Yirmisekiz Çelebi Mehmet - Paris Sefaretnamesi). İlk Türk matbaası kuruldu (İbrahim Müteferrika ve Şinasi). Çiçek aşısı getirildi. Lale Devri'nde ASKERİ ALANDA ISLAHAT YAPILMAMIŞTIR!",
                "I. Mahmut: Batı tarzı ilk askeri okul olan Hendesehane'yi kurdu (Comte de Bonneval / Humbaracı Ahmet Paşa).",
                "III. Selim: Kapsamlı reform dönemi: 'Nizam-ı Cedit'. İlk daimi elçilik Londra'da açıldı (Yusuf Agah Efendi). İrad-ı Cedit hazinesi kuruldu. Kabakçı Mustafa İsyanı ile sona erdi."
            ),
            kpssCodes = listOf(
                "17. yy Şifresi: 'T-O-K-M-A-C' (Tarhuncu, Osman, Kuyucu, Murat IV, Ahmet I, Çandarlı/Köprülü).",
                "Lale Devri'nde Askeri Islahat YOKTUR!"
            ),
            highYieldFacts = listOf(
                "Küçük Kaynarca Antlaşması (1774): Kırım bağımsız oldu (Halkı Müslüman ilk toprak kaybı), Osmanlı ilk kez Rusya'ya savaş tazminatı ödedi, Rusya Karadeniz'de donanma bulundurma ve elçilik açma hakkı aldı.",
                "Yaş Antlaşması (1792): Kırım'ın Rusya'ya ait olduğu resmen kabul edildi ve Gerileme Dönemi bitti, Dağılma Dönemi başladı."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "tar_07",
            subject = Subject.TARIH,
            title = "Osmanlı Dağılma Dönemi Islahatları (II. Mahmut & Tanzimat)",
            summary = "Sened-i İttifak, Vaka-i Hayriye, II. Mahmut idari yenilikleri, Tanzimat ve Islahat Fermanları, Kanun-i Esasi ve Meşrutiyet.",
            keyPoints = listOf(
                "II. Mahmut (En Köklü Reformcu): Yeniçeri Ocağı'nı kaldırdı (1826 Vaka-i Hayriye), yerine Asakir-i Mansure-i Muhammediye kuruldu. Divan-ı Hümayun yerine Heyet-i Vükela (Bakanlıklar) kuruldu. Tımar ve Müsadere kaldırıldı. Takvim-i Vekayi ilk resmi gazete çıktı. Muhtarlıklar, posta teşkilatı ve pasaport uygulaması başladı.",
                "Tanzimat Fermanı (1839 - Gülhane Hatt-ı Hümayunu): Sultan Abdülmecit döneminde Mustafa Reşit Paşa okudu. Padişah ilk kez kanun gücünün üstünlüğünü kabul etti. Hukuk devletine ilk adımdır.",
                "Islahat Fermanı (1856): Paris Antlaşması öncesi Avrupalı devletlerin baskısıyla ilan edildi. Gayrimüslimlere cizye kaldırıldı, devlet memuru olma ve bedelli askerlik hakkı tanındı. Küçük düşürücü sözler yasaklandı.",
                "I. Meşrutiyet (1876): II. Abdülhamit döneminde Genç Osmanlıların (Jön Türkler) baskısıyla Kanun-i Esasi (ilk anayasa) ilan edildi. Halk ilk kez padişahın yanında yönetime katıldı (Mebusan Meclisi ve Ayan Meclisi)."
            ),
            kpssCodes = listOf(
                "Fermanların Karşılaştırması: Tanzimat Fermanı tüm tebaaya (Müslüman + Gayrimüslim) yöneliktir; Islahat Fermanı ise neredeyse tamamen Gayrimüslimlere ayrıcalıklar tanır.",
                "Duyun-u Umumiye (1881 Muharrem Kararnamesi): Osmanlı'nın iflasını ilan etmesi üzerine dış borçları tahsil etmek için kurulan yabancı Genel Borçlar İdaresi'dir."
            ),
            highYieldFacts = listOf(
                "Kırım Savaşı (1853-1856): Osmanlı ilk kez İngiltere'den dış borç almıştır. Florance Nightingale (Lambalı Kadın) Selimiye Kışlası'nda yaralı askerleri tedavi etmiştir.",
                "II. Meşrutiyet (1908): İttihat ve Terakki Cemiyeti'nin etkisiyle ilan edildi. 31 Mart Vakası (1909) rejime karşı ilk irticai isyandır; Hareket Ordusu (Kurmay Başkanı Kolağası Mustafa Kemal) bastırmış ve II. Abdülhamit tahttan indirilmiştir."
            ),
            readTimeMinutes = 10
        ),
        TopicLecture(
            id = "tar_08",
            subject = Subject.TARIH,
            title = "20. Yüzyıl Başlarında Osmanlı (Trablusgarp & Balkan Savaşları)",
            summary = "Trablusgarp Savaşı, Uşi Antlaşması, I. ve II. Balkan Savaşları, Bâb-ı Âli Baskını ve Londra/Bükreş antlaşmaları.",
            keyPoints = listOf(
                "Trablusgarp Savaşı (1911-1912): İtalya'nın sömürge arayışıyla başladı. Mustafa Kemal (Gazeteci Şerif Bey takma adıyla) Derne ve Tobruk'ta, Enver Bey Bingazi'de yerli halkı örgütleyerek İtalyanları durdurdu (Mustafa Kemal'in ilk askeri başarısı). Dünya tarihinde ilk kez uçak bu savaşta İtalyanlar tarafından kullanıldı.",
                "Uşi Antlaşması (1912): Osmanlı Kuzey Afrika'daki son toprak parçasını (Trablusgarp ve Bingazi) kaybetti. On İki Ada geçici olarak İtalya'ya bırakıldı.",
                "I. Balkan Savaşı (1912): Karadağ'ın Osmanlı'ya saldırmasıyla başladı (Bulgaristan, Yunanistan, Sırbistan, Karadağ). Osmanlı Midye-Enez hattının batısındaki tüm Rumeli topraklarını, Edirne ve Kırklareli'yi kaybetti (Londra Antlaşması). Arnavutluk bu kargaşada bağımsızlığını ilan eden son Balkan devleti oldu.",
                "Bâb-ı Âli Baskını (1913): Enver Paşa öncülüğünde İttihatçıların hükümet darbesiyle Kamil Paşa kabinesini devirip iktidarı ele geçirmesidir.",
                "II. Balkan Savaşı (1913): Bulgaristan'ın I. savaşta fazla pay almasına karşı Sırbistan, Yunanistan, Karadağ ve I. savaşa girmeyen ROMANYA Bulgaristan'a savaş açtı. Osmanlı Edirne ve Kırklareli'yi geri aldı (Edirne Fatihi Enver Paşa)."
            ),
            kpssCodes = listOf(
                "I. Balkan'a Katılanlar: Sırbistan, Yunanistan, Karadağ, Bulgaristan.",
                "II. Balkan'a Sonradan Katılan Devlet: ROMANYA!",
                "Osmanlı'dan Ayrılan Son Balkan Devleti: ARNAVUTLUK."
            ),
            highYieldFacts = listOf(
                "Hamidiye Kahramanı: Rauf Orbay, I. Balkan Savaşı'nda Hamidiye Kruvazörü ile Ege Denizi'nde Yunan donanmasına karşı gösterdiği başarılarla bu unvanı almıştır.",
                "Mustafa Kemal I. Balkan Savaşı sırasında Gelibolu Bolayır Kolordusu'nda görev yapmış; bu tecrübe Çanakkale Savaşı'nda araziyi tanımasını sağlamıştır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "tar_09",
            subject = Subject.TARIH,
            title = "I. Dünya Savaşı (1914-1918) ve Cepheler",
            summary = "Savaşın nedenleri, Osmanlı'nın savaşa girişi (Goben ve Breslau), Taarruz, Savunma ve Yardım cepheleri, Çanakkale ve Kut'ül Amare zaferleri.",
            keyPoints = listOf(
                "Osmanlı'nın Savaşa Girişi: Alman Goben ve Breslau (Yavuz ve Midilli) zırhlılarının Rus limanlarını (Sivastopol, Odessa) bombalamasıyla savaşa girildi.",
                "Taarruz Cepheleri (2K): Kafkas Cephesi (Sarıkamış faciası, Ermeni Tehcir Kanunu; Mustafa Kemal Muş ve Bitlis'i Ruslardan geri alıp Altın Kılıç madalyası kazandı) ve Kanal Cephesi (Cemal Paşa komutasında Mısır'ı İngilizlerden geri almak için açıldı, başarısız oldu).",
                "Savunma Cepheleri: Çanakkale, Irak, Suriye-Filistin, Hicaz-Yemen.",
                "Çanakkale Cephesi (1915): 18 Mart Deniz Zaferi (Cevat Çobanlı Paşa) ve Anafartalar, Conkbayırı, Arıburnu Kara Savaşları (Anafartalar Kahramanı Albay Mustafa Kemal: 'Ben size taarruzu değil, ölmeyi emrediyorum!'). Rusya'ya yardım gidemedi, Çarlık Rusya çöktü ve savaş en az 2 yıl uzadı.",
                "Irak Cephesi: Kut'ül Amare Zaferi (1916) - Halil Kut Paşa komutasında İngiliz General Townshend ve 13 bin askeri esir alındı.",
                "Hicaz-Yemen Cephesi: Fahrettin Paşa (Çöl Kaplanı / Medine Müdafii) Medine'yi ve Peygamber kabrini İngiliz-Arap ittifakına karşı kahramanca savundu."
            ),
            kpssCodes = listOf(
                "Taarruz Cepheleri: 'K-K' (Kafkas ve Kanal).",
                "Yardım Cepheleri (Sınır Dışı): 'G-R-M' (Galiçya, Romanya, Makedonya).",
                "Kafkas Cephesini Kapatan Antlaşma: 1918 Brest-Litowsk (Rusya Kars, Ardahan ve Batum'u iade etti)."
            ),
            highYieldFacts = listOf(
                "Mustafa Kemal'in I. Dünya Savaşı'nda savaştığı cepheler sırasıyla: ÇANAKKALE -> KAFKAS -> SURİYE-FİLİSTİN (Ç-K-S şifresi).",
                "Savaştan ilk çekilen İttifak devleti Bulgaristan olmuştur (Selanik Ateşkesi); böylece Osmanlı ile Almanya'nın kara bağlantısı kopmuştur."
            ),
            readTimeMinutes = 10
        ),
        TopicLecture(
            id = "tar_10",
            subject = Subject.TARIH,
            title = "Mondros Ateşkesi, İşgaller & Zararlı-Yararlı Cemiyetler",
            summary = "Mondros'un 7. ve 24. maddeleri, Paris Barış Konferansı, İzmir'in İşgali (Hasan Tahsin), Milli ve Zararlı Cemiyetler.",
            keyPoints = listOf(
                "Mondros Ateşkes Antlaşması (30 Ekim 1918): Limni Adası'nın Mondros Limanı'nda Agamemnon zırhlısında imzalandı. Osmanlı adına Rauf Orbay, İtilaf adına Amiral Calthorpe imzaladı.",
                "Ölümcül Maddeler: Madde 7 (İtilaf devletleri güvenliklerini tehdit edecek bir durum ortaya çıkarsa herhangi bir stratejik noktayı işgal edebilecek - Anadolu'yu işgale açık hale getirdi). Madde 24 (Vilayet-i Sitte'de / 6 Doğu ilinde karışıklık çıkarsa işgal edilecek - Büyük Ermenistan kurma amacı).",
                "İlk İşgal Edilen Yerler: Musul (İngiltere tarafından ilk işgal edilen Osmanlı toprağı), Anadolu'da ilk işgal edilen yer Hatay Dörtyol (Fransa - İlk kurşun Kara Mehmet Çavuş).",
                "İzmir'in İşgali (15 Mayıs 1919): Yunanistan işgal etti; Hukuk-ı Beşer gazetesi yazarı Hasan Tahsin (Osman Nevres) ilk kurşunu sıkarak şehit oldu.",
                "Yararlı Cemiyetler: Trakya-Paşaeli, İzmir Müdafaa-i Hukuk, Reddi İlhak, Trabzon Muhafaza-i Hukuk, Şark Vilayetleri (Doğu Anadolu) Müdafaa-i Hukuk, Kilikyalılar (Çukurova - Fransız ve Ermenilere karşı), Milli Kongre (Dr. Esat Işık - Kuvay-ı Milliye tabirini ilk kullanan, basın-yayın yoluyla mücadele eden cemiyet)."
            ),
            kpssCodes = listOf(
                "Vilayet-i Sitte İlleri (Madde 24): 'B-E-S-V-A-D' -> Bitlis, Erzurum, Sivas, Van, Elazığ (Harput), Diyarbakır.",
                "Kilikyalılar Cemiyeti ADI YANILTICI OLAN BİR YARARLI CEMİYETTİR (Adana ve Çukurova bölgesini savunur)."
            ),
            highYieldFacts = listOf(
                "Amiral Bristol Raporu: Batı Anadolu'da Türklerin çoğunlukta olduğunu, Rumların iddialarının asılsız olduğunu ve Yunan işgalinin haksız olduğunu belirten İLK ULUSLARARASI BELGEDİR.",
                "General Harbord Raporu: Doğu Anadolu'da Ermenilerin çoğunlukta olmadığını belirten rapordur."
            ),
            readTimeMinutes = 9
        )
    )
}
