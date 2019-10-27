package loops;

import java.util.Scanner;

public class SixthTask {
    private static Scanner scan = new Scanner(System.in);
    private static final int START = 0;
    private static final int END = 65536;

    public static void main(String[] args) {
        for (int i = START; i < END; i++) {
            System.out.printf("%3d %c\n", i, (char) i);
        }
    }
}
