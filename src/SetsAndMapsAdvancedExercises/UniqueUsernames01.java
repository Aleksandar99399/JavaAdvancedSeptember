package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class UniqueUsernames01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int n=Integer.parseInt(scanner.nextLine());
        
        Set<String>names= new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String input=scanner.nextLine();
            names.add(input);
        }
        for (String s : names) {
            System.out.println(s);
        }


    }
}
