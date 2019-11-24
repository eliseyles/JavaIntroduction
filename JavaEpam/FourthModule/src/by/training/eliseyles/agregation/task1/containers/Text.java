//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

package by.training.eliseyles.agregation.task1.containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private Sentence heading;
    private List<Sentence> text;

    public Text() {
        heading = new Sentence();
        text = new ArrayList<Sentence>();
    }

    public Text(Sentence heading, List<Sentence> text) {
        this.heading = heading;
        this.text = text;
    }

    public Sentence getHeading() {
        return heading;
    }

    public void setHeading(Sentence heading) {
        this.heading = heading;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public void add(Sentence sentence) {
        if (sentence != null) {
            text.add(sentence);
        }
    }

    public int size() {
        return text.size();
    }

    public Sentence getSentence(int index) {
        if (isValidIndex(index)) {
            return text.get(index);
        }
        return null;
    }

    public void setSentence(int index, Sentence sentence) {
        if (isValidIndex(index) && sentence != null) {
            text.set(index, sentence);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(heading, text1.heading) &&
                Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "heading=" + heading +
                ", text=" + text +
                '}';
    }
}
