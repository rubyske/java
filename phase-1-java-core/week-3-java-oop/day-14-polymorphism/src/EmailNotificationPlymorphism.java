package src;

public class EmailNotificationPlymorphism extends Notification{
    @Override
    public void send() {
        System.out.println("Notification Email");
    }
}
