package branches;

import java.util.Scanner;

public class FifthTask {
    private static Scanner scan = new Scanner(System.in);
    private static final int BORDER = 3;

    public static void main(String[] args) {
        double a = scan.nextDouble();
        System.out.printf("result = %f", calculatingFunc(a));
    }

    private static double calculatingFunc(double x) {
        if (x > BORDER) {
            return 1 / (Math.pow(x, 3) + 6);
        } else {
            return Math.pow(x, 2) - 3 * x + 9;
        }
    }
}
