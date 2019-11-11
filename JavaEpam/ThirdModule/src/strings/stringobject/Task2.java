//2. В строке вставить после каждого символа 'a' символ 'b'.

package strings.stringobject;

import strings.util.Input;

public class Task2 {
    private static final int ZERO = 0;
    private static final String WRONG_VALUE = "";
    private static final char CHAR_BEFORE = 'a';
    private static final char CHAR_AFTER = 'b';


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(insertBeforeConst(string, CHAR_BEFORE, CHAR_AFTER));
    }

    public static String insertBeforeConst(String string, char charBefore, char charAfter) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = ZERO; i < string.length(); i++) {
                stringBuilder.append(string.charAt(i));
                if (string.charAt(i) == charBefore) {
                    stringBuilder.append(charAfter);
                }
            }
            return stringBuilder.toString();
        }
        return WRONG_VALUE;
    }
}
