package simpleclasses.task4;

import java.util.ArrayList;
import java.util.Objects;

public class Depot {
    private ArrayList<Train> trains;


    public Depot() {
        trains = new ArrayList<Train>();
    }

    public Depot(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Train> getTrains() {
        return trains;
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
