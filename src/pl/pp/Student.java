package pl.pp;

import java.util.List;

public class Student
{
    private int indeks;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(int indeks, String imie, String nazwisko, List<Integer> oceny) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public int getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSrednia() {
        if (oceny == null || oceny.isEmpty()) return 0.0;
        double suma = 0;
        for (int o : oceny) suma += o;
        return suma / oceny.size();
    }
}
