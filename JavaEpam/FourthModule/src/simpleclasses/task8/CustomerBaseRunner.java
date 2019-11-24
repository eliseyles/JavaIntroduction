//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

import simpleclasses.task8.container.CustomerBase;
import simpleclasses.task8.entity.Customer;
import simpleclasses.task8.logic.CustomerBaseLogic;
import simpleclasses.task8.view.CustomerBaseView;

import java.util.Random;

public class CustomerBaseRunner {
    public static final String[] SURNAME = new String[]{"hfskd", "fhsdjkfh", "huser", "rtyui", "oeiuew", "uirower", "aaand", "bfdbkr"};
    public static final String[] NAME = new String[]{"joiew", "ioewds", "owep", "owdssfv", "koim", "pexk"};
    public static final String[] PATRONYMIC = new String[]{"klsr", "qerd", "qwer", "poiuumxz", "iuytr", "mnbv"};
    public static final String[] ADDRESS = new String[]{"lj;lsjfhlksdf", "seyiruyojnf", "ndksd", "ouirt", "plkjnbvc", "wedfghjk"};
    public static final String[] CARD_ID = new String[]{"123", "124", "125", "126", "127", "128"};
    public static final String[] BANK_ACCOUNT = new String[]{"78965412", "3215857", "5413548", "798645241", "32654", "7486541"};
    public static final int CUSTOMER_NUMBER = 5;

    public static void main(String[] args) {
        CustomerBase customerBase = new CustomerBase();
        for (int i = 0; i < CUSTOMER_NUMBER; i++) {
            customerBase.add(new Customer(SURNAME[new Random().nextInt(SURNAME.length)],
                    NAME[new Random().nextInt(NAME.length)],
                    PATRONYMIC[new Random().nextInt(PATRONYMIC.length)],
                    ADDRESS[new Random().nextInt(ADDRESS.length)],
                    CARD_ID[new Random().nextInt(CARD_ID.length)],
                    BANK_ACCOUNT[new Random().nextInt(BANK_ACCOUNT.length)]));
        }

        new CustomerBaseView().printCustomerBase(customerBase);

        new CustomerBaseView().printCustomerBase(new CustomerBaseLogic().sortFullName(customerBase));
        new CustomerBaseView().printCustomerBase(
                new CustomerBaseLogic().getCustomerWithValidCard(customerBase, "123", "125"));
    }
}
