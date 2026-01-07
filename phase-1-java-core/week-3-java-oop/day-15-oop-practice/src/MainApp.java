package src;

import src.notification.impl.EmailNotificationImpl;
import src.notification.Notification;
import src.notification.impl.PushNotification;
import src.notification.impl.SmsNotificationImpl;

public class MainApp {
    public static void main(String[] args) {
        User admin = new Admin("admin1");
        User customer = new Customer("user1");
        User guest = new Guest("Gues1");

        Notification email = new EmailNotificationImpl();
        Notification sms = new SmsNotificationImpl();
        Notification pushNotification = new PushNotification();

        admin.login();
        admin.work();
        email.send("Admin login success");

        System.out.println("======================================");

        customer.login();
        customer.work();
        sms.send("Transaction Success");

        System.out.println("======================================");
        guest.login();
        guest.work();
        pushNotification.send("Anda tidak dapat melakukan Transaksi");

    }
}
