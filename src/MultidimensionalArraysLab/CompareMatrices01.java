package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int[]rowsAndCols= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows=rowsAndCols[0];
        int cols=rowsAndCols[1];

        int [][]firstMatrix= readMatrix(rows,cols,scanner);

        rowsAndCols= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        rows=rowsAndCols[0];
        cols=rowsAndCols[1];

        int [][]secontMatrix= readMatrix(rows,cols,scanner);

        if (areMatrixEqual(firstMatrix,secontMatrix)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
       //for (int r = 0; r < rows; r++) {
       //    arr[r]= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       //}
       //for (int r = 0; r < rows; r++) {
       //    String[] elements = scanner.nextLine().split(" ");
       //    for (int c = 0; c < elements.length; c++) {
       //        int number=Integer.parseInt(elements[c]);
       //        arr[r][c]=number;
       //    }
       //}
        System.out.println();
    }

    private static boolean areMatrixEqual(int[][] firstMatrix, int[][] secontMatrix) {
        boolean areEqual=true;

        if (firstMatrix.length!=secontMatrix.length){
            areEqual=false;
        }else {
            for (int r = 0; r < firstMatrix.length; r++) {


                if (firstMatrix[r].length!=secontMatrix[r].length){
                    areEqual=false;
                    break;
                }else {
                    for (int c = 0; c < firstMatrix[r].length; c++) {
                        if (firstMatrix[r][c]!=secontMatrix[r][c]){
                            return false;
                        }
                    }
                }
            }
        }

        return areEqual;
    }

    private static int[][]readMatrix(int row,int col,Scanner scanner){
        int [][]matrix= new int[row][col];
        for (int r = 0; r < row; r++) {
            String[] elements = scanner.nextLine().split(" ");
            for (int c = 0; c < elements.length; c++) {
                int number=Integer.parseInt(elements[c]);
                matrix[r][c]=number;
            }
        }
        return matrix;
    }
}
