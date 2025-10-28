public class PaymentSystem {
    public static void main(String[] args) {
        Payable upi = new UpiPayment("user@bank");
        Payable creditCard = new CreditCardPayment("1234-5678-9012-3456");
        Payable wallet = new WalletPayment();

        System.out.println("--- Making Payments ---");
        upi.pay(150.75);
        creditCard.pay(899.99);
        wallet.pay(45.50);
    }
}
