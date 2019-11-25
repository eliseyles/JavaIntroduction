//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

package by.training.eliseyles.agregation.task5.entity;

import by.training.eliseyles.agregation.task4.entity.Meal;
import by.training.eliseyles.agregation.task4.entity.Transport;
import by.training.eliseyles.agregation.task4.entity.Type;

import java.util.Objects;

public class Tour {
    private String country;
    private Type type;
    private Transport transport;
    private Meal meals;
    private int numberOfDays;

    public Tour() {
        country = "";
        type = Type.CRUISE;
        transport = Transport.PLANE;
        meals = Meal.OB;
        numberOfDays = 0;
    }

    public Tour(String country, Type type, Transport transport, Meal meals, int numberOfDays) {
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.meals = meals;
        this.numberOfDays = numberOfDays;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        if (numberOfDays > 0) {
            this.numberOfDays = numberOfDays;
        } else {
            this.numberOfDays = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return numberOfDays == tour.numberOfDays &&
                Objects.equals(country, tour.country) &&
                Objects.equals(type, tour.type) &&
                Objects.equals(transport, tour.transport) &&
                Objects.equals(meals, tour.meals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, type, transport, meals, numberOfDays);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", meals='" + meals + '\'' +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
