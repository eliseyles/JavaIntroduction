//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package simpleclasses.task10;

import simpleclasses.task10.container.AirlineRepository;
import simpleclasses.task10.entity.Airline;
import simpleclasses.task10.logic.AirlineRepositoryLogic;
import simpleclasses.task10.view.AirlineRepositoryView;

import java.util.Random;

public class AirlineRepositoryRunner {
    public static final String[] DESTINATION = new String[]{"Moscow", "Minsk", "Bali", "Tokyo", "Toronto", "Gomel", "Warsaw"};
    public static final String[] TYPE = new String[]{"Boeing-737", "Airbus A320", "Boeing-747", "Boeing-777", "Sukhoi SuperJet-100"};
    public static final String[] WEEK_DAY = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static final int AIRLINE_COUNT = 10;

    public static void main(String[] args) {
        AirlineRepository airlineRepository = new AirlineRepository();

        for (int i = 0; i < AIRLINE_COUNT; i++) {
            airlineRepository.add(new Airline(DESTINATION[new Random().nextInt(DESTINATION.length)],
                    new Random().nextInt(1000),
                    TYPE[new Random().nextInt(TYPE.length)],
                    new Random().nextInt(24),
                    new Random().nextInt(60),
                    WEEK_DAY[new Random().nextInt(WEEK_DAY.length)]
            ));
        }

        AirlineRepositoryView airlineRepositoryView = new AirlineRepositoryView();

        airlineRepositoryView.print(airlineRepository);

        airlineRepositoryView.print(new AirlineRepositoryLogic().findFlightByDestination(airlineRepository,"Tokyo"));
        airlineRepositoryView.print(new AirlineRepositoryLogic().findFlightByWeekDay(airlineRepository, "Wed"));
        airlineRepositoryView.print(
                new AirlineRepositoryLogic().findFlightByWeekDayAndTime(airlineRepository, "Wed", 8,0));
    }
}
