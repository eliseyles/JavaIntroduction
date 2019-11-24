//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд

package by.training.eliseyles.simpleclasses.task6.view;

import by.training.eliseyles.simpleclasses.task6.entity.Time;

public class TimeView {
    public void printTime(Time time) {
        System.out.println((time.getHour() < 10 ? "0" : "") + time.getHour() + ":"
                + (time.getMinute()< 10 ? "0" : "") + time.getMinute() + ":"
                + (time.getSecond()< 10 ? "0" : "") + time.getSecond());
    }
}
