package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */

public class Bank
{
    List<BankAccount> customerAccounts;

    public Bank()
    {
        customerAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber)
    {
        BankAccount removedAccount = customerAccounts.get(indexNumber);
        customerAccounts.remove(removedAccount);

        return removedAccount;
    }

    public void addBankAccount(BankAccount bankAccount)
    {
        customerAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount)
    {
        return customerAccounts.contains(bankAccount);
    }
}
