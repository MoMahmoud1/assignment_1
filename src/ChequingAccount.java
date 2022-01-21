/**
 •	Should contain two constants:
 •	FREE_TRANSACTIONS (should equal 3)
 •	TRANSACTION_FEE (should equal $2 – these are for additional transactions)
 •	Should contain a class attribute transactionCnt (to keep track of transactions)
 •	Should have a constructor to create zero balance account.
 •	Also has a constructor to create an account with an initial starting balance (i.e. if a person opens an account with an initial deposit)
 •	Should override the depositAmt and withdrawAmt methods in order to increment the transaction count.
 •	Contains a chargeFees method that will charge the transaction fee (if any) to the account for any
 transactions beyond the free transactions (assume that transfers or balance checks are free)
//remove
 */

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
        super.transfer(bankAccount ,transferAmount);
        numTransaction++;
        this.chargeFee();
    }

    /**
     *track transaction and charge fees when appropriate .call this on every transaction
     */
    private void chargeFee(){

        if (this.numTransaction> FREE_TRANSACTIONS) {
            this.withdraw(TRANSACTIONS_FEE);
        }
        }

}
