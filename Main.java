import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // Mapping numbers to their squares
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Squares of Numbers: " + squares);

        // Reducing the numbers to calculate their sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of Numbers: " + sum);
    }
}
