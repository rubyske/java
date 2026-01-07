package src;

public class Customer extends User{
    public Customer(String userName) {
        super(userName);
    }

    @Override
    public void work() {
        System.out.println("Customer melakukan Transaksi");
    }

    public void doTransaction(){
        System.out.println("Customer Transaction Processed");
    }
}
