package simpleclasses.task4;

public class TrainView {
    public static void printTrains(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].toString());
        }
        System.out.println();
    }
}
