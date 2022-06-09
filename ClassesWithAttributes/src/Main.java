public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(8);
        product.setStockAmount(3);
        System.out.println("id: " + product.getId() + " name: " + product.getName()
                + " description: " + product.getDescription()
                + " price: " + product.getPrice()
                + " stock amount: " + product.getStockAmount());
        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}