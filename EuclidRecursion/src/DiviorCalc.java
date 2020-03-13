//Stephen Romer
//Euclid Recursion
//Calculation Class

public class DiviorCalc 
{   

    public static int gcd(int num1, int num2)
    {	
    	//Euclid's Algorithim / Recursion
    	
        if (num2 == 0) 

            return num1;

        else if (num1 >= num2 && num2 > 0)
            
        	return gcd(num2, num1 % num2);

        else 
        
            return gcd(num2, num1);
    }
}
