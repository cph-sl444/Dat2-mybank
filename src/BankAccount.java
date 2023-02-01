

public abstract class BankAccount
{

    protected double balance;
    protected Customer owner;


    public abstract void setOwner(Customer owner);


    public abstract boolean withdraw(double amount);

    public int getId()
    {
        return owner.getId();
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
