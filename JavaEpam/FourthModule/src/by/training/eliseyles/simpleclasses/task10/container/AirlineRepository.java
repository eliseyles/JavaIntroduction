//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package by.training.eliseyles.simpleclasses.task10.container;

import by.training.eliseyles.simpleclasses.task10.entity.Airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineRepository {
    private List<Airline> airlines;

    public AirlineRepository() {
        airlines = new ArrayList<>();
    }

    public AirlineRepository(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getAirlines() {
        return new ArrayList<>(airlines);
    }

    public void add(Airline airline) {
        if (airline != null) {
            airlines.add(airline);
        }
    }

    public int size() {
        return airlines.size();
    }

    public Airline getAirline(int index) {
        if (isValidIndex(index)) {
            return airlines.get(index);
        }
        return null;
    }

    public void setAirline(int index, Airline airline) {
        if (isValidIndex(index) && airline != null) {
            airlines.set(index, airline);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineRepository that = (AirlineRepository) o;
        return Objects.equals(airlines, that.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlines);
    }

    @Override
    public String toString() {
        return "AirlineRepository{" +
                "airlines=" + airlines +
                '}';
    }
}

