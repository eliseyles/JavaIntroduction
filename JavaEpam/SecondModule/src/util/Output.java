package util;

public class Output {
    private static final int START = 0;
    public static final String WRONG_MATRIX = "Matrix is null";


    public static <T> void displayArray(T[] arr) {
        for (int i = START; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayDoubleArray(double[] arr) {
        for (int i = START; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayIntArray(int[] arr) {
        for (int i = START; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayIntMatrix(int[][] arr) {
        if (arr != null) {
            for (int[] i: arr) {
                displayIntArray(i);
            }
            System.out.println();
        }
        System.out.println(WRONG_MATRIX);
    }
}
