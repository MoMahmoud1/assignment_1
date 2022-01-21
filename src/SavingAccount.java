/**
 •	Should contain a class attribute interestRate (double) that holds the interest rate defined. (note that 3% is equivalent to 0.03)
 •	Contains a changeInterest method that can be used to adjust the interest rate.
 •	Contains an addInterest method that adds the interest, as specified, to the account balance
 . To calculate the interest for the amount in the account you can use this formula:
 interestAmt = balance * interestRate / 100.0

 */
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
     *
     * @return saving account balance after ass interest rate
     */
    public double addInterest(){
        double interestAmt;
        //todo add interest rate to saving account
        interestAmt = getBalance()*interestRate/100.0+getBalance();
        return setBalance(interestAmt);
    }

}
