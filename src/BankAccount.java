/**
 * Bank account class for assignment 1
 *
 * @author mohamed
 */
public abstract class BankAccount {

    protected double balance;

    /**
     * default constructor to create bank account balance
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     *constructor to set bank account balance
     * is not positive the account defaults to a balance of 0
     * @param balance bank account balance
     */
    public BankAccount(double balance) {
        if(balance > 0){
        this.balance = balance;
        }else {this.balance = 0;}
    }

    /**
     *get bank account balance
     * @return balance amount
     */
    public final double getBalance() {
        return balance;
    }

    /**
     *deposit an amount in to the account . must be positive amount.
     * @param depositAmount deposit amount.
     */
    public void deposit(double depositAmount){

        if (depositAmount >= 0){
            this.balance+=depositAmount;
        }
    }

    /**
     * withdraw amount from bank account. must be positive amount.
     * @param withdrawAmount withdraw amount.
     */
    public  void withdraw(double withdrawAmount) {

        if (withdrawAmount > getBalance() || withdrawAmount < 0) {
            System.out.println("invalid withdrawAmount amount  ");
        }
        else {

            this.balance = getBalance() - withdrawAmount;
        }

    }

    /**
     *transfer an amount to the specified bankAccount. must be positive amount .
     * @param bankAccount chose bank bankAccount to transfer amount.
     * @param transferAmount the amount to be transferred.
     */
    public  void transfer(BankAccount bankAccount, double transferAmount) {
    if(this.balance > transferAmount && transferAmount > 0){
        this.balance -= transferAmount;
        bankAccount.deposit(transferAmount);
        }
    }

}
