//2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;


public class Task2 {
    public static final int START = 0;
    public static final int INVALID_POSITION_RETURN_VALUE = -1;
    public static final double[] INVALID_ARRAY_RETURN_VALUE = null;


    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();
        double z = Input.nextInt("Enter Z: ");

        System.out.println(replaceNumbersBiggerZReturnReplaceNumber(arr, z));
    }

    private static double[] replaceNumbersBiggerZReturnArr(double[] arr, double zNumber) {
        if (arr != null) {
            int replaceNumber = START;
            for (int i = START; i < arr.length; i++) {
                if (arr[i] > zNumber) {
                    arr[i] = zNumber;
                }
            }
            return arr;
        } else return INVALID_ARRAY_RETURN_VALUE;
    }

    private static int replaceNumbersBiggerZReturnReplaceNumber(double[] arr, double zNumber) {
        if (arr != null) {
            int replaceNumber = START;
            for (int i = START; i < arr.length; i++) {
                if (arr[i] > zNumber) {
                    arr[i] = zNumber;
                    replaceNumber++;
                }
            }
            return replaceNumber;
        } else return INVALID_POSITION_RETURN_VALUE;
    }

    private static int findReplaceNumber(double[] arr, double[] replaceArr) {
        if (arr != null && replaceArr != null) {
            int replaceNumber = START;
            for (int i = START; i < arr.length; i++) {
                if (arr[i] != replaceArr[i]) {
                    replaceNumber++;
                }
            }
            return replaceNumber;
        } else return INVALID_POSITION_RETURN_VALUE;
    }
}


