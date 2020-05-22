package StacksAndQueueExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperation02 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int[]representingNums= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int pushNums=representingNums[0];
        int popNums=representingNums[1];
        int checkNums=representingNums[2];
        ArrayDeque<Integer>nums=new ArrayDeque<>();
        for (int i = 0; i < pushNums; i++) {
            nums.push(numbers[i]);
        }
        for (int i = 0; i < popNums; i++) {
            nums.pop();
        }
        int value=0;
        if (nums.isEmpty()){
            System.out.println(0);
        }else if (nums.contains(checkNums)){
            System.out.println("true");

        }else {
            while (nums.size() > 1) {
                int num1 = nums.pop();
                int num2=nums.pop();
                if (num1 < num2) {
                    nums.push(num1);
                }else {
                    nums.push(num2);
                }
            }
            System.out.println(nums.pop());
        }
    }
}

