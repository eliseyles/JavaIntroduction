//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

package by.training.eliseyles.agregation.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private List<Wheel> wheels;
    private Engine engine;
    private int fuel;
    private String brand;
    private boolean driver;

    public Car(List<Wheel> wheels, Engine engine, int fuel, String brand, boolean driver) {
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = fuel;
        this.brand = brand;
        this.driver = driver;
    }

    public Car() {
        wheels = new ArrayList<>();
        engine = new Engine();
        fuel = 0;
        brand = "";
        driver = false;
    }

    public int size() {
        return wheels.size();
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void setWheel(Wheel wheel, int index) {
        if(isValidIndex(index)) {
            wheels.set(index, wheel);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        } else {
            fuel = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isDriver() {
        return driver;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuel == car.fuel &&
                driver == car.driver &&
                Objects.equals(wheels, car.wheels) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, engine, fuel, brand, driver);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine=" + engine +
                ", fuel=" + fuel +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                '}';
    }
}
