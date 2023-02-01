import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class BankAccountTest
{

   public static Customer owner;
   public static PenguinAccount pAccount;

   public static SalaryAccount sAccount;

    //runs before everything else
    @BeforeAll
    public static void setUpAccount()
    {
        owner = new Customer("Test", Status.ADULT, 30);
        pAccount = new PenguinAccount();
        sAccount = new SalaryAccount();

    }

    @Test
    void setOwner(Customer owner)
    {
       //assertEquals(owner, pAccount.setOwner(owner));
    }


    @Test
    void testWithdraw()
    {
        pAccount.deposit(100);
        pAccount.withdraw(50);
        assertEquals(50, pAccount.getBalance());
    }

    @Test
    void getId()
    {
        assertEquals(30, owner.getId());
    }

    @Test
    void deposit(double amount)
    {
      // assertEquals(100, sAccount.deposit(1000));
    }


    @Test
   void getBalance()
    {
        assertEquals(10000, sAccount.getBalance());
    }


    @Test
    void getOwner()
    {
        assertEquals(owner, sAccount.getOwner());
    }



}
