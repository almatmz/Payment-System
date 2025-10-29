package strategy.concrete_strategies;

import strategy.PaymentStrategy;

public class PayByCrypto implements PaymentStrategy {
    private final String walletAddress;

    public PayByCrypto(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Processing Crypto payment...");
        System.out.println("Wallet: " + walletAddress);
        System.out.println("Paid " + amount + " Tenge using Cryptocurrency.");
    }
}