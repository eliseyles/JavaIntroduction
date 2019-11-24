//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;

public class Task6 {

    public static final Double WRONG_ARRAY_RESULT = Double.MAX_VALUE;
    public static final int START = 0;
    public static final int PRIME_DIVIDER_NUMBER = 2;
    public static final int FIRST_NON_PRIME_DIVIDER = 2;
    public static final int NUMBER_DIVIDERS = 2;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();
        System.out.println(sumOnPrimePosition(arr));
    }

    private static double sumOnPrimePosition(double[] arr) {
        if (arr != null) {
            double sum = START;
            for (int i = START; i < arr.length; i++) {
                if (isPrime(i)) {
                    sum += arr[i];
                }
            }
            return sum;
        }
        return WRONG_ARRAY_RESULT;
    }

    private static boolean isPrime(int position) {
        if (position > START) {
            int divider = PRIME_DIVIDER_NUMBER;
            for (int i = FIRST_NON_PRIME_DIVIDER; i <= Math.sqrt(position); i++) {
                if (position % i == START) {
                    divider += NUMBER_DIVIDERS;
                }
            }
            return divider == PRIME_DIVIDER_NUMBER;
        }
        return false;
    }
}
