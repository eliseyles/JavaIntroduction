//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package simpleclasses.task4;

import simpleclasses.task4.container.Depot;
import simpleclasses.task4.entity.Train;
import simpleclasses.task4.logic.DepotLogic;
import simpleclasses.task4.view.DepotView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TrainRunner {
    public static final String[] DESTINATION = new String[]{"Moscow", "Brest", "Minsk", "Erevan", "Bobruisk"};
    public static final int[][] TIME = new int[][]{{11, 12}, {9, 0}, {9, 15}, {16, 30}, {23, 22}, {20, 40}};
    public static final int SIZE = 5;


    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<Train>();
        for (int i = 0; i < SIZE; i++) {
            trains.add(new Train(DESTINATION[new Random().nextInt(DESTINATION.length)],
                    new Random().nextInt(1000), TIME[new Random().nextInt(TIME.length)]));
        }
        Depot depot = new Depot(trains);
        DepotView depotView = new DepotView();
        depotView.printDepot(depot);
        depotView.printDepot(new DepotLogic().sortByNumber(depot));

        int number = new Scanner(System.in).nextInt();
        depotView.printDepot(new DepotLogic().findTrainsByNumber(depot, number));

        depotView.printDepot(new DepotLogic().sortByDestination(depot));

    }


}
