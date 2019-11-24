package by.training.eliseyles.util;

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
            for (int[] i : arr) {
                displayIntArray(i);
            }
            System.out.println();
        } else
            System.out.println(WRONG_MATRIX);
    }

    public static void displayDoubleMatrix(double[][] arr) {
        if (arr != null) {
            for (double[] i : arr) {
                displayDoubleArray(i);
            }
            System.out.println();
        } else
            System.out.println(WRONG_MATRIX);
    }

    public static void displayFractions(int[] num, int[] den) {
        for (int i = START; i < num.length; i++) {
            System.out.print(num[i] + "/" + den[i] + " ");
        }
        System.out.println();
    }
}
