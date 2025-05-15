package pl.pp;

public class mojaSiodmaAplikacja
{

    public static void main(String[] args) {

        Person p1 = new Person("Mateusz", "Karmazyn", 24,
                "Warszawa, ul. Kwiatowa 5", 1999);
        Person p2 = new Person("Dariusz", "Walendziak", 42,
                "Łódź, ul. Leśna 10", 1981);

        p1.hiToAll();
        p2.hiToAll();

        p1.growOld();          // +1
        p2.growOld(10);        // +10
        p2.beYounger();        // –1

        p1.hiToAll();
        p2.hiToAll();
    }
}
