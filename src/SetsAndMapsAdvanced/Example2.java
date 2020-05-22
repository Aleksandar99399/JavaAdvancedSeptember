package SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class Example2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int n= Integer.parseInt(scanner.nextLine());

        TreeMap<String, Map<String,Double>>map=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name=scanner.nextLine();
            String[]subjects=scanner.nextLine().split(";");

            map.putIfAbsent(name,new HashMap<>());

            for (String subject : subjects) {
                String[] element=subject.split(" - ");
                String subjectName=element[0];
                double subjectGrade=Double.parseDouble(element[1]);

                map.get(name).put(subjectName,subjectGrade);
            }
        }
        for (Map.Entry<String, Map<String, Double>> entry : map.entrySet()) {
            String studentName=entry.getKey();
            Map<String,Double>subjects=entry.getValue();
            System.out.printf("# Student: %s%n",studentName);

            for (Map.Entry<String, Double> doubleEntry : subjects.entrySet()) {
                System.out.printf("## %s - %d%n",doubleEntry.getKey(),doubleEntry.getValue());
            }

        }


        //for (Map.Entry<String, double[]> stringEntry : map.entrySet()) {
       //    String student=stringEntry.getKey();
       //    double [] studentGrades=stringEntry.getValue();
       //    double avg=Arrays.stream(studentGrades).average().getAsDouble();
       //    System.out.printf("Student: %s%n",student);
       //    System.out.printf("Grades: %s%n",studentGrades.toString());
       //    System.out.printf("Average: %.2f%n",avg);
       //}


    }
}
