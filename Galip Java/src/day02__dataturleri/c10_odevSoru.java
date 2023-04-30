package day02__dataturleri;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c10_odevSoru {
    public static void main(String[] args) {

         /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip,
        ucuncu bir degisken kullanmadan ikisinin
        degerlerini degistirin(swap).
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki adet pozitif tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // sayı1=15, sayi2=35

        sayi2= sayi2+sayi1;
        System.out.println(sayi2); // sayi2 =50

        sayi1 = sayi2 - sayi1;

        System.out.println(sayi2); // sayi2=15

        System.out.println("yerleri degisen sayılar : " +
                "\nsayi1 in yeni degeri : " + sayi1 +
                "\nsayi2 nin yeni degeri : " + sayi2);



    }
}
