//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package simpleclasses.task8;

import java.util.Objects;

public class Customer {
    private static int customerCount = 1;
    private int id;
    private Person person;
    private String creditCardId;
    private String bankAccountId;


    public Customer() {
        id = customerCount;
        person = new Person();
        creditCardId = "";
        bankAccountId = "";
        customerCount++;
    }

    public Customer(Person person, String creditCardId, String bankAccountId) {
        this.id = customerCount;
        this.person = person;
        this.creditCardId = creditCardId;
        this.bankAccountId = bankAccountId;
        customerCount++;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(String creditCardId) {
        this.creditCardId = creditCardId;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(person, customer.person) &&
                Objects.equals(creditCardId, customer.creditCardId) &&
                Objects.equals(bankAccountId, customer.bankAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, creditCardId, bankAccountId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", person=" + person +
                ", creditCardId='" + creditCardId + '\'' +
                ", bankAccountId='" + bankAccountId + '\'' +
                '}';
    }
}
