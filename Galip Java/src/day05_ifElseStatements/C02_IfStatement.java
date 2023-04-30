package day05_ifElseStatements;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yazdırmak istediginiz ayın ilk harfini giriniz");

        char ilkharf = scanner.next().toUpperCase().charAt(0);

        if (ilkharf=='o' || ilkharf == 'O') System.out.println("Ocak");
        if (ilkharf=='S') System.out.println("Subat");
        if (ilkharf=='M') System.out.println("Mart veya Mayıs");
        if (ilkharf=='N') System.out.println("Nisan");
        if (ilkharf=='H') System.out.println("Haziran");
        if (ilkharf=='T') System.out.println("Temmuz");
        if (ilkharf=='A') System.out.println("Agustos veya Aralık");
        if (ilkharf=='E') System.out.println("Eylül veya Ekim");
        if (ilkharf=='K') System.out.println("Kasım");

    }
}
