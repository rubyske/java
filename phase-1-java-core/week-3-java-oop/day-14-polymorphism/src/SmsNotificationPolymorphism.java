package src;

public class SmsNotificationPolymorphism extends Notification{
    @Override
    public void send() {
        System.out.println("Sms Notification");
    }
}
