//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

package by.training.eliseyles.agregation.task4.entity;

import java.util.Objects;

public class Account {
    private String customerName;
    private String accountNumber;
    private int amount;
    private boolean blockAccount;

    public Account() {
        customerName = "";
        accountNumber = "";
        amount = 0;
        blockAccount = true;
    }

    public Account(String customerName, String accountNumber, int amount, boolean blockAccount) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.blockAccount = blockAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isBlockAccount() {
        return blockAccount;
    }

    public void setBlockAccount(boolean blockAccount) {
        this.blockAccount = blockAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return amount == account.amount &&
                blockAccount == account.blockAccount &&
                Objects.equals(customerName, account.customerName) &&
                Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, accountNumber, amount, blockAccount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", blockAccount=" + blockAccount +
                '}';
    }
}
