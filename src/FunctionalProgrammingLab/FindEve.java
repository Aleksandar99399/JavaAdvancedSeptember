package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.lang.System.in;

public class FindEve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] s = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int downRange = s[0];
        int upRange = s[1];
        String word = scanner.nextLine();

        //Predicate<Integer> condition;
        //if (word.equals("odd")) {
        //    condition = n -> n % 2 != 0;
        //} else {
        //    condition = n -> n % 2 == 0;
        //}
        IntStream.range(downRange, upRange + 1)
                .boxed()
                .filter(e->{
                    if (word.equals("odd")) {
                            return  e % 2 != 0;
                    } else {
                            return e % 2 == 0;
                    }
                })
                .forEach(n-> System.out.print(n+" "));
    }
}
