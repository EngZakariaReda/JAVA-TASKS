import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Map<Person, String> employees = new HashMap<>();
//
//        Person p1 = new Person(1, "Ahmed");
//        Person p2 = new Person(1, "Ali");
//
//        employees.put(p1, "Employee");
//        employees.put(p2, "Manager");
//
//        System.out.println(employees.size()); // return 2
//        System.out.println(employees.get(p1)); // return Employee

        // despite of the same key it return 2 & Employee "duplicated"
        // Because equals() and hashCode() aren't overridden: have the same data, they are different objects.

        // after overriding equals() and hashCode()
        // return 1 & Manager "replaced"


          // Retrieve using a new object
//        employees.put(new Person(1, "Ahmed"), "Employee");
//        Person newPerson = new Person(1, "Ahmed");
//        System.out.println(employees.get(newPerson));
          // return "Employee" because of equals() and hashCode()


        // Modify a key after inserting into HashMap
        Person p = new Person(1, "Ahmed");
        Map<Person, String> map = new HashMap<>();
        map.put(p, "Employee");

        p.id = 10;
        System.out.println(map.get(p)); // null
        // This is why mutable fields used in equals() / hashCode() are dangerous as HashMap keys.

    }
}