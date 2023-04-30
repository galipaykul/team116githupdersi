package day13_arrays;

public class C08_ArraydeElemanArama {

    public static void main(String[] args) {

        // Soru 4-  Verilen bir array’de
        //          istenen bir elemanin var olup olmadigini
        //          ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String [] sinifListesi={"Saida","Isa","Asil","Kubra","Elif","Yusuf","isa"};
        String arananİsim="Isa";

        arrayElemanBul(sinifListesi,arananİsim);

    }

    private static void arrayElemanBul(String[] arr, String arananİsim) {
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr [i].equalsIgnoreCase(arananİsim)){
                sayac++;


            }

        }

        if (sayac==0){
            System.out.println("Aradiğiniz isim sinif listesinde yok");
        }else {

            System.out.println("Aradiğiniz isim sinif listeside" +sayac+"adet bulunuyor");
        }
    }
}
