//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

package arrays.decomposition;

import util.Output;

import java.util.Arrays;

public class Task16 {
    public static final int ZERO = 0;
    public static final int LENGTH = 1;
    public static final int OFFSET = 1;
    public static final int NUMBER_SYSTEM = 10;
    public static final int WRONG_VALUE = -1;


    public static void main(String[] args) {
        System.out.println(findNumbersSum(LENGTH));
        System.out.println(findEvenDigitsNumber(findNumbersSum(LENGTH)));
    }

    public static int findNumbersSum(int n) {
        if (n > ZERO) {
            int oddDigitsNumbersSum = ZERO;
            for (int i = (int) Math.pow(NUMBER_SYSTEM, n - OFFSET); i < (int) Math.pow(NUMBER_SYSTEM, n); i++) {
                if (isOddDigits(i)) {
                    oddDigitsNumbersSum += i;
                }
            }
            return oddDigitsNumbersSum;
        }
        return WRONG_VALUE;
    }

    private static boolean isOddDigits(int number) {
        boolean result = false;
        if (number > ZERO) {
            result = true;
            int num = Math.abs(number);
            while (num != ZERO) {
                if ((num % NUMBER_SYSTEM) % 2 == 0) {
                    result = false;
                    break;
                }
                num /= NUMBER_SYSTEM;
            }
        }
        return result;
    }

    public static int findEvenDigitsNumber(int number) {
        if (number > ZERO) {
            int count = ZERO;
            int num = Math.abs(number);
            while (num != ZERO) {
                if ((num % NUMBER_SYSTEM) % 2 == 0) {
                    count++;
                }
                num /= NUMBER_SYSTEM;
            }
            return count;
        }
        return WRONG_VALUE;
    }
}



