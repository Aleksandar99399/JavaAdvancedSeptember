package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class readListOfList {
        public static void main(String[] args){
            Scanner scanner=new Scanner(in);

            List<List<Integer>> matrix=readMatrix(scanner);

        }

        private static List<List<Integer>> readMatrix(Scanner scanner) {
            int[]rowsandCols= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int rows=rowsandCols[0];
            int cols=rowsandCols[1];

            List<List<Integer>>matrix=new ArrayList<>();

            for (int i = 0; i < rows; i++) {
                matrix.add(Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))  ;

            }
            return matrix;
        }
}
