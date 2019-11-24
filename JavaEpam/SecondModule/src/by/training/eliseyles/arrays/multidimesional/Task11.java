//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

package by.training.eliseyles.arrays.multidimesional;

import java.util.Random;

public class Task11 {
    public static final int START = 0;
    public static final int ROW_COUNT = 10;
    public static final int COLUMN_COUNT = 20;
    public static final int BOUND = 15;
    public static final String WRONG_MATRIX = "Matrix is null";
    public static final int NUMBER = 5;
    public static final int NUMBER_COUNT = 3;
    public static final int MIN_NUMBER_COUNT = 0;


    public static void main(String[] args) {
        int[][] matrix = randomMatrixFilling();
        displayIntMatrix(matrix);
        printRowNumber(matrix);
    }

    public static int[][] randomMatrixFilling() {
        int[][] matrix = new int[ROW_COUNT][COLUMN_COUNT];
        for (int i = START; i < matrix.length; i++) {
            for (int j = START; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(BOUND);
            }
        }
        return matrix;
    }

    public static void displayIntMatrix(int[][] arr) {
        if (arr != null) {
            for (int[] i : arr) {
                displayIntArray(i);
            }
            System.out.println();
        } else
            System.out.println(WRONG_MATRIX);
    }

    private static void displayIntArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printRowNumber(int[][] matrix) {
        if (matrix != null) {
            for (int i = START; i < matrix.length; i++) {
                if (isThereEnoughNumbers(matrix[i])) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static boolean isThereEnoughNumbers(int[] row) {
        if (row != null) {
            int numberCount = MIN_NUMBER_COUNT;
            for (int i = START; i < row.length; i++) {
                if (row[i] == NUMBER) numberCount++;
            }
            return numberCount >= NUMBER_COUNT;
        }
        return false;
    }

}
