import java.util.*;
import java.util.stream.Collectors;

public  class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );

        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );


//      Sort a list of employees by salary then by name
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator
                        .comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

//      Find the second highest number in a list
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(secondHighest);

//      Find duplicate elements in a list of integers
        Set<Integer> set = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(num -> !(set.add(num)))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(duplicates);

//      Remove null or empty strings from a list using stream
        List<String> realNames = names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .collect(Collectors.toList());

        System.out.println(realNames);

//      Partition students into pass/fail groups based on grade
        Map<Boolean, List<Student>> partitionedStudents = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getGrade() >= 50));

        System.out.print("Passed: " + partitionedStudents.get(true));
        System.out.print(" Failed: " + partitionedStudents.get(false));
        System.out.println();


    }
}

