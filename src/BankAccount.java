

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
        if (amount<= 0){
            System.out.println("The deposited amount must be positive");
            //thow specific exeption
        }
        else {
            balance = balance + amount;
            System.out.println("You have deposited: "+ amount + " Your balance is now: " + balance);
        }
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
