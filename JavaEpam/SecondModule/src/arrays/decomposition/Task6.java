//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

package arrays.decomposition;

import util.Input;
import util.Output;

public class Task6 {

    public static final int ZERO = 0;
    public static final int WRONG_VALUE = Integer.MIN_VALUE;


    public static void main(String[] args) {
        System.out.println(isMutuallySimple(-99, 17, -27));
    }

    public static boolean isMutuallySimple(int first, int second, int third) {
        return GCF(first, GCF(second, third)) == 1;
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
