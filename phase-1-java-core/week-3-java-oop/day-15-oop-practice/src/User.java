package src;

public abstract class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void login(){
        System.out.println(userName + " Login");
    }

    public abstract void work();
}
