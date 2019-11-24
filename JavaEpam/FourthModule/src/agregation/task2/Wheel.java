package agregation.task2;

import java.util.Objects;

public class Wheel {

    private String brand;
    private int width;
    private int proportionality;
    private int diameter;


    public Wheel(String brand, int width, int proportionality, int diameter) {
        this.brand = brand;
        this.width = width;
        this.proportionality = proportionality;
        this.diameter = diameter;
    }

    public Wheel() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getProportionality() {
        return proportionality;
    }

    public void setProportionality(int proportionality) {
        this.proportionality = proportionality;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return width == wheel.width &&
                proportionality == wheel.proportionality &&
                diameter == wheel.diameter &&
                Objects.equals(brand, wheel.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, width, proportionality, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", width=" + width +
                ", proportionality=" + proportionality +
                ", diameter=" + diameter +
                '}';
    }
}
