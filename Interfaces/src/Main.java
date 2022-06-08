public class Main {
    public static void main(String[] args) {
        // interface new yapılmaz
        CustomerManager customerManager = new CustomerManager(new MySQLCustomerDal());
        customerManager.add();
    }
}