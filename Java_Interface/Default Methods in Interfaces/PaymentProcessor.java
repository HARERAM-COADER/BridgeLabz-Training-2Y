public interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Processing a generic refund of $" + amount + ". " +
                "Implement this for custom behavior.");
    }
}
