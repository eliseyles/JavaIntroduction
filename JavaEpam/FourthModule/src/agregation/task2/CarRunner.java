package agregation.task2;

import java.util.ArrayList;

public class CarRunner {

    public static void main(String[] args) {
        ArrayList<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel("Nokian", 185, 65, 15));
        }

        Car car = new Car(wheels, new Engine("P110", "Gas"),
                0, "Volvo", false);

        CarAction carAction = new CarAction();
        CarView carView = new CarView();

        carView.print(car);

        System.out.println("The car become to drive");
        carAction.driveCar(car,true);


        System.out.println("The car needs to be refueled 38 liters");
        carAction.fuelCar(car, 38);
        carView.print(car);

        System.out.println("The car needs to change front left wheel");
        Wheel wheel = new Wheel("Nexen", 195, 55, 15);
        carAction.changeWheel(car, wheel, 0);
        carView.print(car);

        // вывод в консоль марки автомобиля
        carView.printBrand(car);
    }
}
