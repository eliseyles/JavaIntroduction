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

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task8 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    private static final int MIN_BOUND = 1;
    private static final int MAX_BOUND = 10;
    private static final int DEFAULT_COMMON_DENOMINATOR = 1;
    private static final int SIZE = 10;



    public static void main(String[] args) {
        int[] numerators = Input.randomIntArrayFilling(SIZE, MIN_BOUND, MAX_BOUND);
        int[] denominators = Input.randomIntArrayFillingNonZero(SIZE, MIN_BOUND, MAX_BOUND);
        Output.displayFractions(numerators, denominators);

        leadToCommonDenominator(numerators, denominators);
         Output.displayFractions(numerators, denominators);
         Output.displayFractions(numeratorsSort(numerators), denominators);
    }

    private static void leadToCommonDenominator(int[] numerators, int[]denominators) {
        int commonDenominator = findCommonDenominator(denominators);
        for (int i = ZERO_INDEX; i < numerators.length; i++) {
            numerators[i] = numerators[i] * (commonDenominator / denominators[i]);
            denominators[i] = commonDenominator;
        }
    }

    private static int findCommonDenominator(int[] denominators) {
        int commonDenominator = DEFAULT_COMMON_DENOMINATOR;
        for (int den : denominators) {
            commonDenominator = twoNumbersLCM(commonDenominator, den);
        }
        return commonDenominator;
    }


    private static int twoNumbersLCM(int firstNumber, int secondNumber) {
        int mcd = GCD(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / mcd;
    }

    private static int GCD(int firstNumber, int secondNumber) {
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

    private static int[] numeratorsSort(int[] num) {
        if (num != null){
            int replaceNumber = ZERO;
            for (int i = ZERO_INDEX; i < num.length; i++) {
                for (int j = ZERO_INDEX; j < num.length - OFFSET; j++) {
                    if (num[j] > num[j + OFFSET]) {
                        replaceNumber++;
                        int temp = num[j];
                        num[j] = num[j + OFFSET];
                        num[j + OFFSET] = temp;
                    }
                }
            }
            return num;
        }
        return new int[]{};
    }
}
