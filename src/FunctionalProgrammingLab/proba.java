package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class proba {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        UnaryOperator<Double>addVat=x->x*1.2;

        List<Double> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(d -> Double.parseDouble(d))
                .map(d->addVat.apply(d))
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        list.forEach(e-> System.out.printf("%.2f%n",e));
    }
}
