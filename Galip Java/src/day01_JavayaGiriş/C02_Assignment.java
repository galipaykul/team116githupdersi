package day01_JavayaGiriş;

public class C02_Assignment {

    public static void main(String[] args) {

         int sayi ;

         // java değer atamadan
        // bir variable oluşturulmasına izin verir
        // ama deger atamadan kullanmaya izin vermez

        sayi = 20;

        System.out.println(sayi); // 20

        sayi = sayi+10;

        System.out.println(sayi); // 30

        // sayi + 10 = sayi ;

        // Java'da eşitliğin sol tarafı variable'dir ve sol tarafta işlem olmaz

        // eşitliğin sağ tarafı değerdir, burada işlemler olabilir

        // java = gorduğunde önce eşitliğin sağını hesaplar

        // sonra sağ tarafta bulduğu değeri, soldaki variable' a atama yapar

        sayi = 2 * sayi ;

        System.out.println(sayi); // 60

        // int sayi = 50;
        // data turu yukarıda tanımlanmıştı
        // java oluşturulan bir variable'nin data turumum değiştirilmesine İZİN VERMEZ
        // onun için data türü sadece 1 kere yazılabilir


        /*
        Java'da bir kodun altı kırmızı çizgili ise orada Compile Time Error CTE vardir
        eger projenin herhangi bir yerinde CTE varsa o projedeki hiçbir class çalışmaz

        Java'da yazdırma işlemi yapılırken " " arasına yazılan herşey bir metin olarak algılanır.

        ve " " ne yazarsanız oraya yazdığınız şekilde consolda yazdırılır

        Eğer bir variable'nin o satırdaki değerini yazdırmak isterseniz sout içerisine variable ismini yazmanız yeterlidir.

         */
    }
}
