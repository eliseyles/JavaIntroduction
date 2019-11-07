//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

package arrays.decomposition;

import util.Output;

import java.util.Arrays;

public class Task15 {
    public static final int ZERO = 0;
    public static final int LENGTH = 3;
    public static final int OFFSET = 1;
    public static final int NUMBER_SYSTEM = 10;


    public static void main(String[] args) {
        Output.displayIntArray(findRisingNumbers(LENGTH));
    }

    public static int[] findRisingNumbers(int n) {
        if (n > ZERO) {
            int[] risingNumbers = new int[ZERO];
            for (int i = (int)Math.pow(NUMBER_SYSTEM, n - OFFSET); i < (int)Math.pow(NUMBER_SYSTEM, n); i++) {
                if (isRising(i)) {
                    risingNumbers = add(risingNumbers, i);
                }
            }
            return risingNumbers;
        }
        return new int[]{};
    }

    private static boolean isRising(int number) {
        int[] digits = digitFragmetation(number);
        boolean isRising = true;
        for (int i = ZERO; i < digits.length - OFFSET; i++) {
            if (digits[i] <= digits[i + OFFSET]){
                isRising = false;
                break;
            }
        }
        return isRising;
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
