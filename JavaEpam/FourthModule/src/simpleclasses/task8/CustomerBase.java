//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerBase {
    private List<Customer> customers;

    public CustomerBase() {
        customers = new ArrayList<Customer>();
    }

    public CustomerBase(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public void add(Customer customer) {
        if (customer != null) {
            customers.add(customer);
        }
    }

    public int size() {
        return customers.size();
    }

    public Customer getCustomer(int index) {
        if(isValidIndex(index)) {
            return customers.get(index);
        }
        return null;
    }

    public void setCustomer(int index, Customer customer) {
        if (isValidIndex(index) && customer != null) {
            customers.set(index, customer);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
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
