package pl.pp;

public class CashAccount extends Account
{

    public CashAccount(String accountHolder, String accountNumber, double balance, String currency) {
        super(accountHolder, accountNumber, balance, currency);
    }

    @Override
    public void displayInfo() {
        System.out.println("Cash Account - Holder: " + accountHolder + ", Number: " + accountNumber + ", Balance: " + balance + " " + currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Cash deposit: " + amount + " " + currency);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Cash withdrawn: " + amount + " " + currency);
        } else {
            System.out.println("Not enough cash available.");
        }
    }
}
