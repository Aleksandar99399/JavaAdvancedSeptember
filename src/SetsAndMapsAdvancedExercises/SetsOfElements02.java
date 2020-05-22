package SetsAndMapsAdvancedExercises;

import java.util.*;

import static java.lang.System.in;

public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] length = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstSet = length[0];
        int secondSet = length[1];

        Set<Integer> oneSet = new HashSet<>();
        Set<Integer> twoSet = new HashSet<>();
        Set<Integer> save = new LinkedHashSet<>();

        for (int i = 1; i <= firstSet + secondSet; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i <= firstSet) {
                oneSet.add(num);
            } else {
                twoSet.add(num);
            }

            if ((oneSet.contains(num) && twoSet.contains(num))) {
                save.add(num);
            }

        }
        for (Integer integer : save) {
            System.out.print(integer+" ");
        }

    }
}
