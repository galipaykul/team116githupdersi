package day13_arrays;

public class C04_ArraydeIstenenSartiSaglayanElementSayisiBulma {

    public static void main(String[] args) {

       int [] arr = {2,4,6,8,1,3,7,5};

       // array'de kaç tane cift sayi olduğunu yazdirin

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                sayac++;
                               
            }
        }
        System.out.println("Verilen array'deki 3'e tam bölünen sayi adedi : "+sayac);

        // verilen array'de 4 ile 8 (sinirlar dahil) arasinda kac sayi olduğunu yazdirin

        sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>=4 && arr[i]<=8){
                sayac++;

            }

        }

        System.out.println("Verilen array'de istenen araliktaki sayi adedi : "+ sayac);
    }
}
