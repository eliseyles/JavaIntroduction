package simpleclasses.task8.view;

import simpleclasses.task8.entity.Customer;

public class CustomerView {

    public void print(Customer customer) {
        System.out.println(customer.getId() + " " + customer.getSurname() + " "
                + customer.getName() + " " + customer.getPatronymic() + " " + customer.getAddress()
                + " cardID " + customer.getCreditCardId() + " accountID " + customer.getBankAccountId());
    }
}
