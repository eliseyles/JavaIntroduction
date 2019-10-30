//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task13 {
    public static final int START = 0;

    public static void main(String[] args) {
        int[][] matrix = Input.randomIntMatrixFilling(3, 4, -5, 10);

        Output.displayIntMatrix(matrix);


        Output.displayIntMatrix(sortColumnAsc(matrix));
        Output.displayIntMatrix(sortColumnDesc(matrix));
    }

    public static int[][] sortColumnAsc(int[][] matrix) {
        if(matrix != null){
            int[] column = new int[matrix.length];
            for (int i = START; i < matrix[START].length; i++) {
                for (int j = START; j < matrix.length; j++) {
                    column[j] = matrix[j][i];
                }
                column = sortAsc(column);
                for (int j = START; j < matrix.length; j++) {
                    matrix[j][i] = column[j];
                }
            }
            return matrix;
        }
        return new int[][]{{}};
    }

    private static int[] sortAsc(int[] row) {
        if (row != null){
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

    public static int[][] sortColumnDesc(int[][] matrix) {
        if(matrix != null){
            int[] column = new int[matrix.length];
            for (int i = START; i < matrix[START].length; i++) {
                for (int j = START; j < matrix.length; j++) {
                    column[j] = matrix[j][i];
                }
                column = sortDesc(column);
                for (int j = START; j < matrix.length; j++) {
                    matrix[j][i] = column[j];
                }

            }
            return matrix;
        }
        return new int[][]{{}};
    }

    private static int[] sortDesc(int[] row) {
        if (row != null){
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
