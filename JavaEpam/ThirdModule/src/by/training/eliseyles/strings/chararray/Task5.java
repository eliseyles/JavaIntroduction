//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

package by.training.eliseyles.strings.chararray;

import by.training.eliseyles.strings.util.Input;

import java.util.Arrays;

public class Task5 {
    private static final int ZERO = 0;
    private static final int OFFSET = 1;
    private static final char SPACE = ' ';
    private static final char LAST_DIGIT = '9';


    public static void main(String[] args) {
        char[] str = Input.nextCharArray("Enter string with excess spaces: ");
        System.out.println(deleteAllExcessSpace(str));
    }

    public static char[] deleteAllExcessSpace(char[] str) {
        if (str != null) {
            str = deleteFirstSpaces(str);
            str = deleteLastSpaces(str);
            str = deleteExcessSpace(str);
            return str;
        }
        return new char[]{};
    }

    private static char[] deleteFirstSpaces(char[] str) {
        if (str != null) {
            int i = ZERO;
            while (str[i] == SPACE) {
                i++;
            }
            return Arrays.copyOfRange(str, i, str.length);

        }
        return new char[]{};
    }

    private static char[] deleteLastSpaces(char[] str) {
        if (str != null) {
            int i = str.length - OFFSET;
            while (str[i] == SPACE) {
                i--;
            }
            return Arrays.copyOfRange(str, ZERO, i + OFFSET);

        }
        return new char[]{};
    }

    private static char[] deleteExcessSpace(char[] str) {
        if (str != null) {
            char[] strWithoutExcessSpace = new char[ZERO];
            boolean isSpace = false;
            for (int i = ZERO; i < str.length; i++) {
                if (str[i] != SPACE) {
                    strWithoutExcessSpace = add(strWithoutExcessSpace, str[i]);
                    if (isSpace) {
                        isSpace = false;
                    }
                }
                if (str[i] == SPACE && !isSpace) {
                    strWithoutExcessSpace = add(strWithoutExcessSpace, str[i]);
                    isSpace = true;
                }
            }
            return strWithoutExcessSpace;
        }
        return new char[]{};
    }

    private static char[] add(char[] arr, char letter) {
        arr = Arrays.copyOf(arr, arr.length + OFFSET);
        arr[arr.length - OFFSET] = letter;
        return arr;
    }
}
