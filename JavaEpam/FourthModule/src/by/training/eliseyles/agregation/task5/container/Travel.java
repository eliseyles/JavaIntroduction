package by.training.eliseyles.agregation.task5.container;

import by.training.eliseyles.agregation.task5.entity.Tour;
import com.sun.corba.se.impl.oa.toa.TOA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Travel {

    private List<Tour> tours;

    public Travel() {
        tours = new ArrayList<>();
    }

    public Travel(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public void add(Tour tour) {
        if (tour != null) {
            tours.add(tour);
        }
    }

    public int size() {
        return tours.size();
    }

    public Tour getTour(int index) {
        if (isValidIndex(index)) {
            return tours.get(index);
        }
        return null;
    }

    public void setTour(int index, Tour tour) {
        if (isValidIndex(index) && tour != null) {
            tours.set(index, tour);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return Objects.equals(tours, travel.tours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tours);
    }

    @Override
    public String toString() {
        return "Travel{" +
                "tours=" + tours +
                '}';
    }
}
