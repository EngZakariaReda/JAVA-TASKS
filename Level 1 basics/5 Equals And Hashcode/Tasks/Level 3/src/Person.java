import java.util.Objects;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Case 1 — Equality by id

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // Case 2 — Equality by name

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//
//        Person p = (Person) obj;
//
//        return name.equals(p.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }


    // Case 3 — Equality by both

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//
//        Person p = (Person) obj;
//
//        return id == p.id &&
//                name.equals(p.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}

