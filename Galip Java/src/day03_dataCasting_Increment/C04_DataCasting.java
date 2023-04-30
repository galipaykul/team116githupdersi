package day03_dataCasting_Increment;

public class C04_DataCasting {
    public static void main(String[] args) {

        int sayi = 10;
        boolean b1 = true;
        char chr = 'K';

        // String bir ifade başka turdeki
        // veriable veya degerlerle işleme girerse
        // onları da String'leştirir

        String str = sayi+""; // "10"

        System.out.println(str.charAt(0)); //

        str = ""+b1; // "true"
        System.out.println(str.charAt(1)); //

        str = chr+""; // "K"

        System.out.println(str.toLowerCase()); // K

    }
}
