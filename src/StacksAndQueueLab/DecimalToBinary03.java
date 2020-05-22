package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<Integer>queue=new ArrayDeque<>();
        int num=Integer.parseInt(scanner.nextLine());

        if (num==0){
            System.out.println(0);
        }else {

            while (num!=0){
                queue.push(num%2);

                num/=2;
            }
        }
        for (Integer integer : queue) {
            System.out.print(integer);
        }
    }
}
