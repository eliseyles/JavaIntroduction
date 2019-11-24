//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

package by.training.eliseyles.arrays.decomposition;

import by.training.eliseyles.util.Output;

import java.util.Arrays;

public class Task12 {
    public static final int ZERO = 0;
    public static final int NUMBER_SYSTEM = 10;
    public static final int OFFSET = 1;


    public static void main(String[] args) {
        Output.displayIntArray(findAllNumbers(3, 24));
    }

    public static int[] findAllNumbers(int k, int n) {
        int[] numbers = new int[ZERO];
        for (int i = ZERO; i < n; i++) {
            if (digitSum(i) == k) {
                numbers = add(numbers, i);
            }
        }
        return numbers;
    }

    private static int[] add(int[] arr, int element) {
        arr = Arrays.copyOf(arr, arr.length + OFFSET);
        arr[arr.length - OFFSET] = element;
        return arr;
    }

    private static int digitSum(int number) {
        number = Math.abs(number);
        int sum = ZERO;
        while (number != ZERO) {
            sum += number % NUMBER_SYSTEM;
            number /= NUMBER_SYSTEM;
        }
        return sum;
    }
}
