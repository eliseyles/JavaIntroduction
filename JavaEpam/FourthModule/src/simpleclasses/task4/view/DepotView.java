//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package simpleclasses.task4.view;

import simpleclasses.task4.container.Depot;
import simpleclasses.task4.entity.Train;

public class DepotView {

    public  void printDepot(Depot depot) {
        for (Train train : depot.getTrains()) {
            new TrainView().printTrain(train);
        }
        System.out.println();
    }
}
