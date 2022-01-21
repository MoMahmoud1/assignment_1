
/**
 * simple tester class
 * @author mohamed
 */
public class AccountTester {
    public static void main(String[] args) {
        //Instantiate a savings account object. Call it your_first_nameSavings (where “your_first_name” is your first name)
        SavingAccount mohamedSaving = new SavingAccount();

        //Instantiate a chequing account object. Call it your_last_nameChequing (where 3e“your_last_name” is your last name)
        ChequingAccount mahmoudChequing = new ChequingAccount();

        //Deposit 5000 into the savings account.
        mohamedSaving.deposit(5000);

        //Saving account balance after deposit 5000
        System.out.println("Saving account balance : "+mohamedSaving.getBalance());

        //Add interest to the savings account
        mohamedSaving.addInterest();


        //Transfer 1000 to the chequing account
        System.out.println("\nTransfer 1000 to Chequing account.");
        mohamedSaving.transfer(mahmoudChequing,1000);

        //Chequing account balance
        System.out.println("Chequing Account balance: "+mahmoudChequing.getBalance());

        //Withdraw 200 from the chequing account
        mahmoudChequing.withdraw(200);
        System.out.printf("\nChequing account balance after withdraw 200 is : %.2f",mahmoudChequing.getBalance());

        //Withdraw 400 from the chequing account
        mahmoudChequing.withdraw(400);
        System.out.printf("\nChequing account balance after withdraw 400 is : %.2f",mahmoudChequing.getBalance());

        //Withdraw 300 from the chequing account
        mahmoudChequing.withdraw(300);
        System.out.printf("\nChequing account balance after withdraw 300 is : %.2f",mahmoudChequing.getBalance());

        //Withdraw 50 from the chequing account
        mahmoudChequing.withdraw(50);
        System.out.printf("\nChequing account balance after withdraw 50 is  : %.2f",mahmoudChequing.getBalance());

        //Change the interest of the savings account to 5%
        mohamedSaving.adjustInterestRate(0.05);

//        //Chequing account transaction fee
//        System.out.println("\nChequing account transaction fee  : "+mahmoudChequing.chargeFee());
//        //Chequing account balance after fee
//        System.out.println("Chequing account balance after fee: "+(mahmoudChequing.getBalance()-mahmoudChequing.chargeFee()));
        //Saving account balance
        System.out.println("Saving account balance\t\t\t  : "+mohamedSaving.getBalance());

    }

}



