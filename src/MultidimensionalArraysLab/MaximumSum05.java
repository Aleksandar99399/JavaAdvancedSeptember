package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MaximumSum05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] sizes = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int cols = sizes[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxValue=Integer.MIN_VALUE;
        int[][] maxMatrix=new int[2][2];

        for (int r = 0; r < matrix.length-1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {

                int current = matrix[r][c];
                int right = matrix[r][c + 1];
                int below = matrix[r + 1][c];
                int diagonal = matrix[r + 1][c + 1];
                int sum = current + right + below + diagonal;
                if (sum>maxValue){
                    maxValue=sum;
                    maxMatrix[0][0]=current;
                    maxMatrix[0][1]=right;
                    maxMatrix[1][0]=below;
                    maxMatrix[1][1]=diagonal;
                }
            }

        }
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(maxMatrix[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
    }
}
