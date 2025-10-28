abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) { System.out.println("Savings Account Loan applied: " + amount); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan(double amount) { System.out.println("Current Account Loan applied: " + amount); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount(101, "Alice", 8000),
            new CurrentAccount(102, "Bob", 20000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(5000);
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
