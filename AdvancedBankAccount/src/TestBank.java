public class TestBank
{
    public static void main(String[] args)
    {
        //create a Bank using default constructor and test all methods while printing in between
        Bank theBank1 = new Bank();
        theBank1.printCompanyReport();
        System.out.println("Total funds are: " + theBank1.calcTotalFunds());
        theBank1.chargeFees(0.50);
        theBank1.printCompanyReport();
        theBank1.addInterest();
        theBank1.printCompanyReport();
        
        
        //first create a preexisting array of Bank accounts from a Bank that "closed"
        BankAccount[] closedbank = new BankAccount[10];
        for (int i = 0; i < 10; i++)
        {
            closedbank[i] = new BankAccount();
            closedbank[i].deposit(100);
        }
        
        //create a Bank using the 2nd constructor and test all methods while printing in between
        Bank theBank2 = new Bank(closedbank);
        theBank2.printCompanyReport();
        System.out.println("Total funds are: " + theBank2.calcTotalFunds());
        theBank2.chargeFees(0.50);
        theBank2.printCompanyReport();
        theBank2.addInterest();
        theBank2.printCompanyReport();
        
        //create a Bank using 3rd constructor and test all methods while printing in between
        Bank theBank3 = new Bank("Randy Random");
        theBank3.printCompanyReport();
        System.out.println("Total funds are: " + theBank3.calcTotalFunds());
        theBank3.chargeFees(0.50);
        theBank3.printCompanyReport();
        theBank3.addInterest();
        theBank3.printCompanyReport();
    }
}
