package strategy.concrete_strategies;

import strategy.PaymentStrategy;

public class PayByCreditCard implements PaymentStrategy {
    private String cardNumber;
    private String cardOwner;
    public PayByCreditCard(String cardNumber, String cardOwner) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Holder: " + cardOwner);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Paid " + amount + " Tenge via Credit Card.");
    }
}
