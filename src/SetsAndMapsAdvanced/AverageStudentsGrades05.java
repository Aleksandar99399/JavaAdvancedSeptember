package SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class AverageStudentsGrades05 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>>recordStudents=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[]nameAndGrade=scanner.nextLine().split(" ");
            String name=nameAndGrade[0];
            double grade=Double.parseDouble(nameAndGrade[1]);
            if (!recordStudents.containsKey(name)) {
                recordStudents.put(name, new ArrayList<>());
            }
            recordStudents.get(name).add(grade);
        }

        recordStudents.forEach((name, value) -> {
            double avg = value.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            System.out.printf("%s -> ", name);
            value.forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", avg);
        });

    }
}
