//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

package arrays.onedimesional;

import util.Input;

public class Task3 {
    public static final int START = 0;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();

        System.out.println("Count positive numbers = " + countPositive(arr));
        System.out.println("Count negative numbers = " + countNegative(arr));
        System.out.println("Count zeros = " + countZero(arr));
    }

    private static int countNegative(double[] arr) {
        int count = START;
        for (int i = START; i < arr.length; i++) {
            if (arr[i] < START) {
                count++;
            }
        }
        return count;
    }

    private static int countZero(double[] arr) {
        int count = START;
        for (int i = START; i < arr.length; i++) {
            if (arr[i] == START) {
                count++;
            }
        }
        return count;
    }

    private static int countPositive(double[] arr) {
        int count = START;
        for (int i = START; i < arr.length; i++) {
            if (arr[i] > START) {
                count++;
            }
        }
        return count;
    }
}
