//Stephen Romer
//Bank Account
//27-09-2017

public class BankAccount
{
    //fields
    private double balance;
    private String owner;

    //constructors 
    public BankAccount()
    {
        //initialize instance variables
        balance = 1.0;
        owner = "Stephen Romer";
    }

    public BankAccount(String myOwner, double start)
    {
        //initialize instance variables
        balance = start;
        owner = myOwner;
    }

    public BankAccount(double start)
    {
        balance = start; //Practice #1
        owner = "Stephen Romer";
    }

    public BankAccount(String myOwner)
    {
        balance = 1.0; //Practice #2
        owner = myOwner;
    }

    //methods
    public double getBalance()
    {
        return balance;   
    }

    public String getOwner()
    {
        return owner; //Example #3
    }

    public void mutateOwner(String mutation)
    {
        owner = owner + mutation; //Example #4
    }

    public void changeOwner(String newOwner)    
    {        
        owner = newOwner; //Example #5    
    }       

    public void deposit(double amount)
    {
        balance = balance + amount;   
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;   
    }

    public void printInfo()
    {
        System.out.println("This is the balance: $" + balance);
        System.out.println("Account Owner: " + owner);    
    }

    public void transferTo(BankAccount other, double amount)
    {
        if(amount <= this.balance)
        {
            this.withdraw(amount);
            other.deposit(amount);
        }
        else
            System.out.println("Error: Insufficient funds.");
    }
}