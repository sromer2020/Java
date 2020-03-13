/** Electronics Project: driver
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class driver
{
    public static void main(String args[])
    {
        electronics test1 = new electronics(150, 20, "test1");
        electronics test2 = new electronics(100, 37, "test2");
        electronics testAppliance;
        electronics testPrinter;
        electronics testPortable;
        electronics testPhone;
        
        System.out.println(test1 + "\n" + test2);
        
        System.out.println("\n\t-----END BLOCK 1-----\n");
        
        testAppliance = new homeAppliances(1000, 200, "testAppliance", "kitchen");
        testPrinter = new printer(90, 9, "testPrinter", "office", 100, 60, true);
        
        testPortable = new portableElectronics(250, 2, "testPortable", 95);
        testPhone = new cellphone(500, 1.5, "testPhone", 60, 5821044);
        
        System.out.println(testAppliance + "\n" + testPrinter + "\n" + testPortable + "\n" + testPhone);
        
        System.out.println("\n\t-----END BLOCK 2-----\n");
        
        testAppliance.setName("Stove");
        System.out.println(testAppliance.getName());
       
        testPortable.setName("Phone");
        System.out.println(testPortable.getName());
        
        System.out.println("\n\t-----END BLOCK 3-----\n");
    }
}