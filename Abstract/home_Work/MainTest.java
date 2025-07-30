package Abstract.home_Work;

abstract class Notification {
    abstract void notifyUser(String message);
}

class EmailNotification extends Notification {
    private String recipient;

    EmailNotification(String recipient) {
        this.recipient = recipient;
    }

    @Override
    void notifyUser(String message) {
        if (recipient.contains("@")) {
            System.out.println("Email sent to " + recipient + " : " + message);
        } else {
            throw new IllegalArgumentException("Invalid Email ID. Please include '@' ");
        }
    }
}

class SMSNotification extends Notification {
    private String phone;

    SMSNotification(String phone) {
        this.phone = phone;
    }

    @Override
    void notifyUser(String message) {
        if (phone.matches("\\d{10}")) {
            System.out.println("SMS sent to " + phone + " : " + message);
        } else {
            System.out.println("Invalid phone number: " + phone);
        }
    }
}

public class MainTest {
    public static void main(String[] args) {
        Notification email = new EmailNotification("bablukumar@gmail.com");
        email.notifyUser("You got a notification on email");

        Notification sms = new SMSNotification("8809636316");
        sms.notifyUser("Hello! You got an SMS");
    }
}