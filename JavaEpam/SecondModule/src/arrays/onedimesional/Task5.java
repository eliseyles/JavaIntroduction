//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package arrays.onedimesional;

import util.Input;

public class Task5 {

    public static final int START = 0;
    public static final String WRONG_VALUE = "Wrong array";

    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        printNumbersBiggerPosition(arr);
    }

    private static void printNumbersBiggerPosition(int[] arr) {
        if (arr != null) {
            for (int i = START; i < arr.length; i++) {
                if (arr[i] > i) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(WRONG_VALUE);
    }

}
