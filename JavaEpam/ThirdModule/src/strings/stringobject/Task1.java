//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

package strings.stringobject;

import strings.util.Input;

public class Task1 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final char SPACE = ' ';


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println(findMaxSpaceCount(string));
    }

    public static int findMaxSpaceCount(String str) {
        if (str != null) {
            int spaceCount = ZERO;
            int maxSpaceCount = ZERO;
            boolean isSpace = false;
            for (int i = ZERO; i < str.length(); i++) {
                if (str.charAt(i) == SPACE && !isSpace) {
                    isSpace = true;
                    spaceCount++;
                }
                if (str.charAt(i) == SPACE && isSpace) {
                    spaceCount++;
                }
                if (str.charAt(i) != SPACE && isSpace) {
                    isSpace = false;
                    if (spaceCount > maxSpaceCount) {
                        maxSpaceCount = spaceCount;
                    }
                    spaceCount = ZERO;
                }
            }
            return maxSpaceCount;
        }
        return WRONG_VALUE;
    }
}
