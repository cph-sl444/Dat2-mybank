public class PenguinAccount extends BankAccount
{

    @Override
    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }

    @Override
    public boolean withdraw(double amount)
    {
        return false;
    }






}
