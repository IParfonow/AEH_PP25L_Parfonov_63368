
package pl.pp;
public abstract class Account
{
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;
    protected String currency;

    public Account(String accountHolder, String accountNumber, double balance, String currency) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public abstract void displayInfo();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}