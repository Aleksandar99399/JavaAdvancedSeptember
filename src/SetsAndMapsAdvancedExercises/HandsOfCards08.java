package SetsAndMapsAdvancedExercises;

import java.util.*;

import static java.lang.System.in;

public class HandsOfCards08 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        Map<String,Integer>scoresPlayers=new LinkedHashMap<>();
        Map<String,Set<String>>map=new LinkedHashMap<>();
        String[]strings=scanner.nextLine().split(": ");
        while (!"JOKER".equals(strings[0])){
            String name=strings[0];
            String[]card=strings[1].split(", ");
            if (!map.containsKey(name)) {
                map.put(name, new LinkedHashSet<>());
                for (int i = 0; i < card.length; i++) {
                    map.get(name).add(card[i]);
                }

            }else {
                for (int i = 0; i < card.length; i++) {
                    if (!map.get(name).contains(card[i])){

                        map.get(name).add(card[i]);
                    }
                }

            }
            int sum=0;
            for (String s : map.get(name)) {

                String[] word=s.split("");
                String power = "" ;
                String type = "";
                if (word.length>2){
                    power=word[0]+word[1];
                    type=word[2];
                }else {
                    power=word[0];
                    type=word[1];
                }
                int sila = 0;
                int tip = 0;
                if (Character.isDigit(power.charAt(0))) {
                    sila = Integer.parseInt(String.valueOf(power));
                } else {
                    if (power.equals("A")) {
                        sila = 14;
                    } else if (power.equals("K")) {
                        sila = 13;
                    } else if (power.equals("Q")) {
                        sila = 12;
                    } else if (power.equals("J")) {
                        sila = 11;
                    }
                }
                if (type.equals("S")) {
                    tip = 4;
                } else if (type.equals("H")) {
                    tip = 3;
                } else if (type.equals("D")) {
                    tip = 2;
                } else if (type.equals("C")) {
                    tip = 1;
                }
                sum+=sila*tip;
            }

            scoresPlayers.put(name,sum);

            strings=scanner.nextLine().split(": ");
        }
        for (Map.Entry<String, Integer> entry : scoresPlayers.entrySet()) {
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }
    }
}
