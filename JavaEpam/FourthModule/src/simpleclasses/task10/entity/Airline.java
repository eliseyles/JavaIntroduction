//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package simpleclasses.task10.entity;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String destination;
    private int number;
    private String planeType;
    private int hour;
    private int minute;
    private String weekDay;

    public Airline() {
        destination = "";
        number = 0;
        planeType = "";
        hour = 0;
        minute = 0;
        weekDay = "";
    }

    public Airline(String destination, int number, String planeType, int hour, int minute, String weekDay) {
        this.destination = destination;
        this.number = number;
        this.planeType = planeType;
        setHour(hour);
        setMinute(minute);
        this.weekDay = weekDay;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else this.hour = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else this.minute = 0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return number == airline.number &&
                hour == airline.hour &&
                minute == airline.minute &&
                Objects.equals(destination, airline.destination) &&
                Objects.equals(planeType, airline.planeType) &&
                Objects.equals(weekDay, airline.weekDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, planeType, hour, minute, weekDay);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", planeType='" + planeType + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", weekDay='" + weekDay + '\'' +
                '}';
    }
}
