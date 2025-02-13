package javaConcepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> upperCaseNames =
                names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Keep only even numbers
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        names = Arrays.asList("Alice", "Bob", "Charlie");

        Optional<String> firstNameStartingWithC = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();

        firstNameStartingWithC.ifPresent(System.out::println);

        numbers = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted() // Ascending order
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);

        numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Reduce to sum

        System.out.println(sum);
    }

}
