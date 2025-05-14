package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lower, upper;

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            lower = scanner.nextInt();
            upper = scanner.nextInt();

            if (lower == upper) {
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d%n", lower * lower, upper * upper, sum);
        }
        System.out.println("Done");
    }
}
