//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package arrays.decomposition;

public class Task11 {
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int DIGIT_NUMBER = 10;
    public static final int FIRST = 102;
    public static final int SECOND = 10223;


    public static void main(String[] args) {

        System.out.println(biggestDigitsNumber(FIRST, SECOND));
    }

    public static String biggestDigitsNumber(int firstNumber, int secondNumber) {
        int firstDigitsNumber = digitNumber(digitFragmetation(firstNumber));
        int secondDigitsNumber = digitNumber(digitFragmetation(secondNumber));
        if (firstDigitsNumber == secondDigitsNumber){
            return "The same number";
        }
        if (firstDigitsNumber > secondDigitsNumber){
            return "First number bigger";
        } else {
            return "Second number bigger";
        }
    }

    private static boolean[] digitFragmetation(int number) {
        number = Math.abs(number);
        boolean[] digits = new boolean[DIGIT_NUMBER];
        if (number == ZERO) {
            digits[number] = true;
        }
        while (number != ZERO) {
            digits[number % DIGIT_NUMBER] = true;
            number /= DIGIT_NUMBER;
        }
        return digits;
    }

    private static int digitNumber(boolean[] digits) {
        if (digits != null) {
            int number = ZERO;
            for (boolean i : digits) {
                if (i) {
                    number++;
                }
            }
            return number;
        }
        return WRONG_VALUE;
    }

}
