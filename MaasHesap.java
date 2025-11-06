/* Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Tarih: 06.11.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 *
 * Bu projede kullanicidan alinan ad-soyad, brut maas, calisma saati,
 * mesai saati verilerini alarak bu verileri elimizde sabit olarak
 * tanımlanmıs degerleri kullanarak kullanicinin maas bordrosu cikarilmis
 * ve bu maas bordrosu istenilen formatta ekrana cikti olarak gonderilmistir
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MaasHesap {
    public static void main(String[] args) {

        // Scanner nesnesi olusturuldu
        Scanner scan = new Scanner(System.in);

        // Anlik Tarih Bilgisi Alinir
        LocalDate bugun = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tarih = bugun.format(formatter);

        // Maas hesaplamasinda kullanilacak olan sabit degerlerin atamasi yapiliyor
        final double SGK_Orani = 0.14;
        final double Gelir_Vergisi_Orani = 0.15;
        final double Damga_Vergisi_Orani = 0.00759;
        final double Mesai_Katsayisi = 1.5;
        final double Aylik_Ort_Calisma_Saati = 160;
        final double Is_Gunu_Sayisi = 22;

        // Kullanicidan maas hesaplamasi icin gerekli veriler aliniyor

        System.out.println("========== Maas Hesaplama Sistemi ==========");
        System.out.print("\nCalisan Ad-Soyad: ");
        String AdSoyad = scan.nextLine();
        System.out.print("Brut Maas (TL): ");
        Double BrutMaas = scan.nextDouble();
        System.out.print("Haftalik Calisma Saati: ");
        int CalismaSaati = scan.nextInt();
        System.out.print("Mesai Saati Sayisi: ");
        int MesaiSaati = scan.nextInt();

        // Kullanicidan alinan veriler kullanilarak maas bordrosu icin gerekli veriler hesaplaniyor
        double MesaiUcreti = (BrutMaas/Aylik_Ort_Calisma_Saati) * Mesai_Katsayisi * MesaiSaati;
        double ToplamGelir = BrutMaas + MesaiUcreti;
        double SGKKesinti = ToplamGelir * SGK_Orani;
        double GelirVergisiKesinti =  ToplamGelir * Gelir_Vergisi_Orani;
        double DamgaVergisiKesinti =  ToplamGelir * Damga_Vergisi_Orani;
        double ToplamKesinti = GelirVergisiKesinti + DamgaVergisiKesinti + SGKKesinti;
        double NetMaas = ToplamGelir - ToplamKesinti;
        double KesintiOraniYuzde = (ToplamKesinti/ToplamGelir)*100;
        double SaatlikMaas = NetMaas / Aylik_Ort_Calisma_Saati;
        double GunlukMaas = NetMaas / Is_Gunu_Sayisi;

        // Kullanicinin girdigi veriler hesaplanarak maas bordrosu cikarilir

        System.out.println("\n============================================");
        System.out.println("                MAAS BORDROSU               ");
        System.out.println("============================================");
        System.out.println("Calisan: "+ AdSoyad);
        System.out.println("Tarih: "+ tarih);
        System.out.println("\nGELIRLER:");
        System.out.printf(" Brut Maas              : %.2f TL%n", BrutMaas);
        System.out.printf(" Mesai Ucreti ("+MesaiSaati+" Saat) : %.2f TL%n",MesaiUcreti);
        System.out.println(" ------------------------");
        System.out.printf(" TOPLAM GELİR           : %.2f TL%n", ToplamGelir);
        System.out.println("\nKESINTILER:");
        System.out.printf(" SGK Kesintisi (14.0%%)      : %.2f TL%n", SGKKesinti );
        System.out.printf(" Gelir Vergisi (15.0%%)      : %.2f TL%n", GelirVergisiKesinti);
        System.out.printf(" Damga Vergisi (0.8%%)       : %.2f TL%n", DamgaVergisiKesinti);
        System.out.println(" ----------------------------");
        System.out.printf(" Toplam Kesinti              : %.2f TL%n", ToplamKesinti);
        System.out.printf("\nNET MAAS                     : %.2f TL%n", NetMaas);
        System.out.println("ISTATISTIKLER: ");
        System.out.printf(" Kesinti Orani               : %.1f TL%n", KesintiOraniYuzde);
        System.out.printf(" Saatlik Net Kazanc          : %.2f TL/saat%n", SaatlikMaas);
        System.out.printf(" Gunluk Net Kazanc           : %.2f TL/gun%n", GunlukMaas);
        System.out.println("============================================");

        // Scanner objesi kapatilir
        scan.close();

    }
}
