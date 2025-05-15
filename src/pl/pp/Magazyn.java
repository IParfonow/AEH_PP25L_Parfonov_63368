package pl.pp;

public class Magazyn {

    private String numerMagazynu;
    private int dostepnaPrzestrzen;
    private String wlasciciel;
    private String email;
    private String telefon;

    public Magazyn(String numerMagazynu, int dostepnaPrzestrzen,
                   String wlasciciel, String email, String telefon) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.wlasciciel = wlasciciel;
        this.email = email;
        this.telefon = telefon;
    }

    public void dodajTowar(int jednostki) {
        dostepnaPrzestrzen -= jednostki;
        System.out.println("Dodano " + jednostki + " jednostek towaru. Pozostała przestrzeń: " + dostepnaPrzestrzen);
    }

    public void usunTowar(int jednostki) {
        dostepnaPrzestrzen += jednostki;
        System.out.println("Usunięto " + jednostki + " jednostek towaru. Dostępna przestrzeń: " + dostepnaPrzestrzen);
    }

    public void sprawdzZajetosc() {
        System.out.println("Aktualna dostępna przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
    }

    public void aktualizujKontakt(String email, String telefon) {
        this.email = email;
        this.telefon = telefon;
        System.out.println("Dane kontaktowe zaktualizowane. Email: " + this.email + ", Telefon: " + this.telefon);
    }

    public String getNumerMagazynu() {
        return numerMagazynu;
    }

    public int getDostepnaPrzestrzen() {
        return dostepnaPrzestrzen;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }
}