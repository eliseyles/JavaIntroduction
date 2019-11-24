package by.training.eliseyles.agregation.task2.logic;

import by.training.eliseyles.agregation.task2.entity.Car;
import by.training.eliseyles.agregation.task2.entity.Wheel;

public class CarAction{

        public void driveCar(Car car, boolean drive) {
            car.setDriver(drive);
        }

        public void fuelCar(Car car, int fuel) {
            car.setFuel(fuel);
        }

        public void changeWheel(Car car, Wheel wheel, int index) {
            car.setWheel(wheel, index);
        }

}
