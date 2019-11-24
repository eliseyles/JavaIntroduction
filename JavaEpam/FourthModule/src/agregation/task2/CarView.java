package agregation.task2;

public class CarView {
    public void printBrand(Car car) {
        System.out.print("The brand of car is '");
        System.out.print(car.getBrand());
        System.out.println("'.");
    }

    public void print(Car car) {
        System.out.println("Car " +
                "wheels = " + car.getWheels() +
                ",\n engine=" + car.getEngine() +
                ",\n fuel=" + car.getFuel() +
                ", brand='" + car.getBrand() + '\'' +
                ", driver=" + car.isDriver());
    }
}
