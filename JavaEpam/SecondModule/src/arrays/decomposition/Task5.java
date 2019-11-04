//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

package arrays.decomposition;

import util.Input;
import util.Output;

public class Task5 {
    public static final int ZERO_INDEX = 0;
    public static final int WRONG_VALUE = Integer.MIN_VALUE;


    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(10, -10, 20);
        Output.displayIntArray(arr);
        System.out.println(findSecondMax(arr));
//        Output.displayIntMatrix(findMaxDistance(arr));
//        System.out.println(findDistance(new int[]{0, 0}, new int[]{3, 4}));
    }

    public static int findSecondMax(int[] arr) {
        if (arr != null) {
            int max = findMax(arr);
            int secondMax = Integer.MIN_VALUE;

            for (int i = ZERO_INDEX; i < arr.length; i++) {
//                System.out.println(arr[i]);
                if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }
            return secondMax;
        }
        return WRONG_VALUE;
    }

    private static int findMax(int[] arr) {
        if (arr != null) {
            int max = Integer.MIN_VALUE;
            for (int i = ZERO_INDEX; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
        return WRONG_VALUE;
    }

}
