import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public  class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila"
                , "Kareem", "Nada", "Nour", "Samy", "" , null);

        // Filter even numbers from a list of integers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Find names starting with a specific letter from a list of strings
        Predicate<String> startNames = name -> {
            if (name == null || name == ""){
                return false;
            }
            return name.startsWith("A");
        };

        List<String> namesStartingWithA = names.stream()
                .filter(startNames)
                .collect(Collectors.toList());
        System.out.println(namesStartingWithA);

        // Convert all strings to uppercase using stream
        List<String> upperNames = names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);

        // Sort a list of integers in descending order using streams
        List<Integer> descendingNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingNumbers);

        // Remove duplicate elements from a list using distinct()
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

    }

}