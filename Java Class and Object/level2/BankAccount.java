class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Archit", 12345, 10000);
        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}