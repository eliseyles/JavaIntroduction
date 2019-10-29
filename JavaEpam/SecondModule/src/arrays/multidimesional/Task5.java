//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task5 {
    public static final int START = 0;
    public static final int OFFSET = 1;
    public static final int FILLER = 0;


    public static void main(String[] args) {
        int n = Input.nextInt("Enter n: ");

        Output.displayIntMatrix(createMatrixByLaw(n));
    }

    public static int[][] createMatrixByLaw(int n) {
        if (isEven(n) && n > 0) {
            int[][] matrix = new int[n][n];
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (isInLaw(i, j, n)) {
                        matrix[i][j] = i + OFFSET;
                    } else {
                        matrix[i][j] = FILLER;
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
        return j < n - i;
    }
}
