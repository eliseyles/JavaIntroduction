package by.training.eliseyles.simpleclasses.task10.view;

import by.training.eliseyles.simpleclasses.task10.entity.Airline;

public class AirlineView {
    public void print(Airline airline) {
        System.out.println("Airline " +
                "destination = " + airline.getDestination() +
                " number = " + airline.getNumber() +
                " planeType = " + airline.getPlaneType() +
                " time = " + airline.getHour() + ":" + airline.getMinute() +
                " weekDay = " + airline.getWeekDay());
    }
}
