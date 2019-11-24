//5. Сортировка вставками. Дана последовательность чисел
//n a ,a , ,a 1 2 
//. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//a a ai
//, , , 1 2  - упорядоченная последовательность, т. е.
//a1  a2  an
//. Берется следующее число
//i+1 a
//и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task5 {

    private static final int ZERO = 0;
    private static final int OFFSET = 1;
    private static final int HALF = 2;

    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(10, -10, 10);

        Output.displayIntArray(arr);
        Output.displayIntArray(insertSort(arr));
    }

    private static int[] insertSort(int[] arr) {
        if (arr != null) {
            for (int i = 1; i < arr.length; i++) {
                int curElement = arr[i];
                int insertionPos = binarySearch(arr, i, curElement);
                if (arr[insertionPos] < curElement) {
                    insertionPos++;
                }
                arr = shift(arr, i - OFFSET, insertionPos);
                arr[insertionPos] = curElement;
            }
            return arr;
        }
        return new int[]{};
    }

    private static int[] shift(int[] arr,int from, int to) {
        if (arr != null) {
            for (int k = from; k >= to; k--) {
                arr[k + 1] = arr[k];
            }
            return arr;
        }
        return new int[]{};
    }

    private static int binarySearch(int[] array, int endBound, int value) {
        int startBound = ZERO;
        while (endBound - startBound >= HALF) {
            int middle = (startBound + endBound) / HALF;
            if (array[middle] > value) {
                endBound = middle;
            } else {
                startBound = middle;
            }
        }
        return startBound;
    }
}

