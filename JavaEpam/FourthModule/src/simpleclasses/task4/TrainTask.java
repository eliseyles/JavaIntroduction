//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления

package simpleclasses.task4;

import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;

import java.util.Random;
import java.util.Scanner;

public class TrainTask {
    public static final String[] DESTINATION = new String[]{"Moscow", "Brest", "Minsk", "Erevan", "Bobruisk"};
    public static final int[][] TIME = new int[][]{{11, 12}, {9, 0}, {9, 15}, {16, 30}, {23, 22}, {20, 40}};


    public static void main(String[] args) {
        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train(DESTINATION[new Random().nextInt(DESTINATION.length)],
                    new Random().nextInt(1000), TIME[new Random().nextInt(TIME.length)]);
        }
        printTrains(trains);
        printTrains(sortByNumber(trains));

        int number = new Scanner(System.in).nextInt();
        findTrainByNumber(trains, number);

        printTrains(sortByDestination(trains));

    }

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

    public static void printTrains(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].toString());
        }
        System.out.println();
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
