package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute the payment strategy
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

