package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistroy01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String>history=new ArrayDeque<>();
        String url=scanner.nextLine();
        while (!"Home".equals(url)){
            boolean error=false;
            if (url.equals("back")){
                if (history.size()<2){
                    System.out.println("no previous URLs");
                    error=true;
                }else {
                    history.poll();
                }

            }else {
                history.push(url);
            }
            if (!error) {
                System.out.println(history.peek());
            }
            url=scanner.nextLine();
        }
    }




}
