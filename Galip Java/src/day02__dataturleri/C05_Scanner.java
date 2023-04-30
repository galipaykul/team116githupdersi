package day02__dataturleri;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini isteyip
        // ismi buyuk harfe cevirip kaydedin
        // sonra kullaniciya yeni halini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminiz giriniz");
        String girilenIsim = scanner.nextLine();
        // nexLine () yazıla bilginin tumunu getirir
        // next () ilk space'e kadar olan kismini getirir H Ibrahim ==> H

        girilenIsim = girilenIsim.toUpperCase();

        System.out.println("Girilen ismin düzenlenmiş hali:"+girilenIsim);
    }
}
