package pl.pp;

import java.util.*;

public class Table
{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        Set<Integer> losowaneSet = new HashSet<>();
        while (losowaneSet.size() < 6) {
            int liczba = rand.nextInt(49) + 1;
            losowaneSet.add(liczba);
        }
        int[] losowane = losowaneSet.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Wylosowane liczby:");
        System.out.println(Arrays.toString(losowane));

        Set<Integer> uzytkownikSet = new HashSet<>();
        while (uzytkownikSet.size() < 6) {
            System.out.print("Podaj liczbę z przedziału 1–49 (pozostało " + (6 - uzytkownikSet.size()) + "): ");
            try {
                int liczba = Integer.parseInt(scanner.nextLine());
                if (liczba < 1 || liczba > 49) {
                    System.out.println("Liczba poza zakresem!");
                } else if (!uzytkownikSet.add(liczba)) {
                    System.out.println("Liczba już została podana!");
                }
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba!");
            }
        }
        int[] uzytkownik = uzytkownikSet.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Twoje liczby:");
        System.out.println(Arrays.toString(uzytkownik));

        int trafienia = 0;
        for (int liczba : uzytkownik) {
            for (int los : losowane) {
                if (liczba == los) {
                    trafienia++;
                }
            }
        }

        System.out.println("Liczba trafień: " + trafienia);
    }
}
