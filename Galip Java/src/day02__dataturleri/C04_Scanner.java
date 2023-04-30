package day02__dataturleri;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  Kullanıcıdan bir tamsayi isteyin
        //  girilen sayinin 2 katını yazdırın

        // 1-Scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        // 2-Kullancıya ne istediğimizi söyleyin

        System.out.println("Lutfen bir tamsayı giriniz");

        // 3-kullacının gireceği data turune uygun bir variable olusturun
        // scanner objesi ile variable'a uygun hazır method'u kullanıp
        // kullanıcıdan değeri alın ve oluşturduğumuz variable'a atayın

        int girilenSayi = scanner. nextInt();

        System.out.println("Gridiğiniz sayinin iki kati : "+2*girilenSayi);

    }
}
