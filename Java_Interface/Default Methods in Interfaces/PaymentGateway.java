public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor oldProvider = new OldPaymentProvider();
        PaymentProcessor newProvider = new NewPaymentProvider();

        System.out.println("--- Using Old Provider ---");
        oldProvider.processPayment(100.0);
        oldProvider.refund(50.0); // Uses the default method

        System.out.println("\n--- Using New Provider ---");
        newProvider.processPayment(200.0);
        newProvider.refund(75.0); // Uses the overridden method
    }
}
