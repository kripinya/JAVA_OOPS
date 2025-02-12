/*Create a package named Balance containing a class Account with a method Display_Balance that displays the account balance. Write another program to import the 
Balance package and call the Display_Balance method from the Account class.
 */
import Balance.Account;

public class lab6_first {

    public static void main(String[] args) {
        Account a = new Account();
        a.display_balance();
    }
}
