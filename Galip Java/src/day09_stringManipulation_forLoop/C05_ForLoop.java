package day09_stringManipulation_forLoop;

public class C05_ForLoop {

    public static void main(String[] args) {

        // 10 kere "Hello World" yazdirin

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("============");
        String str = "Hello World";

        System.out.println(str.repeat(10));

        // verilen bir sayinin rakamlar toplamini bulun
        // 1'den 100'e kadar(100 dahil) olan sayilari yazdirin

        for (int i = 1; i <=100; i++) {

            System.out.println(i +" ");

        }

    }
}
