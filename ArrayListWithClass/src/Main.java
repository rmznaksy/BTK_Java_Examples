import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Ali","AKSOY"));
        customers.add(new Customer(2,"Ramazan","AKSOY"));
        customers.add(new Customer(3,"Engin","Demiroğ"));
        customers.add(new Customer(4,"Fatih","AKSOY"));

        customers.remove(0);

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }




    }
}