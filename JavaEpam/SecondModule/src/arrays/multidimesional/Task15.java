//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task15 {

    public static final int START = 0;
    public static final int EVEN = 2;
    public static final int WRONG_MATRIX = Integer.MIN_VALUE;
    public static final int ZERO = 0;


    public static void main(String[] args) {
        int row = Input.nextInt("Enter row number: ");
        int column = Input.nextInt("Enter column number: ");

        int[][] matrix = Input.randomIntMatrixFilling(row, column, -10, 20);
        Output.displayIntMatrix(matrix);
        System.out.println(findMaxMatrixElement(matrix));
        Output.displayIntMatrix(replaceOddElementsByMax(matrix));
    }

    public static int findMaxMatrixElement(int[][] matrix) {
        if (matrix != null) {
            int max = matrix[START][START];
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
            return max;
        }
        return WRONG_MATRIX;
    }

    public static int[][] replaceOddElementsByMax(int[][] matrix) {
        if (matrix != null) {
            int max = findMaxMatrixElement(matrix);
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (matrix[i][j] % EVEN != ZERO) {
                        matrix[i][j] = max;
                    }
                }
            }
            return matrix;
        }
        return new int[][]{{}};
    }
}
