//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию

package by.training.eliseyles.arrays.decomposition;

public class Task13 {
    public static final int ZERO = 0;
    public static final int SHIFT = 2;
    public static final int OFFSET = 1;
    public static final String WRONG_VALUE = "Wrong value";
    public static final int PLAIN_DIVIDERS_NUMBER = 2;
    public static final int FIRST_NON_PLAIN_DIVIDER = 2;
    public static final int DIVIDERS_NUMBER = 2;


    public static void main(String[] args) {
        findPlainTwins(3);;
    }

    public static void findPlainTwins(int n) {
        if (n > 2) {
            for (int i = n; i < 2 * n - OFFSET; i ++) {
                if(isPlain(i) && isPlain(i + SHIFT)) {
                    System.out.println(i + " " + (i + SHIFT));
                }
            }
        }else {
            System.out.println(WRONG_VALUE);
        }
    }

    private static boolean isPlain(int number) {
        int dividerNUmber = PLAIN_DIVIDERS_NUMBER;
        for (int i = FIRST_NON_PLAIN_DIVIDER; i < Math.sqrt(number); i++) {
            if (number % i == ZERO) {
                dividerNUmber += DIVIDERS_NUMBER;
            }
        }
        return dividerNUmber == PLAIN_DIVIDERS_NUMBER;
    }
}
