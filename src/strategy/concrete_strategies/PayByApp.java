package strategy.concrete_strategies;

import strategy.PaymentStrategy;

public class PayByApp implements PaymentStrategy {
    private String email;

    public PayByApp(String email) {
        this.email = email;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Processing payment with Application...");
        System.out.println("Email: " + email);
        System.out.println("Paid " + amount + " Tenge via Application.");
    }
}
