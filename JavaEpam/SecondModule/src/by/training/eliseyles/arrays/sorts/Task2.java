//2. Даны две последовательности
//a1  a2  an и b1  b2  bm
//. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Output;

import java.util.Arrays;

public class Task2 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int EVEN = 2;


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {0, 2, 2, 6, 99};
        Output.displayIntArray(mergeSort(arr1, arr2));
//        Output.displayIntArray(selectionSort(arr));
    }

    public static int[] mergeSort(int[] firstArr, int[] secondArr) {
        if (firstArr != null && secondArr != null) {
            firstArr = makeNewArr(firstArr, firstArr.length + secondArr.length);
            int i = ZERO_INDEX;
            int j = ZERO_INDEX;
            while (i < secondArr.length && j < firstArr.length) {
                if (secondArr[i] < firstArr[j]) {
                    firstArr = shift(firstArr, j);
                    firstArr[j] = secondArr[i];
                    i++;
                } else {
                    j++;
                }
            }
            return firstArr;
        }
        return new int[]{};
    }

    private static int[] shift(int[] arr, int position) {
        if (arr != null) {
            for (int i = arr.length - OFFSET; i > position; i--) {
                arr[i] = arr[i - OFFSET];
            }
            return arr;
        }
        return new int[]{};
    }
    private static int[] makeNewArr(int[] arr, int newSize) {
        if (arr != null) {
            int size = arr.length;
            arr = Arrays.copyOf(arr, newSize);
            for (int i = size; i < newSize; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
            return arr;
        }
        return new int[]{};
    }

}
