//10. Найти положительные элементы главной диагонали квадратной матрицы.

package arrays.multidimesional;

import util.Input;
import util.Output;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {

    public static final int START = 0;
    public static final int ZERO = 0;
    public static final int OFFSET = 1;



    public static void main(String[] args) {
        int[][] matrix = Input.nextIntSquareMatrix();

        Output.displayIntMatrix(matrix);
        Output.displayIntArray(findPositiveDiagonalElements(matrix));
    }

    public static int[] findPositiveDiagonalElements(int[][] matrix) {
        if (matrix != null) {
            int[] positiveDiagonal = new int[ZERO];
            for (int i = START; i < matrix.length; i++) {
                if (matrix[i][i] > ZERO) {
                    positiveDiagonal = add(positiveDiagonal, matrix[i][i]);
                }
            }
            return positiveDiagonal;
        }
        return null;
    }

    private static int[] add(int[] arr, int number) {
        if (arr != null) {
            arr = Arrays.copyOf(arr, arr.length + OFFSET);
            arr[arr.length - OFFSET] = number;
            return arr;
        }
        return new int[]{};
    }
}
