//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

package branches;

import java.util.Scanner;

public class Task1 {
    private static Scanner scan = new Scanner(System.in);
    private static final int ZERO = 0;
    private static final int RIGHT_ANGLE = 90;
    private static final int STRAIGHT_ANGLE = 180;

    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.printf("Is triangle exist? = %b\n", isExist(a, b));
        if (isExist(a, b)) System.out.printf("Is triangle right? = %b", isRight(a, b));

    }

    private static boolean isExist(double a, double b) {
        if (a > ZERO && b > ZERO) {
            return a + b < STRAIGHT_ANGLE;
        }
        return false;
    }

    private static boolean isRight(double a, double b) {
        if (a > ZERO && b > ZERO) {
            return a + b == RIGHT_ANGLE || a == RIGHT_ANGLE || b == RIGHT_ANGLE;
        }
        return false;
    }
}
