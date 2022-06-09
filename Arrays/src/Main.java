import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 1.4, 1.5, 1.6, 1.7};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            System.out.print(number + " - ");
            total += number;

        }
        System.out.println();
        System.out.println("Toplam: " + total);
        System.out.println("Max Sayı: " + max);


    }
}