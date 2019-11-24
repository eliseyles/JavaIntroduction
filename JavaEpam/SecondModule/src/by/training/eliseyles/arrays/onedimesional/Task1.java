//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;

public class Task1 {

    public static final int START = 0;
    public static final int INVALID_RETURN_VALUE = -1;


    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        int k = Input.nextInt("Enter K: ");

        System.out.println(findSumMultipleK(arr, k));
    }

    private static int findSumMultipleK(int[] arr, int k) {
        if (arr != null) {
            int sum = START;
            for (int i = START; i < arr.length; i++) {
                if (arr[i] % k == START) {
                    sum += arr[i];
                }
            }
            return sum;
        } else {
            return INVALID_RETURN_VALUE;
        }
    }
}
