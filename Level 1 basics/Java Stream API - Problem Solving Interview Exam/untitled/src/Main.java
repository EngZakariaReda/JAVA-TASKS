import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Question 1: Find the First Non-Repeated Character

//        String input = "swiss";
//        List<Character> characters = new ArrayList<>();
//        for (int i = 0 ; i < input.length() ; i++){
//            characters.add(input.charAt(i));
//        }
//
//        Character firstNonRepeatedCharacter = characters.stream()
//                .filter(c -> characters.indexOf(c) == characters.lastIndexOf(c))
//                .findFirst()
//                .orElse(null);
//
//        System.out.println(firstNonRepeatedCharacter);

        // Question 2: Find Duplicate Elements in a List
//        List<Integer> numbers =
//                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
//
//        Set<Integer> seen = new HashSet<>();
//
//        List<Integer> duplicates = numbers.stream()
//                .filter(n -> !seen.add(n))
//                .distinct()
//                .sorted()
//                .toList();
//
//        System.out.println(duplicates);

        // Question 3: Find the Second Highest Number
//        List<Integer> numbers =
//                Arrays.asList(10, 5, 20, 20, 8, 15, 10);
//
//        int secondHighestNumber = numbers.stream().distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElse(0);
//
//        System.out.println(secondHighestNumber);

        // Question 4: Find the Frequency of Each Word

//        String sentence = "Java Spring Java Hibernate Spring Java";
//        List<String> words = Arrays.asList(sentence.split(" "));
//
//        Map<String, Long>  frequencyofEachWord =
//                words.stream() .collect(Collectors.groupingBy(word -> word, Collectors.counting() ));
//        System.out.println(frequencyofEachWord);

        // Question 5: Find the Longest String

        List<String> words = Arrays.asList(
                "Java", "SpringBoot", "Microservices",
                "Hibernate", "Docker"
        );

        String longestString = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(longestString);

        // Question 6: Group Employees by Department
    }
}