package day03_dataCasting_Increment;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {

        System.out.println( 20 % 8 ); // 4

        System.out.println( 625872538 % 3 ); // 1 eger sonuc 0 ise sayi 3'e tam bölünür

        // 12563412 sayısı 17'nin tam katımıdır?

        System.out.println(12563412 % 17); // 4 demek ki tam katı değil

        // kullanıcıdan bir pozitif tamsayı alıp
        // birler basamağının karesini yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi%10 * girilenSayi%10);

        // girilen sayıdan birler basamağının silip kalan sayiyi yazdırın
        // orneğin 213 girildiğinde 21 yazdırırsın

        System.out.println(girilenSayi / 10 ); // 213 / 10 ===> 21

    }
}
