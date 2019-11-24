package by.training.eliseyles.simpleclasses.task8.view;

import by.training.eliseyles.simpleclasses.task8.container.CustomerBase;

public class CustomerBaseView {

    public void printCustomerBase(CustomerBase customerBase) {
        for(int i = 0; i < customerBase.size(); i++) {
            new CustomerView().print(customerBase.getCustomer(i));
        }
        System.out.println();
    }
}
