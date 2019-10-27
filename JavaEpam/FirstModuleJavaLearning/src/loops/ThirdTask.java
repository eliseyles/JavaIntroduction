package loops;

public class ThirdTask {
    private static final int BORDER = 100;

    public static void main(String[] args) {
        System.out.printf("sum of squares of the first %d numbers = %.0f", BORDER, squaresSum());
    }

    private static double squaresSum() {
        double sum = 0;
        for (int i = 0; i < BORDER; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
