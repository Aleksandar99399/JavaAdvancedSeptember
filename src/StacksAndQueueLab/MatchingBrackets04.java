package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String expression=scanner.nextLine();
        Deque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symb=expression.charAt(i);
            if ('(' == symb){
                stack.push(i);
            }else if (symb==')'){
                int startIndex=stack.pop();
                String content=expression.substring(startIndex,i+1);
                System.out.println(content);
            }

        }
    }
}
