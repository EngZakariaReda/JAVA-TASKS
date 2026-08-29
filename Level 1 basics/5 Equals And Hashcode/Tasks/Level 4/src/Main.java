import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        products.add(new Product("P100", 500));
        products.add(new Product("P100", 700));
        products.add(new Product("P200", 300));

        System.out.println(products.size()); // return 2
        // overriden equals() & hashCode() P100 → duplicate , P200 → unique


        // case 1 by id
        Student s1 = new Student(1, "a@gmail.com");
        Student s2 = new Student(1, "b@gmail.com");

        System.out.println(s1.equals(s2)); // return true

        // case 2 by email
//        Student stu1 = new Student(1, "a@gmail.com");
//        Student stu2 = new Student(2, "a@gmail.com");
//
//        System.out.println(stu1.equals(stu2)); // return true


        Map<Car, String> cars = new HashMap<>();

        Car car1 = new Car("ABC123", "Red");
        Car car2 = new Car("ABC123", "Blue");

        cars.put(car1, "Owner: Ahmed");
        cars.put(car2, "Owner: Mohamed");

        System.out.println(cars.size()); // return 1
        System.out.println(cars.get(car1)); // return Owner: Mohamed
    }
}