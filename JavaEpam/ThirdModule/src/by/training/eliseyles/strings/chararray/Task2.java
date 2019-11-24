//2. Замените в строке все вхождения 'word' на 'letter'.

package by.training.eliseyles.strings.chararray;

import by.training.eliseyles.strings.util.Input;

import java.util.Arrays;

public class Task2 {
    private static final int ZERO = 0;
    private static final int OFFSET = 1;
    private static final String TO_REPLACE = "word";
    private static final String REPLACEABLE = "letter";



    public static void main(String[] args) {
        char[] textToReplace = TO_REPLACE.toCharArray();
        char[] replaceableText = REPLACEABLE.toCharArray();
        char[] basicText = Input.nextCharArray("Enter text to replace: ");
        System.out.println(replace(basicText, textToReplace, replaceableText));
    }

    public static char[] replace(char[] basicText, char[] textToReplace, char[] replaceableText) {
        if (basicText != null && textToReplace != null && replaceableText != null) {
            int i = ZERO;
            char[] replacedText = new char[ZERO];
            while (i < (basicText.length)) {
                if (isFromReplace(basicText, textToReplace, i)) {
                    replacedText = add(replacedText, replaceableText);
                    i += textToReplace.length;
                } else {
                    replacedText = add(replacedText, basicText[i]);
                    i++;
                }
            }
            return replacedText;
        }
        return new char[]{};
    }

    private static boolean isFromReplace(char[] basisText, char[] textToReplace, int index) {
        if (basisText != null && textToReplace != null && index >= ZERO) {
            boolean result = true;
            for (int i = ZERO; i < textToReplace.length && result && i + index < basisText.length; i++) {
                if (basisText[i + index] != textToReplace[i]) {
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
