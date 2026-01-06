public class Loop {
    public static void main(String[] args) {
        // tugas 1
        int[] saldo = {100_000, 200_000, 150_000, 50_000};
        int total = 0 ;
        for (int t : saldo){
            total += t;
        }
        System.out.println("total saldo : " + total);

        System.out.println("====================================");
        //tugas 2
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i + " genap");
            } else {
                System.out.println(i + " ganjil");
            }
        }

        System.out.println("====================================");
        // tugas 3
        String correctUsername = "admin";
        String correctPassword = "12345";

        for (int attempt = 1; attempt <= 3; attempt++) {

            String inputUsername = "admin";
            String inputPassword = "1234";

            if (inputUsername.equals(correctUsername)
                    && inputPassword.equals(correctPassword)) {
                System.out.println("Login berhasil");
                break;
            } else {
                System.out.println("Login gagal (percobaan ke-" + attempt + ")");
            }

            if (attempt == 3) {
                System.out.println("Akun diblokir");
            }
        }


    }
}
