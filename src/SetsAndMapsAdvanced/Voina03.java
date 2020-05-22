package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Voina03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        LinkedHashSet<Integer> onePlayer= getNums(scanner);
        LinkedHashSet<Integer> twoPlayer= getNums(scanner);

        for (int i = 1; i <= 50; i++) {

            int firstNum=onePlayer.iterator().next();
            onePlayer.remove(firstNum);
            int secondNum=twoPlayer.iterator().next();
            twoPlayer.remove(secondNum);

            if (firstNum>secondNum){
                onePlayer.add(firstNum);
                onePlayer.add(secondNum);

            }else if (secondNum>firstNum){
                twoPlayer.add(secondNum);
                twoPlayer.add(firstNum);
            }
        }
        if (onePlayer.size()>twoPlayer.size()){
            System.out.println("First player win!");

        }else if (twoPlayer.size()>onePlayer.size()){
            System.out.println("Second player win!");

        }else if (onePlayer.isEmpty()||twoPlayer.isEmpty()){
            System.out.println("Draw!");
        }
    }

    private static LinkedHashSet<Integer> getNums(Scanner scanner) {
        int []nums=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
        }
        return set;
    }
}
