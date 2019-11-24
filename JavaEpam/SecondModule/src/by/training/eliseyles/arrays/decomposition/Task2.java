//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

package by.training.eliseyles.arrays.decomposition;

public class Task2 {

    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int FIRST_NUMBER = 15;
    public static final int SECOND_NUMBER = 25;
    public static final int THIRD_NUMBER = 5;
    public static final int FOURTH_NUMBER = 250;


    public static void main(String[] args) {
        System.out.println(MCDFourNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER));

    }

    public static int MCDFourNumbers(int first, int second, int third, int fourth) {
        if (first > ZERO && second > ZERO && third > ZERO && fourth > ZERO) {
            return MCD(MCD(first, second), MCD(third, fourth));
        }
        return WRONG_VALUE;
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
