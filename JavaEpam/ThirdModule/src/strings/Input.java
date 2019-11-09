package strings;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static char[] nextCharArray(String text) {
        System.out.println(text);
        String s = scanner.nextLine();
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
        return str;
    }
}
