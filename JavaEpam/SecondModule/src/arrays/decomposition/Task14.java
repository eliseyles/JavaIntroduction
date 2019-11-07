//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

package arrays.decomposition;

import util.Output;

import java.util.Arrays;

public class Task14 {

    public static final int ZERO = 0;
    public static final int BOUND = 1000;
    public static final int OFFSET = 1;
    public static final int NUMBER_SYSTEM = 10;


    public static void main(String[] args) {
        Output.displayIntArray(findArmstrongNumbers(BOUND));
    }

    public static int[] findArmstrongNumbers(int k) {
        if (k > ZERO) {
            int[] armstrongNumbers = new int[ZERO];
            for (int i = ZERO; i <= k; i++) {
                if (isArmstrong(i)) {
                    armstrongNumbers = add(armstrongNumbers, i);
                }
            }
            return armstrongNumbers;
        }
        return new int[]{};
    }

    private static boolean isArmstrong(int number) {
        int digitSum = ZERO;
        int[] digits = digitFragmetation(number);
        for (int i = ZERO; i < digits.length; i++) {
            digitSum += Math.pow(digits[i], digits.length);
        }

        return number == digitSum;
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
