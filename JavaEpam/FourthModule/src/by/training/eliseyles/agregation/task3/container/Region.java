package by.training.eliseyles.agregation.task3.container;

import by.training.eliseyles.agregation.task3.entity.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private List<District> districts;
    private City mainDistrictCity;
    private double square;

    public Region() {
        districts = new ArrayList<>();
        mainDistrictCity = new City();
        square = 0;
    }

    public Region(List<District> districts, City mainDistrictCity, double square) {
        this.districts = districts;
        this.mainDistrictCity = mainDistrictCity;
        this.square = square;
    }

    public City getMainDistrictCity() {
        return mainDistrictCity;
    }

    public void setMainDistrictCity(City mainDistrictCity) {
        this.mainDistrictCity = mainDistrictCity;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public int getDistrictNumber() {
        return districts.size();
    }

    public District getDistrict(int index) {
        if (isValidIndex(index)) {
            return districts.get(index);
        }
        return null;
    }

    public void add(District district) {
        if (district != null) {
            districts.add(district);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < getDistrictNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 &&
                Objects.equals(districts, region.districts) &&
                Objects.equals(mainDistrictCity, region.mainDistrictCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districts, mainDistrictCity, square);
    }

    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                ", mainDistrictCity=" + mainDistrictCity +
                ", square=" + square +
                '}';
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
