package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C04_SwitchStatement {
    public static void main(String[] args) {

        // Kullanicidan 2 basamaklı bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yazıyla goruntulemek istediğiniz tam sayiyi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi < -99 || (girilenSayi > -10 && girilenSayi < 10) || girilenSayi > 100)
            System.out.println("iki basamakli bir tam sayi girmediniz");

        else{
            if (girilenSayi<0) {
                System.out.print("Eksi");
                girilenSayi*=-1;
            }
         switch (girilenSayi/10) {
             case 1:
                 System.out.println("on");
                 break;
             case 2:
                 System.out.println("yirmi");
                 break;
             case 3:
                 System.out.println("otuz");
                 break;
             case 4:
                 System.out.println("kırık");
                 break;
             case 5:
                 System.out.println("elli");
                 break;
             case 6:
                 System.out.println("altmış");
                 break;
             case 7:
                 System.out.println("yetmiş");
                 break;
             case 8:
                 System.out.println("seksen");
                 break;
             case 9:
                 System.out.println("doksan");
                 break;
         }
         switch (girilenSayi%10) {
             case 1:
                 System.out.println("bir");
                 break;
             case 2:
                 System.out.println("iki");
                 break;
             case 3:
                 System.out.println("üc");
                 break;
             case 4:
                 System.out.println("dört");
                 break;
             case 5:
                 System.out.println("bes");
                 break;
             case 6:
                 System.out.println("altı");
                 break;
             case 7:
                 System.out.println("yedi");
                 break;
             case 8:
                 System.out.println("sekiz");
                 break;
             case 9:
                 System.out.println("dokuz");
                 break;

        }
        }


        }
    }


