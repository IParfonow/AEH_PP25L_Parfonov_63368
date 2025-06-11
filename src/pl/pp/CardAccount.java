package pl.pp;
public class CardAccount extends Account
{

    public CardAccount(String accountHolder, String accountNumber, double balance, String currency) {
        super(accountHolder, accountNumber, balance, currency);
    }

    @Override
    public void displayInfo() {
        System.out.println("Card Account - Holder: " + accountHolder + ", Number: " + accountNumber + ", Balance: " + balance + " " + currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to card: " + amount + " " + currency);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from card: " + amount + " " + currency);
        } else {
            System.out.println("Insufficient funds on card account.");
        }
    }
}