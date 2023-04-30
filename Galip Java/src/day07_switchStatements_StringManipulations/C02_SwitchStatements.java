package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan ay numarasini alin,
        //        o ayin hangi mevsimde oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir at numarasi giriniz");

        int ayNo = scanner.nextInt();

        switch (ayNo) {

            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");
        }
    }
}
