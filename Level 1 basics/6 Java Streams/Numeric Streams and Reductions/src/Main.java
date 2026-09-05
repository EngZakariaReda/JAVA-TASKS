import java.util.*;
import java.util.stream.Collectors;

public  class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila"
                , "Kareem", "Nada", "Nour", "Samy", "" , null);


//      Calculate the sum of a list of integers using reduce
        int sumOfNumbers = numbers.stream()
                .reduce(0 ,(acc , val) -> acc + val);

        System.out.println(sumOfNumbers);

//      Find the maximum and minimum value in a list
        OptionalDouble maxNumber = numbers.stream()
                .mapToDouble(value -> value.doubleValue())
                .max();

        OptionalDouble minNumber = numbers.stream()
                .mapToDouble(value -> value.doubleValue())
                .min();

        System.out.println("maximum number is " + maxNumber );
        System.out.println("minimum number is " + minNumber );

//      Calculate the average of a list of doubles
        OptionalDouble averageOfNumbers = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        System.out.println(averageOfNumbers);


//      Multiply all integers in a list together using reduce
        int multiplyNumbers = numbers.stream()
                .reduce(1 ,(acc , num) -> num * acc);

        System.out.println(multiplyNumbers);

//      Count how many numbers are positive in a list
        long countPositiveNumber = numbers.stream()
                .filter(num -> num > 0)
                .count();

        System.out.println(countPositiveNumber);


    }
}

