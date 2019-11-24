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
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String creditCardId;
    private String bankAccountId;


    public Customer() {
        id = customerCount;
        surname = "";
        name = "";
        patronymic = "";
        address = "";
        creditCardId = "";
        bankAccountId = "";
        customerCount++;
    }

    public Customer(String surname, String name, String patronymic, String address, String creditCardId, String bankAccountId) {
        this.id = customerCount;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankAccountId = bankAccountId;
        customerCount++;
    }

    public int getId() {
        return id;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(creditCardId, customer.creditCardId) &&
                Objects.equals(bankAccountId, customer.bankAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, creditCardId, bankAccountId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardId='" + creditCardId + '\'' +
                ", bankAccountId='" + bankAccountId + '\'' +
                '}';
    }
}
