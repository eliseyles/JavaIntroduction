//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

package by.training.eliseyles.agregation.task5.logic;

import by.training.eliseyles.agregation.task4.entity.Type;
import by.training.eliseyles.agregation.task5.container.Travel;

import by.training.eliseyles.agregation.task5.entity.Tour;
import by.training.eliseyles.simpleclasses.task4.entity.Train;

public class TravelLogic {

    public Travel selectByType(Travel travel, Type type) {
        if (travel != null) {
            Travel oneTypetravel = new Travel();
            for (int i = 0; i < travel.size(); i++) {
                if (type == travel.getTour(i).getType()) {
                    oneTypetravel.add(travel.getTour(i));
                }
            }
            return oneTypetravel;
        }
        return new Travel();
    }

    public Travel sortByType(Travel travel) {
        if (travel != null) {
            for (int i = 0; i < travel.size(); i++) {
                for (int j = 0; j < travel.size(); j++) {
                    if (compareByType(travel.getTour(i), travel.getTour(j))) {
                        Tour  tour = travel.getTour(i);
                        travel.setTour(i, travel.getTour(j));
                        travel.setTour(j, tour);
                    }
                }
            }
            return travel;
        }
        return new Travel();
    }

    private boolean compareByType(Tour firstTour, Tour secondTour) {
        return firstTour.getType().compareTo(secondTour.getType()) < 0;
    }
}
