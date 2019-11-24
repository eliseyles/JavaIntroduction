//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task6 {
    public static final int START = 0;
    public static final int OFFSET = 1;
    public static final int FILLER_ONE = 1;
    public static final int FILLER_ZERO = 0;


    public static void main(String[] args) {
        int n = Input.nextInt("Enter n: ");

        Output.displayIntMatrix(createMatrixByLaw(n));
    }

    public static int[][] createMatrixByLaw(int n) {
        if (isEven(n) && n > 0) {
            int[][] matrix = new int[n][n];
            for (int i = START; i < matrix.length / 2; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (isInLaw(i, j, n)) {
                        matrix[i][j] = FILLER_ZERO;
                        matrix[matrix.length - OFFSET - i][j] = FILLER_ZERO;
                    } else {
                        matrix[i][j] = FILLER_ONE;
                        matrix[matrix.length - OFFSET - i][j] = FILLER_ONE;
                    }
                }
            }
            return matrix;
        }
        return null;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isInLaw(int i, int j, int n) {
        return j < i || j > n - i - OFFSET;
    }
}
