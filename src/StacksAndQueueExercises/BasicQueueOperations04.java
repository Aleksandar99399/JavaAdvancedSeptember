package StacksAndQueueExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<Integer>deque=new ArrayDeque<>();
        int[]opperations= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n=Integer.parseInt(String.valueOf(opperations[0]));
        int s=Integer.parseInt(String.valueOf(opperations[1]));
        int x=Integer.parseInt(String.valueOf(opperations[2]));
        int[]nums= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <n; i++) {
            deque.add(nums[i]);
        }
        for (int i = 0; i < s; i++) {
            deque.pop();
        }
        if (deque.isEmpty()){
            System.out.println(0);
        }else if (deque.contains(x)) {
            System.out.println("true");
        } else {
            while (deque.size() > 1) {
                int num1 = deque.pop();
                int num2=deque.pop();
                if (num1 < num2) {
                    deque.push(num1);
                }else {
                    deque.push(num2);
                }
            }
            System.out.println(deque.pop());
        }
    }
}
