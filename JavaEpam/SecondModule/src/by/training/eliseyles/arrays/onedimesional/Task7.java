//7. Даны действительные числа а1 ,а2 ,..., аn.
// Найти max(a1 + a2n, a2 + a2n−1, ..., an + an+1)

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task7 {

    public static final int START = 0;
    public static final int HALF = 2;
    public static final int OFFSET = -1;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();

        Output.displayDoubleArray(arr);
        System.out.println(findMaxElementSum(arr));
    }

    public static double findMaxElementSum(double[] arr) {
        double max = Double.MIN_VALUE;
        if (arr != null) {
            for (int i = START; i < arr.length / HALF; i++) {
                if (arr[i] + arr[arr.length + OFFSET - i] > max) {
                    max = arr[i] + arr[arr.length + OFFSET - i];
                }
            }
        }
        return max;
    }
}
