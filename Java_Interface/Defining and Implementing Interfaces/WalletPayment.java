public class WalletPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Deducting $" + amount + " from digital wallet.");
    }
}
