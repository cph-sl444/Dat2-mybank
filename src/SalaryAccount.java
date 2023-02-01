public class SalaryAccount extends BankAccount
{

    double balance = 10000;
    Customer owner;

    @Override
    public void setOwner(Customer owner)
    {

    }

    @Override
    public boolean withdraw(double amount)
    {
        if(balance <= amount)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public void deposit(double amount)
    {
        double result = amount * 0.10;

    }

    public double getBalance()
    {
        return balance;
    }

    public Customer getOwner()
    {
        return owner;
    }



}
