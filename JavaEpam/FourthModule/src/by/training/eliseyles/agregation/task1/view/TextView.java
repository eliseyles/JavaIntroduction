package by.training.eliseyles.agregation.task1.view;

import by.training.eliseyles.agregation.task1.containers.Text;

public class TextView {
    public void printText(Text text) {
        for (int i = 0; i < text.size(); i++) {
            new SentenseView().print(text.getSentence(i));
        }
        System.out.println();
    }

    public void printHeading(Text text) {
        new SentenseView().print(text.getHeading());
        System.out.println();
        System.out.println();
    }

    public void printAllText(Text text) {
        printHeading(text);
        printText(text);
        System.out.println();
    }
}
