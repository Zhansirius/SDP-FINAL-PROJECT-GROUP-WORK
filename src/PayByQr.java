public class PayByQr implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment " + amount + " KZT. Payment by QR successful.");
        return true;
    }
}