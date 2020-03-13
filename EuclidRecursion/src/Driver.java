//Stephen Romer
//Euclid Recursion
//Driver Class

import java.util.Scanner;

public class Driver
{   
    public static void main(String[] args) 
    {   
    	//fields 
    	
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        //prompts
        
        System.out.print("Enter a number: "); //prompts for first number
        num1 = input.nextInt();
        
        System.out.print("Enter another number: "); //prompts for second number
        num2 = input.nextInt();
        
        // print out statement 
        
        System.out.print("The GCD of " + num1 + " and " + num2 + " is " + DiviorCalc.gcd(num1,num2));
    }
}
