//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд

package by.training.eliseyles.simpleclasses.task6.logic;

import by.training.eliseyles.simpleclasses.task6.entity.Time;

public class TimeLogic {

    private final int SECONDS_IN_HOUR = 3600;
    private final int SECONDS_IN_MINUTE = 60;
    private final int HOUR_IN_DAY = 24;
    private final int SECONDS_IN_DAY = HOUR_IN_DAY * SECONDS_IN_HOUR;

    public Time changeTime(Time time, Time changeTime, boolean isForward) {
        int timeInSeconds = time.getHour() * SECONDS_IN_HOUR + time.getMinute() * SECONDS_IN_MINUTE + time.getSecond();
        int changeTimeInSeconds = changeTime.getHour() * SECONDS_IN_HOUR
                + changeTime.getMinute() * SECONDS_IN_MINUTE + changeTime.getSecond();


        timeInSeconds += changeTimeInSeconds * (isForward ? 1 : -1);
        timeInSeconds = timeInSeconds % SECONDS_IN_DAY;
        if (timeInSeconds < 0) {
            timeInSeconds = SECONDS_IN_DAY + timeInSeconds;
        }
        time.setHour(timeInSeconds / SECONDS_IN_HOUR);
        timeInSeconds %= SECONDS_IN_HOUR;
        time.setMinute(timeInSeconds / SECONDS_IN_MINUTE);
        timeInSeconds %= SECONDS_IN_MINUTE;
        time.setSecond(timeInSeconds);
        return time;
    }
}
