package MultidimensionalArraysLab;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][2];


        int[][] matrix2 = {
                {1, 2, 3, 4, 5, 6, 7, 8},//0row
                {5, 6, 7, 8}//1row
        };
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.print(matrix2[row][col] + ", ");
            }
            System.out.println();

        }

        //getting element
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int el = matrix3[1][1];
        //setting element-matrix4.length=matrix4[0].length; matrix4[0].length=matrix4[1].length
        int[][] matrix4 = new int[3][4];
        for (int row = 0; row < matrix4.length; row++) {
            for (int col = 0; col < matrix4[0].length; col++) {
                matrix4[row][col] = row + col;
            }
        }
    }


}
