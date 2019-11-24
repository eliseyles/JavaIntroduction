package agregation.task3.entity;

import java.util.Objects;

public class City {
    private String title;

    public City(String title) {
        this.title = title;
    }

    public City() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(title, city.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                '}';
    }
}
