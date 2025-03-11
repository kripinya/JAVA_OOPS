/*Write a Java program to create an interface Bank with methods deposit(double amount) and withdraw(double amount). Implement this interface in a class Account that
 overrides these methods to perform deposit and withdrawal operations on a balance variable. Create another class BankDemo with a main() method to test the
  functionality by depositing and withdrawing amounts and displaying the updated balance.*/
// Define the Bank interface
interface Bank {

    void deposit(double amount);

    void withdraw(double amount);
}

// Implementing the Bank interface in the Account class
class Account implements Bank {

    private double balance;

    // Constructor to initialize balance
    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class to test the functionality
public class Exp7_third {

    public static void main(String[] args) {
        // Creating an Account object with an initial balance of $1000
        Account myAccount = new Account(1000);

        // Performing deposit and withdrawal operations
        myAccount.displayBalance();
        myAccount.deposit(500);
        myAccount.displayBalance();
        myAccount.withdraw(300);
        myAccount.displayBalance();
        myAccount.withdraw(1500); // Attempting to withdraw more than balance
    }
}
