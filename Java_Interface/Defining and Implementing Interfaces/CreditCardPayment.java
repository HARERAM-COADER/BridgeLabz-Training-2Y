public class CreditCardPayment implements Payable {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Charging $" + amount + " to credit card " + cardNumber);
    }
}
