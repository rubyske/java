package src;

public class MethodApp {
    void showWelcomeMessage(){
        System.out.println("Welcome to Backend Java System");
    }

    void greetUser(String name){
        System.out.println("Hello " + name);
    }

    boolean isSaldoCukup(double saldo, double nominal){
        return saldo >= nominal;
    }
}
