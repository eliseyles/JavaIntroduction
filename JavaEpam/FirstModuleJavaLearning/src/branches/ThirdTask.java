package branches;

import java.util.Scanner;

public class ThirdTask {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Point A: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Point B: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Point C: ");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.printf("Is this points on one line? - %b", isOnOneLine(x1, y1, x2, y2, x3, y3));
    }

    private static boolean isOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) return true;
        else return false;
    }
}
