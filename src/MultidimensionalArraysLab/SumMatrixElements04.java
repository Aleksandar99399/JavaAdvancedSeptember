package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class SumMatrixElements04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int []rowsAndCols= Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows=rowsAndCols[0];
        int cols=rowsAndCols[1];

        int[][]matrix=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i]=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
