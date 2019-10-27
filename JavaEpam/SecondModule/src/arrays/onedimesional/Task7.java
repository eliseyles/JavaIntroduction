//7. Даны действительные числа а1 ,а2 ,..., аn.
// Найти max(a1 + a2n, a2 + a2n−1, ..., an + an+1)

package arrays.onedimesional;

import util.Input;
import util.Output;

public class Task7 {

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();

        Output.displayDoubleArray(arr);
        System.out.println(findMaxElementSum(arr));
    }

    public static double findMaxElementSum(double[] arr) {
        double max = Double.MIN_VALUE;
        if (arr != null) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] + arr[arr.length - 1 - i] > max) {
                    max = arr[i] + arr[arr.length - 1 - i];
                }
            }
        }
        return max;
    }
}
