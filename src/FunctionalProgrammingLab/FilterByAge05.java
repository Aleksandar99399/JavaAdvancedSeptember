package FunctionalProgrammingLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.in;

public class FilterByAge05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> nameAndAge = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");

            nameAndAge.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> predicate = getPredicate(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = getPrinter(format);
         nameAndAge.entrySet().stream()
                    .filter(e -> predicate.test(e.getValue()))
                    .forEach(e -> printer.accept(e));


    }

    private static Consumer<Map.Entry<String, Integer>> getPrinter(String format) {
        Consumer<Map.Entry<String,Integer>> printer;
        if (format.equals("name")){
            printer=n-> System.out.printf("%s%n",n.getKey());
        }else if (format.equals("age")){
            printer=n-> System.out.printf("%d%n",n.getValue());
        }else {
            printer=e->System.out.printf("%s - %d%n",e.getKey(),e.getValue());
        }

        return printer;
    }

    private static Predicate<Integer> getPredicate(String condition, int age) {
        Predicate<Integer> result;
        if (condition.equals("younger")) {
            result = n -> n <= age;
        } else {
            result = n -> n >= age;
        }
        return result;
    }
}
