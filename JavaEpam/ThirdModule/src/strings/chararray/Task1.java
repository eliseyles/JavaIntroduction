//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

package strings.chararray;

import strings.Input;

import java.util.Arrays;

public class Task1 {
    private static final int ZERO = 0;
    private static final int SHIFT = (int)'a' - (int)'A';
    private static final int OFFSET = 1;
    private static final char FIRST_UPCASE_LETTER = 'A';
    private static final char LAST_UPCASE_LETTER = 'Z';
    private static final char UNDERSCORE = '_';


    public static void main(String[] args) {
        System.out.println(makeSnakeCase(Input.nextCharArray("Enter camelCase string: ")));
    }

    public static char[] makeSnakeCase(char[] camelCaseString) {
        if (camelCaseString != null) {
            char[] snakeCaseString = new char[ZERO];
            for (int i = ZERO; i < camelCaseString.length; i++) {
                if(camelCaseString[i] >= FIRST_UPCASE_LETTER  && camelCaseString[i] <= LAST_UPCASE_LETTER) {
                    snakeCaseString = add(snakeCaseString, UNDERSCORE);
                    snakeCaseString = add(snakeCaseString, (char)((int)camelCaseString[i] + SHIFT));
                } else {
                    snakeCaseString = add(snakeCaseString, camelCaseString[i]);
                }
            }
            return snakeCaseString;
        }
        return new char[]{};
    }

    private static char[] add(char[] arr, char letter) {
        arr = Arrays.copyOf(arr, arr.length + OFFSET);
        arr[arr.length - OFFSET] = letter;
        return arr;
    }
}
