package strategy;

public class Order {
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(double totalAmount) {
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
