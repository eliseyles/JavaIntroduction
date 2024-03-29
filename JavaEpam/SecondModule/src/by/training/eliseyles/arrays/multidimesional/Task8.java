//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task8 {
    public static final int START = 0;


    public static void main(String[] args) {
        double[][] matrix = Input.nextDoubleMatrix();

        int k = Input.nextInt("Enter first column: ");
        int p = Input.nextInt("Enter second column: ");
        Output.displayDoubleMatrix(matrix);
        Output.displayDoubleMatrix(replaceTwoColumn(matrix, k, p));
    }

    public static double[][] replaceTwoColumn(double[][] matrix, int first, int second) {
        if (matrix != null) {
            if (isInBound(first, matrix.length) || isInBound(second, matrix.length)) {
                for (int i = START; i < matrix.length; i++) {
                    double temp = matrix[i][first];
                    matrix[i][first] = matrix[i][second];
                    matrix[i][second] = temp;
                }
            }
        }
        return matrix;
    }

    private static boolean isInBound(int i, int n) {
        return i > START && i < n;
    }


}
