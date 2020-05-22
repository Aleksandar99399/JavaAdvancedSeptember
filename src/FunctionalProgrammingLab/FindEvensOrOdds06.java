package FunctionalProgrammingLab;

import java.util.*;
import java.util.function.Predicate;

import static java.lang.System.in;

public class FindEvensOrOdds06 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int[] s = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int downRange=s[0];
        int upRange=s[1];
        String word=scanner.nextLine();

        List<Integer>nums=new ArrayList<>();

        Predicate<Integer>filter=getPredicate(word);


        for (int i = downRange; i <=upRange; i++) {
            nums.add(i);
        }

        nums.stream().filter(e->filter.test(e)).forEach(e-> System.out.print(e+" "));


    }

    private static Predicate<Integer> getPredicate(String word) {
        Predicate<Integer> filter;
        if (word.equals("odd")){
            filter=n->n%2!=0;
        }else {
            filter=n->n%2==0;
        }
        return filter;
    }
}
