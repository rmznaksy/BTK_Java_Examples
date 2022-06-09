public class ProductManager {
    public void add(Product product){
        // new yapılmazsa yapıcı bloklar çalışmaz
        ProductValidator productValidator=new ProductValidator();
        if (productValidator.isValid(product)){
            System.out.println("Ürün Eklendi");
        }
        else
            System.out.println("Ürün bilgileri geçersizdir.");


    }
}
