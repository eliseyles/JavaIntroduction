//6. Из заданной строки получить новую, повторив каждый символ дважды.

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task6 {
    private static final int ZERO = 0;
    private static final String WRONG_VALUE = "";
    private static final int DOUBLE = 2;
    private static final int OFFSET = 1;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(doubleEachSymbolAlgo(string));
        System.out.println(doubleEachSymbolFunc(string));
    }

    public static String doubleEachSymbolAlgo(String string) {
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

    public static String doubleEachSymbolFunc(String string) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder(string);
            for (int i = ZERO; i < string.length(); i++) {
                stringBuilder.insert(i * DOUBLE + OFFSET,  string.charAt(i));
            }
            return stringBuilder.toString();
        }
        return WRONG_VALUE;
    }
}
