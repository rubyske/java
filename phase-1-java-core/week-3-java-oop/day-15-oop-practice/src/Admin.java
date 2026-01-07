package src;

public class Admin extends User{
    public Admin(String userName) {
        super(userName);
    }

    @Override
    public void work() {
        System.out.println("Admin mengelola Sistem");
    }

    public void  manageSystem(){
        System.out.println("System maintenance by Admin");
    }
}
