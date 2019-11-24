//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package by.training.eliseyles.simpleclasses.task4.entity;

import java.util.Arrays;
import java.util.Objects;

public class Train {
    private String destination;
    private int number;
    private int[] time;

    public Train() {
    }

    public Train(String destination, int number, int[] time) {
        this.destination = destination;
        this.number = number;
        setTime(time);
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

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
        if (time[0] >= 0 && time[0] < 24 && time[1] >= 0 && time[1] < 60)
            this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Objects.equals(destination, train.destination) &&
                Arrays.equals(time, train.time);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, number);
        result = 31 * result + Arrays.hashCode(time);
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", time=" + Arrays.toString(time) +
                '}';
    }

}
