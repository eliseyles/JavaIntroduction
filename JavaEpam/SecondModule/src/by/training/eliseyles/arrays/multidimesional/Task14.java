//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

import java.util.Random;

public class Task14 {

    public static final int START = 0;
    public static final int ZERO = 0;


    public static void main(String[] args) {
        int row = Input.nextInt("Enter row number: ");
        int column = Input.nextInt("Enter column number: ");

        int[][] binaryMatrix = randomGenerateBinaryMatrix(row, column);
        Output.displayIntMatrix(binaryMatrix);
    }

    public static int[][] randomGenerateBinaryMatrix(int row, int column) {
        if (row > ZERO && column > ZERO && row >= column) {
            int[][] matrix = new int[row][column];
            for (int i = START; i < matrix[START].length; i++) {
                int unitsNumber = i;
                int position = new Random().nextInt(row);
                while (unitsNumber != 0) {
                    while (matrix[position][i] != 0) {
                        position = new Random().nextInt(row);
                    }
                    matrix[position][i] = 1;
                    unitsNumber--;
                }
            }
            return matrix;
        }
        return new int[][]{{}};
    }
}
