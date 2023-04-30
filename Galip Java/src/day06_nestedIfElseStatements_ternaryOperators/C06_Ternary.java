package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {

    public static void main(String[] args) {

        // Verilen sayi pozitif ise degerine 2 katına cıkarın
        // pozitif degil ise degerini 10 artırın

        int sayi = -10;

        sayi = sayi>0 ? 2*sayi : sayi+10;

        // Ternary bize sonuc verir, bu sonucu ya direk yazdırmaliyiz veya variable'a atamaliyiz

        System.out.println(sayi);

    }
}
