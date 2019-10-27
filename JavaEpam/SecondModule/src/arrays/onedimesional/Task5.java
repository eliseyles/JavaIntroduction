package arrays.onedimesional;

import util.Input;

public class Task5 {

    public static final int ZERO = 0;
    public static final String WRONGVALUE = "Wrong array";

    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        printNumbersBiggerPosition(arr);
    }

    private static void printNumbersBiggerPosition(int[] arr) {
        if (arr != null) {
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] > i) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(WRONGVALUE);
    }

}
