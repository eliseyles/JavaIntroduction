//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package arrays.multidimesional;

import util.Input;

public class Task2 {
    public static final int START = 0;

    public static void main(String[] args) {
        int[][] matrix = Input.nextIntSquareMatrix();
        printDiagonal(matrix);
    }

    public static void printDiagonal(int[][] matrix) {
        for (int i = START; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}
