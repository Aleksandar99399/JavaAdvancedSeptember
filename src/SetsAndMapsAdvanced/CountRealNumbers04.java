package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class CountRealNumbers04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        double[]numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double,Integer>map=new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i])){
                map.put(numbers[i],1);
            }else {
                map.put(numbers[i],map.get(numbers[i])+1);
            }
        }
        for (Double entry : map.keySet()) {
            System.out.printf("%.1f -> %d%n",entry,map.get(entry));
        }
    }
}
