//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

public class CustomerBaseLogic {
    public static CustomerBase sortByDestination(CustomerBase customerBase) {
        if (customerBase != null) {
            for (int i = 0; i < customerBase.getTrains().size(); i++) {
                for (int j = 0; j < customerBase.getTrains().size(); j++) {
                    if (compareByDestination(customerBase.getTrains().get(i), customerBase.getTrains().get(j))) {
                        Train train = customerBase.getTrains().get(i);
                        customerBase.getTrains().set(i, customerBase.getTrains().get(j));
                        customerBase.getTrains().set(j, train);
                    }
                }
            }
            Class cl;
            return customerBase;
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
