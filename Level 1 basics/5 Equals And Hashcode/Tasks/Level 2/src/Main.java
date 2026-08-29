import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person(1, "Ahmed"));
        people.add(new Person(1, "Ahmed"));
        people.add(new Person(2, "Ali"));
        people.add(new Person(2, "Ali"));

        System.out.println(people.size()); // return 4 despite of there is a duplication

        // System.out.println(people.size()); return 4 despite of there is a duplication
        // Because equals() and hashCode() aren't overridden: have the same data, they are different objects.

        // after overriding equals() and hashCode()
        // System.out.println(people.size()); return 2

        people.add(new Person(1, "Ahmed"));
        people.add(new Person(2, "Ali"));
        people.add(new Person(1, "Mohamed"));
        people.add(new Person(3, "Omar"));
        people.add(new Person(4, "Hassan"));
        people.add(new Person(2, "Khaled"));
        people.add(new Person(5, "Youssef"));
        people.add(new Person(3, "Mahmoud"));
        people.add(new Person(6, "Amr"));
        people.add(new Person(1, "Mostafa"));

        System.out.println(people.size());

        // in each case the output changes depend on the nature of equals() and hashcode overriden
    }
}