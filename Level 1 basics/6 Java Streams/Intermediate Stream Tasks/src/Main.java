import java.util.*;
import java.util.stream.Collectors;

public  class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila"
                , "Kareem", "Nada", "Nour", "Samy", "" , null);


//      Count the number of strings longer than 5 characters
        Long countLongestNames = names.stream()
                .filter(name -> name != null && name.length() > 5)
                .count();
        System.out.println(countLongestNames);

//      Find the first element in a stream that matches a given condition (first even number)
        Optional<Integer> firstEvenNumber = numbers.stream()
                .filter(num -> num % 2 == 0)
                .findFirst();
        System.out.println(firstEvenNumber);

//      Check if any number is divisible by 5 in a list
        List<Integer> divisibleBy5 = numbers.stream()
                .filter(num -> num % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(divisibleBy5);


//      Collect elements into a Set instead of a List
        Set<Integer> setOfNumbers = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(setOfNumbers);

//      Skip the first 3 elements and return the rest
        List<Integer> skipFirst3 = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(skipFirst3);

    }
}

