package pl.pp;

import java.util.*;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> studenci = Arrays.asList(
                new Student(67890, "Jan", "Nowak", Arrays.asList(5, 4, 5, 4)),
                new Student(12345, "Anna", "Kowalska", Arrays.asList(4, 4, 5, 5)),
                new Student(54321, "Paweł", "Wiśniewski", Arrays.asList(3, 2, 3, 3)),
                new Student(22222, "Katarzyna", "Ziółek", Arrays.asList(4, 5, 5, 4))
        );

        for (Student s : studenci) {
            System.out.printf("%s %s (%d) - Average: %.2f\n",
                    s.getImie(),
                    s.getNazwisko(),
                    s.getIndeks(),
                    s.getSrednia());
        }
    }
}