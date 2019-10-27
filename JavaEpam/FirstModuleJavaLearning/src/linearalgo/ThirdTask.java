package linearalgo;

import java.util.Scanner;

public class ThirdTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.printf("result = %f", calculateFunction(x, y));
    }

    private static double calculateFunction(double x, double y) {
        if (Math.cos(x) - Math.sin(y) != 0) {
            return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        } else {
            return Double.MAX_VALUE;
        }
    }
}
