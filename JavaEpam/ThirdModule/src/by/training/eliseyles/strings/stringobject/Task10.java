//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

package by.training.eliseyles.strings.stringobject;

import by.training.eliseyles.strings.util.Input;

public class Task10 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final int OFFSET = 1;
    private static final String EXCLAMATION_POINT = "!";
    private static final String DOT = ".";
    private static final String QUESTION_MARK = "?";
    private static final int INDEX_NON_INSIDE = -1;


    public static void main(String[] args) {
        String string = Input.nextLine("Enter string: ");
        System.out.println("Sentences count = " + countSentences(string));
    }

    public static int countSentences(String string) {
        if (string != null) {
            int sentencesCount = ZERO;
            sentencesCount += countPunctuationMarks(string, EXCLAMATION_POINT);
            sentencesCount += countPunctuationMarks(string, QUESTION_MARK);
            sentencesCount += countPunctuationMarks(string, DOT);
            return sentencesCount;
        }
        return WRONG_VALUE;
    }

    private static int countPunctuationMarks(String string, String mark) {
        if (string != null) {
            int count = ZERO;
            int position = string.indexOf(mark);
            while (position != INDEX_NON_INSIDE) {
                count++;
                position = string.indexOf(mark, position + OFFSET);
            }
            return count;
        }
        return WRONG_VALUE;
    }
}
