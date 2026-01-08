package src;

public class TransactionService {
    boolean validateAmount(double amount) {
        return amount > 0;
    }

    double processTransaction(double saldo, double amount){
        if (validateAmount(amount) && saldo >= amount){
            return saldo - amount;
        }
        return saldo;
    }

}
