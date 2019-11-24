//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

package by.training.eliseyles.arrays.decomposition;

public class Task1 {

    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int FIRST_NUMBER = 15;
    public static final int SECOND_NUMBER = 25;

    public static void main(String[] args) {
        System.out.println(LCMTwoNumbers(FIRST_NUMBER, SECOND_NUMBER));

    }

    public static int LCMTwoNumbers(int firstNumber, int secondNumber) {
        int mcd = GCF(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / mcd;
    }

    private static int GCF(int firstNumber, int secondNumber) {
        if (firstNumber != ZERO && secondNumber != ZERO) {
            firstNumber = Math.abs(firstNumber);
            secondNumber = Math.abs(secondNumber);
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
