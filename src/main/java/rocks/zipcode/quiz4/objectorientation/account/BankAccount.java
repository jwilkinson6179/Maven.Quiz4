package rocks.zipcode.quiz4.objectorientation.account;

import java.math.BigDecimal;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable
{
    Double balance;

    public BankAccount(Long id, Double balance)
    {
        super(id);
        this.balance = balance;
    }

    public BankAccount()
    {
        super(null);
        this.balance = 0.0;
    }

    public void setBalance(Double val)
    {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy)
    {
        if(amountToIncreaseBy < 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            balance += amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy)
    {
        if(amountToDecreaseBy < 0)
        {
            throw new IllegalArgumentException();
        } else if(amountToDecreaseBy > balance)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            balance -= amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance()
    {
        return balance;
    }
}
