package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class PeriodicTable03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int n=Integer.parseInt(scanner.nextLine());
        Set<String>chemicalElements=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[]input=scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(input));
        }
        for (String s : chemicalElements) {
            System.out.print(s+ " ");
        }

    }
}
