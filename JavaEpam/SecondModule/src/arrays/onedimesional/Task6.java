//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

package arrays.onedimesional;

import util.Input;

public class Task6 {

    public static final Double WRONGARRAYRESULT = Double.MAX_VALUE;
    public static final int ZERO = 0;
    public static final int PRIMEDIVIDERNUMBER = 2;
    public static final int FIRSTNONPRIMEDIVIDER = 2;
    public static final int NUMBERDIVIDERS = 2;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();
        System.out.println(sumOnPrimePosition(arr));
    }

    private static double sumOnPrimePosition(double[] arr) {
        if (arr != null) {
            double sum = ZERO;
            for (int i = ZERO; i < arr.length; i++) {
                if (isPrime(i)) {
                    sum += arr[i];
                }
            }
            return sum;
        }
        return WRONGARRAYRESULT;
    }

    private static boolean isPrime(int position) {
        if (position > ZERO) {
            int divider = PRIMEDIVIDERNUMBER;
            for (int i = FIRSTNONPRIMEDIVIDER; i <= Math.sqrt(position); i++) {
                if (position % i == ZERO) {
                    divider += NUMBERDIVIDERS;
                }
            }
            return divider == PRIMEDIVIDERNUMBER;
        }
        return false;
    }
}
