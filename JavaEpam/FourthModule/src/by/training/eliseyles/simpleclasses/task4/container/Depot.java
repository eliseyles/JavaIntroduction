//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package by.training.eliseyles.simpleclasses.task4.container;

import by.training.eliseyles.simpleclasses.task4.entity.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depot {
    private List<Train> trains;

    public Depot() {
        trains = new ArrayList<Train>();
    }

    public Depot(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public List<Train> getTrains() {
        return new ArrayList<>(trains);
    }

    public void add(Train train) {
        if (train != null) {
            trains.add(train);
        }
    }

    public int size() {
        return trains.size();
    }

    public Train getTrain(int index) {
        if(isValidIndex(index)) {
            return trains.get(index);
        }
        return null;
    }

    public void setTrain(int index, Train train) {
        if (isValidIndex(index) && train != null) {
            trains.set(index, train);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depot depot1 = (Depot) o;
        return Objects.equals(trains, depot1.trains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trains);
    }

    @Override
    public String toString() {
        return "Depot{" +
                "trains=" + trains +
                '}';
    }
}
