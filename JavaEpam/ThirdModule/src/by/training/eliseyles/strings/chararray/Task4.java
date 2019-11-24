//4. В строке найти количество чисел

package by.training.eliseyles.strings.chararray;

import by.training.eliseyles.strings.util.Input;

public class Task4 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final char FIRST_DIGIT = '0';
    private static final char LAST_DIGIT = '9';


    public static void main(String[] args) {
        char[] str = Input.nextCharArray("Enter string with digits: ");
        System.out.println(findNumberCount(str));
    }

    public static int findNumberCount(char[] str) {
        if (str != null) {
            int count = ZERO;
            boolean isNumber = false;
            for (int i = ZERO; i < str.length; i++) {
                if (str[i] >= FIRST_DIGIT && str[i] <= LAST_DIGIT) {
                    if (!isNumber) {
                        isNumber = true;
                        count++;
                    }
                } else {
                    isNumber = false;
                }
//                System.out.println(isNumber);
            }
            return count;
        }
        return WRONG_VALUE;
    }
}
