public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Ahmed");
        Person p2 = new Person(1, "Ahmed");

        System.out.println(p1.equals(p2));

        // before overriding equals()
        // System.out.println(p1.equals(p2)); return false
        // Because Object.equals() by default behaves essentially like reference comparison.

        // after overriding equals()
        // System.out.println(p1.equals(p2)); return true

        Person p3 = new Person(1, "Mohamed");
        Person p4 = new Person(2, "Omar");
        Person p5 = new Person(1, "Ahmed");
        Person p6 = new Person(1, "Ali");

        System.out.println(p3.equals(p4)); // false
        System.out.println(p3.equals(p5)); // true
        System.out.println(p3.equals(p6)); // true

        // What happens if you override equals() but NOT hashCode()?
        // HashSet and HashMap use: hashCode() , equals() So if equal objects have different hash codes, collections may put them into different buckets and fail to recognize them as duplicates.

    }
}