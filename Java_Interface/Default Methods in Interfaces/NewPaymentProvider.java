public class NewPaymentProvider implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("[New Provider] Payment of $" + amount + " processed successfully.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("[New Provider] A specific refund of $" + amount + " has been initiated.");
    }
}
