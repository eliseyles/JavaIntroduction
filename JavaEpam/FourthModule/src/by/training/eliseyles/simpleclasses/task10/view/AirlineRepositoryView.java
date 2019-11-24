package by.training.eliseyles.simpleclasses.task10.view;

import by.training.eliseyles.simpleclasses.task10.container.AirlineRepository;

public class AirlineRepositoryView {
    public void print(AirlineRepository airlineRepository) {
        for (int i = 0; i < airlineRepository.size(); i++) {
            new AirlineView().print(airlineRepository.getAirline(i));
        }
        System.out.println();
    }
}
