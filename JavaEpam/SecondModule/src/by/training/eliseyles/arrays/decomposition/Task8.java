//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

package by.training.eliseyles.arrays.decomposition;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task8 {
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = Integer.MIN_VALUE;
    public static final int ADDITIONAL_ELEM_NUMBER = 2;
    public static final int OFFSET = 1;
    public static final int POSITION = 1;


    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(10, -10, 20);
        Output.displayIntArray(arr);
        System.out.println(findSumThreeElements(arr, POSITION));
    }

    public static int findSumThreeElements(int[] arr, int position) {
        if (arr != null && position < arr.length - ADDITIONAL_ELEM_NUMBER) {
            return arr[position] + arr[position + OFFSET] + arr[position + OFFSET + OFFSET];
        }
        return WRONG_VALUE;
    }
}
