package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class PrintDiagonalOfSquareMatrix06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[num][];

        for (int r = 0; r < num; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int row = 0;
        int col = 0;

        while (row < num && col < num) {
            int element=matrix[row][col];
            System.out.print(element+" ");
            row++;
            col++;
        }
        System.out.println();

        row=num-1;
        col=0;
        while (row>=0&&col<num){
            int element=matrix[row][col];
            System.out.print(element+" ");
            row--;
            col++;
        }
    } 
}
