package util;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int nextInt(String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    public static double[] nextDoubleArray() {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }


    public static int[] nextIntArray() {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(nextInt("fhdkjgh"));
    }

}
