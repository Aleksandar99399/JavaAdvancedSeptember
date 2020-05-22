package StacksAndQueueLab;

import java.util.*;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        int n = stack.peek();
        System.out.println(n);

        ArrayDeque<Integer>deque=new ArrayDeque<>();
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        deque.pop();
        int n2=deque.peek();
        System.out.println(n2);
        for (Integer integer : deque) {
            System.out.print(integer);
        }


    }
}
