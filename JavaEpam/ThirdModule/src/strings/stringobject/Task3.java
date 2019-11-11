//3. Проверить, является ли заданное слово палиндромом.

package strings.stringobject;

import strings.util.Input;

public class Task3 {
    private static final int ZERO = 0;
    private static final int HALF = 2;
    private static final int OFFSET = 1;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter palindrome string: ");
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        if (string != null) {
            boolean isPalindrome = true;
            for (int i = ZERO; i < string.length() / HALF; i++) {
                if (string.charAt(i) != string.charAt(string.length() - i - OFFSET)) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        }
        return false;
    }
}
