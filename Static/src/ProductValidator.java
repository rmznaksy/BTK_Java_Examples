public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapıcı blok new yapıldığı için çalıstı");
    }

    public static boolean isValid(Product product) {
        // price >0 ve name boş olmayacak
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else
            return false;

    }

    public void exam(){
        // ProductManager de
        // eğer new leme yapmazsak buna erişemeyiz.

    }

}
