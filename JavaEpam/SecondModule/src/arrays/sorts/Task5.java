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

package arrays.sorts;

import util.Input;
import util.Output;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
//        int[] arr = Input.nextIntArray();
        int[] arr = Input.randomIntArrayFilling(10, -10, 20);

        Output.displayIntArray(arr);
        Output.displayIntArray(insertSort1(arr));
//        System.out.println(insertSort(arr));
    }

    public static int[] shift(int[] arr, int start, int end) {
        int el = arr[end + 1];
        for (int i = end; i > start + 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[start] = el;
        return arr;
    }

    public static int[] insertSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int l = 0;
            int r = i-1;
            if (l < r) {
                while (l < r) {
                    int mid = l + (r - l) / 2;
                    if (el < arr[mid]) {
                        r = mid;
                    } else {
                        l = mid + 1;
                    }
                }
                for (int j = i; j < l + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[l] = el;
            }

        }
        return arr;
    }

    public static int[] insertSort(int[] arr) {
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

        }
        for (int i = 1; i < arr.length; i++) {
            int position = binarySearch(arr, i);
            if (position != i) {
                arr = shift(arr, position , i);
            }
//            System.out.println(i + " " + position);
            Output.displayIntArray(arr);

        }
        return arr;
    }

    public static int binarySearch(int[] arr, int sortEnd) {
        int left = 0;
        int right = sortEnd;
        while (left < right) {
            int mid = left + (left + right) / 2;
            if (arr[sortEnd + 1] > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

