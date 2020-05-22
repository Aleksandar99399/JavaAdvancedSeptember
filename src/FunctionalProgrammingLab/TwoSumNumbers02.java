package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class TwoSumNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Function<String, Integer> parseInt = str -> Integer.parseInt(str);

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(s -> parseInt.apply(s))
                .collect(Collectors.toList());

        System.out.println("Count = " + numbers.size());

        Function<Integer, Integer> sum = n -> n + n;
        System.out.println("Sum = " + numbers.stream().mapToInt(n -> n).sum());

        int dsa = 0;
        System.out.println("BiSum = " + numbers
                .stream()
                .reduce(0, (x, y) -> x + y));
    }
}
