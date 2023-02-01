import java.util.ArrayList;

public class Customer
{
    private String name;
    private Status status;
    private int id;

    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public Customer(String name, Status status, int id)
    {
        this.name = name;
        this.status = status;
        this.id = id;
    }

    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    public void remove(BankAccount account)
    {
        accounts.remove(account);
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public String getName()
    {
        return name;
    }

    public Status getStatus()
    {
        return status;
    }

    public int getId()
    {
        return id;
    }

}
