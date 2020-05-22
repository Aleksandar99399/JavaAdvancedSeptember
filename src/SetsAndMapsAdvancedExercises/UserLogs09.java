package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class UserLogs09 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        Map<String,Map<String,Integer>>saveUsersIp=new TreeMap<>();

        String[] input=scanner.nextLine().split("[ A-Za-z]+[=]");

        while (!"end".equals(input[0])){
            String ip=input[1];
            String user=input[3];
            if (!saveUsersIp.containsKey(user)){
                saveUsersIp.put(user,new LinkedHashMap<>());
                saveUsersIp.get(user).put(ip,1);
            }else {
                if (!saveUsersIp.get(user).containsKey(ip)){

                    saveUsersIp.get(user).put(ip,1);
                }else {
                    saveUsersIp.get(user).put(ip,saveUsersIp.get(user).get(ip)+1);
                }
            }
            input=scanner.nextLine().split("[ A-Za-z]+[=]");
        }

        for (Map.Entry<String, Map<String, Integer>> s : saveUsersIp.entrySet()) {
            System.out.println(s.getKey()+": ");

            int size=s.getValue().size();

            for (Map.Entry<String, Integer> entry : s.getValue().entrySet()) {

                if (size>1){

                    System.out.printf("%s => %d, ",entry.getKey(),entry.getValue());
                }else {
                    System.out.printf("%s => %d.%n",entry.getKey(),entry.getValue());

                }
                size--;

            }
            //System.out.println(".");

        }

    }
}
