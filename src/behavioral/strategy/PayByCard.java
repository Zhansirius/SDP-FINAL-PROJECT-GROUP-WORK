package behavioral.strategy;

public class PayByCard implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        System.out.println(
                "Payment " + amount + " KZT. Payment by card successful."
        );
        return true;
    }
}