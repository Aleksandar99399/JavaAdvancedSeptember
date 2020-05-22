package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int [] rowsAndCols= Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int rows=rowsAndCols[0];
        int cols=rowsAndCols[1];

        int [][]matrix=new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r]=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        int number= Integer.parseInt(scanner.nextLine());
        boolean isEqual=false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==number){
                    System.out.println(i+" "+j);
                    isEqual=true;
                }
            }
        }
        if (!isEqual){
            System.out.println("not found");
        }

    }
}
