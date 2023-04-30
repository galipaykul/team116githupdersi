package day03_dataCasting_Increment;

import java.util.SortedMap;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        int sayi =10;

        // primitive data türlerinin hazır methodlari YOKTUR
        // java primitive data turleri ile bazi methodları kullanabilmemiz için
        // ozel Wrapper Class'lar oluşturulmuştur

        Integer sayWrap =10;

        /*
        byte
        Short
        Integer
        Long
        Float
        Double
        Charter
        Boolean
        Class'lari primitive data turleri ile aynı değerleri alabilir
        Aynı data turundeki primitive ve
        Wrapper Class arasında hiçbir casting olmaksızın atama yapılabilir
        */

        sayWrap = sayi;
        sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE); // 2147483647

        String str1 = "34";
        String str2 = "45";

        // bu iki String içindeki sayıların toplamını yazdırın

        System.out.println(str1+str2); // 3445

        System.out.println((Integer.parseInt(str1)+Integer.parseInt(str2))); // 79

        char chr = 'm';

        // chr'yi buyuk harf olarak yazdırın

        System.out.println(Character.toUpperCase(chr)); // M

        System.out.println(Character.isAlphabetic(chr)); // true

        System.out.println(Character.isDigit(chr)); // false

        Double db1 = 34.4;
        String doublestr = "44.3";

        // doubleStr değerinin 5 eksiğini yazdırın

        System.out.println(Double.parseDouble(doublestr)-5); // 36.3



    }
}
