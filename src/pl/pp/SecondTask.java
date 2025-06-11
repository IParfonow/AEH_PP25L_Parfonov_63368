package pl.pp;

import java.util.Random;
import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę iteracji: ");
        int n = scanner.nextInt();

        System.out.printf("Leibniz: %.10f%n", approximatePiLeibniz(n));
        System.out.printf("Monte Carlo: %.10f%n", approximatePiMonteCarlo(n));
    }

    public static double approximatePiLeibniz(int iterations) {
        double pi = 0.0;
        for (int i = 0; i < iterations; i++) {
            double term = 1.0 / (2 * i + 1);
            pi += (i % 2 == 0) ? term : -term;
        }
        return 4 * pi;
    }

    public static double approximatePiMonteCarlo(int samples) {
        Random rand = new Random();
        int insideCircle = 0;
        for (int i = 0; i < samples; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            if (x * x + y * y <= 1.0) {
                insideCircle++;
            }
        }
        return 4.0 * insideCircle / samples;
    }
}
