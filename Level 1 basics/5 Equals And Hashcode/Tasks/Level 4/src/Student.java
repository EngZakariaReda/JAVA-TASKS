public class Student {
    int id;
    String email;

    public Student(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return id == student.id;
    }

    // equallity by email
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//
//        Student student = (Student) obj;
//
//         return email.equals(student.email);
//    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // equallity by email
//    @Override
//    public int hashCode() {
//        // return email.hashCode(); // by email
//    }
}

