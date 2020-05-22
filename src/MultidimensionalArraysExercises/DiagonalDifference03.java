package MultidimensionalArraysExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
            }
            System.out.println();
        }
        int primDiag=primaryDiagonal(matrix, n);
        int secoDiag=secondaryDiagonal(matrix,n);

        int abs=Math.abs(primDiag-secoDiag);
        System.out.println(abs);
    }

    private static int secondaryDiagonal(int[][] matrix, int n) {
        int sum=0;
        int r=0;
        int c=n-1;
        while (r<n&&c>=0){
            sum+=matrix[r][c];
            r++;
            c--;
        }
        return sum;
    }

    private static int primaryDiagonal(int[][] matrix, int n) {
        int sum = 0;
        int r = 0;
        int c = 0;
        while (r < n && c < n) {
            sum+=matrix[r][c];
            r++;
            c++;
        }
        return sum;
    }
}
