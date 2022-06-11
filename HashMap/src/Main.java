import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        System.out.println("Sözlük Listesi: " + sozluk);

        for (String malzeme : sozluk.keySet()) {
            System.out.println("Eleman: " + malzeme + " Değer: " + sozluk.get(malzeme));
        }

        HashMap<Integer, String> veri = new HashMap<Integer, String>();
        veri.put(1, "Ahmet");
        veri.put(2, "Ramazan");
        veri.put(3, "Burak");

        System.out.println("Veri Listesi: " + veri);

        for (Object item : veri.keySet()) {
            System.out.println("Eleman: " + item + " Değer: " + veri.get(item));
        }

    }
}