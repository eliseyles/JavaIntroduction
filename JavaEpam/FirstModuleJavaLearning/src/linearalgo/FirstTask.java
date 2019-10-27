package linearalgo;

import java.util.Scanner;

public class FirstTask {
    private static Scanner scan = new Scanner(System.in);
//    static {
//        scan = new Scanner(System.in);
//    }
    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.printf("result = %f", calculateFunction(a, b, c));
    }

    private static double calculateFunction(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
