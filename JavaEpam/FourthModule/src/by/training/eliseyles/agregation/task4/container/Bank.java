//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

package by.training.eliseyles.agregation.task4.container;

import by.training.eliseyles.agregation.task4.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void add(Account account) {
        if (account != null) {
            accounts.add(account);
            account.setAmount(account.getAmount() + 1);
        }
    }

    public int size() {
        return accounts.size();
    }

    public Account getAccount(int index) {
        if (isValidIndex(index)) {
            return accounts.get(index);
        }
        return null;
    }

    public void setAccount(int index, Account account) {
        if (isValidIndex(index) && account != null) {
            accounts.set(index, account);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
