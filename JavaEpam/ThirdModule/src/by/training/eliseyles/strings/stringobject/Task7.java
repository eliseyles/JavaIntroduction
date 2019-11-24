//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task7 {
    private static final int ZERO = 0;
    private static final String WRONG_VALUE = "";
    private static final int INDEX_NON_INSIDE = -1;
    private static final char SPACE = ' ';
    private static final int OFFSET = 1;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(reduceDoublingAndSpaces(string));
    }

    public static String reduceDoublingAndSpaces(String string) {
        if (string != null) {
            string = reduceAllSpaces(string);
            string = reduceDoubling(string);
            return string;
        }
        return WRONG_VALUE;
    }

    private static String reduceAllSpaces(String string) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = ZERO; i < string.length(); i++) {
                if (string.charAt(i) != SPACE) {
                    stringBuilder.append(string.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
        return WRONG_VALUE;
    }

    private static String reduceDoubling(String string) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = ZERO; i < string.length(); i++) {
                if (stringBuilder.indexOf(string.substring(i, i + OFFSET)) == INDEX_NON_INSIDE) {
                    stringBuilder.append(string.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
        return WRONG_VALUE;
    }
}
