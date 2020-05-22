package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class Example {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        Set<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i <5; i++) {
            set.add(i);
        }
        set.add(7);
        System.out.println(set);
    }
}
