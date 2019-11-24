//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

package by.training.eliseyles.simpleclasses.task5.entity;

public class DecimalCounter {
    private int count;
    private final int DEFAULT_VALUE = 0;
    private final int LOW_BOUND = 0;
    private final int HIGH_BOUND = 10;

    public DecimalCounter() {
        this.count = DEFAULT_VALUE;
    }

    public DecimalCounter(int count) {
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= LOW_BOUND && count <= HIGH_BOUND) {
            this.count = count;
        } else {
            this.count = DEFAULT_VALUE;
        }
    }

    public void increaseCount() {
        setCount(getCount() + 1);
    }

    public void decreaseCount() {
        setCount(getCount() - 1);
    }
}
