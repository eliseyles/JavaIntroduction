////6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
////изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
////недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
////заданное количество часов, минут и секунд
//
//package simpleclasses.task6;
//
//public class Time {
//    private int hour;
//    private int minute;
//    private int second;
//
//    private final int DEFAULT_TIME = 0;
//    private final int MAX_HOURS = 24;
//    private final int MAX_MINUTES = 60;
//    private final int MAX_SECONDS = 60;
//
//
//    public Time() {
//        hour = DEFAULT_TIME;
//        minute = DEFAULT_TIME;
//        second = DEFAULT_TIME;
//    }
//
//    public Time(int hour, int minute, int second) {
//        setHour(hour);
//        setMinute(minute);
//        setSecond(second);
//    }
//
//    public int getHour() {
//        return hour;
//    }
//
//    public void setHour(int hour) {
//        if (hour >= DEFAULT_TIME && hour < MAX_HOURS) {
//            this.hour = hour;
//        } else {
//            this.hour = DEFAULT_TIME;
//        }
//    }
//
//    public int getMinute() {
//        return minute;
//    }
//
//    public void setMinute(int minute) {
//        if (minute >= DEFAULT_TIME && minute < MAX_MINUTES) {
//            this.minute = minute;
//        } else {
//            this.minute = DEFAULT_TIME;
//        }
//    }
//
//    public int getSecond() {
//        return second;
//    }
//
//    public void setSecond(int second) {
//        if (second >= DEFAULT_TIME && second < MAX_SECONDS) {
//            this.second = second;
//        } else {
//            this.second = DEFAULT_TIME;
//        }
//    }
//
//    public void changeTime(int hour, int minute, int second) {
//        int timeInSecond = (this.hour * MAX_MINUTES + this.minute) * MAX_SECONDS + this.second;
//        int changeTimeInSeconds = (hour * MAX_MINUTES + minute) * MAX_SECONDS + second;
//
//        timeInSecond += changeTimeInSeconds;
//
//        if (timeInSecond > 0) {
//            setHour((timeInSecond / MAX_SECONDS) / MAX_MINUTES);
//            timeInSecond
//        }
//    }
//
//
//}
