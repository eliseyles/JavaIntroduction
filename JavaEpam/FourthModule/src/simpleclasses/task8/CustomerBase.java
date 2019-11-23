//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class CustomerBase {
    private ArrayList<Customer> customers;

    public CustomerBase() {
        customers = new ArrayList<Customer>();
    }

    public CustomerBase(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void add(Customer customer) {
        if (customer != null) {
            customers.add(customer);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "customers=" + customers +
                '}';
    }
}
