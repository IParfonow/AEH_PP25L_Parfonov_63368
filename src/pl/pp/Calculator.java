package pl.pp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operation;

        while (true) {
            System.out.println("\nSimple Calculator:");
            System.out.println("a) Dodawanie (+)");
            System.out.println("b) Odejmowanie (-)");
            System.out.println("c) Mnożenie (*)");
            System.out.println("d) Dzielenie (/)");
            System.out.println("q) Wyjście");
            System.out.print("Wybierz opcję: ");

            operation = scanner.next().charAt(0);

            if (operation == 'q') {
                System.out.println("Zakończenie programu.");
                break;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            num1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            num2 = scanner.nextDouble();

            switch (operation) {
                case 'a':
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                    break;
                case 'b':
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                    break;
                case 'c':
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                    break;
                case 'd':
                    if (num2 != 0) {
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                    }
                    break;
                default:
                    System.out.println("Nieznana operacja! Spróbuj ponownie.");
            }
        }
    }
}
