package by.training.eliseyles.agregation.task4.view;

import by.training.eliseyles.agregation.task4.entity.Account;

public class AccountView {
    public void print(Account account) {
        System.out.println("Account " + account.getAccountNumber() + " " + account.getCustomerName() +
                " " + account.getAmount() + " " + (account.isBlockAccount() ? "blocking" : " active"));
    }
}
