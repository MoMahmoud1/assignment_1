/**
 •	Should contain a class attribute balance (double)
 •	Should have a constructor that creates a new bank account with a zero balance.
 •	Also has a constructor to create an account with an initial starting balance (i.e. if a person opens an account with an initial deposit)
 •	Contains a depositAmt method that accepts an amount to be deposited in the account (double)
 •	Contains a withdrawAmt method that accepts an amount to withdraw from the account
 •	Contains a getBalance method that returns the current balance in the account.
 •	Contains a transferAmt method that will transfer money from one bank account to another bank account
 . This method will take two arguments, a BankAccount object and an amount (i.e. BankAccount account, double amount)

 */


/**
 * Bank account class for assignment 1
 *
 * @author mohamed
 */
public class BankAccount {
    private double balance;
    /**
     * default constructor to set bank account balance
     */
    public BankAccount() {
    }

    /**
     *
     * @param balance constructor to set bank account balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return balance amount
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance to set balance
     * @return balance
     */
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    /**
     *
     * @param depositAmount to bank account
     */
    public void deposit(double depositAmount){
        // todo add constraints for negative
        if (depositAmount >= 0){
            this.balance+=depositAmount;
        }
    }

    public void withdrawAmt(double withdraw){

        // todo check the withdraw amount is available
        if (withdraw > getBalance() || withdraw < 0) {
            System.out.println("invalid withdraw amount  ");
        }
        else {
            // todo update balance after withdraw and update fee
            this.balance = getBalance() - withdraw;
        }

    }

    /**
     *
     * @param account chose bank account to transfer amount
     * @param transferAmount the amount to be transferred
     */
    public void transfer(BankAccount account, double transferAmount){
        balance -= transferAmount;
        account.balance+=transferAmount;

    }

}
