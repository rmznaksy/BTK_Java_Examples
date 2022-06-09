public class Main {

    public static void main(String[] args) {
        // For Döngüsü
        for (int i = 0; i <= 10; i++) {
            System.out.print(i+", ");
        }
        System.out.println("For Döngü Bitti....");

        // While Döngüsü
        int i = 0;
        while (i < 10) {
            System.out.print(i+", ");
            i++;

        }
        System.out.println("While Döngüsü bitti...");

        // Do-While Döngüsü
        int j = 0;
        do {
            System.out.print(j+", ");
            j++;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti...");

    }
}