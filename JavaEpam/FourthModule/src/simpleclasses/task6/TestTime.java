//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд

package simpleclasses.task6;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time();
        TimeView.printTime(time);
        TimeView.printTime(TimeLogic.changeTime(time, new Time(1, 55, 5), true));
        TimeView.printTime(TimeLogic.changeTime(time, new Time(2, 45, 12), false));
    }
}
