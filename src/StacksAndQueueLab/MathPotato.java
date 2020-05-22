package StacksAndQueueLab;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> save=new ArrayDeque<>();
        String[]names=scanner.nextLine().split("\\s+");
        int count=Integer.parseInt(scanner.nextLine());
        Collections.addAll(save,names);
        int cycle=1;
        while (save.size()>1){
            for (int i = 0; i < count; i++) {
                save.offer(save.poll());
            }

            cycle++;
        }
        System.out.println("Last is "+save.pop());
    }
}
