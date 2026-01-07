package src;

public class MainAppPolymorphism {
    public static void main(String[] args) {
        Notification notification;

        notification = new EmailNotificationPlymorphism();
        notification.send();

        notification = new SmsNotificationPolymorphism();
        notification.send();
    }
}
