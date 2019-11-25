package by.training.eliseyles.agregation.task4.view;

import by.training.eliseyles.agregation.task4.container.Bank;

public class BankView {
    public void print(Bank bank) {
        for (int i = 0; i < bank.size(); i++) {
            new AccountView().print(bank.getAccount(i));
        }
        System.out.println();
    }

    public void printAmount(int amount) {
        System.out.println(amount);
        System.out.println();
    }
}
