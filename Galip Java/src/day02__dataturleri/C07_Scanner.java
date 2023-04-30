package day02__dataturleri;

import java.util.Scanner;
import java.util.SortedMap;

public class C07_Scanner {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //         asagidaki formatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : DOE
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla isminizi, soyisminizi ve yaşınızı giriniz");

        String isim = scanner.nextLine();

        String soyisim = scanner.nextLine().toUpperCase();

        int yas = scanner.nextInt();


        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
        */

        System.out.println("Isminiz :"+isim+"nSoyisminiz:"+soyisim+"/nYasiniz:"+yas+"/nKaydiniz başarıyla tamamlanmiştir.");


    }
}

