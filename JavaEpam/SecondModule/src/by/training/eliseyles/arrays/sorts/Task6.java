//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента
//ai и ai+1
//. Если
//ai  ai+1
//, то продвигаются
//на один элемент вперед. Если
//ai  ai+1
//, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task6 {
    private static final int ZERO = 0;
    private static final int HALF = 2;
    private static final int OFFSET = 1;
    private static final int MIN_BOUND = -10;
    private static final int MAX_BOUND = 10;
    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(SIZE, MIN_BOUND, MAX_BOUND);
        Output.displayIntArray(arr);
        Output.displayIntArray(sort(arr));
    }

    private static int[] sort (int[] arr)
    {
        if(arr != null) {
            for (int inc = arr.length / HALF; inc >= OFFSET; inc = inc / HALF) {
                for (int step = ZERO; step < inc; step++) {
                    arr = insertionSort(arr, step, inc);
                }
            }
            return arr;
        }
        return new int[]{};
    }

    private static int[] insertionSort (int[] arr, int start, int inc)
    {
        if (arr != null) {
            for (int i = start; i < arr.length - OFFSET; i += inc) {
                for (int j = Math.min(i + inc, arr.length - 1); j - inc >= ZERO; j = j - inc) {
                    if (arr[j - inc] > arr[j]) {
                        int tmp = arr[j];
                        arr[j] = arr[j - inc];
                        arr[j - inc] = tmp;
                    } else break;
                }
            }
            return arr;
        }
        return new int[]{};
    }
}
