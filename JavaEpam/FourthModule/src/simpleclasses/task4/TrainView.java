package simpleclasses.task4;

public class TrainView {

    public static void printTrain(Train train) {
        System.out.println("Train number " + train.getNumber() +
                " destination " + train.getDestination() +
                " time " + train.getTime()[0] + ":" + train.getTime()[1]);
    }
}
