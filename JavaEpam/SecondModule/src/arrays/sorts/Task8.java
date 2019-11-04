//8.Даны дроби
//n
//n
//q
//p
//q
//p
//q
//p
//, , ,
//2
//2
//1
//1 
//(
//pi qi
//, - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

package arrays.sorts;

import util.Input;
import util.Output;

public class Task8 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;


    public static void main(String[] args) {
//        int[] arr = Input.randomIntArrayFilling(10, -10, 20);
//        Output.displayIntArray(arr);
        System.out.println(LCMTwoNumbers(15, 25));
//        Output.displayIntArray(arr);

    }

//    private static int LCM(int[][] fractions) {
//        if (fractions != null) {
//            int mcd = MCD(fractions[0], secondNumber);
//            return (firstNumber * secondNumber) / mcd;
//        }
//    }

    private static int LCMTwoNumbers(int firstNumber, int secondNumber) {
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
