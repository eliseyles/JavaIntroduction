//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task9 {
    public static final int START = 0;
    public static final int WRONG_MATRIX = -1;


    public static void main(String[] args) {
        double[][] matrix = Input.nextDoubleMatrix();

        Output.displayDoubleMatrix(matrix);
        Output.displayDoubleArray(columnSum(matrix));
        System.out.println(maxSumColumnNumber(matrix));
    }

    public static double[] columnSum(double[][] matrix) {
        if (matrix != null) {
            double[] columnSum = new double[matrix[START].length];
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    columnSum[j] += matrix[i][j];
                }
            }
            return columnSum;
        }
        return null;
    }

    public static int maxSumColumnNumber(double[][] matrix) {
        if (matrix != null) {
            double[] columnSum = columnSum(matrix);
            double max = columnSum[START];
            int maxColumnNumber = START;
            for (int i = START; i < columnSum.length; i++) {
                if (columnSum[i] > max) {
                    max = columnSum[i];
                    maxColumnNumber = i;
                }
            }
            return maxColumnNumber;
        }
        return WRONG_MATRIX;
    }
}
