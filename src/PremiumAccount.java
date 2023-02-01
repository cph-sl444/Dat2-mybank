public class PremiumAccount {
    public PremiumAccount(double balance, Customer owner) {
        super(balance, owner);
    }
    @Override
    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public boolean withdraw(double amount) {
        //No negative amount
        if (amount <= 0) {
            System.out.println("The withdrawn amount must be positive ");
            //Throw Exception
            return false;
        }

        //No exceeding balance
        if (balance < amount) {
            System.out.println("Amount exceeds balance. Your balance is: " + balance);
            //Throw Exception
            return false;
        }

        // Successful  withdraw
        if (balance > amount)
            balance = balance - amount;
        System.out.println("You have withdrawn: " + amount + " Your balance is now: " + balance);
        return true;
    }
}
