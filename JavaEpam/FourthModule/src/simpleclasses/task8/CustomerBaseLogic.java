//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

public class CustomerBaseLogic {
    public CustomerBase sortFullName(CustomerBase customerBase) {
        if (customerBase != null) {
            for (int i = 0; i < customerBase.size(); i++) {
                for (int j = 0; j < customerBase.size(); j++) {
                    if (compareByDestination(customerBase.getCustomer(i), customerBase.getCustomer(j))) {
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

    private boolean compareByDestination(Customer firstCustomer, Customer secondCustomer) {
        if (firstCustomer != null && secondCustomer != null) {
            if (firstCustomer.getSurname().equals(secondCustomer.getSurname())) {
                if (firstCustomer.getName().equals(secondCustomer.getName())) {
                    return String.CASE_INSENSITIVE_ORDER.
                            compare(firstCustomer.getPatronymic(), secondCustomer.getPatronymic()) < 0;
                } else {
                    return String.CASE_INSENSITIVE_ORDER.
                            compare(firstCustomer.getName(), secondCustomer.getName()) < 0;
                }
            } else {
                return String.CASE_INSENSITIVE_ORDER.
                        compare(firstCustomer.getSurname(), secondCustomer.getSurname()) < 0;
            }
        }
        return false;
    }
    
}
