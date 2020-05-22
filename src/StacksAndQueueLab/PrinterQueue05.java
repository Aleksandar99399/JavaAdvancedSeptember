package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String>queue=new ArrayDeque<>();

        String printer=scanner.nextLine();
        while (!"print".equals(printer)){
            if ("cancel".equals(printer)&&queue.size()>=1){
                System.out.println("Canceled "+queue.pop());
            }else if (!"cancel".equals(printer)){
                queue.add(printer);

            }else {
                System.out.println("Printer is on standby");
            }

            printer=scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
