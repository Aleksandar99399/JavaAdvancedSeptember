package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());//4
        int cols=Integer.parseInt(scanner.nextLine());//4

        int[][]matrix=new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[]input=scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=Integer.parseInt(input[col]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }




}
