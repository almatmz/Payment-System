package strategy;

public class Order {
    private final float totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (paymentStrategy == null) {
            System.out.println("Error: Payment method not selected.");
            return;
        }
        paymentStrategy.pay((float) totalAmount);
        System.out.println("Order completed successfully.");
    }

}
