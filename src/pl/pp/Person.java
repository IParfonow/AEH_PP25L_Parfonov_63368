package pl.pp;

public class Person {

    private String forename;
    private String surname;
    private String address;
    private int    age;
    private int    yearOfBirth;

    public Person() { }

    public Person(String forename, String surname, int age,
                  String address, int yearOfBirth) {
        this.forename    = forename;
        this.surname     = surname;
        this.age         = age;
        this.address     = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void hiToAll() {
        System.out.println("Nazywam się " + forename + " " + surname +
                ", mam " + age + " lat, mieszkam: " + address +
                ", rok urodzenia: " + yearOfBirth);
    }

    public void growOld() {
        age += 1;
    }

    public void growOld(int n) {
        age += n;
    }

    public void beYounger() {
        age -= 1;
    }

    public int getAge()             { return age;      }
    public String getForename()     { return forename; }
    public void setForename(String f) { this.forename = f; }
    public String getSurname()      { return surname;  }
    public void setSurname(String s) { this.surname  = s; }
}
