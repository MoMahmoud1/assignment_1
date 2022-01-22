/**
 * specialized version of a bank account
 *
 * @author mohamed
 */
public class TFSAAccount extends BankAccount {

    private double maxContribution;
    private final double penalty = 0.05;


    /** create a default constructor.
     */
    public TFSAAccount() {}

    /**
     * default constructor to set TFSA  account balance,and max Contribution.
     */
    public TFSAAccount(double balance, double maxContribution) {
        super(balance);
        this.maxContribution = maxContribution;
    }

    /**
     * do the calculates of contribution room for the TFSA.
     * @param balance the account balance.
     * @param maxContribution the max contribution.
     * @return contribution room for the account.
     */
    public static double contributionRoom(double balance, double maxContribution){
        return maxContribution-balance;
    }

    /**
     * increase contribution of TFSA account.
     * @param IncreaseContribution The max contributions.
     * @return updated max contributions.
     */
    public double IncreaseContribution(double IncreaseContribution) {
        return this.maxContribution += IncreaseContribution;
    }

    /**
     * calculate penalty amount .
     * @return an amount that is equal to the penalty * to the amount above the max contribution.
     */
    public double calculatePenalty(){
        double penaltyCharges;
        double extra =maxContribution-balance;
        if (extra<0) penaltyCharges = (extra * this.penalty)*-1;
        else{penaltyCharges=0;}
        this.balance= balance-penaltyCharges;
        return balance;
    }

}
