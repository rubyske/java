package src;

public class ExcpetionHandlingApp {
    static void tugas1() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error perhitungan");
        }
    }

    //tugas 2
    static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Nominal tidak valid");
        }
    }

    // tugas 3
    static void tugas3(double saldo, double amount){
        if(saldo < amount){
            throw new SaldoTidakCukupException("Saldo tidak cukup");
        }
    }

    public static void main(String[] args) {
        try {
            tugas1();
            validateAmount(0);
            tugas3(1000.00, 8000.00);
        } catch (IllegalArgumentException | SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
        }
    }

}
