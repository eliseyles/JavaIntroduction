//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

package linearalgo;

import java.util.Scanner;

public class Task1 {
    private static Scanner scan = new Scanner(System.in);

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
