package strings.util;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);
    private static final int ZERO = 0;


    public static char[] nextCharArray(String text) {
        System.out.println(text);
        String s = scanner.nextLine();
        char[] str = new char[s.length()];
        for (int i = ZERO; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
        return str;
    }

    public static String nextLine(String text) {
        System.out.println(text);
        String s = scanner.nextLine();
        return s;
    }
}
