package day06_nestedIfElseStatements_ternaryOperators;

public class C05_ternaryOperators {

    public static void main(String[] args) {

        int sayi = 14;

        // sayinin tek veya cift oldugunu yazdirin

        if (sayi%2==0){
            System.out.println("Verilen sayı cift sayidir");
        }else{
            System.out.println("Verilen sayi tek sayidir");
        }

        // ternary operatör'leri basit if-else cümlelerini daha kisa yazabilmek için kullanılır

        System.out.println(sayi%2==0? "Verilen sayi cift sayidir" : "Verilem sayi tek sayidir");

    }
}
