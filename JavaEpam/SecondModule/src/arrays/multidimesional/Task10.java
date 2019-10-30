//10. Найти положительные элементы главной диагонали квадратной матрицы.

package arrays.multidimesional;

import util.Input;
import util.Output;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task10 {

    public static final int START = 0;
    public static final int ZERO = 0;


    public static void main(String[] args) {
        int[][] matrix = Input.nextIntSquareMatrix();

        Output.displayIntMatrix(matrix);
        System.out.println(findPositiveDiagonalElements(matrix));
    }

    public static ArrayList findPositiveDiagonalElements(int[][] matrix) {
        if (matrix != null) {
            ArrayList<Integer> positiveDiagonal = new ArrayList<Integer>();
            for (int i = START; i < matrix.length; i++) {
                if (matrix[i][i] > ZERO) {
                    positiveDiagonal.add(matrix[i][i]);
                }
            }
            return positiveDiagonal;
        }
        return null;
    }
}
