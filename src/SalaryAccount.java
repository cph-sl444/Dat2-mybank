public class SalaryAccount extends BankAccount
{
    private double creditlimit;
    double balance;
    Customer owner;
    public SalaryAccount(double balance, Customer owner,double creditlimit) {
        super(balanc

    public double getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(double creditlimit) {
        this.creditlimit = creditlimit;
    }

    @Override
    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }

    @Override
    public boolean withdraw(double amount)
    {
        //No negative amount
        if (amount <= 0) {
            System.out.println("The withdrawn amount must be positive ");
            //Throw Exeption
            return false;
        }


        //No exceeding creditlimit or overdraw
        if ((balance < amount) && (amount < creditlimit)) {
            System.out.println("Amount exceeds limit or balance. Your creditlimit is " + getCreditlimit() + " Your balance is: " + balance);
            //Throw Exeption
            return false;
        }
        // successful  withdraw
        if ((balance > amount) && (amount < creditlimit))
            balance = balance - amount;
        System.out.println("You have withdrawn: " + amount + " Your balance is now: " + balance);
        return true;
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
