package FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> evens = Arrays.asList(scanner.nextLine()
                .split(", "))
                .stream()
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<String>toPrint=evens
                .stream()
                .map(n->n.toString())
                .collect(Collectors.toList());
        String evenString=String.join(", ",toPrint);
        System.out.println(evenString);

        evens=evens
                .stream()
                .sorted()
                .collect(Collectors.toList());

        toPrint.clear();
        for (Integer s : evens) {
            toPrint.add(s.toString());
        }
        evenString=String.join(", ",toPrint);
        System.out.println(evenString);

    }
}
