package src;

public class Guest extends User{
    public Guest(String userName) {
        super(userName);
    }

    @Override
    public void work() {
        System.out.println("Guest hanya dapat melihat informasi!");
    }
}
