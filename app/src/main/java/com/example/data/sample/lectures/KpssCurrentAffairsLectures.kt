package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssCurrentAffairsLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "gun_01",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin İlk Astronotu ve Ax-3 Uzay Misyonu",
            summary = "Alper Gezeravcı'nın Uluslararası Uzay İstasyonu (ISS) görevi, fırlatma tarihi, uzaydaki ilk sözleri ve 13 bilimsel deney.",
            keyPoints = listOf(
                "Tarihi Uçuş: 18 Ocak 2024 tarihinde Florida'daki Kennedy Uzay Merkezi'nden fırlatılan Falcon 9 roketi ve Dragon uzay aracı ile Axiom-3 (Ax-3) mürettebatı uzaya gönderildi.",
                "İlk Türk Astronot: Hava Pilot Albay Alper Gezeravcı, Türkiye'nin insanlı ilk uzay misyonunu gerçekleştiren ilk astronotu olmuştur.",
                "Tarihe Geçen Söz: Gezeravcı'nın uzay kapsülünden dünyaya ilettiği ilk söz, Mustafa Kemal Atatürk'ün 'İstikbal göklerdedir' vecizesi olmuştur.",
                "Bilimsel Deneyler: Uluslararası Uzay İstasyonu'nda mikro yerçekimi altında genetik, tıp, malzeme bilimi ve botanik alanında Türk üniversiteleri ve TÜBİTAK MAM tarafından hazırlanan 13 deney gerçekleştirilmiştir."
            ),
            kpssCodes = listOf(
                "Uzay Misyonu Kodlaması: Ax-3 (Axiom Space 3), Dragon Kapsülü, Kennedy Uzay Merkezi, 13 Bilimsel Deney.",
                "İstikbal göklerdedir! (Uzaydaki ilk telsiz konuşması)."
            ),
            highYieldFacts = listOf(
                "Türkiye Uzay Ajansı (TUA) 2018 yılında kurulmuş olup merkezi Ankara'dadır.",
                "Alper Gezeravcı uzayda yaklaşık 21 gün kalmış ve 9 Şubat 2024'te dünyaya başarılı iniş yapmıştır."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_02",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin İkinci Astronotu: Tuva Cihangir Atasever",
            summary = "Tuva Cihangir Atasever'in Virgin Galactic 07 uçuşuyla yörünge altı araştırma görevi ve mikro yerçekimi deneyleri.",
            keyPoints = listOf(
                "İkinci Türk Astronot: Tuva Cihangir Atasever, Türkiye'nin ikinci astronotu olarak uzay misyonunu tamamlamıştır.",
                "Görev Türü: 8 Haziran 2024 tarihinde New Mexico'daki Spaceport America üssünden gerçekleştirilen 'Galactic 07' adlı yörünge altı (suborbital) araştırma uçuşudur.",
                "VSS Unity Uzay Aracı: Uçuş sırasında Atasever, yaklaşık 90 kilometre irtifaya ulaşarak mikro yerçekimi ortamında 7 farklı bilimsel deney yürütmüştür.",
                "Uçuş Kıyafeti ve Simge: Uçuş tulumunda Türk bayrağı ile birlikte Azerbaycan bayrağını da göğsünde taşımıştır."
            ),
            kpssCodes = listOf(
                "İki Astronotumuz: 1. Alper Gezeravcı (Yörünge - ISS), 2. Tuva Cihangir Atasever (Yörünge altı - Suborbital).",
                "Fırlatma Üssü: Spaceport America (New Mexico)."
            ),
            highYieldFacts = listOf(
                "Tuva Cihangir Atasever ROKETSAN'da sistem mühendisi olarak görev yapmaktaydı.",
                "Deneyleri arasında insülin seviyeleri, beyin kan dolaşımı ve radyasyon dozimetre ölçümleri yer almıştır."
            ),
            readTimeMinutes = 6
        ),
        TopicLecture(
            id = "gun_03",
            subject = Subject.GUNCEL_BILGILER,
            title = "Milli Savunma Hamleleri: KAAN, HÜRJET, KIZILELMA ve ANKA-3",
            summary = "Milli Muharip Uçak KAAN'ın ilk uçuşu, insansız savaş uçakları, jet eğitim uçakları ve TUSAŞ/BAYKAR projeleri.",
            keyPoints = listOf(
                "Milli Muharip Uçak KAAN: 5. nesil hayalet (stealth) savaş uçağımızdır. 21 Şubat 2024'te ilk uçuşunu başarıyla gerçekleştirmiştir (TUSAŞ).",
                "KIZILELMA: Baykar tarafından geliştirilen Türkiye'nin ilk insansız savaş uçağıdır (MİUS). Turbofan motorlu, süpersonik hızlara ve radar görünmezliğine sahiptir.",
                "HÜRJET: Türkiye'nin ilk insanlı jet motorlu eğitim ve hafif taarruz uçağıdır; ilk uçuşunu 2023'te yapmıştır.",
                "ANKA-3: TUSAŞ tarafından geliştirilen 'uçan kanat' (flying wing) gövde tasarımına sahip derin taarruz kabiliyetli görünmez İHA'dır.",
                "TCG Anadolu: Dünyanın ilk SİHA (İHA) gemisi ve Türk Deniz Kuvvetleri'nin en büyük amiral gemisidir (LHD sınıfı çok maksatlı amfibi hücum gemisi)."
            ),
            kpssCodes = listOf(
                "5. Nesil Savaş Uçağımız: KAAN (İlk uçuş: 21 Şubat 2024).",
                "Dünyanın İlk SİHA Gemisi: TCG Anadolu (2023 yılında envantere girdi)."
            ),
            highYieldFacts = listOf(
                "GÖKBEY: Türkiye'nin ilk yerli ve milli genel maksat helikopteridir (TS1400 yerli turboşaft motoru ile uçmuştur).",
                "ALTAY: Türkiye'nin yerli ana muharebe tankıdır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_04",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin İlk Yerli Haberleşme Uydusu: TÜRKSAT 6A",
            summary = "TÜRKSAT 6A'nın üretimi, fırlatılması, uydunun kapsama alanı ve Türkiye'nin uzay ligindeki konumu.",
            keyPoints = listOf(
                "TÜRKSAT 6A: Türkiye'nin ilk yerli ve milli haberleşme uydusudur. TÜBİTAK UZAY, ASELSAN, TUSAŞ ve CTECH ortaklığıyla üretilmiştir.",
                "Fırlatma Tarihi ve Yeri: 8 Temmuz 2024'te ABD Cape Canaveral Uzay Üssü'nden SpaceX Falcon 9 roketi ile fırlatılmıştır.",
                "Yörünge Konumu: 42° Doğu boylamında yer alacaktır.",
                "Stratejik Önemi: Türkiye kendi haberleşme uydusunu üretebilen dünyadaki 11 ülkeden biri olmuştur. Kapsama alanına Hindistan, Tayland, Malezya ve Endonezya gibi Güneydoğu Asya ülkeleri de dahil olmuştur."
            ),
            kpssCodes = listOf(
                "Türkiye'nin Uyduları: İmece (Yüksek çözünürlüklü yerli gözlem uydusu - 2023), Türksat 6A (İlk yerli haberleşme uydusu - 2024).",
                "42 Derece Doğu boylamı Türk haberleşme uydularının ana yörüngesidir."
            ),
            highYieldFacts = listOf(
                "RASAT: Türkiye'nin ilk yerli yer gözlem uydusudur.",
                "GÖKTÜRK-1 ve GÖKTÜRK-2: Askeri ve sivil yüksek çözünürlüklü keşif-gözlem uydularımızdır."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_05",
            subject = Subject.GUNCEL_BILGILER,
            title = "UNESCO Dünya Mirası: Gordion Antik Kenti (2023)",
            summary = "Türkiye'nin 20. UNESCO Dünya Miras Alanı: Ankara Polatlı'daki Frigya Krallığı'nın başkenti Gordion.",
            keyPoints = listOf(
                "Tescil Tarihi: Eylül 2023'te Suudi Arabistan'ın Riyad kentinde toplanan 45. Dünya Miras Komitesi toplantısında kabul edildi.",
                "Konumu: Ankara'nın Polatlı ilçesinde, Sakarya ve Porsuk nehirlerinin birleştiği noktadadır.",
                "Tarihi Önemi: Frigya Krallığı'nın siyasi, ticari ve kültürel başkentidir. Kral Midas Tümülüsü (Büyük Tümülüs) ve meşhur 'Kör Düğüm' (Gordion Düğümü) efsanesinin geçtiği yerdir.",
                "Özelliği: Türkiye'nin UNESCO Dünya Miras Listesi'ne giren 20. kültür varlığı olmuştur."
            ),
            kpssCodes = listOf(
                "20. UNESCO Mirasımız: GORDİON (Ankara Polatlı - Frigya Başkenti).",
                "Kral Midas Tümülüsü ahşap mezar odası mimarisiyle dünyanın en eski ayakta duran ahşap yapılarındandır."
            ),
            highYieldFacts = listOf(
                "Büyük İskender Asya seferine çıkarken Gordion'a uğramış ve çözülemeyen düğümü kılıcıyla kesmiştir.",
                "Ankara'dan listeye giren ilk müstakil kültürel miras alanıdır."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_06",
            subject = Subject.GUNCEL_BILGILER,
            title = "UNESCO: Anadolu'nun Ahşap Hipostil Camileri (2023)",
            summary = "Türkiye'nin 21. UNESCO Dünya Miras Alanı: 5 ildeki Selçuklu ve Beylikler dönemi ahşap tavanlı ve ahşap direkli camiler.",
            keyPoints = listOf(
                "21. UNESCO Mirası: 'Anadolu'nun Ortaçağ Dönemi Ahşap Hipostil Camileri' adıyla seri tescil edilmiştir (Eylül 2023).",
                "Dahil Edilen 5 Cami:",
                "1) Konya - Beyşehir Eşrefoğlu Camii (Ahşap direkli camilerin en büyüğü ve karlık kuyusu vardır),",
                "2) Eskişehir - Sivrihisar Ulu Camii (Geniş ahşap sütunlu Selçuklu mirası),",
                "3) Kastamonu - Kasaba Köyü Mahmut Bey Camii ('Çivisiz Cami' olarak bilinir),",
                "4) Ankara - Samanpazarı Arslanhane (Ahi Şerafeddin) Camii,",
                "5) Afyonkarahisar - Ulu Cami (40 ahşap direkli kündekari şaheseri)."
            ),
            kpssCodes = listOf(
                "5 Ahşap Cami Şifresi: 'B-S-M-A-A' -> Beyşehir (Eşrefoğlu), Sivrihisar, Mahmut Bey (Kastamonu), Arslanhane (Ankara), Afyon Ulu Cami.",
                "Çivisiz Cami: Kastamonu Kasaba Köyü Mahmut Bey Camii."
            ),
            highYieldFacts = listOf(
                "Eşrefoğlu Camii, sedir ağacından yapılmış 48 adet ahşap direğe sahiptir ve ortasında çatıda toplanan karın atıldığı karlık havuzu bulunur.",
                "Bu tescille Türkiye'nin UNESCO Dünya Miras Listesi'ndeki alan sayısı 21'e yükselmiştir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_07",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türk Devletleri Teşkilatı (TDT) & 2024-2026 Zirveleri",
            summary = "TDT üyeleri, gözlemci devletler, Nahçıvan Anlaşması, Bişkek ve Şuşa Zirveleri.",
            keyPoints = listOf(
                "Kuruluş: 3 Ekim 2009 Nahçıvan Anlaşması ile Türk Keneşi adıyla kuruldu; 2021 İstanbul Zirvesi'nde adı 'Türk Devletleri Teşkilatı' (TDT) olarak değiştirildi.",
                "5 Tam Üye: Türkiye, Azerbaycan, Kazakistan, Özbekistan ve Kırgızistan.",
                "3 Gözlemci Üye: Türkmenistan (daimi tarafsızlık statüsünden ötürü gözlemcidir), Macaristan ve Kuzey Kıbrıs Türk Cumhuriyeti (KKTC - 2022 Semerkant zirvesinde gözlemci oldu).",
                "Merkez: Teşkilatın Genel Sekreterliği İstanbul'dadır.",
                "Ortak Alfabe Kararı: Eylül 2024'te Bakü'de toplanan Türk Dünyası Ortak Alfabe Komisyonu, 34 harften oluşan Ortak Türk Alfabesi üzerinde uzlaşmaya varmıştır."
            ),
            kpssCodes = listOf(
                "Tam Üyeler: 'T-A-K-Ö-K' -> Türkiye, Azerbaycan, Kazakistan, Özbekistan, Kırgızistan.",
                "Gözlemci Üyeler: Türkmenistan, Macaristan, KKTC.",
                "3 Ekim: Türk Dili Konuşan Ülkeler İşbirliği Günü olarak kutlanır."
            ),
            highYieldFacts = listOf(
                "TÜRKSOY (Uluslararası Türk Kültürü Teşkilatı) merkezi Ankara'dadır ve 'Türk Dünyasının UNESCO'su' olarak anılır.",
                "Türk Akademisi merkezi Kazakistan'ın Astana kentindedir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_08",
            subject = Subject.GUNCEL_BILGILER,
            title = "Birleşmiş Milletler (BM) Teşkilatı ve 5 Daimi Üye",
            summary = "BM'nin 1945'te kuruluşu, San Francisco Konferansı, Güvenlik Konseyi veto hakkına sahip 5 daimi üye (FİRÇA) ve Genel Sekreter.",
            keyPoints = listOf(
                "Kuruluş: 24 Ekim 1945 tarihinde kuruldu. Merkezi New York'tadır. Türkiye kurucu üyeler arasındadır.",
                "BM Güvenlik Konseyi (BMGK): Toplam 15 üyeden oluşur. 10 geçici üye (2 yıllığına Genel Kurulca seçilir) ve 5 veto yetkili daimi üye.",
                "5 Daimi Üye (Veto Yetkisi Olanlar): Fransa, İngiltere, Rusya, Çin, Amerika Birleşik Devletleri (ABD).",
                "Mevcut Genel Sekreter: Portekizli diplomat António Guterres.",
                "Uluslararası Adalet Divanı: BM'nin başlıca yargı organıdır; merkezi Hollanda'nın Lahey (The Hague) kentindedir."
            ),
            kpssCodes = listOf(
                "5 Daimi Veto Üyesi Şifresi: 'F-İ-R-Ç-A' -> Fransa, İngiltere, Rusya, Çin, ABD.",
                "'Dünya 5'ten büyüktür!' ilkesi BMGK'nın 5 daimi üyesinin veto tekelini eleştiren Türk dış politikası sloganıdır."
            ),
            highYieldFacts = listOf(
                "BM Genel Kurulu'nda her ülkenin tek oy hakkı vardır ancak kararları tavsiye niteliğindedir; bağlayıcı kararları sadece Güvenlik Konseyi alır.",
                "İsviçre BM'ye 2002 yılında halkoylamasıyla çok geç katılmıştır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_09",
            subject = Subject.GUNCEL_BILGILER,
            title = "NATO (Kuzey Atlantik Antlaşması) & Yeni Katılan Üyeler",
            summary = "NATO'nun 1949'da kuruluşu, Türkiye'nin 1952'de katılımı (Kore Savaşı), 5. Madde ve son katılan üyeler (Finlandiya ve İsveç).",
            keyPoints = listOf(
                "Kuruluş: 4 Nisan 1949 Washington Antlaşması ile kuruldu. Merkezi Brüksel'dedir (Belçika).",
                "Türkiye'nin Katılımı: Türkiye ve Yunanistan 1952 yılında (Kore Savaşı'na asker gönderilmesinin ardından) NATO'ya üye olmuştur.",
                "Madde 5 (Kolektif Savunma): Bir üyeye yapılan saldırı tüm üyelere yapılmış sayılır prensibidir.",
                "31. Üye: Finlandiya (Nisan 2023'te katıldı).",
                "32. Üye: İsveç (Mart 2024'te katıldı). NATO üye sayısı 32'ye yükselmiştir.",
                "Yeni Genel Sekreter: 2024 sonbaharında Jens Stoltenberg'in yerine eski Hollanda Başbakanı Mark Rutte NATO Genel Sekreteri olmuştur."
            ),
            kpssCodes = listOf(
                "En Son Katılan 2 Üye: 31. Finlandiya (2023), 32. İsveç (2024).",
                "NATO Genel Sekreteri: Mark Rutte (2024)."
            ),
            highYieldFacts = listOf(
                "Fransa 1966'da Charles de Gaulle döneminde askeri kanattan çekilmiş, 2009'da Sarkozy döneminde geri dönmüştür.",
                "Kuzey Makedonya 2020'de 30. üye olarak katılmıştı."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_10",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin Dev Enerji Projeleri: Karadeniz Gazı & Akkuyu NGS",
            summary = "Sakarya Gaz Sahası Filyos Limanı işleme tesisi, Fatih/Yavuz/Kanuni/Abdülhamid Han sondaj gemileri ve Akkuyu Nükleer Güç Santrali.",
            keyPoints = listOf(
                "Sakarya Gaz Sahası: Karadeniz açıklarında (Tuna-1 kuyusu) Fatih Sondaj Gemisi tarafından 2020'de keşfedilen dev doğal gaz rezervidir. Gaz, Zonguldak Çaycuma Filyos Limanı'ndaki doğal gaz işleme tesisinden karaya ulaştırılmıştır.",
                "Sondaj Gemilerimiz (4 Adet): Fatih, Yavuz, Kanuni ve Abdülhamid Han (en gelişmiş 7. nesil sondaj gemisi). Sismik arama gemilerimiz: Oruç Reis ve Barbaros Hayrettin Paşa.",
                "Akkuyu Nükleer Güç Santrali (NGS): Mersin Gülnar ilçesinde Rusya (Rosatom) ortaklığıyla inşa edilmektedir. Türkiye'nin ilk nükleer santralidir. 4 reaktörden (VVER-1200) oluşur ve ilk ünitesi nükleer yakıt alarak resmen nükleer tesis statüsü kazanmıştır.",
                "Sinop NGS: Türkiye'nin planlanan ikinci nükleer santralidir."
            ),
            kpssCodes = listOf(
                "Sondaj Gemileri: Fatih, Yavuz, Kanuni, Abdülhamid Han.",
                "İlk Nükleer Santral: Akkuyu (Mersin Gülnar)."
            ),
            highYieldFacts = listOf(
                "Doğal Gaz Depolama Tesisleri: Silivri Yeraltı Doğal Gaz Depolama Tesisi (Avrupa'nın en büyük deniz gaz deposu) ve Tuz Gölü Yeraltı Doğal Gaz Depolama Tesisi.",
                "Şırnak Gabar Dağı'nda (Şehit Esma Çevik ve Şehit Aybüke Yalçın sahaları) yüksek kaliteli petrol rezervi keşfedilmiştir."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "gun_11",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin Rekortmen Köprüleri ve Viyadükleri",
            summary = "1915 Çanakkale Köprüsü, Osmangazi Köprüsü, Yavuz Sultan Selim Köprüsü, Eğiste Hadimi Viyadüğü ve Botan Çayı Beğendik Köprüsü.",
            keyPoints = listOf(
                "1915 Çanakkale Köprüsü: Çanakkale Boğazı'nda Malkara-Çanakkale otoyolu üzerindedir. 2023 metrelik orta açıklığıyla 'Dünyanın en uzun orta açıklıklı asma köprüsü' unvanına sahiptir. Kule yüksekliği 318 metredir (18 Mart Çanakkale Zaferi'ni simgeler).",
                "Osmangazi Köprüsü: İzmit Körfezi geçişi (Gebze-Orhangazi-İzmir otoyolu). Dünyanın en uzun dördüncü asma köprüsüdür.",
                "Yavuz Sultan Selim Köprüsü: İstanbul Boğazı'nın 3. köprüsüdür. Üzerinde demiryolu bulunan dünyanın en geniş asma köprüsüdür.",
                "Eğiste Hadimi Viyadüğü: Konya Hadim ilçesinde yer alır. Türkiye'nin en yüksek ayaklı viyadüğüdür (ayak yüksekliği 166 metre).",
                "Beğendik (Botan Çayı) Köprüsü: Siirt Pervari'de inşa edilen Türkiye'nin en yüksek dengeli konsol köprüsüdür."
            ),
            kpssCodes = listOf(
                "Dünyanın En Uzun Asma Köprüsü: 1915 Çanakkale Köprüsü (2023 metre açıklık - Cumhuriyetin 100. yılı anısına).",
                "En Yüksek Ayaklı Viyadük: Eğiste Hadimi Viyadüğü (Konya)."
            ),
            highYieldFacts = listOf(
                "Çanakkale Köprüsü'nün kırmızı-beyaz kuleleri Seyit Onbaşı'nın kaldırdığı top mermisi figürü ile taçlandırılmıştır.",
                "Kömürhan Köprüsü: Malatya ile Elazığ arasındaki Fırat Nehri üzerinde modern eğik kablo gergili köprüdür."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_12",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin Rekortmen Tünelleri",
            summary = "Yeni Zigana Tüneli, Ovit Dağı Tüneli, Ilgaz 15 Temmuz İstiklal Tüneli, Avrasya Tüneli ve Kop Dağı Tüneli.",
            keyPoints = listOf(
                "Yeni Zigana Tüneli: Trabzon - Gümüşhane karayolu üzerinde, çift tüp 14.5 kilometre uzunluğu ile 'Türkiye'nin ve Avrupa'nın en uzun, dünyanın ise 3. en uzun karayolu tüneli'dir (Mayıs 2023'te açıldı).",
                "Ovit Tüneli: Rize İkizdere ile Erzurum İspir arasında yer alır. 14.3 km uzunluğundadır (Türkiye'nin 2. en uzun tüneli).",
                "Ilgaz 15 Temmuz İstiklal Tüneli: Kastamonu ile Çankırı arasında Ilgaz Dağı'nı aşan 5.4 km'lik tüneldir.",
                "Avrasya Tüneli: İstanbul Boğazı'nı deniz tabanının altından geçen iki katlı karayolu tünelidir.",
                "Marmaray: İstanbul Boğazı'nı tüp tünelle bağlayan demiryolu hattıdır (Asrın Projesi)."
            ),
            kpssCodes = listOf(
                "En Uzun Çift Tüp Karayolu Tüneli: Yeni Zigana Tüneli (14.5 km - Trabzon/Gümüşhane).",
                "2. En Uzun Tünel: Ovit Tüneli (14.3 km - Rize/Erzurum)."
            ),
            highYieldFacts = listOf(
                "Avrasya Tüneli sadece hafif araçlara (otomobil ve minibüs) açıktır; ağır vasıtalar ve motosikletler giremez.",
                "Sabuncubeli Tüneli: İzmir ile Manisa arasındaki ulaşım süresini 15 dakikaya indirmiştir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_13",
            subject = Subject.GUNCEL_BILGILER,
            title = "Kültür Başkentleri ve Türk Dünyası Kültür Başkenti Şehirleri",
            summary = "TÜRKSOY Türk Dünyası Kültür Başkentleri (Bursa, Şuşa, Anev, Aktav) ve Avrupa Kültür Başkentleri.",
            keyPoints = listOf(
                "2022 Türk Dünyası Kültür Başkenti: Bursa (Türkiye).",
                "2023 Türk Dünyası Kültür Başkenti: Şuşa (Azerbaycan'ın kültür başkenti ve zafer simgesi).",
                "2024 Türk Dünyası Kültür Başkenti: Anev (Türkmenistan - antik medeniyet kenti).",
                "2025 Türk Dünyası Kültür Başkenti: Aktav (Kazakistan).",
                "Avrupa Kültür Başkenti: 2010 yılında İstanbul Avrupa Kültür Başkenti unvanını taşımıştı. 2024 yılı Avrupa Kültür Başkentleri: Bad Ischl (Avusturya), Bodø (Norveç) ve Tartu (Estonya)."
            ),
            kpssCodes = listOf(
                "Türk Dünyası Kültür Başkentleri Sırası: 2022 Bursa -> 2023 Şuşa -> 2024 Anev -> 2025 Aktav.",
                "TÜRKSOY tarafından seçilir."
            ),
            highYieldFacts = listOf(
                "İlk Türk Dünyası Kültür Başkenti 2012 yılında Kazakistan'ın Astana kenti seçilmiştir.",
                "Türkiye'den Eskişehir 2013'te ve Bursa 2022'de Türk Dünyası Kültür Başkenti olmuştur."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_14",
            subject = Subject.GUNCEL_BILGILER,
            title = "Nobel Ödüllü Türkler ve Önemli Bilim İnsanları",
            summary = "Prof. Dr. Aziz Sancar, Orhan Pamuk, Prof. Dr. Uğur Şahin & Dr. Özlem Türeci, Cahit Arf ve Oktay Sinanoğlu.",
            keyPoints = listOf(
                "Prof. Dr. Aziz Sancar: 2015 Nobel Kimya Ödülü'nü hücrelerin hasar gören DNA'ları nasıl onardığını ve genetik bilgisini koruduğunu haritalandıran araştırmalarıyla (DNA Onarımı) kazanmıştır. Mardin Savur doğumludur. Madalyasını Anıtkabir'e bağışlamıştır.",
                "Orhan Pamuk: 2006 Nobel Edebiyat Ödülü'nü kazanmıştır (Nobel alan ilk Türk vatandaşıdır). Önemli romanları: Beyaz Kale, Kara Kitap, Benim Adım Kırmızı, Kar, Masumiyet Müzesi.",
                "Prof. Dr. Uğur Şahin ve Dr. Özlem Türeci: BioNTech kurucuları olarak mRNA tabanlı ilk Covid-19 aşısını (Comirnaty) geliştirmişlerdir. Almanya'nın en yüksek devlet liyakat nişanını almışlardır.",
                "Cahit Arf: 'Arf Değişmezi', 'Arf Halkaları' teoremleriyle dünya matematik tarihine geçmiştir. 10 TL banknotunun arkasında portresi yer alır.",
                "Prof. Dr. Oktay Sinanoğlu: Yale Üniversitesi'nde 26 yaşında en genç profesör unvanını almış, 'Türk Aynştaynı' olarak tanınan dünyaca ünlü teorik kimyacı ve moleküler biyologdur."
            ),
            kpssCodes = listOf(
                "2 Türk Nobel Sahibi: Orhan Pamuk (2006 Edebiyat), Aziz Sancar (2015 Kimya).",
                "Para Arkasındaki Bilim İnsanı: 10 TL -> Ordinaryüs Prof. Dr. Cahit Arf."
            ),
            highYieldFacts = listOf(
                "Daron Acemoğlu: MIT ekonomi profesörü olup kalkınma iktisadı alanında dünyanın en çok alıntı yapılan ekonomistleri arasındadır.",
                "Aziz Sancar, Türk dünyasından genç bilim insanlarını desteklemek amacıyla ABD Kuzey Karolina'da 'Sancar Türk Kültür ve Toplum Merkezi'ni kurmuştur."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_15",
            subject = Subject.GUNCEL_BILGILER,
            title = "UNESCO Yaratıcı Şehirler Ağı (UCCN) ve Gastronomi Şehirlerimiz",
            summary = "Gaziantep, Hatay, Afyonkarahisar (Gastronomi), Kütahya, İstanbul, Kırşehir ve Bursa'nın UNESCO yaratıcı unvanları.",
            keyPoints = listOf(
                "Gastronomi (Mutfak) Şehirlerimiz (3 İl):",
                "1) Gaziantep (2015 - Türkiye'nin ilk gastronomi kenti),",
                "2) Hatay (2017 - Medeniyetler ve zengin sofra kenti),",
                "3) Afyonkarahisar (2019 - Lokum, sucuk ve kaymak başkenti).",
                "Zanaat ve Halk Sanatları Alanında:",
                "- Kütahya (2017 - Çini sanatı),",
                "- Bursa (2021 - İpek ve havlu dokumacılığı).",
                "Tasarım Şehri: İstanbul (2017).",
                "Müzik Şehri: Kırşehir (2019 - Abdallık geleneği ve Neşet Ertaş diyarı), Şanlıurfa (2023 - Sıra geceleri ve kadim müzik mirası)."
            ),
            kpssCodes = listOf(
                "3 Gastronomi Kenti: Gaziantep, Hatay, Afyonkarahisar.",
                "2 Müzik Şehri: Kırşehir ve Şanlıurfa.",
                "2 Zanaat Şehri: Kütahya ve Bursa."
            ),
            highYieldFacts = listOf(
                "Gaziantep Baklavası ve Aydın İnciri, Avrupa Birliği (AB) nezdinde tescil edilen ilk coğrafi işaretli Türk ürünleridir.",
                "Malatya Kayısısı, Taşköprü Sarımsağı, Milas Zeytinyağı, Bayramiç Beyazı, Giresun Tombul Fındığı, Antakya Künefesi, Maraş Tarhanası da AB tescilli ürünlerimizdendir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_16",
            subject = Subject.GUNCEL_BILGILER,
            title = "Uluslararası Finans ve Ekonomi Kuruluşları (IMF, WB, OECD, G20)",
            summary = "Uluslararası Para Fonu (IMF), Dünya Bankası (WB), Ekonomik İşbirliği ve Kalkınma Örgütü (OECD), G20 ve BRICS.",
            keyPoints = listOf(
                "Uluslararası Para Fonu (IMF): 1944 Bretton Woods Konferansı'nda kuruldu. Merkezi Washington D.C.'dedir. Temel amacı küresel finansal istikrarı sağlamak ve ödemeler dengesi krizine giren ülkelere borç vermektir. Başkanı kural olarak Avrupalıdır (Kristalina Georgieva).",
                "Dünya Bankası (World Bank): Merkezi Washington D.C.'dedir. Gelişmekte olan ülkelere kalkınma ve altyapı kredileri sağlar. Başkanı geleneksel olarak Amerikalıdır (Ajay Banga).",
                "OECD: Merkezi Paris'tedir. Türkiye 1961'de kurucu üyeler arasında yer almıştır.",
                "G20 (Grup 20): Dünyanın en büyük 19 ekonomisi ve Avrupa Birliği (ve son katılan Afrika Birliği) nden oluşur. Türkiye üyedir (2015 yılında Antalya zirvesine ev sahipliği yapmıştır).",
                "BRICS: Brezilya, Rusya, Hindistan, Çin, Güney Afrika tarafından kurulmuş; Mısır, Etiyopya, İran ve BAE'nin katılımıyla genişlemiştir."
            ),
            kpssCodes = listOf(
                "Bretton Woods İkizleri: IMF ve Dünya Bankası (1944).",
                "G20'ye Son Katılan Daimi Üye: Afrika Birliği (2023 Hindistan Zirvesi)."
            ),
            highYieldFacts = listOf(
                "SDR (Özel Çekme Hakları): IMF tarafından oluşturulan uluslararası rezerv para birimidir (Sepette Dolar, Euro, Yuan, Yen ve Sterlin bulunur).",
                "İslam Kalkınma Bankası'nın (IDB) merkezi Suudi Arabistan'ın Cidde kentindedir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_17",
            subject = Subject.GUNCEL_BILGILER,
            title = "Dünyanın 7 Harikası ve Türkiye'de Yer Alanlar",
            summary = "Antik Dünyanın 7 Harikası, Türkiye'de bulunan 2 harika (Artemis ve Halikarnas) ve Yeni 7 Harika.",
            keyPoints = listOf(
                "Antik Dünyanın Yedi Harikası:",
                "1) Artemis Tapınağı (TÜRKİYE - İzmir Selçuk / Efes),",
                "2) Halikarnas Mozolesi (TÜRKİYE - Muğla Bodrum / Kral Mausolos Anıt Mezarı),",
                "3) Keops Piramidi (Mısır - Günümüze sağlam ulaşabilen tek harikadır),",
                "4) Babil'in Asma Bahçeleri (Irak),",
                "5) İskenderiye Feneri (Mısır),",
                "6) Zeus Heykeli (Yunanistan - Olympia),",
                "7) Rodos Heykeli (Yunanistan).",
                "Yeni Dünyanın 7 Harikası (2007): Çin Seddi, Petra Antik Kenti (Ürdün), Kurtarıcı İsa Heykeli (Brezilya), Machu Picchu (Peru), Chichen Itza (Meksika), Kolezyum (İtalya), Tac Mahal (Hindistan)."
            ),
            kpssCodes = listOf(
                "Türkiye'deki 2 Antik Harika: Artemis Tapınağı (İzmir) ve Halikarnas Mozolesi (Bodrum).",
                "Ayakta Kalan Tek Antik Harika: Keops Piramidi (Gize)."
            ),
            highYieldFacts = listOf(
                "Halikarnas Mozolesi'nin kabartma ve heykellerinin büyük kısmı 19. yüzyılda İngiltere'ye götürülmüş olup British Museum'da sergilenmektedir.",
                "Tac Mahal, Şah Cihan tarafından vefat eden eşi Mümtaz Mahal anısına Agra'da yaptırılmıştır; mimarlarından biri Mimar Sinan'ın talebesi İsa Efendi'dir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "gun_18",
            subject = Subject.GUNCEL_BILGILER,
            title = "Avrupa Birliği (AB) Kurumları, Maastricht ve Schengen",
            summary = "Schuman Bildirgesi, Roma Antlaşması, Maastricht Antlaşması (Euro ve kriterler), AB organları ve Dönem Başkanlığı.",
            keyPoints = listOf(
                "Tarihsel Süreç: 1951 Paris Antlaşması ile Avrupa Kömür ve Çelik Topluluğu (AKÇT) kuruldu; 1957 Roma Antlaşması ile Avrupa Ekonomik Topluluğu (AET) oluşturuldu.",
                "Maastricht Antlaşması (1992): Avrupa Birliği resmen kuruldu ve tek para birimi Euro'nun temelleri atıldı.",
                "Kopenhag Kriterleri (Siyasi ve Hukuki): Demokrasi, hukukun üstünlüğü, insan hakları ve azınlıklara saygı.",
                "Maastricht Kriterleri (Ekonomik): Bütçe açığının GSYH'ye oranı %3'ü, kamu borç stokunun GSYH'ye oranı %60'ı geçmemelidir.",
                "Schengen Anlaşması: İç sınır kontrollerinin kaldırıldığı serbest dolaşım alanıdır. 2024'te Bulgaristan ve Romanya deniz ve hava sınırlarında Schengen'e dahil olmuştur.",
                "Merkezler: AB Komisyonu ve Konseyi Brüksel'de (Belçika), Avrupa Parlamentosu Strazburg'da (Fransa), Avrupa Merkez Bankası Frankfurt'ta (Almanya) dır."
            ),
            kpssCodes = listOf(
                "AB'den Ayrılan İlk Ülke (Brexit): Birleşik Krallık (İngiltere) 2020'de resmen ayrılmıştır.",
                "Euro Bölgesine (Eurozone) Son Katılan Ülke: Hırvatistan (1 Ocak 2023)."
            ),
            highYieldFacts = listOf(
                "Türkiye 1963 Ankara Anlaşması ile ortaklık ilişkisi başlatmış; 1999 Helsinki Zirvesi'nde aday ülke ilan edilmiştir.",
                "AB Dönem Başkanlığı 6 ayda bir üye devletler arasında el değiştirir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_19",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye'nin En Son Milli Parkları ve Tabiat Varlıkları",
            summary = "Türkiye'nin ilk ve son ilan edilen milli parkları, Ramsar Sulak Alanları ve Biyosfer Rezervi.",
            keyPoints = listOf(
                "İlk Milli Park: Yozgat Çamlığı Milli Parkı (1958).",
                "En Büyük Milli Park: Ağrı Dağı Milli Parkı.",
                "Son İlan Edilen Milli Parklar:",
                "- 46. Milli Park: Botan Vadisi Milli Parkı (Siirt - 2019),",
                "- 47. Milli Park: Hakkari Cilo ve Sat Dağları Milli Parkı (2020 - Türkiye'nin en yüksek 2. zirvesi Uludoruk ve buzul gölleri),",
                "- 48. Milli Park: Abant Gölü Milli Parkı (Bolu - 2022),",
                "- 49. Milli Park: Derebucak Çamlık Mağaraları Milli Parkı (Konya - 2022).",
                "Türkiye'nin Tek Biyosfer Rezerv Alanı: Artvin Camili (Macahel) Havzası (UNESCO tescilli zengin biyolojik çeşitlilik ve Kafkas arı ırkı gen merkezi)."
            ),
            kpssCodes = listOf(
                "İlk Milli Park: Yozgat Çamlığı (1958).",
                "Tek Biyosfer Rezervi: Artvin Camili (Macahel).",
                "Ramsar Alanları (Sulak Alanlar): Göksu Deltası (ilk ilan edilen), Manyas Kuş Cenneti, Sultansazlığı, Seyfe Gölü, Burdur Gölü vb."
            ),
            highYieldFacts = listOf(
                "Ramsar Sözleşmesi 1971'de İran'ın Ramsar kentinde imzalanmış uluslararası sulak alan koruma antlaşmasıdır.",
                "Cilo Dağı üzerindeki buzullar küresel ısınma nedeniyle erime tehlikesi altında olan Türkiye'nin en büyük vadi buzuludur."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_20",
            subject = Subject.GUNCEL_BILGILER,
            title = "Olimpiyat Oyunları ve Türk Spor Tarihindeki İlkler",
            summary = "2024 Paris Olimpiyatları, Mete Gazoz, Yusuf Dikeç, Filenin Sultanları ve Naim Süleymanoğlu mirası.",
            keyPoints = listOf(
                "2024 Paris Yaz Olimpiyatları: 26 Temmuz - 11 Ağustos 2024 tarihleri arasında Fransa'nın başkenti Paris'te düzenlendi.",
                "Yusuf Dikeç Fenomeni: 2024 Paris Olimpiyatları'nda Şevval İlayda Tarhan ile birlikte 10 Metre Havalı Tabanca Karışık Takım kategorisinde Türkiye'ye gümüş madalya kazandırdı. Özel ekipman (kulaklık, lens) kullanmadan, eli cebinde atış tarzıyla dünya çapında viral oldu.",
                "Mete Gazoz: 2020 Tokyo Olimpiyatları'nda ve 2023 Berlin Dünya Okçuluk Şampiyonası'nda altın madalya kazanarak okçulukta Türkiye tarihinin ilk olimpiyat ve dünya şampiyonu olmuştur. 2024 Paris'te Erkek Klasik Yay Takımı ile bronz madalya kazandı.",
                "A Milli Kadın Voleybol Takımı (Filenin Sultanları): 2023 yılında Milletler Ligi (VNL) şampiyonu, 2023 Avrupa Şampiyonu (CEV) ve Dünya Kupası şampiyonu olarak dünya 1 numarasına yükseldi. 2024 Paris Olimpiyatları'nı 4. tamamladı.",
                "Naim Süleymanoğlu (Cep Herkülü): Üç kez üst üste olimpiyat şampiyonu (1988 Seul, 1992 Barselona, 1996 Atlanta) olan efsanevi haltercimizdir."
            ),
            kpssCodes = listOf(
                "Türkiye'nin Olimpiyatlarda İlk Altın Madalyası: Yaşar Erkan (1936 Berlin - Güreş).",
                "İlk Kadın Olimpiyat Madalyamız: Hülya Şenyurt (1992 Barselona - Judo Bronz)."
            ),
            highYieldFacts = listOf(
                "Servet Tazegül ve Nur Tatar taekwondo branşında Türkiye'ye olimpiyat madalyaları kazandırmıştır.",
                "Busenaz Sürmeneli: 2020 Tokyo Olimpiyatları'nda boks branşında Türkiye'nin ilk altın madalyasını kazanmıştır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_21",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türk Edebiyatı ve Düşünce Dünyasının Öncü Eserleri",
            summary = "Dede Korkut Hikayeleri, Yunus Emre Divanı, Evliya Çelebi Seyahatnamesi, Safahat ve Nutuk.",
            keyPoints = listOf(
                "Dede Korkut Kitabı: Oğuz Türklerinin destansı hikayeleridir. Dresden ve Vatikan nüshalarından sonra 2019 yılında Kazakistan'da 13. boyu içeren 'Türkistan/Korkut Ata' nüshası bulunmuştur.",
                "Yunus Emre: 13-14. yüzyıl Türk tasavvuf şiirinin kurucusudur. 'Risaletü'n-Nushiyye' (Öğütler Kitabı - mesnevi) ve Divan'ı vardır. Sevgi ve hoşgörü dili Türkçeyi doruğa ulaştırmıştır.",
                "Evliya Çelebi: 17. yüzyılın en büyük seyyahıdır. 10 ciltlik 'Seyahatname' eseri Osmanlı coğrafyasının tarihi ve folklorik hazinesidir.",
                "Mehmet Akif Ersoy: İstiklal Marşı'mızın şairidir (Taceddin Dergahı'nda yazmıştır). Eserlerini 'Safahat' adlı 7 kitaptan oluşan külliyatında toplamıştır. Safahat'a İstiklal Marşı'nı koymamış, 'O milletimindir' demiştir.",
                "Mustafa Kemal Atatürk - NUTUK: 1919'da Samsun'a çıkıştan 1927 yılına kadar geçen Millî Mücadele ve Cumhuriyetin kuruluş sürecini belgelerle anlatan temel tarih kaynağıdır. Gençliğe Hitabe ile biter."
            ),
            kpssCodes = listOf(
                "Safahat'ın 7 Bölümü: Safahat, Süleymaniye Kürsüsünde, Hakkın Sesleri, Fatih Kürsüsünde, Hatıralar, Asım, Gölgeler.",
                "Nutuk'un Zaman Dilimi: 1919 - 1927 arasını kapsar."
            ),
            highYieldFacts = listOf(
                "İstiklal Marşı ilk kez Sebilürreşad ve Hakimiyet-i Milliye gazetelerinde, dergi olarak Açıksöz gazetesinde yayımlanmıştır.",
                "İstiklal Marşı'nın ilk bestecisi Ali Rıfat Çağatay; 1930'dan beri çalınan günümüz bestecisi Osman Zeki Üngör'dür."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "gun_22",
            subject = Subject.GUNCEL_BILGILER,
            title = "Türkiye ve Dünyada Önemli Barajlar, Boğazlar ve Kanallar",
            summary = "Atatürk Barajı, Ilısu (Veysel Eroğlu) Barajı, Yusufeli Barajı, Süveyş, Panama, Hürmüz ve Malakka boğazları.",
            keyPoints = listOf(
                "Yusufeli Barajı: Artvin Çoruh Nehri üzerinde inşa edilmiştir. 275 metre gövde yüksekliği ile Türkiye'nin en yüksek, dünyanın kendi sınıfında 5. en yüksek barajıdır (2022'de su tuttu, elektrik üretimine başladı).",
                "Deriner Barajı: Çoruh Nehri üzerinde 249 metre yüksekliğiyle Türkiye'nin ikinci en yüksek barajıdır.",
                "Atatürk Barajı: Şanlıurfa/Adıyaman sınırında Fırat Nehri üzerindedir. Gövde hacmi ve su depolama kapasitesi bakımından Türkiye'nin en büyük barajıdır (GAP'ın kalbi).",
                "Ilısu (Prof. Dr. Veysel Eroğlu) Barajı: Dicle Nehri üzerindedir. Gövde hacmi bakımından Türkiye'nin 2. büyük barajıdır (Hasankeyf bölgesi).",
                "Dünyanın Stratejik Su Yolları:",
                "- Hürmüz Boğazı: Basra Körfezi çıkışında dünya petrol ticaretinin en kritik boğazıdır (İran - Umman).",
                "- Babülmendep Boğazı: Kızıldeniz ile Aden Körfezi (Hint Okyanusu) bağlantısı (Yemen - Cibuti).",
                "- Malakka Boğazı: Malezya ve Endonezya arasında Çin ve Uzakdoğu deniz ticaretinin şah damarıdır.",
                "- Süveyş Kanalı: Akdeniz'i Kızıldeniz'e bağlayan Mısır'daki yapay kanaldır.",
                "- Panama Kanalı: Atlas Okyanusu ile Büyük Okyanus'u bağlayan seviye havuzlu (asansörlü) kanaldır."
            ),
            kpssCodes = listOf(
                "En Yüksek Barajımız: Yusufeli Barajı (275 m - Çoruh Nehri / Artvin).",
                "En Büyük Barajımız: Atatürk Barajı (Fırat Nehri).",
                "Petrolün Boğazı: Hürmüz Boğazı."
            ),
            highYieldFacts = listOf(
                "Korint Kanalı: Yunanistan'da Mora Yarımadası'nı ana karadan ayıran dar yapay kanaldır.",
                "Kiel Kanalı: Almanya'da Kuzey Denizi ile Baltık Denizi'ni birbirine bağlar."
            ),
            readTimeMinutes = 8
        )
    )
}
