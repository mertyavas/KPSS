package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssCitizenshipLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "vat_01",
            subject = Subject.VATANDASLIK,
            title = "Sosyal Düzen Kuralları ve Hukukun Yaptırımları",
            summary = "Din, ahlak, görgü ve hukuk kuralları arasındaki farklar. Hukuk kurallarını diğerlerinden ayıran temel özellik 'maddi yaptırımlı' olmasıdır.",
            keyPoints = listOf(
                "Sosyal Düzen Kuralları: Din, ahlak, görgü kurallarının yaptırımı manevidir (ayıplanma, günahkâr sayılma). Hukuk kurallarının yaptırımı ise DEVLET GÜCÜYLE DESTEKLENEN MADDİ yaptırımdır.",
                "Hukukun Yaptırım Türleri: Ceza (hapis ve adli para), Cebri İcra (borcun devlet zoruyla tahsili), Tazminat (maddi-manevi zarar karşılığı), İptal (idari işlemlerin yargı kararıyla ortadan kaldırılması), Hükümsüzlük.",
                "Tazminat Türleri: Haksız fiil veya sözleşmeye aykırılık sonucu doğar. Manevi tazminat duyulan acı ve elemi dindirmek içindir."
            ),
            kpssCodes = listOf(
                "Yaptırımlar Kodlaması: 'C-C-T-İ-H' -> Ceza, Cebri İcra, Tazminat, İptal, Hükümsüzlük.",
                "İptal yalnızca İDARİ İŞLEMLERE karşı İdare Mahkemesi veya Danıştay'da açılan dava türüdür!"
            ),
            highYieldFacts = listOf(
                "Müsadere (mala el koyma) genel müsadere olarak Anayasa ile kesinlikle yasaklanmıştır; sadece suça konu olan eşya veya kazanç müsaderesi mümkündür.",
                "Ölüm cezası ve genel müsadere cezası 2004 anayasa değişikliği ile anayasamızdan tamamen çıkarılmıştır."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "vat_02",
            subject = Subject.VATANDASLIK,
            title = "Hükümsüzlük Çeşitleri (Yokluk, Butlan, Askıda Hükümsüzlük)",
            summary = "Hukuki işlemlerin geçerlilik şartları ve yaptırımları. Yokluk, Mutlak Butlan, Nisbi Butlan ve Tek Taraflı Bağlamazlık.",
            keyPoints = listOf(
                "Yokluk: Hukuki işlemin kurucu unsurlarından birinin eksik olmasıdır. İşlem hukuken hiç doğmamıştır (Örnek: Resmi evlendirme memuru önünde yapılmayan evlilik, imzasız vasiyetname).",
                "Mutlak Butlan: Kurucu unsurları tamdır fakat kanunun emredici hükümlerine, kamu düzenine veya ahlaka aykırıdır (Örnek: Amca ile yeğenin evlenmesi, ayırt etme gücü olmayanın yaptığı sözleşme).",
                "Nisbi Butlan (İptal Edilebilirlik): İrade sakatlığı (hata, hile, korkutma/tehdit) hallerinde ortaya çıkar. İşlem baştan itibaren geçerlidir ancak mağdur taraf 1 yıl içinde iptal davası açabilir.",
                "Askıda Hükümsüzlük: Sınırlı ehliyetsizin (velisinin izni olmadan) tek başına yaptığı işlemdir. Veli onay verirse geçerli olur, vermezse baştan itibaren hükümsüz kalır."
            ),
            kpssCodes = listOf(
                "Yokluk vs Butlan: Yoklukta işlem doğmamış bir bebektir; Butlanda bebek doğmuştur fakat ölü doğmuştur!",
                "İrade Sakatlıkları: Hata, Hile, İkrah (Korkutma). 1 yıllık hak düşürücü süreye tabidir."
            ),
            highYieldFacts = listOf(
                "Gabin (Aşırı Yararlanma): Bir tarafın darda kalmasından veya bilgisizliğinden aşırı yararlanılması durumudur ve nisbi butlan sebebidir.",
                "Hakim, yokluk ve mutlak butlan durumunu re'sen (kendiliğinden) dikkate almak zorundadır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_03",
            subject = Subject.VATANDASLIK,
            title = "Hukukun Kaynakları ve Boşluk Türleri",
            summary = "Asli (yazılı) kaynaklar, tali (yazısız) kaynaklar, yardımcı kaynaklar, Kanun Boşluğu (Açık ve Örtülü) ve Hukuk Boşluğu.",
            keyPoints = listOf(
                "Yazılı (Asli) Kaynaklar: Anayasa, Kanun, Milletlerarası Antlaşmalar, Cumhurbaşkanlığı Kararnameleri, Yönetmelikler.",
                "Yazısız (Tali) Kaynak: Örf ve Adet Hukuku. Hakim yazılı kaynakta hüküm bulamazsa örf ve adete bakar.",
                "Yardımcı Kaynaklar: Doktrin (öğreti) ve Yargısal Kararlar (içtihatlar). Hakimi bağlamaz (İçtihadı Birleştirme Kararları hariç).",
                "Kanun Boşluğu: Kanunda somut olaya uygulanacak yazılı bir hükmün bulunmamasıdır. Açık boşluk (hiç hüküm yok) ve Örtülü boşluk (hüküm var ama adaletsiz sonuç doğuruyor) olarak ikiye ayrılır.",
                "Hukuk Boşluğu: Somut olay hakkında ne yazılı ne de yazısız (örf ve adet) hiçbir kuralın bulunmamasıdır. Hakim 'Hukuk Yaratır' (TMK m. 1)."
            ),
            kpssCodes = listOf(
                "Hakimin Hukuk Yaratması: Sadece Hukuk Boşluğunda söz konusudur! Kanun boşluğunda ise hakim 'Kıyas' yapar veya 'Takdir Yetkisi' kullanır.",
                "İçtihadı Birleştirme Kararları Resmi Gazete'de yayımlanır ve tüm mahkemeleri BAĞLAR."
            ),
            highYieldFacts = listOf(
                "Ceza Hukukunda asla kıyas yapılamaz ve örf-adet kuralına dayanılarak ceza verilemez (Kanunilik İlkesi).",
                "Hakimin yarattığı hukuk bir kanun niteliği taşımaz; üst mahkemece temyiz incelemesine tabidir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_04",
            subject = Subject.VATANDASLIK,
            title = "Hak Kavramı, Kazanılması ve Korunması",
            summary = "Hakların kazanılmasında İyiniyet (Subjektif), Hakların kullanılmasında Dürüstlük Kuralı (Objektif), Hakların devlet eliyle ve bizzat korunması.",
            keyPoints = listOf(
                "İyiniyet (Subjektif İyiniyet - TMK m. 3): Hakların kazanılmasında geçerlidir. Bir hakkın kazanılmasına engel bir durumu bilmemek ve bilecek durumda olmamaktır.",
                "Dürüstlük Kuralı (Objektif İyiniyet - TMK m. 2): Hakların kullanılmasında ve borçların ifasında geçerlidir. Dürüst, namuslu bir insanın davranması gereken asgari ahlaki standarttır.",
                "Hakların Korunması: Aslolan devlet eliyle korunmasıdır (Talep ve Dava hakkı).",
                "Kişinin Kendi Hakkını Bizzat Koruması (İstisnalar): 1) Meşru Müdafaa (Zorunluluk olmaksızın cana veya mala saldırıyı defetme), 2) Zaruret Hali / Iztırar (Üçüncü bir kişinin malına zarar vererek tehlikeden kurtulma), 3) Kuvvet Kullanma (Devlet müdahalesinin yetişemeyeceği anda hakkı korumak)."
            ),
            kpssCodes = listOf(
                "Altın Kural: Hak KAZANILIRKEN -> İyiniyet aranır. Hak KULLANILIRKEN -> Dürüstlük kuralı aranır.",
                "Meşru Müdafaada tazminat ödenmez; Zaruret Halinde (Iztırar) ise hakkaniyet tazminatı ödenir!"
            ),
            highYieldFacts = listOf(
                "Hakkın Kötüye Kullanılması: Bir hakkın dürüstlük kuralına aykırı şekilde kullanılarak başkasına zarar vermesidir; hukuk düzeni bunu korumaz.",
                "Hakkın Aslen Kazanılması: Sahibinden devralınmadan, ilk kez o kişi üzerinde doğmasıdır (Avlanan balık, ihraz, işgal)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_05",
            subject = Subject.VATANDASLIK,
            title = "Kişilik, Hak ve Fiil Ehliyeti Türleri",
            summary = "Gerçek kişiliğin başlangıcı ve sonu, Hak Ehliyeti ve Fiil Ehliyetinin şartları, 4 ehliyet grubu.",
            keyPoints = listOf(
                "Kişilik: Tam ve sağ doğumla başlar; ölüm veya mahkemece verilen gaiplik kararıyla sona erer.",
                "Hak Ehliyeti: Haklara ve borçlara sahip olabilme yetkisidir. Sağ ve tam doğmak şartıyla ana rahmine düşüldüğü andan itibaren başlar (Pasif ehliyettir).",
                "Fiil Ehliyeti Şartları: 1) Ayırt etme gücü (mümeyyiz), 2) Erginlik (18 yaşını doldurmak, evlenmek veya 15 yaşında kazai rüşt), 3) Kısıtlı olmamak (akıl hastalığı, savurganlık, alkol bağımlılığı, 1 yıl üstü hapis).",
                "Ehliyet Grupları: 1) Tam Ehliyetliler, 2) Sınırlı Ehliyetliler (Yasal danışman atananlar ve evliler), 3) Sınırlı Ehliyetsizler (Ayırt etme gücü olan küçükler ve kısıtlılar), 4) Tam Ehliyetsizler (Ayırt etme gücü olmayanlar)."
            ),
            kpssCodes = listOf(
                "Sınırlı Ehliyetsizlerin Asla Yapamayacağı İşlemler (Kefalet, Bağış, Vakıf Kurma): Velileri veya vasileri izin verse bile bu 3 işlemi KESİNLİKLE YAPAMAZLAR!",
                "Kazai Rüşt (Yargısal Erginlik): 15 yaşını doldurmuş küçüğün, kendi isteği ve velisinin rızasıyla Asliye Hukuk Mahkemesince ergin kılınmasıdır."
            ),
            highYieldFacts = listOf(
                "Tam ehliyetsizlerin yaptığı tüm hukuki işlemler mutlak butlanla sakattır; bağlamaz.",
                "Haksız fiil sorumluluğu için ergin olmak şart değildir; sadece 'ayırt etme gücüne sahip olmak' yeterlidir."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_06",
            subject = Subject.VATANDASLIK,
            title = "Hısımlık Türleri ve Gaiplik Müessesesi",
            summary = "Kan hısımlığı, kayın hısımlığı, altsoy-üstsoy, yansoy derecesi hesaplama ve gaiplik şartları.",
            keyPoints = listOf(
                "Kan Hısımlığı: Biri diğerinden gelen (altsoy-üstsoy: anne, baba, çocuk, torun) veya ortak kökten gelenler (yansoy: kardeş, amca, dayı, teyze, hala, kuzen).",
                "Derece Hesaplama: Her bir doğum bir derecedir. Kardeş ile 2. derece yansoy; Yeğen ile 3. derece yansoy; Kuzen ile 4. derece yansoy.",
                "Kayın Hısımlığı: Evlenme ile eşlerden birinin kan hısımları diğer eşin aynı dereceden kayın hısımı olur. Evlilik sona erse dahi kayın hısımlığı ASLA SONA ERMEZ!",
                "Gaiplik Şartları: 1) Ölüm tehlikesi içinde kaybolma: Olaydan en az 1 yıl sonra mahkemeye başvurulur. 2) Uzun zamandır haber alınamama: Son haber tarihinden en az 5 yıl sonra başvurulur."
            ),
            kpssCodes = listOf(
                "Gaiplikte Miras Teminatı: Ölüm tehlikesinde 5 yıl, uzun süre haber alınamama durumunda 15 yıl (veya gaip 100 yaşına basana kadar) mirasçılardan teminat alınır.",
                "Gaiplik evliliği kendiliğinden SONA ERDİRMEZ! Sağ kalan eş ayrıca evliliğin feshini talep etmelidir (Ölüm karinesinde ise evlilik kendiliğinden biter)."
            ),
            highYieldFacts = listOf(
                "Ölüm Karinesi: Ceset bulunamamış olsa bile ölümüne kesin gözle bakılacak bir halde kaybolan kişinin mülki amir (Vali/Kaymakam) emriyle kütüğe ölü kaydı düşülmesidir. Mahkeme kararı gerekmez!",
                "Kardeşler arasında 2. derece yansoy kan hısımlığı vardır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_07",
            subject = Subject.VATANDASLIK,
            title = "Devlet Şekilleri, Hükümet Sistemleri & Demokrasi",
            summary = "Monarşi, Cumhuriyet, Üniter, Federal, Konfederal devletler; Parlamenter, Başkanlık ve Meclis Hükümeti sistemleri.",
            keyPoints = listOf(
                "Yapılarına Göre Devletler: Üniter Devlet (Tek merkez, tek yasama, tek yargı - Türkiye, Fransa), Federal Devlet (İç işlerinde serbest federe devletler ve üst federal devlet - ABD, Almanya).",
                "Meclis Hükümeti Sistemi: Güçler mecliste birleşmiştir (Kuvvetler birliği). Meclis başkanı hükümetin de başkanıdır. Bakanlar tek tek meclis tarafından seçilir (1921 Anayasası dönemi).",
                "Başkanlık Sistemi: Yasama ve Yürütme kesin çizgilerle ayrılmıştır. Yürütme tek başlıdır (Başkan). Başkan yasama organını feshedemez; yasama başkanı görevden alamaz. Bakanlar meclis dışından atanır.",
                "Parlamenter Sistem: Yürütme iki başlıdır (Cumhurbaşkanı ve Başbakan/Bakanlar Kurulu). Hükümet meclis güvenoyuna muhtaçtır."
            ),
            kpssCodes = listOf(
                "Cumhurbaşkanlığı Hükümet Sistemi (2017): Türkiye'de yürütme yetkisi tek başlı olarak Cumhurbaşkanına verilmiştir. Başbakanlık ve Bakanlar Kurulu kaldırılmıştır.",
                "Doğrudan Demokrasi: Halkın kanunları bizzat yapmasıdır. Temsili Demokrasi: Temsilciler aracılığıyla yönetilmesidir. Yarı Doğrudan Demokrasi araçları: Referandum, Halk Girişimi, Halk Vetosu, Temsilcilerin Azli."
            ),
            highYieldFacts = listOf(
                "Türkiye Cumhuriyeti Anayasası'nda yer alan tek yarı doğrudan demokrasi aracı 'HALK OYLAMASI' (Referandum) dur. Halk girişimi veya halk vetosu yoktur.",
                "Konfederasyon: Bağımsız devletlerin uluslararası antlaşma ile bir araya gelmesiyle oluşur; ayrılma hakkı serbesttir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_08",
            subject = Subject.VATANDASLIK,
            title = "Türk Anayasa Tarihi (Sened-i İttifak'tan 1961'e)",
            summary = "Sened-i İttifak (1808), Tanzimat (1839), Islahat (1856), Kanun-i Esasi (1876), 1921 ve 1924 Anayasaları özellikleri.",
            keyPoints = listOf(
                "Sened-i İttifak (1808): Padişahın yetkilerini sınırlandıran ilk belgedir (Anayasa değildir!). Ayanlarla II. Mahmut arasında imzalandı.",
                "Tanzimat Fermanı (1839): Padişah ilk kez kanun gücünün üstünlüğünü kabul etmiştir. Hukuk devletine ilk adımdır.",
                "Kanun-i Esasi (1876): İlk Türk anayasasıdır. Meşrutiyet ilan edilmiş, çift meclisli sistem (Ayan ve Mebusan) kurulmuştur.",
                "1921 Anayasası (Teşkilat-ı Esasiye): Türkiye'nin tek YUMUŞAK ve ÇERÇEVE anayasasıdır. Temel hak ve özgürlüklere ve yargıya yer verilmemiştir. Meclis hükümeti sistemi benimsenmiştir.",
                "1924 Anayasası: İlk sert ve kazuistik anayasamızdır. Karma hükümet sistemi uygulanmıştır. 1928'de devletin dini İslam maddesi çıkarılmış, 1934'te kadınlara seçme/seçilme hakkı verilmiş, 1937'de 6 Atatürk ilkesi anayasaya girmiştir."
            ),
            kpssCodes = listOf(
                "Tek Yumuşak Anayasa: 1921 Teşkilat-ı Esasiye'dir (Değiştirilmesi kanunlarla aynı usule tabidir).",
                "Çift Meclisli Anayasalarımız: 1876 Kanun-i Esasi (Heyet-i Ayan ve Heyet-i Mebusan) ve 1961 Anayasası (Millet Meclisi ve Cumhuriyet Senatosu)."
            ),
            highYieldFacts = listOf(
                "1961 Anayasası ile ilk kez Anayasa Mahkemesi, Milli Güvenlik Kurulu (MGK), DPT ve Yüksek Hâkimler Kurulu kurulmuştur.",
                "1961 Anayasası 'İnsan haklarına DAYANAN' devlet tabirini kullanırken, 1982 Anayasası 'İnsan haklarına SAYGILI' devlet ifadesini kullanmıştır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_09",
            subject = Subject.VATANDASLIK,
            title = "1982 Anayasası İlk 4 Madde & Değiştirilemez Hükümler",
            summary = "Madde 1: Devletin şekli, Madde 2: Cumhuriyetin Nitelikleri, Madde 3: Bölünmez bütünlük, resmi dil, bayrak, marş ve başkent. Madde 4: Değiştirilemezlik güvencesi.",
            keyPoints = listOf(
                "Madde 1: Türkiye Devleti bir Cumhuriyettir.",
                "Madde 2: Türkiye Cumhuriyeti, toplumun huzuru, millî dayanışma ve adalet anlayışı içinde, insan haklarına saygılı, Atatürk milliyetçiliğine bağlı, başlangıçta belirtilen temel ilkelere dayanan, demokratik, lâik ve sosyal bir hukuk devletidir.",
                "Madde 3: Türkiye Devleti, ülkesi ve milletiyle bölünmez bir bütündür. Dili Türkçedir. Bayrağı beyaz ay yıldızlı al bayraktır. Millî marşı İstiklal Marşı'dır. Başkenti Ankara'dır.",
                "Madde 4: 1. maddedeki Devletin şeklinin Cumhuriyet olduğu hükmü ile 2. ve 3. maddeler DEĞİŞTİRİLEMEZ VE DEĞİŞTİRİLMESİ TEKLİF DAHİ EDİLEMEZ."
            ),
            kpssCodes = listOf(
                "Cumhuriyetin Temel Nitelikleri (Madde 2): Demokratik, Laik, Sosyal ve Hukuk devleti olması, Atatürk milliyetçiliğine bağlı ve insan haklarına saygılı olmasıdır.",
                "Dikkat Tuzağı: 'Resmi din İslam'dır' ibaresi ilk 3 maddede ASLA YOKTUR (1928'de anayasadan çıkarılmıştır)."
            ),
            highYieldFacts = listOf(
                "Anayasa metnine dahil olan 'Başlangıç İlkeleri' anayasa hükmü sayılır ve anayasa yargısında denetim ölçütü olarak kullanılır.",
                "Değiştirilemez ilk 3 maddenin güvencesi 4. maddedir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "vat_10",
            subject = Subject.VATANDASLIK,
            title = "Temel Hak ve Hürriyetlerin Sınırlanması & Sert Çekirdek Haklar",
            summary = "Madde 13 sınırlama kriterleri (kanunilik, ölçülülük, demokratik toplum düzeni, hakkın özü) ve Madde 15 savaş/OHAL sert çekirdek dokunulmaz haklar.",
            keyPoints = listOf(
                "Madde 13 Sınırlama Güvenceleri: Temel hak ve hürriyetler ancak KANUNLA sınırlanabilir. Anayasanın sözüne ve ruhuna, demokratik toplum düzeninin gereklerine ve ÖLÇÜLÜLÜK ilkesine aykırı olamaz; HAKKIN ÖZÜNE dokunamaz.",
                "Sert Çekirdek Haklar (Madde 15 - Savaş ve OHAL'de dahi DOKUNULAMAZ):",
                "1) Yaşama hakkı ve maddi/manevi varlığın bütünlüğü (meşru müdafaa hariç),",
                "2) Kimse din, vicdan, düşünce ve kanaatlerini açıklamaya zorlanamaz ve bunlardan dolayı suçlanamaz,",
                "3) Suç ve cezalar geçmişe yürütülemez,",
                "4) Masumiyet Karinesi: Suçluluğu mahkeme kararıyla saptanıncaya kadar kimse suçlu sayılamaz."
            ),
            kpssCodes = listOf(
                "Sert Çekirdek Kodlaması: 'Y-D-G-M' -> Yaşama hakkı, Din-vicdan kanaatlerini açıklamaya zorlanamama, Geçmişe yürümezlik, Masumiyet karinesi.",
                "Genel Sınırlama Sebepleri 2001 anayasa değişikliği ile kaldırılmıştır! Artık her hak sadece kendi maddesinde yazılı özel sebeplerle sınırlanabilir."
            ),
            highYieldFacts = listOf(
                "Vatandaş sınır dışı edilemez ve yurda girme hakkından yoksun bırakılamaz.",
                "Yurt dışına çıkma hürriyeti sadece suç soruşturması veya kovuşturması sebebiyle HÂKİM KARARIYLA sınırlanabilir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_11",
            subject = Subject.VATANDASLIK,
            title = "Kişi Hak ve Ödevleri (Negatif Statü Hakları)",
            summary = "Bireyin devlet tarafından dokunulamayacak koruyucu hakları: Yaşama hakkı, Kişi hürriyeti ve güvenliği, Özel hayatın gizliliği, Konut dokunulmazlığı, Mülkiyet hakkı.",
            keyPoints = listOf(
                "Negatif Statü: Devletin karışamayacağı, bireyi devlete karşı koruyan haklardır.",
                "Kişi Hakları: Yaşama hakkı, Kişi dokunulmazlığı, Kişi hürriyeti ve güvenliği, İşkence yasağı, Özel hayatın ve aile hayatının gizliliği, Konut dokunulmazlığı, Haberleşme hürriyeti.",
                "Mülkiyet ve Miras Hakkı: Kişi hakları arasındadır! Yalnızca kamu yararı amacıyla kanunla sınırlanabilir.",
                "Hak Arama Hürriyeti: Herkes meşru vasıta ve yollardan faydalanmak suretiyle yargı mercileri önünde davacı veya davalı olarak iddia ve savunma hakkına sahiptir."
            ),
            kpssCodes = listOf(
                "ÖSYM Tuzağı: Mülkiyet Hakkı 'Sosyal-Ekonomik Hak' DEĞİLDİR; Kişi Hak ve Ödevidir!",
                "Konut dokunulmazlığının ihlali veya konutta arama yapılabilmesi kural olarak HÂKİM KARARI, gecikmesinde sakınca bulunan hallerde yetkili merciin yazılı emriyle mümkündür."
            ),
            highYieldFacts = listOf(
                "Yakalanan veya tutuklanan kişi en geç 48 saat içinde (toplu suçlarda en çok 4 gün) hâkim önüne çıkarılmalıdır.",
                "Hiç kimse, yalnızca bir sözleşmeden doğan yükümlülüğünü (borcunu) yerine getirememesinden dolayı özgürlüğünden alıkonulamaz (Borç için hapis yasağı)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_12",
            subject = Subject.VATANDASLIK,
            title = "Sosyal ve Ekonomik Haklar (Pozitif Statü Hakları)",
            summary = "Bireylerin devletten talep edebileceği isteme hakları: Eğitim hakkı, Çalışma hakkı, Sendika kurma, Toplu iş sözleşmesi ve Grev hakkı, Sağlık ve Sosyal Güvenlik.",
            keyPoints = listOf(
                "Pozitif Statü (İsteme Hakları): Devletin müdahale ederek sosyal adaleti sağlamasını gerektiren haklardır.",
                "Eğitim ve Öğrenim Hakkı: İlköğretim kız ve erkek bütün vatandaşlar için zorunludur ve Devlet okullarında parasızdır. Kimse bu haktan yoksun bırakılamaz.",
                "Çalışma ve Sözleşme Hürriyeti: Çalışma herkesin hakkı ve ödevidir. Angarya (zorla çalıştırma) yasaktır.",
                "Sendika Kurma Hakkı: İşçiler ve işverenler önceden izin almaksızın sendika kurma hakkına sahiptir.",
                "Grev ve Lokavt Hakkı: Toplu iş sözleşmesi sırasında uyuşmazlık çıkması halinde işçiler grev hakkına sahiptir. Siyasi amaçlı grev yasaktır ibaresi 2010'da kaldırılmıştır!"
            ),
            kpssCodes = listOf(
                "Devletin Sosyal Hakları Karşılama Sınırı: Anayasa m. 65 uyarınca devlet, sosyal ve ekonomik alanlardaki görevlerini 'mali kaynaklarının yeterliliği ölçüsünde' yerine getirir.",
                "Grev hakkı sosyal haktır ancak memurlara grev hakkı TANINMAMIŞTIR."
            ),
            highYieldFacts = listOf(
                "Kamulaştırma ve Devletleştirme hükümleri Sosyal ve Ekonomik Haklar ve Ödevler bölümünde düzenlenmiştir.",
                "Ailenin korunması ve çocuk hakları da sosyal haklar arasındadır."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_13",
            subject = Subject.VATANDASLIK,
            title = "Siyasi Hak ve Ödevler (Aktif Statü Hakları) & Siyasi Partiler",
            summary = "Vatandaşlık bağı, Seçme ve Seçilme, Siyasi Partilerin kuruluşu, kapatılması ve mali denetimi, Kamu hizmetine girme, Dilekçe ve Bilgi Edinme.",
            keyPoints = listOf(
                "Aktif Statü: Vatandaşın devlet yönetimine katılmasına imkân veren haklardır.",
                "Oy Kullanamayanlar: Silahaltında bulunan er ve erbaşlar, askeri öğrenciler, taksirli suçlar hariç ceza infaz kurumlarında bulunan hükümlüler (Tutuklular oy kullanabilir!).",
                "Siyasi Parti Kuruluşu: En az 30 Türk vatandaşı tarafından önceden izin almaksızın kurulur.",
                "Partilerin Kapatılması: Yargıtay Cumhuriyet Başsavcısı dava açar; kapatma kararını Anayasa Mahkemesi verir (Toplantıya katılanların 2/3 oy çokluğu ile).",
                "Mali Denetim: Siyasi partilerin mali denetimini Anayasa Mahkemesi yapar (Sayıştay'dan yardım alır)."
            ),
            kpssCodes = listOf(
                "Siyasi Partilere Üye Olamayanlar: 'H-Y-H-A-M-Ö' -> Hâkimler ve savcılar, Yüksek yargı mensupları, Silahlı kuvvetler mensupları, Askeri öğrenciler, Memurlar, Yükseköğretim öncesi öğrenciler (Üniversite öğrencileri ve akademisyenler üye OLABİLİR!).",
                "Siyasi Partilere Devlet Yardımı: Genel seçimlerde geçerli oyların en az %3'ünü alan partilere hazine yardımı yapılır. Meclise girmek için ise ülke barajı %7'dir."
            ),
            highYieldFacts = listOf(
                "Dilekçe Hakkı, Kamu Denetçisine (Ombudsman) Başvurma ve Bilgi Edinme Hakkı siyasi haklar bölümündedir.",
                "Vatan hizmeti (askerlik) ve vergi ödevi de siyasi hak ve ödevler kısmında düzenlenmiştir."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_14",
            subject = Subject.VATANDASLIK,
            title = "Yasama: TBMM Seçimleri ve Milletvekilliği Statüsü",
            summary = "600 milletvekili, seçimlerin yenilenmesi, ara seçim şartları, milletvekili seçilme yeterliliği ve milletvekilliğinin kazanılması/sona ermesi.",
            keyPoints = listOf(
                "TBMM Seçimleri: 5 yılda bir Cumhurbaşkanı seçimiyle birlikte yapılır. Seçimlerin geriye bırakılması (ertelenmesi) yalnızca SAVAŞ sebebiyle ve 1 yıl süreyle TBMM tarafından kararlaştırılabilir.",
                "Milletvekili Seçilme Yeterliliği: 18 yaşını doldurmuş olmak, Türk vatandaşı olmak, en az ilkokul mezunu olmak, askerlikle ilişiği bulunmamak, kısıtlı olmamak, kamu hizmetlerinden yasaklı olmamak, taksirli suçlar hariç toplam 1 yıl veya daha fazla hapis cezası almamış olmak.",
                "İstifa Etmesi Gerekenler: Hâkim ve savcılar, yüksek yargı mensupları, TSK mensupları, memurlar ve akademisyenler aday olmak için istifa etmelidir (Hâkim-savcı ve TSK mensupları seçilemezse mesleklerine geri dönemezler!).",
                "Milletvekilliğinin Sona Ermesi: İstifa (TBMM salt çoğunluk kararı), Devamsızlık (1 ayda mazeretsiz 5 birleşime katılmama - üye tamsayısı salt çoğunluğu), Kesin hüküm giyme veya kısıtlanma (Genel Kurula bildirildiği an kendiliğinden düşer)."
            ),
            kpssCodes = listOf(
                "Ara Seçim Kuralları: Genel seçimden 30 ay geçmedikçe ve son 1 yıla girildikçe ara seçim yapılamaz. Ancak boşalan üyelik sayısı %5'i (30 vekil) geçerse 3 ay içinde ara seçim zorunludur. Bir ilin veya seçim çevresinin hiç üyesi kalmazsa 90 gün sonraki ilk pazar zorunlu seçim yapılır.",
                "Milletvekili mazbatasını aldığı an vekillik sıfatını kazanır; TBMM'de ant içerek göreve başlar."
            ),
            highYieldFacts = listOf(
                "TBMM üye sayısı 2017 anayasa değişikliği ile 550'den 600'e çıkarılmıştır.",
                "Milletvekilliği düşürülen vekil, 7 gün içinde Anayasa Mahkemesine iptal davası açabilir; AYM 15 gün içinde kesin karar verir."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_15",
            subject = Subject.VATANDASLIK,
            title = "Yasama: Yasama Bağışıklıkları (Dokunulmazlık ve Sorumsuzluk)",
            summary = "Yasama Sorumsuzluğu (kürsü bağışıklığı) ile Yasama Dokunulmazlığı arasındaki kritik farklar ve kaldırılma usulü.",
            keyPoints = listOf(
                "Yasama Sorumsuzluğu: Milletvekillerinin Meclis çalışmalarındaki oy, söz ve düşüncelerinden ötürü ömür boyu cezaî kovuşturmaya uğramamasıdır. Mutlaktır; kaldırılamaz, feragat edilemez ve vekillik bittikten sonra da sürer. Sadece ceza davalarını kapsar (hukuk davalarını engellemez).",
                "Yasama Dokunulmazlığı: Suç işlediği ileri sürülen vekilin Meclis kararı olmadıkça tutulamaması, sorguya çekilememesi, tutuklanamaması ve yargılanamamasıdır. Nispîdir; TBMM kararıyla kaldırılabilir ve vekillik süresiyle sınırlıdır.",
                "Dokunulmazlığın İstisnaları (Doğrudan Yargılanır): 1) Ağır cezayı gerektiren suçüstü hali, 2) Seçimden önce soruşturmasına başlanmış olmak kaydıyla Anayasanın 14. maddesindeki devletin güvenliğine yönelik suçlar.",
                "Dokunulmazlığı kaldırılan vekil veya bir başka vekil 7 gün içinde AYM'ye itiraz edebilir; AYM 15 gün içinde karara bağlar."
            ),
            kpssCodes = listOf(
                "Sorumsuzluk ÖMÜR BOYUDUR, Dokunulmazlık ise VEKİLLİK SÜRESİNCE geçerlidir.",
                "Dokunulmazlığı kaldırılan kişi milletvekilliğini kaybetmez; sadece o suçtan yargılanır ve hapse atılmazsa meclis çalışmalarına devam eder."
            ),
            highYieldFacts = listOf(
                "Milletvekilinin dokunulmazlığının kalkması durumunda zamanaşımı süresi işlemez; vekillik bitince süre kaldığı yerden devam eder.",
                "Bakanlar ve Cumhurbaşkanı Yardımcıları da görevleriyle ilgili olmayan suçlarda yasama dokunulmazlığından aynen yararlanırlar."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_16",
            subject = Subject.VATANDASLIK,
            title = "Yasama: TBMM'nin Görevleri, Kanun ve Anayasa Değişikliği",
            summary = "TBMM'nin yetkileri, Kanun yapma süreci, Para basılmasına karar verme, Savaş ilanı, Anayasa değişikliği teklif ve kabul nisapları.",
            keyPoints = listOf(
                "TBMM'nin Görevleri: Kanun koymak, değiştirmek, kaldırmak; Bütçe ve kesinhesap kanun tekliflerini görüşmek; Para basılmasına ve savaş ilanına karar vermek; Milletlerarası antlaşmaların onaylanmasını kanunla uygun bulmak; Genel ve özel af ilan etmek (üye tamsayısının 3/5'i - 360 vekil).",
                "Kanun Teklifi: Kanun teklif etmeye yalnızca milletvekilleri yetkilidir (Cumhurbaşkanı sadece Bütçe kanununu teklif eder).",
                "Cumhurbaşkanının Kanunları İncelemesi: 15 gün içinde Resmî Gazete'de yayımlar veya veto ederek meclise geri gönderir. TBMM üye tamsayısının salt çoğunluğuyla (301) aynen kabul ederse CB onaylamak zorundadır. CB Bütçe Kanununu asla veto edemez!",
                "Anayasa Değişikliği Süreci: Teklif için en az 200 vekil (1/3). Kabul için en az 360 vekil (3/5). 360-399 arası çıkarsa CB zorunlu olarak halkoylamasına (referandum) götürür. 400 ve üzeri (2/3) çıkarsa onaylayabilir veya ihtiyari halkoylamasına sunabilir."
            ),
            kpssCodes = listOf(
                "TBMM Toplantı Yeter Sayısı: 200 milletvekili (1/3).",
                "TBMM Karar Yeter Sayısı: Toplantıya katılanların salt çoğunluğu; ancak hiçbir şekilde 151'den (1/4 + 1) az olamaz!",
                "İvedi (Hızlı) Görüşme Yasağı: Anayasa değişiklik teklifleri iki defa görüşülür ve iki görüşme arasında en az 48 saatlik 'serinleme süresi' bulunmalıdır."
            ),
            highYieldFacts = listOf(
                "Temel hak ve hürriyetlere ilişkin usulüne göre yürürlüğe konulmuş milletlerarası antlaşmalarla kanunlar çatışırsa ANTLAŞMA HÜKÜMLERİ esas alınır (m. 90).",
                "Milletlerarası antlaşmalar aleyhine Anayasa Mahkemesine iptal davası açılamaz!"
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_17",
            subject = Subject.VATANDASLIK,
            title = "Yasama: TBMM'nin Bilgi Edinme ve Denetim Yolları",
            summary = "Yazılı Soru, Meclis Araştırması, Genel Görüşme, Meclis Soruşturması. Gensoru ve Güvenoyunun kaldırılması.",
            keyPoints = listOf(
                "Yazılı Soru: Milletvekillerinin, Cumhurbaşkanı yardımcıları ve bakanlara yazılı olarak cevaplandırılmak üzere soru sormasıdır. En geç 15 gün içinde cevaplandırılmalıdır (Cumhurbaşkanına soru sorulamaz!).",
                "Meclis Araştırması: Belli bir konuda bilgi edinmek için kurulan özel bir komisyon vasıtasıyla yapılan incelemedir.",
                "Genel Görüşme: Toplumu ve devlet faaliyetlerini ilgilendiren belli bir konunun TBMM Genel Kurulu'nda görüşülmesidir.",
                "Meclis Soruşturması: Cumhurbaşkanı Yardımcıları ve Bakanların görevleriyle ilgili suç işledikleri iddiasıyla Yüce Divan'a sevk edilmelerini sağlayan denetim yoludur.",
                "Kaldırılan Denetim Yolları: 2017 anayasa değişikliği ile GENSORU ve GÜVENOYU hükümet sistemi gereği tamamen yürürlükten kaldırılmıştır!"
            ),
            kpssCodes = listOf(
                "Meclis Soruşturması Nisapları (301 - 360 - 400): Teklif: 301 vekil (salt çoğunluk). Soruşturma açılmasına karar: 360 vekil (3/5). Yüce Divan'a sevk: 400 vekil (2/3 gizli oyla).",
                "Yüce Divan Yargılaması: Anayasa Mahkemesi tarafından yapılır ve 3 ay içinde tamamlanır (ek süre en çok 3 ay)."
            ),
            highYieldFacts = listOf(
                "Yüce Divan'a sevk edilen bakan veya CB yardımcısının bakanlık görevi kendiliğinden düşmez; seçilmeye engel bir suçtan mahkûm olursa görevi sona erer.",
                "Yazılı soru önergesini tek bir milletvekili tek başına verebilir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_18",
            subject = Subject.VATANDASLIK,
            title = "Yürütme: Cumhurbaşkanının Seçimi, Nitelikleri ve Yetkileri",
            summary = "Cumhurbaşkanı seçilme şartları, aday gösterme, 2 turlu seçim sistemi, görev süresi ve yasama/yürütme/yargıya ilişkin yetkileri.",
            keyPoints = listOf(
                "Seçilme Şartları: Türk vatandaşı olmak, 40 yaşını doldurmuş olmak, yükseköğrenim mezunu olmak ve milletvekili seçilme yeterliliğine sahip olmak.",
                "Aday Gösterme: 1) Siyasi parti grupları, 2) Son genel seçimde geçerli oyların tek başına veya birlikte en az %5'ini almış partiler, 3) En az 100.000 seçmen.",
                "Seçim Usulü: Genel oyla halk seçer. Geçerli oyların salt çoğunluğunu (yüzde 50 + 1 oy) alan aday seçilir. İlk turda sağlanamazsa 2. hafta pazar günü en çok oy alan iki aday arasında ikinci tur yapılır.",
                "Görev Süresi: 5 yıldır. Bir kimse en fazla iki defa Cumhurbaşkanı seçilebilir (İstisna: İkinci döneminde TBMM seçimleri yenilerse üçüncü kez aday olabilir).",
                "Önemli Yetkileri: Bakanları ve yardımcılarını atar ve görevden alır, TSK Başkomutanlığını temsil eder, CB Kararnamesi çıkarır, OHAL ilan eder, AYM ve Danıştay üyelerini seçer."
            ),
            kpssCodes = listOf(
                "Cumhurbaşkanına Vekalet: Makam boşalırsa veya CB hastalık/yurt dışı sebebiyle görev başında olamazsa 'Cumhurbaşkanı Yardımcısı' vekalet eder (En yaşlı vekil veya Meclis başkanı DEĞİL!).",
                "Cumhurbaşkanının Cezai Sorumluluğu: Görev suçu veya kişisel suçu ayrımı olmaksızın, Meclis soruşturması usulüyle (301-360-400) Yüce Divan'a sevk edilebilir."
            ),
            highYieldFacts = listOf(
                "İkinci tura kalan iki adaydan biri vefat eder veya çekilirse, yerine birinci turdaki sıraya göre aday gelir; tek aday kalırsa referandum (evet/hayır) şeklinde yapılır.",
                "Milletlerarası andlaşmaları onaylar ve yayımlar (TBMM uygun bulur, CB onaylar)."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_19",
            subject = Subject.VATANDASLIK,
            title = "Yürütme: Cumhurbaşkanlığı Kararnameleri ve Yönetmelikler",
            summary = "Olağan CBK ve OHAL CBK sınırları, hiyerarşideki yeri, Yönetmelik çıkarma yetkisine sahip organlar ve yargısal denetim.",
            keyPoints = listOf(
                "Olağan CBK: Yürütme yetkisine ilişkin konularda çıkarılır. Temel hak ve hürriyetler ile siyasi haklar DÜZENLENEMEZ (Yalnızca Sosyal ve Ekonomik haklar düzenlenebilir).",
                "Kanun - CBK İlişkisi: Kanunda açıkça düzenlenen konularda CBK çıkarılamaz. Kanun ile CBK aynı konuda farklı hüküm içerirse KANUN HÜKMÜ uygulanır. TBMM aynı konuda kanun çıkarırsa CBK hükümsüz kalır.",
                "OHAL CBK: Olağanüstü hallerde çıkarılır. Sert çekirdek haklar hariç tüm haklar sınırlanabilir veya durdurulabilir. Kanun hükmündedir ve AYM'ye iptal davası AÇILAMAZ!",
                "Yönetmelikler: Cumhurbaşkanı, bakanlıklar ve kamu tüzel kişileri (belediye, üniversite, TRT) kendi görev alanlarını ilgilendiren kanun ve CBK'ların uygulanmasını sağlamak üzere çıkarırlar."
            ),
            kpssCodes = listOf(
                "CBK Yargısal Denetimi: Olağan CBK'ların şekil ve esas bakımından denetimini ANAYASA MAHKEMESİ yapar.",
                "Yönetmeliklerin Denetimi: Ülke çapında uygulanan yönetmelikleri DANIŞTAY, yerel yönetmelikleri ise İDARE MAHKEMELERİ denetler."
            ),
            highYieldFacts = listOf(
                "Tüm yönetmeliklerin Resmî Gazete'de yayımlanması zorunlu değildir; yalnızca kamu personelini veya kamuyu ilgilendiren genel yönetmelikler yayımlanır.",
                "Kanunlar, CBK'lar ve Yönetmelikler yürürlük tarihi belirtilmemişse Resmî Gazete'de yayımlandıkları gün yürürlüğe girer."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_20",
            subject = Subject.VATANDASLIK,
            title = "Yürütme: Olağanüstü Hal (OHAL) Rejimi ve Güvenlik Kurulları",
            summary = "OHAL ilan sebepleri, süresi, uzatılması, MGK üyeleri ve Devlet Denetleme Kurulu (DDK) yetkileri.",
            keyPoints = listOf(
                "OHAL İlanı: Savaş, seferberlik, ayaklanma, şiddet hareketleri, kamu düzeninin bozulması, tabii afet veya ağır ekonomik bunalım hallerinde CUMHURBAŞKANI tarafından ilan edilir.",
                "OHAL Süresi: Süresi 6 ayı geçmemek üzere ilan edilir. Aynı gün Resmî Gazete'de yayımlanır ve TBMM onayına sunulur. TBMM süreyi her defasında en çok 4 ayı geçmemek üzere uzatabilir (Savaş halinde 4 aylık sınır aranmaz).",
                "Milli Güvenlik Kurulu (MGK): Cumhurbaşkanı başkanlığında 2 ayda bir toplanır.",
                "MGK Üyeleri: CB Yardımcıları, Adalet, İçişleri, Dışişleri, Milli Savunma Bakanları, Genelkurmay Başkanı, Kara, Deniz ve Hava Kuvvetleri Komutanları. (Jandarma Genel Komutanı MGK üyesi DEĞİLDİR!).",
                "Devlet Denetleme Kurulu (DDK): Cumhurbaşkanlığına bağlıdır; başkanı ve üyelerini CB seçer. Yargı organları HARİÇ tüm kamu kurumlarını, TSK'yı, kamu kurumu niteliğindeki meslek kuruluşlarını ve işçi-işveren sendikalarını denetler."
            ),
            kpssCodes = listOf(
                "Sıkıyönetim Rejimi 2017 değişikliğiyle anayasadan tamamen ÇIKARILMIŞTIR; sadece OHAL kalmıştır.",
                "DDK Yargı organlarını KESİNLİKLE denetleyemez!"
            ),
            highYieldFacts = listOf(
                "Genelkurmay Başkanı, Milli Savunma Bakanına bağlı ve sorumludur.",
                "Başkomutanlık, TBMM'nin manevi varlığından ayrılamaz ve Cumhurbaşkanı tarafından temsil olunur. Savaşta Başkomutanlık görevini CB adına Genelkurmay Başkanı yürütür."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "vat_21",
            subject = Subject.VATANDASLIK,
            title = "Yargı: Anayasa Mahkemesi ve Görevleri",
            summary = "AYM'nin kuruluşu, 15 üyesinin seçimi, görevleri (iptal davası, itiraz yolu, bireysel başvuru, Yüce Divan) ve çalışma usulü.",
            keyPoints = listOf(
                "Üye Yapısı: 15 üyeden oluşur. 3 üyeyi TBMM (2 Sayıştay, 1 Baro başkanları), 12 üyeyi doğrudan Cumhurbaşkanı seçer. Üyeler 12 yıl için seçilir; yeniden seçilemezler (Emeklilik yaşı 65'tir).",
                "İptal Davası (Soyut Norm Denetimi): Kanunların, CBK'ların ve TBMM İçtüzüğünün şekil ve esas bakımından Anayasaya aykırılığı iddiasıyla açılır. Resmî Gazete'de yayımdan itibaren 60 gün içinde açılmalıdır. Açabilecekler: Cumhurbaşkanı, TBMM'de en fazla üyeye sahip iki siyasi parti grubu ve en az 120 milletvekili (1/5).",
                "İtiraz Yolu (Somut Norm Denetimi / Def'i): Görülmekte olan bir davada mahkemenin uygulayacağı kanun veya CBK kuralını Anayasaya aykırı görmesidir. AYM 5 ay içinde karar verir; veremezse yerel mahkeme mevcut kanuna göre davayı sonuçlandırır. AYM ret kararı verirse 10 yıl geçmedikçe aynı kural için yeniden itiraz yoluna başvurulamaz.",
                "Bireysel Başvuru: Temel hak ve özgürlükleri kamu gücü tarafından ihlal edilen herkes olağan kanun yollarını tükettikten sonra 30 gün içinde AYM'ye başvurabilir.",
                "Yüce Divan: CB, Bakanlar, AYM, Yargıtay, Danıştay başkan ve üyeleri, Sayıştay, HSK başkan ve üyeleri, Genelkurmay Başkanı ve Kuvvet Komutanları ile TBMM Başkanı yargılanır."
            ),
            kpssCodes = listOf(
                "Anayasa Değişikliklerinin Denetimi: Yalnızca ŞEKİL bakımından denetlenebilir! Esastan asla denetlenemez. Şekil davası 10 gün içinde sadece CB veya 120 milletvekili tarafından açılabilir.",
                "Yüce Divan'da Yargılanmayanlar: MİT Başkanı, Jandarma Genel Komutanı, Emniyet Genel Müdürü ve Kamu Başdenetçisi Yüce Divan'da YARGILANMAZ!"
            ),
            highYieldFacts = listOf(
                "AYM kararları Resmî Gazete'de hemen yayımlanır; yasama, yürütme ve yargı organlarını, idare makamlarını, gerçek ve tüzelkişileri BAĞLAR.",
                "İptal kararları geriye yürümez!"
            ),
            readTimeMinutes = 10
        ),
        TopicLecture(
            id = "vat_22",
            subject = Subject.VATANDASLIK,
            title = "Yargı: Yüksek Mahkemeler, HSK ve Sayıştay",
            summary = "Yargıtay, Danıştay, Uyuşmazlık Mahkemesi, Hâkimler ve Savcılar Kurulu (HSK) ve Sayıştay'ın anayasal yapısı.",
            keyPoints = listOf(
                "Yüksek Mahkemeler (4 Adet): 1) Anayasa Mahkemesi, 2) Yargıtay (Adli yargının temyiz mercii), 3) Danıştay (İdari yargının temyiz mercii), 4) Uyuşmazlık Mahkemesi (Adli ve idari yargı arasındaki görev/hüküm uyuşmazlıklarını çözer. Başkanı AYM üyeleri arasından AYM tarafından seçilir).",
                "Danıştay Üyeleri: 3/4'ünü HSK, 1/4'ünü doğrudan Cumhurbaşkanı seçer.",
                "Yargıtay Üyeleri: Tamamını HSK seçer. Yargıtay Cumhuriyet Başsavcısını ise Yargıtay Genel Kurulu'nun gösterdiği 5 aday arasından Cumhurbaşkanı seçer.",
                "Hâkimler ve Savcılar Kurulu (HSK): 13 üyeden oluşur, iki daire halinde çalışır. Başkanı Adalet Bakanıdır. Adalet Bakanlığı Müsteşarı / Bakan Yardımcısı tabii üyedir. 4 üyeyi CB, 7 üyeyi TBMM seçer. YÜKSEK MAHKEME DEĞİLDİR!",
                "Sayıştay: TBMM adına kamu idarelerinin gelir, gider ve mallarını denetler ve kesin hükme bağlar. Başkanı ve üyelerini TBMM seçer. Sayıştay ile Danıştay'ın vergi uyuşmazlığı kararları çatışırsa DANIŞTAY KARARI esas alınır."
            ),
            kpssCodes = listOf(
                "Kaldırılan Mahkemeler: Askeri Yargıtay, Askeri Yüksek İdare Mahkemesi (AYİM) ve Devlet Güvenlik Mahkemeleri (DGM) kaldırılmıştır.",
                "HSK'nın meslekten çıkarma kararlarına karşı yargı yolu (Danıştay) AÇIKTIR; diğer disiplin kararlarına karşı yargı yolu kapalıdır."
            ),
            highYieldFacts = listOf(
                "Hâkimlik ve Savcılık teminatı: Hâkimler ve savcılar azlolunamaz, kendileri istemedikçe 65 yaşından önce emekliye sevk edilemez.",
                "Duruşmalar kural olarak herkese açıktır; kararlar gerekçeli yazılmak zorundadır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_23",
            subject = Subject.VATANDASLIK,
            title = "İdare Hukuku: Temel İlkeler, Yetki Genişliği & İdari Vesayet",
            summary = "Hukuk devleti, İdarenin kanuniliği, İdarenin bütünlüğü, Hiyerarşi ile İdari Vesayet arasındaki farklar, Yetki Genişliği ilkesi.",
            keyPoints = listOf(
                "İdare Hukukunun Özellikleri: Genç, tedvin edilmemiş (dağınık), içtihatlara dayanan ve kamu yararını üstün tutan bir hukuk dalıdır.",
                "İdarenin Bütünlüğü İlkesi: İki hukuki araçla sağlanır: 1) HİYERARŞİ (Aynı kamu tüzel kişiliği içindeki ast-üst ilişkisi; örn: Bakan-Müsteşar, Vali-Kaymakam, Rektör-Dekan). 2) İDARİ VESAYET (Devlet tüzel kişiliğinin yerinden yönetim kuruluşları üzerindeki denetimidir; örn: İçişleri Bakanı - Belediye Başkanı, Vali - Köy Muhtarı, YÖK - Üniversite).",
                "Yetki Genişliği İlkesi: Merkezden yönetimin sakıncalarını gidermek için sadece İL VALİSİNE tanınmış bir anayasal yetkidir. Merkeze danışmadan devlet adına karar alma ve harcama yapabilme yetkisidir (Kaymakamın yetki genişliği YOKTUR!).",
                "Kamu Tüzel Kişiliği: Anayasada sayılanlar hariç, yalnızca KANUNLA veya CUMHURBAŞKANLIĞI KARARNAMESİ ile kurulur."
            ),
            kpssCodes = listOf(
                "Hiyerarşi vs Vesayet Ayrımı: Aynı çatının altıysa -> HİYERARŞİ (Bakan - Vali). Farklı iki tüzel kişilikse -> VESAYET (İçişleri Bakanı - Belediye Başkanı).",
                "Hiyerarşide yerindelik ve hukuka uygunluk denetlenir; Vesayette kural olarak sadece hukuka uygunluk denetlenir."
            ),
            highYieldFacts = listOf(
                "Kanunsuz Emir: Memur üstünden aldığı emri hukuka aykırı görürse yerine getirmez, üstüne bildirir. Üst yazı ile yenilerse emri yapar ve sorumluluk üste geçer. Ancak emir SUÇ TEŞKİL EDİYORSA kesinlikle yerine getirilemez; getiren cezadan kurtulamaz.",
                "Kamu tüzel kişiliği olan kuruluşların bütçeleri özerktir ve yönetmelik çıkarma yetkileri vardır."
            ),
            readTimeMinutes = 9
        ),
        TopicLecture(
            id = "vat_24",
            subject = Subject.VATANDASLIK,
            title = "İdare Hukuku: Türkiye'nin İdari Teşkilat Şeması",
            summary = "Merkezden Yönetim (Başkent & Taşra Teşkilatı) ve Yerinden Yönetim (Mahalli İdareler & Hizmet Yerinden Yönetim).",
            keyPoints = listOf(
                "Başkent Teşkilatı: Cumhurbaşkanı, Cumhurbaşkanı Yardımcıları, Bakanlıklar. Başkente yardımcı danışma organları: Danıştay, Sayıştay, MGK.",
                "Taşra Teşkilatı (Devlet Tüzel Kişiliğine Dahildir, Ayrı Bütçesi Yoktur!): İl Genel İdaresi (Vali, İl İdare Şube Başkanları, İl İdare Kurulu), İlçe İdaresi (Kaymakam, İlçe İdare Şube Başkanları, İlçe İdare Kurulu), Bucak.",
                "Mahalli İdareler (Kamu Tüzel Kişiliği Vardır!): İl Özel İdaresi (Vali, İl Genel Meclisi, İl Encümeni), Belediye İdaresi (Belediye Başkanı, Belediye Meclisi, Belediye Encümeni), Köy İdaresi (Köy Muhtarı, Köy İhtiyar Meclisi, Köy Derneği).",
                "Büyükşehir Belediyesi: Kanunla kurulur, toplam nüfusu en az 750.000 olmalıdır. Türkiye'de 30 büyükşehir vardır. Büyükşehir olan illerde İl Özel İdaresi ve köyler kaldırılmış; köyler mahalleye dönüştürülmüştür."
            ),
            kpssCodes = listOf(
                "Vali vs Kaymakam: Vali istisnai memurdur ve CB Kararıyla atanır, yetki genişliği vardır. Kaymakam meslek memurudur ve CB onayıyla atanır, yetki genişliği YOKTUR.",
                "Köy Derneği: Köydeki tüm seçmenlerden oluşan doğrudan demokrasi organıdır. Köy muhtarını ve ihtiyar meclisini seçer, imece ve salmaya karar verir."
            ),
            highYieldFacts = listOf(
                "Normal bir belediye kurulabilmesi için nüfusun en az 5.000 olması ve Cumhurbaşkanı kararı gerekir (İl ve ilçe merkezlerinde nüfus şartı aranmaksızın belediye kurulması zorunludur).",
                "İl Genel İdaresinin başı olan Vali ile İl Özel İdaresinin başı olan Vali aynı kişidir; fakat birinde devleti, diğerinde mahalli idareyi temsil eder."
            ),
            readTimeMinutes = 10
        ),
        TopicLecture(
            id = "vat_25",
            subject = Subject.VATANDASLIK,
            title = "657 Sayılı Devlet Memurları Kanunu & Disiplin Rejimi",
            summary = "Memurluğun temel ilkeleri, istihdam türleri, memurluğa alınma şartları, adaylık süresi, ödevler, yasaklar ve disiplin cezaları.",
            keyPoints = listOf(
                "Memurluğun Temel İlkeleri: Sınıflandırma, Kariyer (en yüksek dereceye kadar ilerleme) ve Liyakat (yeteneğe göre işe alınma ve yükselme).",
                "İstihdam Türleri: Memur, Sözleşmeli Personel ve İşçi (Geçici personel 4/C kaldırılmıştır).",
                "Adaylık Süresi: En az 1 yıl, en çok 2 yıldır. Adaylık süresinde başka kuruma nakil yapılamaz.",
                "Ödevler ve Yasaklar: Sadakat, tarafsızlık, mal bildirimi (sonu 0 ve 5 ile biten yıllarda yenilenir), hediye alma yasağı, grev yasağı, ticaret ve kazanç getirici faaliyette bulunma yasağı.",
                "Disiplin Cezaları: 1) Uyarma, 2) Kınama, 3) Aylıktan Kesme (1/30 ile 1/8 arası), 4) Kademe İlerlemesinin Durdurulması (1-3 yıl), 5) Devlet Memurluğundan Çıkarma (Yüksek Disiplin Kurulu kararıyla verilir)."
            ),
            kpssCodes = listOf(
                "Disiplin Cezası Olmayanlar: Görevden uzaklaştırma, yer değiştirme, meslekten ihraç, tenzili rütbe disiplin cezası DEĞİLDİR! Görevden uzaklaştırma bir önlemdir.",
                "Disiplin Cezalarına İtiraz: Tüm disiplin cezalarına karşı İdare Mahkemesinde dava açılabilir (2010 değişikliği ile uyarma ve kınama cezaları da yargı denetimine açılmıştır)."
            ),
            highYieldFacts = listOf(
                "Devlet memurluğuna girişte yaş şartı genel kural olarak 18 yaşını doldurmuş olmaktır (Meslek lisesi mezunları kazai rüşt ile 15 yaşında girebilir).",
                "Memurluktan Çıkarma cezası hariç diğer cezaları atamaya yetkili amirler veya disiplin kurulları verir; Memurluktan çıkarmayı sadece 'Yüksek Disiplin Kurulu' verir."
            ),
            readTimeMinutes = 9
        )
    )
}
