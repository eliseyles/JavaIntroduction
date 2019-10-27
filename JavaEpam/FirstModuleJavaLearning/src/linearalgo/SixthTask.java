package linearalgo;

import java.util.Scanner;

public class SixthTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scan.nextInt();
        double y = scan.nextInt();
        System.out.print(isInside(x, y));
    }

    private static boolean isInside(double x, double y) {
        return (x != 0 && y != -1) &&
                (x >= -4 && x <= 4 && y >= -3 && y <= 0) ||
                (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
}
