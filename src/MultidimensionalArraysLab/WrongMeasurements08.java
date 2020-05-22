package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class WrongMeasurements08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int wrongValue = matrix[r][c];

        List<Integer>values=new ArrayList<>();
        List<int[]>indexes=new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongValue) {
                    int validValue = getValidValue(matrix, i, j,wrongValue);
                    values.add(validValue);
                    indexes.add(new int[]{i,j});
                }
            }
        }
        for (int i = 0; i < values.size(); i++) {
            matrix[indexes.get(i)[0]][indexes.get(i)[1]]=values.get(i);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int getValidValue(int[][] matrix, int row, int col,int wrongValue) {
        int sum = 0;
        if (isInBounce(matrix,row+1,col)&&matrix[row+1][col]!=wrongValue) {
            sum += matrix[row + 1][col];
        }
        if (isInBounce(matrix,row+-1,col)&&matrix[row-1][col]!=wrongValue) {
            sum += matrix[row - 1][col];
        }
        if (isInBounce(matrix,row,col+1)&&matrix[row][col+1]!=wrongValue) {
            sum += matrix[row][col + 1];

        }
        if (isInBounce(matrix,row,col-1)&&matrix[row][col-1]!=wrongValue) {
            sum += matrix[row][col - 1];

        }

        return sum;
    }

    private static boolean isInBounce(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
