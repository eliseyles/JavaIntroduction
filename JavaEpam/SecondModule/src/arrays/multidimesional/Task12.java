//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task12 {
    public static final int START = 0;

    public static void main(String[] args) {
        int[][] matrix = Input.randomIntMatrixFilling(3, 4, -5, 10);

        Output.displayIntMatrix(matrix);

        Output.displayIntMatrix(sortRowAsc(matrix));
        Output.displayIntMatrix(sortRowDesc(matrix));
    }

    public static int[][] sortRowAsc(int[][] matrix) {
        if (matrix != null) {
            for (int i = START; i < matrix.length; i++) {
                matrix[i] = sortAsc(matrix[i]);
            }
            return matrix;
        }
        return new int[][]{{}};
    }

    private static int[] sortAsc(int[] row) {
        if (row != null) {
            for (int i = START; i < row.length; i++) {
                for (int j = START; j < row.length; j++) {
                    if (row[i] < row[j]) {
                        int temp = row[i];
                        row[i] = row[j];
                        row[j] = temp;
                    }
                }
            }
            return row;
        }
        return new int[]{};
    }

    public static int[][] sortRowDesc(int[][] matrix) {
        if (matrix != null) {
            for (int i = START; i < matrix.length; i++) {
                matrix[i] = sortDesc(matrix[i]);
            }
            return matrix;
        }
        return new int[][]{{}};
    }

    private static int[] sortDesc(int[] row) {
        if (row != null) {
            for (int i = START; i < row.length; i++) {
                for (int j = START; j < row.length; j++) {
                    if (row[i] > row[j]) {
                        int temp = row[i];
                        row[i] = row[j];
                        row[j] = temp;
                    }
                }
            }
            return row;
        }
        return new int[]{};
    }
}
