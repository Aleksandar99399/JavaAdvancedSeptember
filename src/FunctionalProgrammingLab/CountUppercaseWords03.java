package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class CountUppercaseWords03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        Predicate<String>isStartingWithUppercase=s->Character.isUpperCase(s.charAt(0));

        Consumer<String>print=e-> System.out.println(e);

        List<String> uppStrings = Arrays.stream(scanner.nextLine().split(" ")).filter(s -> isStartingWithUppercase.test(s))
                .collect(Collectors.toList());

        System.out.println(uppStrings.size());
        uppStrings.forEach(e-> print.accept(e));


    }
}
