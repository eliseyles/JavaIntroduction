//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package by.training.eliseyles.simpleclasses.task8.logic;

import by.training.eliseyles.simpleclasses.task8.container.CustomerBase;
import by.training.eliseyles.simpleclasses.task8.entity.Customer;

public class CustomerBaseLogic {
    public CustomerBase sortFullName(CustomerBase customerBase) {
        if (customerBase != null) {
            for (int i = 0; i < customerBase.size(); i++) {
                for (int j = 0; j < customerBase.size(); j++) {
                    if (compareByName(customerBase.getCustomer(i), customerBase.getCustomer(j))) {
                        Customer customer = customerBase.getCustomer(i);
                        customerBase.setCustomer(i, customerBase.getCustomer(j));
                        customerBase.setCustomer(j, customer);
                    }
                }
            }
            return customerBase;
        }
        return new CustomerBase();
    }

    private boolean compareByName(Customer firstCustomer, Customer secondCustomer) {
        if (firstCustomer != null && secondCustomer != null) {
            boolean result = false;
            if (firstCustomer.getSurname().compareTo(secondCustomer.getSurname()) == 0){
                if (firstCustomer.getName().compareTo(secondCustomer.getName()) == 0){
                    result =  firstCustomer.getPatronymic().compareTo(secondCustomer.getPatronymic()) < 0;
                }
                result =  firstCustomer.getName().compareTo(secondCustomer.getName()) < 0;
            }
            result =  firstCustomer.getSurname().compareTo(secondCustomer.getSurname()) < 0;
            return result;
        }
        return false;
    }

    public CustomerBase getCustomerWithValidCard(CustomerBase customerBase, String lowBound, String highBound) {
        if (lowBound != null && highBound != null) {
            CustomerBase validCardCustomers = new CustomerBase();
            for (int i = 0; i < customerBase.size(); i++) {
                if (isCardNumberInBounds(customerBase.getCustomer(i).getCreditCardId(),lowBound, highBound)) {
                    validCardCustomers.add(customerBase.getCustomer(i));
                }
            }
            return validCardCustomers;
        }
        return new CustomerBase();
    }

    private boolean isCardNumberInBounds(String cardNumber, String lowBound, String highBound) {
        return cardNumber.compareTo(lowBound) >= 0
                && cardNumber.compareTo(highBound) <= 0;

    }
}
