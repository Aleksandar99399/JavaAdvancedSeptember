    package StacksAndQueueLab;


    import java.util.ArrayDeque;
    import java.util.Collections;
    import java.util.Scanner;

    public class HotPotato06 {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);

            ArrayDeque<String> save=new ArrayDeque<>();
            String[]names=scanner.nextLine().split("\\s+");
            int count=Integer.parseInt(scanner.nextLine());
            Collections.addAll(save,names);

            while (save.size()>1){
                for (int i = 0; i < count; i++) {
                    if (i==count-1) {
                        System.out.println("Prime "+save.pop());
                        for (String s : save) {
                            System.out.println("Removed " + save.removeFirst());
                        }

                    }else {
                        save.add(save.pop());
                    }
                }
            }
            System.out.println("Last is "+save.pop());
        }
    }
