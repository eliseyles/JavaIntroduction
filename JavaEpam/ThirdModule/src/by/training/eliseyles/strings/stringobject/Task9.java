//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task9 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final char FIRST_LOWERCASE_LETTER = 'a';
    private static final char LAST_LOWERCASE_LETTER = 'z';
    private static final char FIRST_UPPERCASE_LETTER = 'A';
    private static final char LAST_UPPERCASE_LETTER = 'Z';


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println("Lowercase count " + countLowercaseEnglishLetters(string));
        System.out.println("Uppercase count " + countUppercaseEnglishLetters(string));
    }

    public static int countLowercaseEnglishLetters(String string) {
        if (string != null) {
            int count = ZERO;
            for (int i = ZERO; i < string.length(); i++) {
                if (string.charAt(i) >= FIRST_LOWERCASE_LETTER && string.charAt(i) <= LAST_LOWERCASE_LETTER) {
                    count++;
                }
            }
            return count;
        }
        return WRONG_VALUE;
    }

    public static int countUppercaseEnglishLetters(String string) {
        if (string != null) {
            int count = ZERO;
            for (int i = ZERO; i < string.length(); i++) {
                if (string.charAt(i) >= FIRST_UPPERCASE_LETTER && string.charAt(i) <= LAST_UPPERCASE_LETTER) {
                    count++;
                }
            }
            return count;
        }
        return WRONG_VALUE;
    }
}
