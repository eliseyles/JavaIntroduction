package by.training.eliseyles.agregation.task1.view;

import by.training.eliseyles.agregation.task1.containers.Sentence;

public class SentenseView {
    public void print(Sentence sentence) {
        for (int i = 0; i < sentence.size(); i++) {
            System.out.print(sentence.getWord(i).getWord());
            if (i > 0 && i < sentence.size() - 1) {
                System.out.print(" ");
            }
            if (i == sentence.size() - 1) {
                System.out.print(". ");
            }
        }
    }
}
