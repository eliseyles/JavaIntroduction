//7. Сформировать квадратную матрицу порядка N по правилу: a[i,j] = sin((i^2 - j^2)/n)
//и подсчитать количество положительных элементов в ней.

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task7 {
    public static final int START = 0;
    public static final int POW = 2;
    public static final int DEFAULT_NUMBER = 0;
    public static final int WRONG_NUMBER = -1;
    public static final int ZERO = 0;


    public static void main(String[] args) {
        int n = Input.nextInt("Enter n: ");

        Output.displayDoubleMatrix(createMatrixByLaw(n));
        System.out.println(findPositiveElementNumber(createMatrixByLaw(n)));
    }

    public static double[][] createMatrixByLaw(int n) {
        if (n > START) {
            double[][] matrix = new double[n][n];
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    matrix[i][j] = funcValue(i, j, n);
                }
            }
            return matrix;
        }
        return null;
    }

    private static double funcValue(int i, int j, int n) {
        return Math.sin((Math.pow(i, POW) - Math.pow(j, POW)) / n);
    }

    public static int findPositiveElementNumber(double[][] matrix) {
        if (matrix != null) {
            int number = DEFAULT_NUMBER;
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (matrix[i][j] > ZERO) {
                        number++;
                    }
                }
            }
            return number;
        }
        return WRONG_NUMBER;
    }


}
