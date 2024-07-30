package StrategyPatternExample;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Set the payment strategy to Credit Card and execute payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "12/25", "123");
        paymentContext.setPaymentStrategy(creditCardPayment);
        System.out.println("Using Credit Card Payment Strategy:");
        paymentContext.executePayment(150.00);

        // Set the payment strategy to PayPal and execute payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "securepassword");
        paymentContext.setPaymentStrategy(payPalPayment);
        System.out.println("\nUsing PayPal Payment Strategy:");
        paymentContext.executePayment(150.00);
    }
}
