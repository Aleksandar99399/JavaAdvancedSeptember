package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MatrixOfPalindromes02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int[] rowsAndCols= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows=rowsAndCols[0];
        int cols=rowsAndCols[1];

        String[][] matrix=new String[rows][cols];
        takeSymbols(rows, cols, matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void takeSymbols(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char[] lett=new char[3];
                for (int i = 0; i < lett.length; i++) {
                    if (i%2==1){
                        lett[i]=(char)('a'+row+col);
                    }else {
                        lett[i]=(char)('a'+row);
                    }
                }
                matrix[row][col]=String.valueOf(lett);
            }
        }
    }
}
