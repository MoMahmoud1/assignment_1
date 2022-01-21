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

 */

/**
 * specialized version of a bank account
 *
 * @author mohamed
 */


public class ChequingAccount extends BankAccount {
    public static final int FREE_TRANSACTIONS = 3;
    private  int TRANSACTIONS_FEE = 2;
    private int transaction;

    /**
     * default constructor to set chequing account balance
     */
    public ChequingAccount() {
        super();
        this.transaction = 0;

    }

    /**
     * constructor for chequing account balance
     * @param initialBalance
     */
    public ChequingAccount(double initialBalance) {
        super(initialBalance);
        this.transaction = 0;

    }

    @Override
    /**
     * update transaction count
     * @param depositAmount to bank account
     */
    public void deposit(double depositAmount){
        super.deposit(depositAmount);
        this.transaction++;
    }

    /**
     *
     * @param withdraw from chequing account
     * @return balance after withdraw transaction
     * update transaction count
     */
    public double withdrawAmt(double withdraw){
        double updatedBalance = 0 ;
        // todo check the withdraw amount is available
        if (withdraw > getBalance() || withdraw < 0){
            System.out.println("invalid balance ");
        }
        else {
            // todo update balance after withdraw and update fee
            updatedBalance = getBalance() - withdraw;
            transaction++;
        }

       return setBalance(updatedBalance);

    }

    /**
     *
     * @return transaction fee for chequing account
     */
    public double transactionFee(){
        //int fees = 0;
        //todo add fee after free transaction

        if (transaction >FREE_TRANSACTIONS) {
            for (int i = 4; i < transaction; i++) {
                this.TRANSACTIONS_FEE += 2;
            }
        }else {TRANSACTIONS_FEE = 0;}

        return  TRANSACTIONS_FEE;//setBalance(getBalance())-fees; for show balance after fess
    }

}
