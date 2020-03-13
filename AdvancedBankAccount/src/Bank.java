public class Bank
{
    private BankAccount[] accounts;         //declares array of object references

    //default constructor
    public Bank()
    {
        accounts = new BankAccount[10];     //creates Array object and limits it to 10
        for (int i = 0; i < 10; i++)
        {
            accounts[i] = new BankAccount();        //fills each element in array with a reference to a newly made bankAccount object 
        }

        //alternate way of filling array using a temporary variable to refer to objects
        for (int i = 0; i < 10; i++)
        {
            BankAccount b = new BankAccount();
            accounts[i] = b;   //fills each element in array with a reference to the bankAccount object that is also referred to by b
        }
    }

    //this constructor requires that a reference to an already created array be passed as parameter
    public Bank (BankAccount[] premadeArray)
    {
        accounts = premadeArray;
    }

    //this constructor takes a parameter for the number of accounts to create and creates an array object of that size
    //it loops through and creates BankAccount objects with the given starting balance and stores references to them in the array field
    public Bank(String owner)
    {
        accounts = new BankAccount[100];
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new BankAccount(owner, (int)(Math.random() * 1000000 + 1)); 
        }
    }
    //this constructor takes a parameter for the number of accounts to create and creates an array object of that size
    //it loops through and creates BankAccount objects with the given starting balance and stores references to them in the array field
    public Bank(String owner, int numOfAccounts, double startingBalance)
    {
        accounts = new BankAccount[numOfAccounts];
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new BankAccount(owner, startingBalance); 
        }
    }

    //Gets balance of each account, sums them, and returns total
    public double calcTotalFunds()
    {
        double total = 0.0;
        for (BankAccount iterator:accounts)
        {
            total += iterator.getBalance();
        }
        return total;
    }

    //subtracts a given fee from each account in the bank
    public void chargeFees(double feeAmount)
    {
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i].withdraw(feeAmount);
        }
    }

    //adds 5% interest to all accounts.
    public void addInterest()
    {   
        for (BankAccount iterator:accounts)
        {
            double interest = iterator.getBalance() * 0.05;
            iterator.deposit(interest);
        }
    }

    //prints slips for all accounts.
    public void printCompanyReport()
    {
        System.out.println("Bank Report:");
        for (BankAccount iterator:accounts)
        {
            iterator.printSlip();
        }
    }    
}
