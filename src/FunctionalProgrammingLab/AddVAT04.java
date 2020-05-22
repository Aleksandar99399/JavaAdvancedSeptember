package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class AddVAT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Double> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(d -> Double.parseDouble(d))
                .collect(Collectors.toList());

        Function<Double, Double> vat = d -> d * 1.20;

        Consumer<Double>print=d-> System.out.printf("%.2f%n",d);

        System.out.println("Prices with VAT:");
        list.stream().map(d->vat.apply(d)).forEach(e->print.accept(e));

    }
}
