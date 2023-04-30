package day06_Deneme;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C01_Toplantı {

    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
         isim bosluk soyisim seklinde bize donduren bir method olusturun
         input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");
        String soyisim = scanner.next();

        //Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // isim bosluk soyisim seklinde bize donduren bir method olusturun

        System.out.println(isimSoyisimDuzenleme(isim,soyisim));
            }

    public static String isimSoyisimDuzenleme(String isim,String soyisim){

    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    String isimSoyisim="İsim : "+isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase()+"  "+
            "Soyisim : "+soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();
        return isimSoyisim;
                }
                }


