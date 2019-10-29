//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

package arrays.multidimesional;

import util.Input;
import util.Output;

public class Task1 {

    public static final int ODD_START = 1;
    public static final int START = 0;
    public static final int ODD_OFFSET = 2;
    public static final int OFFSET = 1;
    public static final String WRONG_MATRIX = "Matrix is null";


    public static void main(String[] args) {
        int[][] matrix = Input.nextIntMatrix();

        Output.displayIntMatrix(matrix);
        printOddColumn(matrix);
    }

    public static void printOddColumn(int[][] matrix) {
        if (matrix != null) {
            for (int i = ODD_START; i < matrix[START].length; i += ODD_OFFSET) {
                if (isBigger(matrix[START][i], matrix[matrix.length - OFFSET][i])) {
                    for (int j = START; j < matrix.length; j++) {
                        System.out.print(matrix[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println(WRONG_MATRIX);
    }

    private static boolean isBigger(int firstColumnElement, int lastColumnElement) {
        return firstColumnElement > lastColumnElement;
    }
}
