//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package by.training.eliseyles.agregation.task3.container;

import by.training.eliseyles.agregation.task3.entity.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
    private List<Region> regions;
    private City capital;

    public State() {
        regions = new ArrayList<>();
        capital = new City();
    }

    public State(List<Region> regions, City capital) {
        this.regions = regions;
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public int getRegionNumber() {
        return regions.size();
    }

    public Region getRegion(int index) {
        if (isValidIndex(index)) {
            return regions.get(index);
        }
        return null;
    }

    public void add(Region region) {
        if (region != null) {
            regions.add(region);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < getRegionNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(regions, state.regions) &&
                Objects.equals(capital, state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, capital);
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "State{" +
                "regions=" + regions +
                ", capital=" + capital +
                '}';
    }
}
