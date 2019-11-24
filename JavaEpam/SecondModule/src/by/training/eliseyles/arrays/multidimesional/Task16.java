//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//6 1 8
//7 5 3
//2 9 4

package by.training.eliseyles.arrays.multidimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task16 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;


    public static void main(String[] args) {
        int n = Input.nextInt("Input NOT EVEN dimension of magic square: ");
        Output.displayIntMatrix(generateMagicSquare(n));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int[][] generateMagicSquare(int n) {
        if (isEven(n) && n > 2) {
            int i = n / 2;
            int j = n - 1;
            int[][] magicSquare = new int[n][n];
            for (int number = 1; number <= n * n; ) {
                if (i == -1 && j == n) {
                    j = n - 2;
                    i = 0;
                } else {
                    if (j == n) {
                        j = 0;
                    }
                    if (i < 0) {
                        i = n - 1;
                    }
                }
                if (magicSquare[i][j] != 0) {
                    j -= 2;
                    i++;
                    continue;
                } else {
                    magicSquare[i][j] = number++;
                }
                j++;
                i--;
            }
            return magicSquare;
        }
        return new int[][]{};
    }

}
