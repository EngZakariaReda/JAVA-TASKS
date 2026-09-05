import java.util.*;
import java.util.stream.Collectors;

public  class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );

        List<Optional<String>> optionals = Arrays.asList(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Stream"),
                Optional.empty(),
                Optional.of("API")
        );

//      Flatten a list of lists into a single list
        List<String> flattenedList = nestedWords.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flattenedList);

//      Extract all unique characters from a list of words
        List<Character> uniqueCharacters = names.stream()
                .filter(name -> name != null && !(name.isEmpty()))
                .flatMap(name -> name.chars()
                        .mapToObj(c -> (char) c))
                .distinct().collect(Collectors.toList());

        System.out.println(uniqueCharacters);

//      Filter a list of Optionals and collect non-empty values
        List<String> nonEmptyStrings = optionals.stream()
                .filter(optional -> !(optional.isEmpty()))
                .map(optional -> optional.get())
                .collect(Collectors.toList());

        System.out.println(nonEmptyStrings);

//      Map a list of strings to their lengths
        List<Integer> lengthOfStrings = names.stream()
                .filter(name -> name != null)
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(lengthOfStrings);

//      Return a list of uppercased words that start with “A”
        List<String> uppercaseWords = names.stream()
                .filter(name -> name != null && name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords);


    }
}

