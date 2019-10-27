package linearalgo;

import java.util.Scanner;

public class SecondTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.printf("result = %f", calculateFunction(a, b, c));
    }

    private static double calculateFunction(double a, double b, double c) {
        if (a != 0) {
            return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))-
                    Math.pow(a, 3) * c + Math.pow(b, -2);
        } else {
            return Double.MAX_VALUE;
        }
    }
}