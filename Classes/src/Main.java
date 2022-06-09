public class Main {
    // Java da hersey class ın içinde oluşur.
    // class lar referans tiplerdir
    public static void main(String[] args) {
        // referance type
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add(); // Müşteri Eklendi
        customerManager.Update(); // Müşteri Güncellendi
        customerManager.Delete(); // Müşteri Silindi
//--------------------------------------------------------------------
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1; // sayi1 in değerini sayi2 ye verdi
        sayi1 = 30; // sayi1 yeni değeri
        System.out.println("sayi2:" + sayi2); //sayi2=10 yazar
        System.out.println("sayi1:" + sayi1); // sayi1=30 yazar
//---------------------------------------------------------------------
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);


    }

}
