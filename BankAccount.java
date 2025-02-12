//lab4_second

public class BankAccount {

    /*Create a BankAccount class with a private variable balance to store the account balance.
Implement a public method deposit(double amount) to add funds, a protected method withdraw(double amount) to deduct funds, 
and a default-access method checkBalance() to display the current balance. Create an object of the class and demonstrate 
which methods and variables can be accessed both inside and outside the class. 
     */
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.checkBalance();
        account.withdraw(200);
        account.checkBalance();
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}
