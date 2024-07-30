package AdapterPatternExample;

public class TestAdapterPattern {
    public static void main(String[] args) {
        // Process payment through PayPal
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(150.00);

        // Process payment through Stripe
        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(200.00);

        // Process payment through Square
        PaymentProcessor squareProcessor = new SquareAdapter();
        squareProcessor.processPayment(250.00);
    }
}
