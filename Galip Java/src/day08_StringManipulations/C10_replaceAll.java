package day08_StringManipulations;

public class C10_replaceAll {
    public static void main(String[] args) {

        // str icindeki bütün sayilari method ile temizleyin

        String str = "J23a3345v4353a234C354345a3456n345dir";

        /*
        replaceAll methodu, elementlerin ortak özelliklerini kullanarak,
        genel işlem yapmak için kullanılır.
        genel özellikler java regex olarak tanımlanıyor.
        */

        System.out.println(str.replaceAll("//d", ""));
    }
}
