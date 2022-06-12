/* uygulama çalısırken alınacak hataları önlemek ve 
programın çalısmasını durdurmayacak hata yönetimi diyebiliriz     */

public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar= new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            System.out.println("Hata oluştu ve Hatanın nedeni:");
            System.out.println(exception);
        }finally {
            System.out.println("Ben her türlü çalışırım...");
        }




    }
}