package branches;

import java.util.Scanner;

public class FourthTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.printf("Will the brick pass through hole? = %b", isPass(a, b, x, y, z));
    }

    private static boolean isPass(int a, int b, int x, int y, int z) {
        return ((x < a && y < b) || (x < b && y < a)) ||
                ((y < a && z < b) || (y < b && z < a)) ||
                ((x < a && z < b) || (x < b && z < a));
    }
}
