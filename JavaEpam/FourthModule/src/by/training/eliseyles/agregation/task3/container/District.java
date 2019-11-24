package by.training.eliseyles.agregation.task3.container;

import by.training.eliseyles.agregation.task3.entity.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
    private List<City> cities;

    public District(List<City> cities) {
        this.cities = cities;
    }

    public District() {
        cities = new ArrayList<>();
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public int getCitiesNumber() {
        return cities.size();
    }

    public City getCity(int index) {
        if (isValidIndex(index)) {
            return cities.get(index);
        }
        return null;
    }

    public void add(City city) {
        if (city != null) {
            cities.add(city);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < getCitiesNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cities);
    }

    @Override
    public String toString() {
        return "District{" +
                "cities=" + cities +
                '}';
    }
}
