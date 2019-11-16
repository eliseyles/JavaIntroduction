//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

package loops;

import java.math.BigInteger;

public class Task4 {
    private static final int BORDER = 200;

    public static void main(String[] args) {
        System.out.printf("production of squares of the first %d numbers = %s", BORDER, squaresProd().toString());
    }

    private static BigInteger squaresProd() {
        BigInteger prod = BigInteger.valueOf(1);
        BigInteger sub;
        for (int i = 1; i < BORDER; i++) {
            sub = BigInteger.valueOf((int) Math.pow(i, 2));
            prod = prod.multiply(sub);
        }
        return prod;
    }
}
