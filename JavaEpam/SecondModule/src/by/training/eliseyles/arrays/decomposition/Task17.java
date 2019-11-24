//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

package by.training.eliseyles.arrays.decomposition;

public class Task17 {
    public static final int ZERO = 0;
    public static final int NUMBER = 103;
    public static final int OFFSET = 1;
    public static final int NUMBER_SYSTEM = 10;
    public static final int WRONG_VALUE = -1;


    public static void main(String[] args) {
        System.out.println(findSubtractionNumber(NUMBER));
    }

    public static int findSubtractionNumber(int number) {
        if (number >= ZERO) {
            int count = ZERO;
            while (number != ZERO) {
                count++;
                number -= digitSum(number);
            }
            return count;
        }
        return WRONG_VALUE;
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
