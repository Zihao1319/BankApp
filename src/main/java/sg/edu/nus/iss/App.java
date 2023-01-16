package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();
            Random randomNumber = new Random();

            double max = 10000.00;
            double min = 1000.00;

            double initialBalance = min + randomNumber.nextDouble(max);

            // bankAccount[i] = new BankAccount(uuid, initialBalance);
            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
            // bankAccount[i].setTransactions("")
            // bankAccount[i].showAccount();
        }

        bankAccount[0].setFullName("Ooi Zi Hao");
        bankAccount[1].setFullName("David loh");
        bankAccount[2].setFullName("Tan kaki");

        bankAccount[0].deposit(2000);
        bankAccount[1].deposit(3000);
        bankAccount[2].deposit(4000);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].withdraw(1000);
        bankAccount[1].withdraw(4000);
        bankAccount[2].withdraw(100);

        // for (int i=0; i< bankAccount.length; i++) {
        // String uuid = UUID.randomUUID().toString();

        // double max = 10000.00;
        // double min = 1000.00;

        // Random randomNumber = new Random();

        // }
    }
}
