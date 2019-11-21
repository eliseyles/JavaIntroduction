package simpleclasses.task4;

public class DepotView {
    public static void printDepot(Depot depot) {
        for (Train train : depot.getTrains()) {
            TrainView.printTrain(train);
        }
        System.out.println();
    }
}
