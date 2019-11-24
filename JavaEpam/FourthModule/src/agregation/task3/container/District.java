package agregation.task3.container;

import agregation.task3.entity.City;
import com.sun.org.glassfish.external.amx.MBeanListener;

import java.util.List;
import java.util.Objects;

public class District {
    private List<City> cities;

    public District(List<City> cities) {
        this.cities = cities;
    }

    public District() {
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
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
