package MultidimensionalArraysLab;

import java.util.Scanner;

import static java.lang.System.in;

public class FindTheRealQueen07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = 8;

        char[][] board = new char[size][size];
        for (int i = 0; i < size; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                board[i][j] = line[j].charAt(0);

            }
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (board[r][c] == 'q') {
                    boolean isColValid = checkQueenCol(board, c);
                    boolean isRowValid = checkQueenRow(board, r);
                    boolean isMainDiagonalValidUpAndLeft
                            = checkMainDiagonalUpLeft(board, r, c);
                    boolean isMainDiagonalValidDownAndRight
                            = checkMainDiagonalDownAndRight(board, r, c);
                    boolean isSecondaryDiagonalValidUpAndRight
                            = checkSecondaryDiagonalUpAndRight(board, r, c);
                    boolean isSecondaryDiagonalValidDownAndLeft
                            = checkSecondaryDiagonalDownAndLeft(board, r, c);
                    if (isColValid && isRowValid && isMainDiagonalValidDownAndRight && isMainDiagonalValidUpAndLeft
                            && isSecondaryDiagonalValidDownAndLeft && isSecondaryDiagonalValidUpAndRight) {
                        System.out.println(r+" "+c);
                        return;
                    }
                }
            }
        }

    }

    private static boolean checkSecondaryDiagonalDownAndLeft(char[][] board, int row, int col) {
        row++;
        col--;
        while (row < 8 && col >= 0) {
            if (board[row++][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSecondaryDiagonalUpAndRight(char[][] board, int row, int col) {
        row--;
        col++;
        while (row >= 0 && col < 8) {
            if (board[row--][col++] == 'q') {
                return false;
            }
        }
        return true;

    }

    private static boolean checkMainDiagonalDownAndRight(char[][] board, int row, int col) {
        row++;
        col++;

        while (row < 8 && col < 8) {
            if (board[row++][col++] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkMainDiagonalUpLeft(char[][] board, int row, int col) {
        row--;
        col--;

        while (row >= 0 && col >= 0) {
            if (board[row--][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenRow(char[][] board, int row) {
        int queens = 0;
        for (int i = 0; i < board.length; i++) {
            char symb = board[row][i];
            if (symb == 'q') {
                queens++;
            }
        }
        return  queens==1;
    }

    private static boolean checkQueenCol(char[][] board, int col) {
        int queens = 0;

        for (int i = 0; i < board.length; i++) {
            char symb = board[i][col];
            if (symb == 'q') {
                queens++;
            }
        }
        return queens == 1;
    }
}
