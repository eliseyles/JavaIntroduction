package loops;

import java.util.Scanner;

public class FifthTask {
    private static Scanner scan = new Scanner(System.in);
    private static final int START = 0;

    public static void main(String[] args) {
        double e = scan.nextDouble();
        System.out.printf("sum of elements bigger then %f = %f", e, sumBigger(e));
    }

    private static double sumBigger(double e) {
        double sum = 0;
        int n = START;
        while (Math.abs(elementValue(n)) >= e) {
            sum += elementValue(n);
            System.out.printf("%d %f", n, elementValue(n));
            n++;
        }
        return sum;
    }

    private static double elementValue(int n) {
        return (1/Math.pow(2, n))+(1/Math.pow(3, n));
    }
}
