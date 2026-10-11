import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Question 1: Find the First Non-Repeated Character

        String input = "swiss";
        List<Character> characters = new ArrayList<>();
        for (int i = 0 ; i < input.length() ; i++){
            characters.add(input.charAt(i));
        }

        Character firstNonRepeatedCharacter = characters.stream()
                .filter(c -> characters.indexOf(c) == characters.lastIndexOf(c))
                .findFirst()
                .orElse(null);

        System.out.println(firstNonRepeatedCharacter);


        // Question 2: Find Duplicate Elements in a List

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .distinct()
                .sorted()
                .toList();

        System.out.println(duplicates);


        // Question 3: Find the Second Highest Number

        List<Integer> nums =
                Arrays.asList(10, 5, 20, 20, 8, 15, 10);

        int secondHighestNumber = nums.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(secondHighestNumber);


        // Question 4: Find the Frequency of Each Word

        String sentence = "Java Spring Java Hibernate Spring Java";
        List<String> words = Arrays.asList(sentence.split(" "));

        Map<String, Long>  frequencyofEachWord =
                words.stream() .collect(Collectors.groupingBy(word -> word, Collectors.counting() ));
        System.out.println(frequencyofEachWord);


        // Question 5: Find the Longest String

        List<String> javaWords = Arrays.asList(
                "Java", "SpringBoot", "Microservices",
                "Hibernate", "Docker"
        );

        String longestString = javaWords.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(longestString);

        // Question 6: Group Employees by Department

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ahmed" , "IT" , 10000));
        employees.add(new Employee("Mohamed" , "IT" , 15000));
        employees.add(new Employee("Sara" , "HR" , 8000));
        employees.add(new Employee("Omar" , "HR" , 12000));
        employees.add(new Employee("Ali" , "Finance" , 20000));

        Map<String, Double> averageSalary =
                employees.stream()
                        .collect(Collectors.groupingBy( employee -> employee.department, Collectors.averagingDouble(employee -> employee.salary) ));
        System.out.println(averageSalary);


        // Question 7: Find the Highest-Paid Employee in Each Department

        List<Employee> employeess = new ArrayList<>();
        employeess.add(new Employee("Ahmed" , "IT" , 10000));
        employeess.add(new Employee("Mohamed" , "IT" , 18000));
        employeess.add(new Employee("Sara" , "HR" , 9000));
        employeess.add(new Employee("Omar" , "HR" , 14000));
        employeess.add(new Employee("Ali" , "Finance" , 20000));

        Map<String, Optional<Employee>> result =
                employeess.stream()
                        .collect(Collectors.groupingBy( employee -> employee.department, Collectors.maxBy( Comparator.comparingDouble(employee -> employee.salary) ) ));

        result.forEach((department, employee) -> System.out.println(department + " = " + employee.map(e -> e.name).orElse("No Employee")) );

        //  Question 8: Find Common Elements Between Two Lists

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 4);

        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(commonElements);

        // Question 9: Find the Top 3 Most Frequent Numbers

        List<Integer> numbersList = Arrays.asList(
                1, 2, 2, 3, 3, 3, 4, 4, 4, 4,
                5, 5, 5, 6
        );

        numbersList.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(
                        Map.Entry.<Integer, Long>comparingByValue()
                                .reversed()
                                .thenComparing(Map.Entry.comparingByKey())
                )
                .limit(3)
                .forEach(entry ->
                        System.out.println(
                                entry.getKey() + " = "
                                        + entry.getValue() + " occurrences"
                        )
                );


        // Question 10: Find the Top 3 Highest-Paid Employees in Each Department

        List<Employee> employeesAsList = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 18000),
                new Employee("Ali", "IT", 15000),
                new Employee("Omar", "IT", 22000),

                new Employee("Sara", "HR", 12000),
                new Employee("Mona", "HR", 16000),
                new Employee("Nour", "HR", 14000),
                new Employee("Hana", "HR", 9000),

                new Employee("Khaled", "Finance", 20000),
                new Employee("Youssef", "Finance", 25000),
                new Employee("Mostafa", "Finance", 18000)
        );
//
        Map<String, List<Employee>> resultMap = employeesAsList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(
                                                Comparator.comparingDouble(
                                                                (Employee e) -> e.salary
                                                        ).reversed()
                                                        .thenComparing(e -> e.name)
                                        )
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));

        resultMap.forEach((department, employeeList) -> {
            System.out.println(department + ":");

            employeeList.forEach(e ->
                    System.out.println(e.name + " " + e.salary)
            );
        });

    }
}