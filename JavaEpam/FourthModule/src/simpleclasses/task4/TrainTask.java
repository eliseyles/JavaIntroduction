////Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
////номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
////Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
////назначения должны быть упорядочены по времени отправления
//
//package simpleclasses.task4;
//
//import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TrainTask {
//    public static final String[] DESTINATION = new String[]{"Moscow", "Brest", "Minsk", "Erevan", "Bobruisk"};
//    public static final int[][] TIME = new int[][]{{11, 12}, {9, 0}, {9, 15}, {16, 30}, {23, 22}, {20, 40}};
//
//
//    public static void main(String[] args) {
//        Train[] trains = new Train[5];
//        for (int i = 0; i < trains.length; i++) {
//            trains[i] = new Train(DESTINATION[new Random().nextInt(DESTINATION.length)],
//                    new Random().nextInt(1000), TIME[new Random().nextInt(TIME.length)]);
//        }
//        TrainView.printTrains(trains);
//        TrainView.printTrains(TrainLogic.sortByNumber(trains));
//
//        int number = new Scanner(System.in).nextInt();
//        findTrainByNumber(trains, number);
//
//        printTrains(sortByDestination(trains));
//
//    }
//
//
//}
