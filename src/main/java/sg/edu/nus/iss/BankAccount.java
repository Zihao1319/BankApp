package sg.edu.nus.iss;

import java.util.Date;
import java.util.List;

public class BankAccount {

    private String fullName;
    private final String accountNumber;
    private double accountBalance = 0.0;
    // private List <String> transactions;
    private boolean isActive = true;
    private Date accStartDate;
    private Date accCloseDate;

    public BankAccount(String fullName, String accountNumber, double accountBalance, List<String> operations,
            boolean isActive, Date accStartDate, Date accCloseDate) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        // this.operations = operations;
        this.isActive = isActive;
        this.accStartDate = accStartDate;
        this.accCloseDate = accCloseDate;
    }

    public BankAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // public List<String> getTransactions() {
    // return transactions;
    // }
    // public void setTransactions(String transactions) {
    // this.transactions = transactions;
    // }
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getAccStartDate() {
        return accStartDate;
    }

    public void setAccStartDate(Date accStartDate) {
        this.accStartDate = accStartDate;
    }

    public Date getAccCloseDate() {
        return accCloseDate;
    }

    public void setAccCloseDate(Date accCloseDate) {
        this.accCloseDate = accCloseDate;
    }

    public void showAccount() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account name: " + fullName);
        System.out.println("Account balance: " + accountBalance);
    }

    @Override
    public String toString() {
        return "BankAccount [accCloseDate=" + accCloseDate + ", accStartDate=" + accStartDate + ", accountBalance="
                + accountBalance + ", accountNumber=" + accountNumber + ", fullName=" + fullName + ", isActive="
                + isActive + "]";
    }

    public void deposit(double amount)  {

        if (!isActive) {
            throw new IllegalArgumentException ("You cannot make deposit to a closed account");
        }

        if (amount < 0) {
            throw new IllegalArgumentException ("You cannot make deposit to a closed account");

        } else {
            accountBalance += amount;
        }

    }

    public void withdraw(double amount)  {

        if (!isActive) {
            throw new IllegalArgumentException ("You cannot transfer money out of a closed account");
        } 

        if (accountBalance < amount) {
            throw new IllegalArgumentException ("Insufficient funds");

        } else {
            accountBalance -= amount;
        }

    }

}
