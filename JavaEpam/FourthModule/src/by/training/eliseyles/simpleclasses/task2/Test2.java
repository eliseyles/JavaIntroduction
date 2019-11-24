//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса

package by.training.eliseyles.simpleclasses.task2;

import java.util.Objects;

public class Test2 {

    private static final int DEFAULT_VALUE = 0;

    private int firstVariable;
    private int secondVariable;

    public Test2() {
        this.firstVariable = DEFAULT_VALUE;
        this.secondVariable = DEFAULT_VALUE;
    }

    public Test2(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test2 test2 = (Test2) o;
        return firstVariable == test2.firstVariable &&
                secondVariable == test2.secondVariable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstVariable, secondVariable);
    }


}
