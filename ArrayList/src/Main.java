import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        System.out.println("Eleman sayisi: "+sayilar.size()); // ArrayList te kaç eleman olduğunu yazar
        sayilar.add(10);
        sayilar.add("Ankara");
        sayilar.add(15);
        sayilar.add(25);
        sayilar.add("İstanbul");
        /*
        System.out.println(sayilar.size()); // ArrayList te kaç eleman olduğunu yazar
        System.out.println(sayilar); // ArrayList teki elemanları yazar
        System.out.println(sayilar.get(0)); // 0. indexte olan elemanı yazar
        sayilar.set(0,12); // 0. indexteki elemanın değerini 12 yaptık
        System.out.println(sayilar.get(0));
        sayilar.remove(2); // 2. indexteki elemanı siler yani 15 silinir
     //   sayilar.clear(); // tüm elemanları siler
        System.out.println(sayilar);
        */

        for (Object i : sayilar){
            System.out.println(i);
        }

    }
}