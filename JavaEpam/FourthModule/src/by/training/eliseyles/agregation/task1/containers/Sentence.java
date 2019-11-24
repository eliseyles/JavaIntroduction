//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

package by.training.eliseyles.agregation.task1.containers;

import by.training.eliseyles.agregation.task1.entity.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> sentence;

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public Sentence() {
        sentence = new ArrayList<Word>();
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public void add(Word word) {
        if (word != null) {
            sentence.add(word);
        }
    }

    public int size() {
        return sentence.size();
    }

    public Word getWord(int index) {
        if (isValidIndex(index)) {
            return sentence.get(index);
        }
        return null;
    }

    public void setWord(int index, Word word) {
        if (isValidIndex(index) && word != null) {
            sentence.set(index, word);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}
