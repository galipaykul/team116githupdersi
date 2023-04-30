package day02__dataturleri;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner =new Scanner(System.in);

        System.out.println("lütfen ondalıklı bir sayi giriniz");

        double ondalikliSayi= scanner.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz");

        int tamSayi = scanner.nextInt();

        System.out.println("Girilen sayilarin toplami: "+ondalikliSayi+tamSayi);
    }
}
