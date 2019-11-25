//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

package by.training.eliseyles.agregation.task4;

import by.training.eliseyles.agregation.task4.container.Bank;
import by.training.eliseyles.agregation.task4.entity.Account;
import by.training.eliseyles.agregation.task4.logic.BankLogic;
import by.training.eliseyles.agregation.task4.view.BankView;

import java.util.Random;

public class BankRunner {
    public static final int SIZE = 10;
    public static final String[] NAMES = new String[]{"dsd", "dsdsd", "hasukf", "fjdk", "yreui", "fdleq",
            "fhdj", "as", "awe", "irej"};

    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < SIZE; i++) {
            bank.add(new Account(NAMES[new Random().nextInt(NAMES.length)],
                    Integer.toString(new Random().nextInt(9000) + 1000),
                    new Random().nextInt(1000) - 500,
                    false
            ));
        }

        BankView bankView = new BankView();

        bankView.print(bank);
        bankView.print(new BankLogic().findAccountsByCustomerName(bank, "dsd"));
        bankView.print(new BankLogic().findAccountByAccountNumber(bank, "5500"));
        bankView.print(new BankLogic().sortByAccountNumber(bank));
        bankView.print(new BankLogic().sortByCustomerName(bank));
        new BankLogic().blockAccount(bank, bank.getAccount(0));
        bankView.print(bank);
        bankView.printAmount(new BankLogic().getAllUnblockAmount(bank));
        bankView.printAmount(new BankLogic().getAllUnblockNegativeAmount(bank));
        bankView.printAmount(new BankLogic().getAllUnblockPositiveAmount(bank));
    }
}
