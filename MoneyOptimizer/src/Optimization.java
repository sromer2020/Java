/**
 *Money Optimizer Program
 *
 *@author (Stephen Romer)
 *
 *@version (27-09-2017)
 */

import java.util.Scanner;

public class Optimization
{
    public static void main(String args[])
    {
        //Declarations
        double totalAmount;
        Scanner input = new Scanner(System.in);
		
		//Try - Catch Loop to handle non-numeric entries
        try
        {
            //Input Prompt
            System.out.println("Please enter a monetary amount: ");
            totalAmount = input.nextDouble(); 

            //Call to Optimizer
            moneyOptimizer(totalAmount);
        }  
        catch (Exception e) 
        {   
            //Handles non numeric inputs
            System.out.println("Please Enter a Valid Number");
        }
    }
    
    public static void moneyOptimizer(double totalAmount) //This method returns nothing
    { 
        //Declarations for the monetary abstracts
        int tens = 0; //1000
        int fives = 0; //500
        int ones = 0; //100
        int quarters = 0; //25
        int dimes = 0; //10
        int nickles = 0; //5
        int pennies = 0; //1          

        //Declaration and convertion of input to a single large integer
        int initialValue;        
        initialValue = (int)(totalAmount*100);

        //Everchanging new value
        int newValue;

        //If statements & Math
        if(initialValue == 0)
        {   
            //Values are already declared as 0
            System.out.println(tens + " ten dollar bill(s)");
            System.out.println(fives + " five dollar bill(s)");
            System.out.println(ones + " one dollar bill(s)");
            System.out.println(quarters + " quarter(s)");
            System.out.println(dimes + " dime(s)");
            System.out.println(nickles + " nickle(s)");
            System.out.println(pennies + " pennie(s)");
        }
        else if(initialValue > 0)
        {
            //tens
            tens = initialValue / 1000;
            newValue = initialValue % 1000;

            //fives
            fives = newValue / 500;
            newValue = newValue % 500;

            //ones
            ones = newValue / 100;
            newValue = newValue % 100;

            //quarters
            quarters = newValue / 25;
            newValue = newValue % 25;

            //dimes
            dimes = newValue / 10;
            newValue = newValue % 10;

            //nickles
            nickles = newValue / 5;
            newValue = newValue % 5;

            //pennies
            pennies = newValue / 1;
            newValue = newValue % 1;

            //Output
            System.out.println(tens + " ten dollar bill(s)");
            System.out.println(fives + " five dollar bill(s)");
            System.out.println(ones + " one dollar bill(s)");
            System.out.println(quarters + " quarter(s)");
            System.out.println(dimes + " dime(s)");
            System.out.println(nickles + " nickle(s)");
            System.out.println(pennies + " pennie(s)");
        }
        else
        {   
            //Handles negative inputs
            System.out.println("Please Enter a Positive Number Value");
        }
    }   
}