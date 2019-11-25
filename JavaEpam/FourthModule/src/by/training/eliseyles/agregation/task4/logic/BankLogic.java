//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

package by.training.eliseyles.agregation.task4.logic;

import by.training.eliseyles.agregation.task4.container.Bank;
import by.training.eliseyles.agregation.task4.entity.Account;

public class BankLogic {

    public void blockAccount(Bank bank, Account account) {
        if (bank != null) {
            for (int i = 0; i < bank.size(); i++) {
                if (account.equals(bank.getAccount(i))) {
                    bank.getAccount(i).setBlockAccount(true);
                }
            }
        }
    }

    public void unblockAccount(Bank bank, Account account) {
        if (bank != null) {
            for (int i = 0; i < bank.size(); i++) {
                if (account.equals(bank.getAccount(i))) {
                    bank.getAccount(i).setBlockAccount(false);
                }
            }
        }
    }

    public Bank findAccountByAccountNumber(Bank bank, String number) {
        if (bank != null) {
            Bank oneNumberBank = new Bank();
            for (int i = 0; i < bank.size(); i++) {
                if (number.equals(bank.getAccount(i).getAccountNumber())) {
                    oneNumberBank.add(bank.getAccount(i));
                }
            }
            return oneNumberBank;
        }
        return new Bank();
    }

    public Bank findAccountsByCustomerName(Bank bank, String customerName) {
        if (bank != null) {
            Bank oneCustomerBank = new Bank();
            for (int i = 0; i < bank.size(); i++) {
                if (customerName.equals(bank.getAccount(i).getCustomerName())) {
                    oneCustomerBank.add(bank.getAccount(i));
                }
            }
            return oneCustomerBank;
        }
        return new Bank();
    }

    public Bank sortByCustomerName(Bank bank) {
        if (bank != null) {
            for (int i = 0; i < bank.size(); i++) {
                for (int j = 0; j < bank.size(); j++) {
                    if (compareByName(bank.getAccount(i), bank.getAccount(j))) {
                        Account account = bank.getAccount(i);
                        bank.setAccount(i, bank.getAccount(j));
                        bank.setAccount(j, account);
                    }
                }
            }
            return bank;
        }
        return new Bank();
    }

    private boolean compareByName(Account firstAccount, Account secondAccount) {
        return firstAccount.getCustomerName().compareTo(secondAccount.getCustomerName()) < 0;
    }

    public Bank sortByAccountNumber(Bank bank) {
        if (bank != null) {
            for (int i = 0; i < bank.size(); i++) {
                for (int j = 0; j < bank.size(); j++) {
                    if (compareByNumber(bank.getAccount(i), bank.getAccount(j))) {
                        Account account = bank.getAccount(i);
                        bank.setAccount(i, bank.getAccount(j));
                        bank.setAccount(j, account);
                    }
                }
            }
            return bank;
        }
        return new Bank();
    }

    private boolean compareByNumber(Account firstAccount, Account secondAccount) {
        return firstAccount.getAccountNumber().compareTo(secondAccount.getAccountNumber()) < 0;
    }

    public int getAllUnblockAmount(Bank bank) {
        if (bank != null) {
            int fullAmount = 0;
            for (int i = 0; i < bank.size(); i++) {
                if (!bank.getAccount(i).isBlockAccount()) {
                    fullAmount += bank.getAccount(i).getAmount();
                }
            }
            return fullAmount;
        }
        return 0;
    }

    public int getAllUnblockPositiveAmount(Bank bank) {
        if (bank != null) {
            int fullAmount = 0;
            for (int i = 0; i < bank.size(); i++) {
                if (!bank.getAccount(i).isBlockAccount() && bank.getAccount(i).getAmount() > 0) {
                    fullAmount += bank.getAccount(i).getAmount();
                }
            }
            return fullAmount;
        }
        return 0;
    }

    public int getAllUnblockNegativeAmount(Bank bank) {
        if (bank != null) {
            int fullAmount = 0;
            for (int i = 0; i < bank.size(); i++) {
                if (!bank.getAccount(i).isBlockAccount() && bank.getAccount(i).getAmount() < 0) {
                    fullAmount += bank.getAccount(i).getAmount();
                }
            }
            return fullAmount;
        }
        return 0;
    }

}
