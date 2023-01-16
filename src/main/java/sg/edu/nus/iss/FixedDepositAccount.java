package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void deposit (double Amount) {
        System.out.println("Not available");
    }

    @Override
    public void withdraw(double Amount) {
        System.out.println("Not available");
    }

    @Override
    public void showAccount() {
        // using this to assess parent's class functions because it is private only to parent but not to the child
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Account name: " + this.getFullName());
        System.out.println("Account balance: " + this.getAccountBalance() * (100 + interest)/100);
    }
    
    
}
