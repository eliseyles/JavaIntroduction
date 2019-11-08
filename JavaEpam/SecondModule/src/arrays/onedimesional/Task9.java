//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

package arrays.onedimesional;

import util.Input;
import util.Output;

import java.util.Arrays;

public class Task9 {
    public static final int INVALID_VALUE = Integer.MIN_VALUE;
    public static final int INVALID_INDEX = -1;
    public static final int ZERO = 0;
    private static int[][] numbersCount = new int[2][0];
    private static final int NUMBER_ROW = 0;
    private static final int COUNT_ROW = 1;
    private static final int OFFSET = 1;


    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(10, -10, 20);
        Output.displayIntArray(arr);
        System.out.println(findMaxOccurranceNumber(arr));

//        System.out.println(makeArrWithoutMin(arr));
    }

    public static int findMaxOccurranceNumber(int[] arr) {
        if (arr != null) {
            filling(arr);
            return findMaxMinNumber();
        }
        return INVALID_VALUE;
    }

    private static boolean filling(int[] arr) {
        if (arr != null) {
            for (int i = ZERO; i < arr.length; i++) {
                if (indexOf(arr[i]) != -1) {
                    increase(arr[i]);
                } else {
                    add(arr[i]);
                }
            }
        }
        return arr != null;
    }

    private static int indexOf(int number) {
        for (int i = ZERO; i < numbersCount[NUMBER_ROW].length; i++) {
            if (numbersCount[NUMBER_ROW][i] == number) {
                return i;
            }
        }
        return INVALID_INDEX;
    }

    private static void increase(int number) {
        for (int i = ZERO; i < numbersCount[NUMBER_ROW].length; i++) {
            if(number == numbersCount[NUMBER_ROW][i]) {
                numbersCount[COUNT_ROW][i]++;
            }
        }
    }

    private static void add(int number) {
        numbersCount[NUMBER_ROW] = Arrays.copyOf(numbersCount[NUMBER_ROW],
                numbersCount[NUMBER_ROW].length + OFFSET);
        numbersCount[COUNT_ROW] = Arrays.copyOf(numbersCount[COUNT_ROW],
                numbersCount[COUNT_ROW].length + OFFSET);
        numbersCount[NUMBER_ROW][numbersCount[NUMBER_ROW].length - OFFSET] = number;
        numbersCount[COUNT_ROW][numbersCount[COUNT_ROW].length - OFFSET]++;

    }

    private static int findMaxMinNumber() {
        int maxCount = numbersCount[COUNT_ROW][ZERO];
        int maxNumber = numbersCount[NUMBER_ROW][ZERO];
        for (int i = ZERO; i < numbersCount[COUNT_ROW].length; i++) {
            if (numbersCount[COUNT_ROW][i] > maxCount) {
                maxCount = numbersCount[COUNT_ROW][i];
                maxNumber = numbersCount[NUMBER_ROW][i];
            }
            if (numbersCount[COUNT_ROW][i] == maxCount && numbersCount[NUMBER_ROW][i] < maxNumber) {
                maxNumber = numbersCount[NUMBER_ROW][i];
            }
        }
        return maxNumber;
    }
}
