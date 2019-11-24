//3. Сортировка выбором. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Output;

public class Task3 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int EVEN = 2;


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 17, 44, 77, 95, 99};

        Output.displayIntArray(selectionSort(arr));
    }

    public static int[] selectionSort(int[] arr) {
        if (arr != null) {
            for (int i = ZERO_INDEX; i < arr.length / EVEN; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-i-OFFSET];
                arr[arr.length-i-OFFSET] = temp;
            }
            return arr;
        }
        return new int[]{};
    }
}
