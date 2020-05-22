package StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoriUpgrade08 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String>history=new ArrayDeque<>();
        ArrayDeque<String>forward=new ArrayDeque<>();
        String url=scanner.nextLine();
        while (!"Home".equals(url)){
            boolean error=false;
            if (url.equals("back")){
                if (history.size()<1){
                    System.out.println("no previous URLs");
                    error=true;
                }else {
                    System.out.println(history.removeLast());
                    error=true;
                }

            }else if (url.equals("forward")){
                if (forward.size()<1){
                    System.out.println("no next URLs");
                    error=true;
                }else {
                    System.out.println(forward.peek());
                    error=true;
                }

            } else {
                forward.addFirst(url);
                history.push(url);
            }
            if (!error) {
                forward.clear();
                System.out.println(history.peek());
            }
            url=scanner.nextLine();
        }
    }
}
