package src;

public class Conditional {
    public static void main(String[] args) {
        //contoh 1
        int umur = 18;

        if (umur >= 18 ) {
            System.out.println("pendaftaran diterima!");
        } else {
            System.out.println("pendaftaran ditolak!");
        }

        System.out.println("===================================");
        //contoh 2
        String username ="admin";
        String password = "12345";

        if (username.equals("admin") && password.equals("12345")){
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }

        System.out.println("===================================");
        //contoh 3
        double saldo = 500.000;
        double nominalTransfer = 300.000;

        if (nominalTransfer <= 0){
            System.out.println("nominal transfer tidak boleh kurang dari 1");
        } else if (nominalTransfer > saldo) {
            System.out.println("Transfer gagal! saldo tidak cukup");
        } else {
            System.out.println("Transfer Berhasil!");
        }

        System.out.println("===================================");
        //contoh 4
        int nilai = 85;

        if (nilai >= 85){
            System.out.println("A");
        } else if (nilai >= 70){
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        System.out.println("===================================");
        //contoh 5
        int menu = 1;

        switch (menu){
            case 1:
                System.out.println("Cek Saldo");
            break;
            case 2:
                System.out.println("Transfer");
            break;
            case 3:
                System.out.println("Keluar");
            break;
            default:
                System.out.println("menu yang kamu masukan salah!");
        }
    }
}
