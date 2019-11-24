//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

package by.training.eliseyles.arrays.decomposition;

public class Task7 {
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = Integer.MIN_VALUE;
    public static final int NUMBER = 9;


    public static void main(String[] args) {
        System.out.println(findOddNumberFactorialSum(NUMBER));
    }

    public static int findOddNumberFactorialSum(int number) {
        if (number > ZERO) {
            int sum = ZERO;
            for (int i = ZERO; i <= number; i++) {
                if (i % 2 != 0) {
                    sum += factorial(i);
                }
            }
            return sum;
        }
        return WRONG_VALUE;
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n -1);
    }
}
