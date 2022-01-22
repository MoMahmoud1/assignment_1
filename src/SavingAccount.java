/**
 * specialized version of a bank account
 *
 * @author mohamed
 */
public class SavingAccount extends BankAccount{

    private double interestRate = 0.03;

    /**
     * default constructor to set saving account balance
     */
    public SavingAccount() {
        super();
    }


    /**
     *
     * @param newRate add new rate for saving account
     */
    public void adjustInterestRate(double newRate) {
        this.interestRate = newRate;

    }

    /**
     *saving account balance after ass interest rate
     */
    public void addInterest(){
//       double interestAmt;
        //todo add interest rate to saving account
        this.balance += getBalance()*interestRate/100.0;
    }

}
