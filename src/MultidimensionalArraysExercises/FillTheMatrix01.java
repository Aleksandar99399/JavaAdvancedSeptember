package MultidimensionalArraysExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class FillTheMatrix01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        String[]input=scanner.nextLine().split(", ");
        int size=Integer.parseInt(input[0]);
        String pattern=input[1];

        int [][]matrix;

        if (pattern.equals("A")){
            matrix=fillPatternA(size);
        }else {
            matrix=fillPatternB(size);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] fillPatternA(int size) {
        int[][] matrix=new int[size][size];

        int value=1;
        for (int col = 0; col <size ; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col]=value++;
            }
        }

        return matrix;
    }

    private static int[][] fillPatternB(int size) {
        int[][]matrix=new int[size][size];
        int value=1;
        for (int col = 0; col <size ; col++) {
            if (col%2==0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = value++;
                }
            }else {
                for (int i = matrix.length-1; i >=0 ; i--) {
                    matrix[i][col]=value++;
                }
            }
        }
        return matrix;
    }
}
