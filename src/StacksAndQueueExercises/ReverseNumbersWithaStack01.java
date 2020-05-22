package StacksAndQueueExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithaStack01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String>stack=new ArrayDeque<>();
        String[] numbers=scanner.nextLine().split("\\s+");
        //Collections.addAll(stack,numbers);

        for (int i = 0; i <numbers.length; i++) {

            stack.push(numbers[i]);
        }
        for (String s : stack) {
            System.out.print(s+ " ");
        }
    }
}
