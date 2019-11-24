////5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
////на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
////произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
////позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

package by.training.eliseyles.simpleclasses.task5;

import by.training.eliseyles.simpleclasses.task5.entity.DecimalCounter;

public class DecimalCounterRunner {
    public static void main(String[] args) {
        System.out.println("Default initializing");
        DecimalCounter decimalCounter = new DecimalCounter();
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value initializing in border");
        decimalCounter = new DecimalCounter(5);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value initializing out of border");
        decimalCounter = new DecimalCounter(15);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value setting out of border");
        decimalCounter.setCount(15);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value setting in border");
        decimalCounter.setCount(4);
        System.out.println(decimalCounter.getCount());

        System.out.println("Decreasing value");
        for (int i = 0; i < 15; i++) {
            decimalCounter.decreaseCount();
            System.out.println(decimalCounter.getCount());
        }

        System.out.println("Increasing value");
        for (int i = 0; i < 15; i++) {
            decimalCounter.increaseCount();
            System.out.println(decimalCounter.getCount());
        }
    }
}
