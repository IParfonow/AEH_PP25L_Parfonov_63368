package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person("Test", "Testowy", 25);
        person1.hiToAll();

        person1.growOld(10);
        person1.hiToAll();

        person1.setForename("ZmienionyTest");
        person1.hiToAll();

        String personName = person1.getForename();
        int personAge = person1.getAge();
        System.out.println("Pobrane imię to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2);
        circle1.getInfo();
        circle1.setRadius(2.6);
        circle1.getInfo();
    }
}