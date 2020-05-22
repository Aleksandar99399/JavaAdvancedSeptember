package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TheMatrix12 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int [] rowsAndCols= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows=rowsAndCols[0];
        int cols=rowsAndCols[1];

        int[][]matrix=new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            matrix[r]=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum=Integer.MIN_VALUE;
        int row = 0,col=0;

        for (int r = 1; r <matrix.length-1 ; r++) {
            for (int c = 1; c < matrix[r].length-1; c++) {
                int sum=getSum(matrix,r,c);
                if (sum>maxSum){
                    maxSum=sum;
                    row=r;
                    col=c;
                }
            }
        }
        System.out.println("Sum = "+maxSum);
        row--;
        col--;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j <col+3 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int getSum(int[][] matrix, int r, int c) {
        int sum=0;
        r--;
        c--;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j <c+3 ; j++) {
                sum+=matrix[i][j];
            }
            
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
