//3. В строке найти количество цифр

package strings.chararray;

import strings.util.Input;

public class Task3 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final char FIRST_DIGIT = '0';
    private static final char LAST_DIGIT = '9';



    public static void main(String[] args) {
        char[] str = Input.nextCharArray("Enter string with digits: ");
        System.out.println(findCountDigits(str));
    }

    public static int findCountDigits(char[] str) {
        if (str != null) {
            int count = ZERO;
            for (int i = ZERO; i < str.length; i++) {
                if (str[i] >= FIRST_DIGIT && str[i] <= LAST_DIGIT) {
                    count++;
                }
            }
            return count;
        }
        return WRONG_VALUE;
    }
}
