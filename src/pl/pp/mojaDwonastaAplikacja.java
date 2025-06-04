package pl.pp;

import java.io.*;
import java.util.Scanner;

public class mojaDwonastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ścieżkę do pliku wejściowego: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();

        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.out.println("Plik wejściowy nie istnieje!");
            return;
        }

        int lineCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku wejściowego.");
            return;
        }

        System.out.println("Liczba linii: " + lineCount);
        System.out.println("Liczba znaków: " + charCount);

        try (PrintWriter writer = new PrintWriter(outputFilePath)) {
            writer.println("Liczba linii: " + lineCount);
            writer.println("Liczba znaków: " + charCount);
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku wyjściowego.");
        }
    }
}