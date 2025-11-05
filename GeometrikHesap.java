/* Ad Soyad: Emirhan LEVENTER
 * Ogrenci No: 250542004
 * Tarih: 05.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 *
 * Bu program kullanicidan yaricap degeri alarak, bu deger uzerinde birkac
 * geometrik hesaplama yapip buldugu degerleri ekrana istenilen formatta
 * cikti olarak gonderir.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        // Scanner objesi olusturuldu
        Scanner scan = new Scanner(System.in);

        // math sinifindan pi degerini alip sabit bir değere atadik
        final double pi = Math.PI;

        // Kullanicidan yaricap bilgisini aldik
        System.out.println("====== GEOMETRIK HESAPLAYİCİ ======");
        System.out.print("Dairenin Yaricapini Girin (cm): ");
        double yaricap = scan.nextDouble();

        // Kullanicidan alinan yaricap degerini kullanarak geometrik hesaplamalar yapilir
        double DaireAlan = pi *(Math.pow(yaricap, 2));
        double DaireCevre = 2 * pi * yaricap;
        double KureHacim = 4.0/3.0 * pi * (Math.pow(yaricap, 3));
        double KureAlan = 4.0 * pi * (Math.pow(yaricap, 2));

        // Hesaplanilan veriler ekrana cikti olarak verilir
        System.out.println("\nSONUCLAR: \n"+"--------------------------------------");
        System.out.printf("Daire Alani      : %.2f cm^2%n", DaireAlan );
        System.out.printf("Daire Cevre      : %.2f cm%n", DaireCevre);
        System.out.printf("Daire Capi       : %.2f cm%n",(yaricap*2));
        System.out.printf("Kure Hacmi       : %.2f cm^3 %n", KureHacim);
        System.out.printf("Kure Yuzey Alani : %.2f cm^2%n", KureAlan);

        // Scanner objesi kapatildi
        scan.close();
    }
}
