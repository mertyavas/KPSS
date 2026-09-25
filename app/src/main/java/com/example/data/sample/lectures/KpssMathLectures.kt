package com.example.data.sample.lectures

import com.example.data.model.Subject
import com.example.data.model.TopicLecture

object KpssMathLectures {
    val list: List<TopicLecture> = listOf(
        TopicLecture(
            id = "mat_01",
            subject = Subject.MATEMATIK,
            title = "Temel Kavramlar & Sayı Kümeleri",
            summary = "Rakam, Doğal sayılar, Tam sayılar, Tek-Çift sayılar, Pozitif-Negatif sayılar, Asal sayılar ve Faktöriyel.",
            keyPoints = listOf(
                "Tek ve Çift Sayılar: Tek ± Tek = Çift; Çift ± Çift = Çift; Tek ± Çift = Tek. Tek x Tek = Tek; Tek x Çift = Çift; Çift x Çift = Çift. Eğer bir çarpım tek ise çarpanların HEPSİ tektir; çarpım çift ise en az biri çifttir.",
                "Ardışık Sayılar: n tane ardışık sayının toplamı T ise, T / n = Ortanca Sayıyı verir (n tek ise tam ortadaki sayıdır).",
                "Asal Sayılar: Sadece 1'e ve kendisine bölünebilen 1'den büyük sayılardır. En küçük asal sayı 2'dir ve 2 haricinde çift asal sayı yoktur!",
                "Aralarında Asal Sayılar: 1'den başka ortak pozitif böleni olmayan sayılardır (Sayıların kendilerinin asal olması şart değildir; örn: 8 ile 9 aralarında asaldır)."
            ),
            kpssCodes = listOf(
                "İki basamaklı ab sayısının çözümlenişi: 10a + b.",
                "ab - ba = 9(a - b) ve ab + ba = 11(a + b) eşitlikleri sınavda büyük hız kazandırır."
            ),
            highYieldFacts = listOf(
                "0! = 1 ve 1! = 1 olarak kabul edilir.",
                "a ve b aralarında asal ise: EBOB(a, b) = 1 ve EKOK(a, b) = a * b'dir."
            ),
            readTimeMinutes = 7
        ),
        TopicLecture(
            id = "mat_02",
            subject = Subject.MATEMATIK,
            title = "Bölünebilme Kuralları ve EBOB - EKOK",
            summary = "2, 3, 4, 5, 8, 9, 11 ile bölünebilme; Asal çarpanlara ayırma, EBOB ve EKOK problemleri.",
            keyPoints = listOf(
                "Bölünebilme Kuralları:",
                "- 3 ile bölünebilme: Rakamları toplamı 3'ün katı olmalı,",
                "- 4 ile bölünebilme: Son iki basamağı 00 veya 4'ün katı olmalı,",
                "- 8 ile bölünebilme: Son üç basamağı 8'in katı olmalı,",
                "- 9 ile bölünebilme: Rakamları toplamı 9'un katı olmalı,",
                "- 11 ile bölünebilme: Birler basamağından başlayarak sola doğru (+, -, +, -, +) işaretleri verilip toplanır.",
                "EBOB (En Büyük Ortak Bölen): Parçalama, bölme, şişeleme ve paketleme sorularında (Büyük parçalardan küçük parçalar elde ediliyorsa) EBOB kullanılır.",
                "EKOK (En Küçük Ortak Kat): Nöbet tutma, zillerin birlikte çalması, tuğlaları üst üste koyup küp yapma sorularında (Küçük parçalardan büyük bir bütün elde ediliyorsa) EKOK kullanılır."
            ),
            kpssCodes = listOf(
                "İki Sayının Çarpımı Kuralı: EBOB(a, b) x EKOK(a, b) = a x b (Sadece iki sayı için geçerlidir!).",
                "Aralarında asal iki sayının EBOB'u 1'dir."
            ),
            highYieldFacts = listOf(
                "Bir sayının pozitif bölen sayısı (PBS): Sayı asal çarpanlarına ayrılır a^x * b^y * c^z, üsler birer artırılıp çarpılır: PBS = (x + 1)(y + 1)(z + 1).",
                "Tam bölen sayısı = 2 x PBS'dir."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "mat_03",
            subject = Subject.MATEMATIK,
            title = "Rasyonel Sayılar, Üslü ve Köklü Sayılar",
            summary = "Dört işlem, merdivenli işlemler, devirli sayılar; Üs özellikleri, Köklü sayılarda eşlenik ve kök dışına çıkarma.",
            keyPoints = listOf(
                "Devirli Ondalık Sayılar Formülü: (Sayının Tamamı - Devretmeyen Kısım) / (Virgülden sonraki devreden kadar 9, devretmeyen kadar 0).",
                "Üslü Sayılar Kuralları: Tabanlar aynı ise çarparken üsler toplanır, bölerken çıkarılır. Üsler aynı ise tabanlar çarpılır/bölünür. (a^x)^y = a^(x*y).",
                "Negatif Üs: a^(-n) = 1 / a^n (Sadece sayıyı ters çevirir, işaretini değiştirmez!).",
                "Köklü Sayılar: Kökün derecesi çift ise kök içi sıfırdan küçük olamaz (kök(x) >= 0). Eşlenik ile çarpma: Paydada köklü ifade bırakılmaz; pay ve payda eşlenikle çarpılır: (kök(a) - kök(b)) nin eşleniği (kök(a) + kök(b)) dir."
            ),
            kpssCodes = listOf(
                "İki Kare Farkı: a^2 - b^2 = (a - b)(a + b).",
                "Tam Kare: (a + b)^2 = a^2 + 2ab + b^2."
            ),
            highYieldFacts = listOf(
                "Sıfırıncı Kuvvet: 0^0 tanımsızdır; sıfır hariç her sayının sıfırıncı kuvveti 1'dir (a^0 = 1).",
                "Kök derecesi tek ise kök içi negatif olabilir: küpkök(-8) = -2."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "mat_04",
            subject = Subject.MATEMATIK,
            title = "Sayı, Kesir ve Yaş Problemleri Çözüm Taktikleri",
            summary = "Denklem kurma, payda eşitleme taktiği, kuyruk problemleri, yaş farkının değişmezliği ilkesi.",
            keyPoints = listOf(
                "Kesir Problemlerinde Bütün Seçimi: Bir soruda birden fazla kesir varsa (örneğin bir paranın 1/3'ü ve kalanın 2/5'i harcanıyorsa), bütün paraya paydaların çarpımı olan '15x' deyin. Böylece kesirli sayılarla uğraşmazsınız!",
                "Kuyruk Problemleri: Bir kişi baştan n. sırada, sondan m. sırada ise kuyrukta toplam kişi sayısı = n + m - 1'dir (o kişi iki kez sayıldığı için 1 çıkarılır).",
                "Yaş Problemleri Altın Kuralı: İki kişi arasındaki yaş farkı YILLAR GEÇSE DE ASLA DEĞİŞMEZ! Zamanla yaşların oranı değişir ama fark sabittir.",
                "t yıl sonra herkes t yaş büyür; n kişilik bir ailenin yaşları toplamı t yıl sonra n * t kadar artar."
            ),
            kpssCodes = listOf(
                "Yaş Farkı Sabittir: Anne ile kızın yaşları farkı 25 ise 20 yıl sonra da fark 25'tir.",
                "Adım Soruları: 5 ileri 2 geri giden biri her (5+2=7) adımda (5-2=3) adım ilerler."
            ),
            highYieldFacts = listOf(
                "Bir kesrin değeri a/b ise payına ax, paydasına bx diyerek başlayın.",
                "Ters orantılı çoklukların çarpımları sabittir (x * y = k); doğru orantılı çoklukların bölümleri sabittir (x / y = k)."
            ),
            readTimeMinutes = 8
        ),
        TopicLecture(
            id = "mat_05",
            subject = Subject.MATEMATIK,
            title = "Yüzde, Kâr-Zarar, Karışım ve Hız Problemleri",
            summary = "100x kuralı, indirim ve zam hesabı, karışım yüzdesi formülü, zıt ve aynı yönlü hareket, tren-tünel problemleri.",
            keyPoints = listOf(
                "Yüzde ve Maliyet Problemleri: Bir malın maliyet fiyatına daima 100x deyin. %20 kârlı satış = 120x; %30 zararlı satış = 70x.",
                "Art Arda Zam / İndirim Tuzağı: Bir mala %20 zam yapılıp yeni fiyat üzerinden %20 indirim yapılırsa fiyat başlangıç seviyesine dönmez! 100x -> 120x -> 120x - 24x = 96x (%4 zarar edilir).",
                "Karışım Problemleri Formülü: (1. Madde Miktarı x 1. Yüzde) + (2. Madde Miktarı x 2. Yüzde) = Toplam Miktar x Son Yüzde. Saf su eklenirse yüzdesi %0, saf tuz eklenirse %100 alınır.",
                "Hız Problemleri Formülleri: Yol = Hız x Zaman (x = V x t). İki araç birbirine doğru geliyorsa (zıt yönlü): Yol = (V1 + V2) x t. Aynı yönde gidiyorsa: Yol = (V1 - V2) x t.",
                "Ortalama Hız: V_ort = Toplam Yol / Toplam Zaman."
            ),
            kpssCodes = listOf(
                "Tren ve Tünel Problemleri: Alınan Yol = Trenin Boyu + Tünelin Boyu.",
                "Hız Birimi Dönüşümü: km/saat hızını metre/saniye'ye çevirmek için 3.6'ya bölün (veya 5/18 ile çarpın)."
            ),
            highYieldFacts = listOf(
                "İşçi Problemleri: Bir işi A işçisi tek başına a günde, B işçisi b günde bitirirse birlikte t günde: (1/a + 1/b) * t = 1 formülü kullanılır.",
                "Havuz Problemleri: Dolduran musluklar toplanır, dipteki boşaltan musluk çıkarılır: (1/a - 1/b) * t = 1."
            ),
            readTimeMinutes = 9
        )
    )
}
