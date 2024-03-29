//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package by.training.eliseyles.simpleclasses.task4.view;

import by.training.eliseyles.simpleclasses.task4.entity.Train;

public class TrainView {

    public void printTrain(Train train) {
        System.out.println("Train number " + train.getNumber() +
                " destination " + train.getDestination() +
                " time " + train.getTime()[0] + ":" + train.getTime()[1]);
    }
}
