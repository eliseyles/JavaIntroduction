//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

package simpleclasses.task4;

public class DepotLogic {

    public Depot sortByNumber(Depot depot) {
        if (depot != null) {
            for (int i = 0; i < depot.size(); i++) {
                for (int j = 0; j < depot.size(); j++) {
                    if (compareByNumber(depot.getTrain(i), depot.getTrain(j))) {
                        Train train = depot.getTrain(i);
                        depot.setTrain(i, depot.getTrain(j));
                        depot.setTrain(j, train);
                    }
                }
            }
            return depot;
        }
        return new Depot();
    }

    private boolean compareByNumber(Train firstTrain, Train secondTrain) {
        if (firstTrain != null && secondTrain != null) {
            return firstTrain.getNumber() < secondTrain.getNumber();
        }
        return false;
    }

    public Depot findTrainsByNumber(Depot depot, int number) {
        Depot sameNumberTrainDepot = new Depot();
        for (Train train : depot.getTrains()) {
            if (number == train.getNumber()) {
                sameNumberTrainDepot.add(train);
            }
        }
        return sameNumberTrainDepot;
    }

    public Depot sortByDestination(Depot depot) {
        if (depot != null) {
            for (int i = 0; i < depot.size(); i++) {
                for (int j = 0; j < depot.size(); j++) {
                    if (compareByDestination(depot.getTrain(i), depot.getTrain(j))) {
                        Train train = depot.getTrain(i);
                        depot.setTrain(i, depot.getTrain(j));
                        depot.setTrain(j, train);
                    }
                }
            }
            return depot;
        }
        return new Depot();
    }

    private boolean compareByDestination(Train firstTrain, Train secondTrain) {
        if (firstTrain != null && secondTrain != null) {
            if (firstTrain.getDestination().equals(secondTrain.getDestination())) {
                if (firstTrain.getTime()[0] != secondTrain.getTime()[0]) {
                    return firstTrain.getTime()[0] < secondTrain.getTime()[0];
                } else {
                    return firstTrain.getTime()[1] < secondTrain.getTime()[1];
                }
            } else {
                return firstTrain.getDestination().compareTo(secondTrain.getDestination()) < 0;
            }
        }
        return false;
    }
}
