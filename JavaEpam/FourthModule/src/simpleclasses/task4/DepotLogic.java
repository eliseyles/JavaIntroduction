//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package simpleclasses.task4;

public class DepotLogic {
    public static Depot sortByNumber(Depot depot) {
        if (depot != null) {
            for (int i = 0; i < depot.getTrains().size(); i++) {
                for (int j = 0; j < depot.getTrains().size(); j++) {
                    if (compareByNumber(depot.getTrains().get(i), depot.getTrains().get(j))) {
                        Train train = depot.getTrains().get(i);
                        depot.getTrains().set(i, depot.getTrains().get(j));
                        depot.getTrains().set(j, train);
                    }
                }
            }
            return depot;
        }
        return new Depot();
    }

    private static boolean compareByNumber(Train firstTrain, Train secondTrain) {
        if (firstTrain != null && secondTrain != null) {
            return firstTrain.getNumber() < secondTrain.getNumber();
        }
        return false;
    }

    public static Depot findTrainsByNumber(Depot depot, int number) {
        Depot sameNumberTrainDepot = new Depot();
        for (Train train : depot.getTrains()) {
            if (number == train.getNumber()) {
                sameNumberTrainDepot.getTrains().add(train);
            }
        }
        return sameNumberTrainDepot;
    }

    public static Depot sortByDestination(Depot depot) {
        if (depot != null) {
            for (int i = 0; i < depot.getTrains().size(); i++) {
                for (int j = 0; j < depot.getTrains().size(); j++) {
                    if (compareByDestination(depot.getTrains().get(i), depot.getTrains().get(j))) {
                        Train train = depot.getTrains().get(i);
                        depot.getTrains().set(i, depot.getTrains().get(j));
                        depot.getTrains().set(j, train);
                    }
                }
            }
            return depot;
        }
        return new Depot();
    }

    private static boolean compareByDestination(Train firstTrain, Train secondTrain) {
        if (firstTrain != null && secondTrain != null) {
            if (firstTrain.getDestination().equals(secondTrain.getDestination())) {
                if (firstTrain.getTime()[0] != secondTrain.getTime()[0]) {
                    return firstTrain.getTime()[0] < secondTrain.getTime()[0];
                } else {
                    return firstTrain.getTime()[1] < secondTrain.getTime()[1];
                }
            } else {
                return String.CASE_INSENSITIVE_ORDER.compare(firstTrain.getDestination(), secondTrain.getDestination()) < 0;
            }
        }
        return false;
    }
}
