package day05_ifElseStatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C14_IfElseIfStatements {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi giriniz,\nKadin için : K, Erkek için E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasınızı giriniz");

        int yas = scanner.nextInt();

        if ((cinsiyet != 'K'  && cinsiyet != 'E')|| yas<10 || yas>80){

            System.out.println("gecersiz giris");

        }else if (cinsiyet == 'K' && yas>=60){

            System.out.println("Kadın 60 yasindan büyük, emekli olabilir");
        } else if (cinsiyet== 'K'&& yas<60) {
            System.out.println("Kadın 60 yasına kadar calışmalidir, daha" + (60 - yas) + "sene calişmalisin");
        } else if (cinsiyet=='E'&& yas>=65) {
            System.out.println("Erkek 65 yasindan büyük, emekli olabilir");
        } else if (cinsiyet=='E'&& yas<=65) {
            System.out.println("Erkek 65 yasina kadar calismalidir, daha"+(65-yas)+"sene calismalisin");

        }

    }

    }

