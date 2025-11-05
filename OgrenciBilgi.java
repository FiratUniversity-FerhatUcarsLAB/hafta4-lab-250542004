/* Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogreci Bilgi Sistemi
 *
 * Bu program kullanicidan ad, soyad, ogrenci no, gpa ve yas bilgilerini
 * alır ve bu bilgilerden gpa bilgisini kontrol ederek kullanici basari
 * durumunu belirler, ardindan bu degerleri ekrana -düzenli bir formatta- cikti olarak gonderir.
 */


import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {

        // Scanner objesi olusturuldu
        Scanner scan = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // Kullanicidan ad soyad bilgisi alinir
        System.out.print("Lutfen Adinizi Giriniz: ");
        String adi = scan.nextLine();

        System.out.print("Lutfen Soyadinizi Giriniz: ");
        String soyadi = scan.next();

        // Kullanicidan Ogrenci Numarasi alinir
        System.out.print("Lutfen Ogrenci Numarananizi Giriniz: ");
        int OgrenciNo = scan.nextInt();

        // Kullanicidan Yas bilgisi alinir
        System.out.print("Lutfen Yasinizi Giriniz: ");
        int yasi = scan.nextInt();

        // Kullanicidan 0.00 - 4.00 arasinda olan GPA bilgisi alinir
        System.out.print("Lutfen GPA Notunuzu Giriniz (0.00 - 4.00) : ");
        double gpa = scan.nextDouble();

        // Kulanicinin GPA degerine bakarak basarili olma durumu kontol edilir

        String BasariDurum;
        if(gpa >= 2 &&  gpa <= 4){
            BasariDurum = "Basarili Ogrenci";
        }
        else if (gpa < 2 && gpa >= 0){
            BasariDurum = "Basarisiz Ogrenci";
        }
        else{
            BasariDurum = "Gecersiz GPA Degeri Girilmis";
        }

        // Kullanicidan alinan bu bilgiler çıktı olarak verilir

        System.out.println("\n=== Ogrenci Bilgi Sistemi ===");
        System.out.println(String.format("Ad-Soyad: %s %s", adi, soyadi ));
        System.out.println("Ogrenci No: " + OgrenciNo);
        System.out.println("Yasiniz: " + yasi);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("Basari Durum: " + BasariDurum);

        // Scanner objesi kapatilir
        scan.close();
    }
}
