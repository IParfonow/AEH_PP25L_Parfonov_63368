package pl.pp;

public class BankTest {
    public static void main(String[] args)
    {
        CardAccount card = new CardAccount("Igor", "CARD123", 1000.0, "PLN");
        CashAccount cash = new CashAccount("Igor", "CASH456", 500.0, "PLN");

        card.displayInfo();
        card.deposit(250);
        card.withdraw(400);

        cash.displayInfo();
        cash.deposit(100);
        cash.withdraw(700);
    }
}