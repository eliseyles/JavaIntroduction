//6. Из заданной строки получить новую, повторив каждый символ дважды.

package strings.stringobject;

import strings.util.Input;

public class Task6 {
    private static final int ZERO = 0;
    private static final char LETTER = 'a';
    private static final String WRONG_VALUE = "";
    private static final int OFFSET = 1;
    private static final int DOUBLE = 2;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(doubleEachSymbol(string));
    }

    public static String doubleEachSymbol(String string) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = ZERO; i < string.length(); i++) {
                for (int k = ZERO; k < DOUBLE; k++) {
                    stringBuilder.append(string.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
        return WRONG_VALUE;
    }
}
