class Notification {

    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class SMS extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}

class WhatsApp extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Sending WhatsApp Notification");
    }
}

class Email extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Notification n;

        n = new SMS();
        n.sendNotification();

        n = new WhatsApp();
        n.sendNotification();

        n = new Email();
        n.sendNotification();
    }
}