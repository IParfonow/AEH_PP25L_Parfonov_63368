package pl.pp;

import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę dni (wpisz wartość ujemną, aby przejść do temperatur): ");
            int dni = scanner.nextInt();

            if (dni < 0) {
                break;
            }

            int tygodnie = dni / 7;
            int pozostaleDni = dni % 7;

            System.out.println(dni + " dni to " + tygodnie + " tygodnie i " + pozostaleDni + " dni.\n");
        }

        while (true) {
            System.out.print("Podaj temperaturę w stopniach Celsjusza (wpisz -1 aby zakończyć): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Wyjście z programu...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsjusz: %.2f°C\n", celsius);
            System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
            System.out.printf("Kelwin: %.2fK\n\n", kelvin);
        }

        scanner.close();
    }
}
