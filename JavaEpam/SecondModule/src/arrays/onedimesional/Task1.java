package arrays.onedimesional;

import util.Input;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        int k = Input.nextInt("Enter K: ");

        System.out.println(findSumMultipleK(arr, k));
    }

    private static int findSumMultipleK(int[] arr, int k) {
        if (arr != null) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % k == 0) {
                    sum += arr[i];
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
