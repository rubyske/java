package src;

public class UserEncapsulation {
    private String userName;
    private String email;
    private AccountEncapsulation account;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            System.out.println("Email tidak boleh kosong");
            return;
        }
        this.email = email;
    }

    public double getBalanceAccount() {
        return account.getBalance();
    }
}
