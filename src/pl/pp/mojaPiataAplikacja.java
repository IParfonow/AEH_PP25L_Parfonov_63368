package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {

    public static void main(String[] args) {
        printCharLines('*', 10, 4);
        printCharLines('#', 5, 2);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPodaj znak: ");
        char znak = sc.next().charAt(0);
        System.out.print("Ile znaków w wierszu? ");
        int ileWKolumnie = sc.nextInt();
        System.out.print("Ile wierszy? ");
        int ileLinii = sc.nextInt();

        printCharLines(znak, ileWKolumnie, ileLinii);
    }

    private static void printCharLines(char znak, int ileWKolumnie, int ileLinii) {
        for (int i = 0; i < ileLinii; i++) {
            for (int j = 0; j < ileWKolumnie; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}