//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

package arrays.decomposition;

public class Task1 {

    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int FIRST_NUMBER = 15;
    public static final int SECOND_NUMBER = 25;

    public static void main(String[] args) {
        System.out.println(LCMTwoNumbers(FIRST_NUMBER, SECOND_NUMBER));

    }

    public static int LCMTwoNumbers(int firstNumber, int secondNumber) {
        int mcd = MCD(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / mcd;
    }

    private static int MCD(int firstNumber, int secondNumber) {
        if (firstNumber != ZERO && secondNumber != ZERO) {
            while (firstNumber != ZERO && secondNumber != ZERO) {
                if (firstNumber > secondNumber) {
                    firstNumber %= secondNumber;
                } else {
                    secondNumber %= firstNumber;
                }
            }
            if (firstNumber > ZERO) {
                return firstNumber;
            } else {
                return secondNumber;
            }
        }
        return WRONG_VALUE;
    }
}
