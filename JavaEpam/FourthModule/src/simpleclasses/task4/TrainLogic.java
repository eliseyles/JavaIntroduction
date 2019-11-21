package simpleclasses.task4;

public class TrainLogic {

    public static Train[] sortByNumber(Train[] trains) {
        if (trains != null) {
            for (int i = 0; i < trains.length; i++) {
                for (int j = 0; j < trains.length; j++) {
                    if (compareByNumber(trains[i], trains[j])) {
                        Train train = trains[i];
                        trains[i] = trains[j];
                        trains[j] = train;
                    }
                }
            }
            return trains;
        }
        return new Train[]{};
    }

    private static boolean compareByNumber(Train firstTrain, Train secondTrain) {
        if (firstTrain != null && secondTrain != null) {
            return firstTrain.getNumber() < secondTrain.getNumber();
        }
        return false;
    }

    public static void findTrainByNumber(Train[] trains, int number) {
        for (int i = 0; i < trains.length; i++) {
            if (number == trains[i].getNumber()) {
                System.out.println(trains[i].toString());
            }
        }
    }

    public static Train[] sortByDestination(Train[] trains) {
        if (trains != null) {
            for (int i = 0; i < trains.length; i++) {
                for (int j = 0; j < trains.length; j++) {
                    if (compareByDestination(trains[i], trains[j])) {
                        Train train = trains[i];
                        trains[i] = trains[j];
                        trains[j] = train;
                    }
                }
            }
            return trains;
        }
        return new Train[]{};
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
