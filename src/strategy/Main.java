package strategy;
import strategy.concrete_strategies.PayByApp;
import strategy.concrete_strategies.PayByCreditCard;
import strategy.concrete_strategies.PayByCrypto;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1490);

        PaymentStrategy app = new PayByApp("almmuzdubai@gmail.com");
        order.setPaymentStrategy(app);
        order.processOrder();

        PaymentStrategy card = new PayByCreditCard("1234567890123456", "Almat Muzdybay");
        order.setPaymentStrategy(card);
        order.processOrder();

        PaymentStrategy crypto = new PayByCrypto("0xAB12CD34EF56");
        order.setPaymentStrategy(crypto);
        order.processOrder();
    }
}
