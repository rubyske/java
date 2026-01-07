package src;

public class MainAppOopBasic {
    public static void main(String[] args) {
        AccountOopBasic account = new AccountOopBasic();
        account.accountNumber = "081315178831";
        account.balance = 5000.00;


        UserOopBasic objUser = new UserOopBasic();
        objUser.userName = "Badru Kamal";
        objUser.email = "badrukamal23@gmail.com";
        objUser.account = account;
        objUser.displayInfo();
        objUser.login();
        objUser.showAccountBalance();
    }
}
