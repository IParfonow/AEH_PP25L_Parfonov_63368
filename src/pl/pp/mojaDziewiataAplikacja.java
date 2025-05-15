package pl.pp;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn(
                "PLN_001",
                5000,
                "Jan Kowalski",
                "jan.kowalski@firma.pl",
                "123 456 789"
        );

        magazyn.sprawdzZajetosc();
        magazyn.dodajTowar(2000);
        magazyn.usunTowar(1000);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("kontakt@firma.pl", "987 654 321");
    }
}