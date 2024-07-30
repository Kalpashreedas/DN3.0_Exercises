package DecoratorPatternExample;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Send an email notification
        System.out.println("Sending email notification:");
        emailNotifier.send("Hello via Email!");

        // Create an email notifier wrapped with SMS notification
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Send email and SMS notifications
        System.out.println("\nSending email and SMS notifications:");
        smsEmailNotifier.send("Hello via Email and SMS!");

        // Create an email notifier wrapped with both SMS and Slack notifications
        Notifier slackSmsEmailNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send email, SMS, and Slack notifications
        System.out.println("\nSending email, SMS, and Slack notifications:");
        slackSmsEmailNotifier.send("Hello via Email, SMS, and Slack!");
    }
}

