//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task5 {
    private static final int ZERO = 0;
    private static final char LETTER = 'a';
    private static final int WRONG_VALUE = -1;
    private static final int OFFSET = 1;



    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(countLetterAlgo(string, LETTER));
        System.out.println(countLetterFunc(string, LETTER));

    }

    public static int countLetterAlgo(String string, char letter) {
        if (string != null) {
            int count = ZERO;
            for (int i = ZERO; i < string.length(); i++) {
                if(string.charAt(i) == letter) {
                    count++;
                }
            }
            return count;
        }
        return WRONG_VALUE;
    }

    public static int countLetterFunc(String string, char letter) {
        if (string != null) {
            int count = ZERO;
            int position = string.indexOf(letter);

            while (position > WRONG_VALUE) {
                count++;
                position = string.indexOf(letter, position + OFFSET);
            }
            return count;
        }
        return WRONG_VALUE;
    }


}
