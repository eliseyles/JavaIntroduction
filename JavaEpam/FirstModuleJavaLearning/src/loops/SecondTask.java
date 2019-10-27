package loops;

import java.util.Scanner;

public class SecondTask {
    private static Scanner scan = new Scanner(System.in);
    private static final int BORDER = 2;

    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        for (double i = a; i <= b; i += h) {
            System.out.printf("y(%.3f) = %.3f\n", i, calculatingFunc(i));
        }
    }

    private static double calculatingFunc(double x) {
        if (x > BORDER) {
            return x;
        } else {
            return -x;
        }
    }
}
