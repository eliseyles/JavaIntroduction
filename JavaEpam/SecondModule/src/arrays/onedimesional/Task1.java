//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package arrays.onedimesional;

import util.Input;

public class Task1 {

    public static final int ZERO = 0;
    public static final int INVALIDRETURNVALUE = -1;


    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        int k = Input.nextInt("Enter K: ");

        System.out.println(findSumMultipleK(arr, k));
    }

    private static int findSumMultipleK(int[] arr, int k) {
        if (arr != null) {
            int sum = ZERO;
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] % k == ZERO) {
                    sum += arr[i];
                }
            }
            return sum;
        } else {
            return INVALIDRETURNVALUE;
        }
    }
}
