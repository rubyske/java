package src;

public class AccountEncapsulation {
    private double balance;

    public void deposit(double amount){
        if (amount < 0 ) {
            System.out.println("Amount tidak boleh kurang dari 0!");
            return;
        }
        balance += amount;
        System.out.println("Deposit berhasil. Saldo sekarang: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Penarikan gagal: nominal tidak valid");
            return;
        }
        if (amount > balance) {
            System.out.println("Penarikan gagal: saldo tidak cukup");
            return;
        }
        balance -= amount;
        System.out.println("Penarikan berhasil. Saldo sekarang: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
