//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

package by.training.eliseyles.arrays.decomposition;

import by.training.eliseyles.util.Output;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int OFFSET = 1;
    public static final int NUMBER_SYSTEM = 10;

    public static final int NUMBER = 1045;
    public static final int ARRAY_LENGTH = 10;


    public static void main(String[] args) {
        Output.displayIntArray(fillArrWithNumberDigits(NUMBER, ARRAY_LENGTH));
    }

    public static int[] fillArrWithNumberDigits(int number, int length) {
        if (length > 0) {
            int[] digits = digitFragmetation(number);
            int[] arr = new int[length];
            for (int i = ZERO; i < arr.length; i++) {
                arr[i] = digits[new Random().nextInt(digits.length)];
            }
            return arr;
        }
        return new int[]{};
    }

    private static int[] add(int[] arr, int element) {
        arr = Arrays.copyOf(arr, arr.length + OFFSET);
        arr[arr.length - OFFSET] = element;
        return arr;
    }

    private static int[] digitFragmetation(int number) {
        int num = Math.abs(number);
        int[] digits = new int[ZERO];
        while (num != ZERO) {
            digits = add(digits, num % NUMBER_SYSTEM);
            num /= NUMBER_SYSTEM;
        }
        return digits;
    }
}
