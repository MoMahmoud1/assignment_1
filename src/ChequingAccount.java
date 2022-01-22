/**
 * specialized version of a bank account
 *
 * @author mohamed
 */
public class ChequingAccount extends BankAccount {

    public static final int FREE_TRANSACTIONS = 3;
    public static final int TRANSACTIONS_FEE = 2;
    private int numTransaction;

    /**
     * default constructor to set chequing account balance
     */
    public ChequingAccount() {
        super();
        this.numTransaction = 0;

    }

    /**
     * comment
     * @param balance constructor for chequing account balance
     */
    public ChequingAccount(double balance) {
        super(balance);
        this.numTransaction = 0;

    }


    /**
     * update transaction count
     * @param depositAmount to bank account
     */
    @Override
    public void deposit(double depositAmount){
        super.deposit(depositAmount);
        this.numTransaction++;
        this.chargeFee();
    }

    /**
     * update transaction count
     * @param withdrawAmount from chequing account
     */
    @Override
    public void withdraw(double withdrawAmount) {
        super.withdraw(withdrawAmount);
        numTransaction++;
        this.chargeFee();

    }

    /**
     *transfer an amount to the specified account. must be positive amount .
     * @param bankAccount chose bank account to transfer amount.
     * @param transferAmount the amount to be transferred.
     */
    @Override
    public void transfer(BankAccount bankAccount, double transferAmount) {
        this.withdraw(transferAmount);
        bankAccount.deposit(transferAmount);

    }

    /**
     *track transaction and charge fees when appropriate .call this on every transaction
     */
    private void chargeFee(){

        if (this.numTransaction> FREE_TRANSACTIONS) {
            this.balance -= TRANSACTIONS_FEE;
        }
        }

}
