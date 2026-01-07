package src;

public class AccountOopBasic {
    String accountNumber;
    double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}
