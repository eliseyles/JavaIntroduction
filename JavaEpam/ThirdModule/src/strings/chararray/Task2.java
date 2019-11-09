//2. Замените в строке все вхождения 'word' на 'letter'.

package strings.chararray;

import strings.util.Input;

import java.util.Arrays;

public class Task2 {
    private static final int ZERO = 0;
    private static final int OFFSET = 1;


    public static void main(String[] args) {
//        System.out.println(makeSnakeCase(Input.nextCharArray("Enter camelCase string: ")));
//        System.out.println(isFromReplace(new char[]{'s','s','s'}, new char[]{'s', 'a'}, 0));
        char[] textToReplace = Input.nextCharArray("Enter word to replace: ");
        char[] replaceableText = Input.nextCharArray("Enter replaceable word: ");
        char[] basicText = Input.nextCharArray("Enter basic text: ");
        System.out.println(replace(basicText, textToReplace, replaceableText));
    }

    public static char[] replace(char[] basicText, char[] textToReplace, char[] replaceableText) {
        if (basicText != null && textToReplace != null && replaceableText != null) {
            int i = ZERO;
            char[] replacedText = new char[ZERO];
            while (i < (basicText.length)) {
                System.out.println(i);
                if (isFromReplace(basicText, textToReplace, i)) {
                    replacedText = add(replacedText, replaceableText);
                    i += textToReplace.length;
                } else {
                    replacedText = add(replacedText, basicText[i]);
                    i++;
                }

                System.out.println(replacedText);
            }
            return replaceableText;
        }
        return new char[]{};
    }

    private static boolean isFromReplace(char[] basisText, char[] textToReplace, int index) {
        if (basisText != null && textToReplace != null && index >= ZERO) {
            boolean result = true;
            for (int i = index; i < textToReplace.length && result && i < basisText.length; i++) {
                if (basisText[i] != textToReplace[i]) {
                    result = false;
                }
            }
            return result;
        }
        return false;
    }

    private static char[] add(char[] arr, char[] str) {
        for (int i = ZERO; i < str.length; i++) {
            arr = add(arr, str[i]);
        }
        return arr;
    }

    private static char[] add(char[] arr, char letter) {
        arr = Arrays.copyOf(arr, arr.length + OFFSET);
        arr[arr.length - OFFSET] = letter;
        return arr;
    }
}
