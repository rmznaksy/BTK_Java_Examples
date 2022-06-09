import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Yozgat");
        sehirler.add("İstanbul");
        sehirler.add("Kayseri");
        sehirler.add("Ankara");
        sehirler.add("Aydın");
        sehirler.remove("İstanbul"); // İstanbul silinir
        Collections.sort(sehirler); // sehirleri sıralar
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}