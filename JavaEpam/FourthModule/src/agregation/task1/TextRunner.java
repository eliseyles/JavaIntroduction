//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

package agregation.task1;

import agregation.task1.containers.Sentence;
import agregation.task1.containers.Text;
import agregation.task1.entity.Word;
import agregation.task1.view.TextView;

import java.util.Random;

public class TextRunner {
    public static String[] WORDS = new String[]{"qwer", "yeiwrn", "hfskdjhf", "ab", "nmds,", "fjsdkl", "jlfsk"};
    public static int TEXT_MAX_SIZE = 10;
    public static int SENTENCE_MAX_SIZE = 10;

    public static void main(String[] args) {
        Text text = new Text();

        Sentence sentence = new Sentence();
        for (int j = 0; j < new Random().nextInt(SENTENCE_MAX_SIZE); j++) {
            sentence.add(new Word(WORDS[new Random().nextInt(WORDS.length)]));
        }
        text.setHeading(sentence);

        for (int i = 0; i < new Random().nextInt(TEXT_MAX_SIZE) + 1; i++) {
            sentence = new Sentence();
            for (int j = 0; j < new Random().nextInt(SENTENCE_MAX_SIZE) + 1; j++) {
                sentence.add(new Word(WORDS[new Random().nextInt(WORDS.length)]));
            }
            text.add(sentence);
        }

        TextView textView = new TextView();
        System.out.println("Print all text");
        textView.printAllText(text);

        sentence = new Sentence();
        for (int j = 0; j < new Random().nextInt(SENTENCE_MAX_SIZE); j++) {
            sentence.add(new Word(WORDS[new Random().nextInt(WORDS.length)]));
        }

        text.add(sentence);
        System.out.println("Print tetx after addition");
        textView.printAllText(text);

        System.out.println("Print heading");
        textView.printHeading(text);

    }
}
