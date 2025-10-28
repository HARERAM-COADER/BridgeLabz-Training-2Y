public class UpiPayment implements Payable {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " to " + upiId);
    }
}
