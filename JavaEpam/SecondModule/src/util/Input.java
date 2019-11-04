package util;

import java.util.Random;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int START = 0;

    public static int nextInt(String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    public static double[] nextDoubleArray() {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        for (int i = START; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }


    public static int[] nextIntArray() {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = START; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static double[][] nextDoubleMatrix() {
        System.out.println("Enter row number: ");
        int row = scanner.nextInt();
        System.out.println("Enter column number: ");
        int column = scanner.nextInt();
        double[][] arr = new double[row][column];
        for (int i = START; i < row; i++) {
            for (int j = START; j < column; j++) {
                System.out.println("Enter element: ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        return arr;
    }

    public static int[][] nextIntMatrix() {
        System.out.println("Enter row number: ");
        int row = scanner.nextInt();
        System.out.println("Enter column number: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = START; i < row; i++) {
            for (int j = START; j < column; j++) {
                System.out.println("Enter element: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int[][] nextIntSquareMatrix() {
        System.out.println("Enter row and column number: ");
        int row = scanner.nextInt();

        int[][] arr = new int[row][row];
        for (int i = START; i < row; i++) {
            for (int j = START; j < row; j++) {
                System.out.println("Enter element: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int[][] randomIntMatrixFilling(int row, int column, int lowBound, int highBound) {
        int[][] matrix = new int[row][column];
        for (int i = START; i < matrix.length; i++) {
            for (int j = START; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(highBound + Math.abs(lowBound)) + lowBound;
            }
        }
        return matrix;
    }

    public static int[] randomIntArrayFilling(int size, int lowBound, int highBound) {
        int[] arr = new int[size];
        for (int i = START; i < arr.length; i++) {
            arr[i] = new Random().nextInt(highBound + Math.abs(lowBound)) + lowBound;
        }
        return arr;
    }

    public static int[][] nextFractionArray() {
        System.out.println("Enter fraction number: ");
        int row = scanner.nextInt();

        int[][] arr = new int[row][2];

        for (int i = START; i < row; i++) {
            System.out.println("Enter numerator: ");
            arr[i][0] = scanner.nextInt();
            System.out.println("Enter denominator: ");
            arr[i][1] = scanner.nextInt();
        }

        return arr;
    }
}
