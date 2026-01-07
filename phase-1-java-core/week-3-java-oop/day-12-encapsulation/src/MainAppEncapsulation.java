package src;

public class MainAppEncapsulation {
    public static void main(String[] args) {

        AccountEncapsulation account = new AccountEncapsulation();
        account.deposit(5000.00);
        account.withdraw(2000.00);
        account.withdraw(5000.00);
    }
}
