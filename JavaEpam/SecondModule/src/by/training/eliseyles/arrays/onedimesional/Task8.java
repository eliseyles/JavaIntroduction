//8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn.)

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

import java.util.Arrays;

public class Task8 {
    public static final int INVALID_VALUE = Integer.MIN_VALUE;
    public static final int ZERO = 0;
    public static final int OFFSET = 1;


    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();

        Output.displayIntArray(makeArrWithoutMin(arr));
    }

    private static int[] makeArrWithoutMin(int[] arr) {
        if (arr != null) {
            int[] arrWithoutMin = new int[ZERO];
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] != findMin(arr)) {
                    arrWithoutMin = add(arrWithoutMin, arr[i]);
                }
            }
            return arrWithoutMin;
        }
        return null;
    }

    private static int findMin(int[] arr) {
        if (arr != null) {
            int min = arr[ZERO];
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
        return INVALID_VALUE;
    }

    private static int[] add(int[] arr, int number) {
        if (arr != null) {
            arr = Arrays.copyOf(arr, arr.length + OFFSET);
            arr[arr.length - OFFSET] = number;
            return arr;
        }
        return new int[]{};
    }
}
