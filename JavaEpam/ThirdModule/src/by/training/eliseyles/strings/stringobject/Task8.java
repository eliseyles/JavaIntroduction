//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task8 {
    private static final String EMPTY_STRING = "";
    private static final int INDEX_NON_INSIDE = -1;
    private static final String SPACE = " ";
    private static final int OFFSET = 1;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(findLongestWord(string));
    }

    public static String findLongestWord(String string) {
        if (string != null) {
            String longestWord = EMPTY_STRING;
            int spacePosition = string.indexOf(SPACE);
            while (spacePosition != INDEX_NON_INSIDE) {
                if (spacePosition + OFFSET < string.length()) {
                    if (string.indexOf(SPACE, spacePosition + OFFSET) != INDEX_NON_INSIDE) {
                        if (longestWord.length()
                                < string.substring(spacePosition + OFFSET,
                                string.indexOf(SPACE, spacePosition + OFFSET)).length()) {

                            longestWord = string.substring(spacePosition + OFFSET,
                                    string.indexOf(SPACE, spacePosition + OFFSET));
                        }
                    } else {
                        if (longestWord.length() < string.substring(spacePosition + OFFSET).length()) {
                            longestWord = string.substring(spacePosition + OFFSET);
                        }
                    }
                }
                spacePosition = string.indexOf(SPACE, spacePosition + OFFSET);
            }
            return longestWord;

        }
        return EMPTY_STRING;
    }
}
