//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

package arrays.multidimesional;

import util.Input;

public class Task3 {
    public static final int START = 0;
    public static final String WRONG_MATRIX = "Matrix is null";
    public static final String ROW_PRINT = "The %d row in matrix: /n";
    public static final String COLUMN_PRINT = "The %d column in matrix: /n";


    public static void main(String[] args) {
        int[][] matrix = Input.nextIntSquareMatrix();

        int k = Input.nextInt("Enter k: ");
        int p = Input.nextInt("Enter p: ");

        printRowByNumber(matrix, k);
        printColumnByNumber(matrix, p);
    }

    public static void printRowByNumber(int[][] matrix, int rowNumber) {
        if (matrix != null && rowNumber >= START && rowNumber < matrix.length) {
            System.out.printf(ROW_PRINT, rowNumber);
            for (int i = START; i < matrix[rowNumber].length; i++) {
                System.out.print(matrix[rowNumber][i] + " ");
            }
            System.out.println();
        }
        System.out.println(WRONG_MATRIX);
    }

    public static void printColumnByNumber(int[][] matrix, int columnNumber) {
        if (matrix != null && columnNumber >= START && columnNumber < matrix[START].length) {
            System.out.printf(COLUMN_PRINT, columnNumber);
            for (int i = START; i < matrix.length; i++) {
                System.out.print(matrix[i][columnNumber] + " ");
            }
            System.out.println();
        }
        System.out.println(WRONG_MATRIX);
    }
}
