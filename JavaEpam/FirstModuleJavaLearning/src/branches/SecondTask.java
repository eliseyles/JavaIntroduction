package branches;

import java.util.Scanner;

//TODO add eps to comparison double

public class SecondTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.printf("Max = %d", max(min(a, b), min(c, d)));
    }

    private static int min(int a, int b) {
        if (a < b) {
        return a;
        } else {
            return b;
        }
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
