//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task4 {
    public static final int START = 0;
    public static final int OFFSET = 1;


    public static void main(String[] args) {
        int n = Input.nextInt("Enter n: ");

        Output.displayIntMatrix(createMatrixByLaw(n));
    }

    public static int[][] createMatrixByLaw(int n) {
        if (isEven(n) && n > 0) {
            int[][] matrix = new int[n][n];
            for (int i = START; i < matrix.length; i++) {
                for (int j = START; j < matrix[i].length; j++) {
                    if (isEven(i)) {
                        matrix[i][j] = j + OFFSET;
                    } else {
                        matrix[i][j] = n - j;
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
}
