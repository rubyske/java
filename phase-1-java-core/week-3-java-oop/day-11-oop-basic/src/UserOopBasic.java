package src;

public class UserOopBasic {
    String userName;
    String email;
    AccountOopBasic account;

    // tugas 1
    void displayInfo() {
        System.out.println("User Name : " + userName);
        System.out.println("Email : " + email);
    }

    //tugas 2
    void login() {
        System.out.println("User " + userName + " Login");
    }

    void showAccountBalance() {
        account.showBalance();
    }

}
