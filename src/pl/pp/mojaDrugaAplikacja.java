package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja
{
    public static void main(String[] args)
    {
        int x = 10;
        int doubleX = 2 * x;
        int xSquared = x * x;


        System.out.println("Wartość x = " + x);
        System.out.println("Dwukrotność x = " + doubleX);
        System.out.println("Kwadrat x = " + xSquared);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój wiek w latach: ");
        int ageInYears = scanner.nextInt();

        long ageInSeconds = (long) ageInYears * 365 * 24 * 3600;

        scanner.close();
        System.out.println("Twój wiek w sekundach to: " + ageInSeconds);


    }
}
