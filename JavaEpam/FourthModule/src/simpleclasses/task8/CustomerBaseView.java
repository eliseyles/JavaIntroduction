package simpleclasses.task8;

public class CustomerBaseView {

    public void printCustomerBase(CustomerBase customerBase) {
        for(int i = 0; i < customerBase.size(); i++) {
            new CustomerView().print(customerBase.getCustomer(i));
        }
        System.out.println();
    }
}
