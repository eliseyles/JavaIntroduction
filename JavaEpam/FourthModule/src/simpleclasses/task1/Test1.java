//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных

package simpleclasses.task1;

public class Test1 {

    public int firstVariable;
    public int secondVariable;

    public Test1() {
    }


    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public void printFirstVariable() {
        System.out.println(firstVariable);
    }

    public void printSecondVariable() {
        System.out.println(secondVariable);
    }

    public int findSumVariables() {
        return firstVariable + secondVariable;
    }

    public int findMax() {
        return (firstVariable - secondVariable) > 0 ? secondVariable : firstVariable;
    }
}
