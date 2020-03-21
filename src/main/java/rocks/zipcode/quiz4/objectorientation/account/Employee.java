package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable
{
    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage;
    Double moneyEarned;

    public Employee()
    {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
        hoursWorked = 0.0;
        hourlyWage = 35.0;
        moneyEarned = 0.0;
    }

    public BankAccount getBankAccount()
    {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy)
    {
        moneyEarned -= amountToIncreaseBy;
        this.bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy)
    {
        moneyEarned += amountToDecreaseBy;
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours)
    {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyEarned;
    }
}
