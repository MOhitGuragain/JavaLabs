class Account {
    protected int accountNumber;
    protected double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Account.");
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // call parent constructor
        this.interestRate = interestRate;
    }

    // Overriding deposit method to add interest
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // call parent deposit
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }

    // Overriding display method
    @Override
    public void display() {
        super.display(); // call parent display
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class qes7 {
    public static void main(String[] args) {
        // Create a normal Account
        Account acc = new Account(1001, 5000);
        acc.deposit(1000);
        acc.display();

        System.out.println("--------------------");

        // Create a Savings Account
        SavingsAccount savAcc = new SavingsAccount(2001, 8000, 5);
        savAcc.deposit(2000);
        savAcc.display();
    }
}
