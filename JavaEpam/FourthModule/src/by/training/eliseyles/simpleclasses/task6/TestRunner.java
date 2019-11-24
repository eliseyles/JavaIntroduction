//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд

package by.training.eliseyles.simpleclasses.task6;

import by.training.eliseyles.simpleclasses.task6.entity.Time;
import by.training.eliseyles.simpleclasses.task6.logic.TimeLogic;
import by.training.eliseyles.simpleclasses.task6.view.TimeView;

public class TestRunner {
    public static void main(String[] args) {
        Time time = new Time();
        TimeView timeView = new TimeView();
        timeView.printTime(time);
        timeView.printTime(new TimeLogic().changeTime(time, new Time(1, 55, 5), true));
        timeView.printTime(new TimeLogic().changeTime(time, new Time(2, 45, 12), false));
    }
}
