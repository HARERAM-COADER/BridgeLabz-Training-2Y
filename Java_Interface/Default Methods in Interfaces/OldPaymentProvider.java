public class OldPaymentProvider implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("[Old Provider] Payment of $" + amount + " processed.");
    }
}
