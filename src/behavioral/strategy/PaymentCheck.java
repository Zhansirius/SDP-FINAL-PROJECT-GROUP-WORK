package behavioral.strategy;

public class PaymentCheck implements PaymentStrategy {

    private PaymentStrategy payment;
    private boolean successful;

    public PaymentCheck(PaymentStrategy payment) {
        this.payment = payment;
    }

    @Override
    public boolean pay(double amount) {
        successful = payment.pay(amount);
        return successful;
    }

    public boolean isSuccessful() {
        return successful;
    }
}