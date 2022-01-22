import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * simple tester class
 * @author mohamed
 */
public class TransactionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);

        //Instantiate a savings account object.
        SavingAccount mohamedSaving = new SavingAccount();

        //Instantiate a chequing account object.
        ChequingAccount mahmoudChequing = new ChequingAccount(200);

        //Instantiate a  TFSA account   object.
        TFSAAccount mohamedTFSA = new TFSAAccount(100,1600);

        // print account balance
        System.out.printf("Saving account balance :%s \n" +
                        "Chequing account balance :%s\n" +
                        "TFSA balance : %s",
                numberFormat.format(mohamedSaving.getBalance()),
                numberFormat.format(mahmoudChequing.getBalance()),
                numberFormat.format(mohamedTFSA.getBalance()));

        // get choice from user.
        String choice ="y";
        while (choice.equalsIgnoreCase("y")) {
            try {
                System.out.println("""
                                            
                        Chose option number :
                        1- Deposit to Savings.
                        2- Deposit to TFSA.
                        3- Deposit to chequing.
                        4- Withdraw from savings.
                        5- Withdraw from chequing.
                        6- Withdraw from TFSA.
                        7- Transfer from one account to another.
                        8-Print balances of accounts.
                        """);
                // get choice from user.
                System.out.println("Please enter Option number:");
                int number = input.nextInt();

                //Deposit to Savings.
                if (number == 1) {
                    System.out.println("Please enter deposit Amount");
                    double amount = input.nextDouble();
                    mohamedSaving.deposit(amount);

                    //Deposit to TFSA.
                } else if (number == 2) {
                    System.out.println("Please enter deposit Amount");
                    double amount = input.nextDouble();
                    mohamedTFSA.deposit(amount);

                    //Deposit to chequing.
                } else if (number == 3) {
                    System.out.println("Please enter deposit Amount");
                    double amount = input.nextDouble();
                    mahmoudChequing.deposit(amount);

                    //Withdraw from savings.
                } else if (number == 4) {
                    System.out.println("Please enter withdraw Amount");
                    double amount = input.nextDouble();
                    mohamedSaving.withdraw(amount);

                    //Withdraw from chequing.
                } else if (number == 5) {
                    System.out.println("Please enter withdraw Amount");
                    double amount = input.nextDouble();
                    mahmoudChequing.withdraw(amount);

                    //Withdraw from TFSA.
                } else if (number == 6) {
                    System.out.println("Please enter withdraw Amount");
                    double amount = input.nextDouble();
                    mohamedTFSA.withdraw(amount);

                    //Transfer from one account to another.
                } else if (number == 7) {
                    System.out.println("""
                            Please choose the account number  you want to transfer from
                            1- savings account.
                            2- chequing account.
                            3- TFSA account.
                            """);
                    int from = input.nextInt();

                    System.out.println("Please enter transfer Amount");
                    double amount = input.nextDouble();

                    System.out.println("""
                            Please choose the account number  you want to transfer to
                            1- savings account.
                            2- chequing account.
                            3- TFSA account.
                            """);
                    int to = input.nextInt();

                    if (from == 1 && to == 2) {
                        mohamedSaving.transfer(mahmoudChequing, amount);
                    } else if (from == 1 && to == 3) {
                        mohamedSaving.transfer(mohamedTFSA, amount);
                    } else if (from == 2 && to == 1) {
                        mahmoudChequing.transfer(mohamedSaving, amount);
                    } else if (from == 2 && to == 3) {
                        mahmoudChequing.transfer(mohamedTFSA, amount);
                    } else if (from == 3 && to == 1) {
                        mohamedTFSA.transfer(mohamedSaving, amount);
                    } else if (from == 3 && to == 2) {
                        mohamedTFSA.transfer(mahmoudChequing, amount);
                    } else if (from == to) {
                        System.out.println("you can't transfer to the same account");
                    } else {
                        System.out.println("you have entered a wrong account number");
                    }

                    //Print balances of accounts.
                } else if (number == 8) {
                    System.out.printf("\n" +
                            "Saving Account Balance:\t\t %.2f\n" +
                            "Chequing Account Balance:\t %.2f\n" +
                            "TFSA Balance:\t\t\t\t %.2f",
                            mohamedSaving.getBalance(),
                            mahmoudChequing.getBalance(),
                            mohamedTFSA.balance);

                } else {
                    System.out.println("wrong input");
                }

                System.out.println("\ncontinue(y/n)");
                choice = input.next();
            } catch (InputMismatchException InputMismatchException) {
                System.err.println("error "+InputMismatchException);
                System.out.println("Invalid entry .Try again.\n");
                input.nextLine();
            }
        }
        //adjust saving account rate .
        mohamedSaving.adjustInterestRate(2.5);
        mohamedSaving.addInterest();
        mahmoudChequing.chargeFee();
        mohamedTFSA.calculatePenalty();
        mohamedTFSA.IncreaseContribution(1000);

        //Print balances of accounts.
        System.out.printf("\n" +
                "Saving Account Balance:\t\t %S\n" +
                "Chequing Account Balance:\t %S\n" +
                "TFSA Balance:\t\t\t\t %S",
                numberFormat.format(mohamedSaving.getBalance()),
                numberFormat.format(mahmoudChequing.getBalance()),
                        numberFormat.format(mohamedTFSA.getBalance()));
    }
}
