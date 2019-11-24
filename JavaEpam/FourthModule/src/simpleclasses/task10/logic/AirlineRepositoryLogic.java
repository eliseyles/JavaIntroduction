//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package simpleclasses.task10.logic;

import simpleclasses.task10.container.AirlineRepository;

public class AirlineRepositoryLogic {

    public AirlineRepository findFlightByDestination(AirlineRepository airlineRepository, String destination) {
        if(airlineRepository != null) {
            AirlineRepository destinationAirline = new AirlineRepository();
            for (int i = 0; i < airlineRepository.size(); i++) {
                if (airlineRepository.getAirline(i).getDestination().equals(destination)) {
                    destinationAirline.add(airlineRepository.getAirline(i));
                }
            }
            return destinationAirline;
        }
        return new AirlineRepository();
    }

    public AirlineRepository findFlightByWeekDay(AirlineRepository airlineRepository, String weekDay) {
        if(airlineRepository != null) {
            AirlineRepository weekDayAirline = new AirlineRepository();
            for (int i = 0; i < airlineRepository.size(); i++) {
                if (airlineRepository.getAirline(i).getWeekDay().equals(weekDay)) {
                    weekDayAirline.add(airlineRepository.getAirline(i));
                }
            }
            return weekDayAirline;
        }
        return new AirlineRepository();
    }

    public AirlineRepository findFlightByWeekDayAndTime(AirlineRepository airlineRepository, String weekDay,
                                                        int hour, int minute) {
        if(airlineRepository != null) {
            AirlineRepository weekDayAirline = new AirlineRepository();
            for (int i = 0; i < airlineRepository.size(); i++) {
                if (airlineRepository.getAirline(i).getWeekDay().equals(weekDay)) {
                    if (airlineRepository.getAirline(i).getHour() > hour
                            && airlineRepository.getAirline(i).getMinute() > minute) {
                        weekDayAirline.add(airlineRepository.getAirline(i));
                    }
                }
            }
            return weekDayAirline;
        }
        return new AirlineRepository();
    }


}
