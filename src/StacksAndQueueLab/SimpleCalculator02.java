package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> stack=new ArrayDeque<>();
        String[]arr=scanner.nextLine().split("\\s+");
        Collections.addAll(stack,arr);

        while (stack.size()>1){
            int num1=Integer.parseInt(stack.pop());
            String op=stack.pop();
            int num2=Integer.parseInt(stack.pop());
            if (op.equals("+")){
                stack.push(String.valueOf(num1+num2));

            }else {
                stack.push(String.valueOf(num1-num2));
            }


        }
        System.out.println(stack.peek());
    }
}
