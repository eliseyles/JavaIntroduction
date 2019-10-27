package arrays.onedimesional;

import util.Input;

public class Task3 {
    public static final int ZERO = 0;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();

        System.out.println("Count positive numbers = " + countPositive(arr));
        System.out.println("Count negative numbers = " + countNegative(arr));
        System.out.println("Count zeros = " + countZero(arr));
    }

    private static int countNegative(double[] arr) {
        int count = ZERO;
        for (int i = ZERO; i < arr.length; i++) {
            if (arr[i] < ZERO) {
                count++;
            }
        }
        return count;
    }

    private static int countZero(double[] arr) {
        int count = ZERO;
        for (int i = ZERO; i < arr.length; i++) {
            if (arr[i] == ZERO) {
                count++;
            }
        }
        return count;
    }

    private static int countPositive(double[] arr) {
        int count = ZERO;
        for (int i = ZERO; i < arr.length; i++) {
            if (arr[i] > ZERO) {
                count++;
            }
        }
        return count;
    }
}
