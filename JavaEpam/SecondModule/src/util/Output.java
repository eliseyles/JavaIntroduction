package util;

public class Output {
    private static final int ZERO = 0;

    public static <T> void displayArray(T[] arr) {
        for (int i = ZERO; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayDoubleArray(double[] arr) {
        for (int i = ZERO; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
