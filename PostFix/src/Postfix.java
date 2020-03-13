//Stephen Romer
//CS 220
//Prof. Duan
//Extra Credit #1

import java.util.*;

public class Postfix 
{
	public static void main(String[] args) 
	{

		System.out.println(postfixEvaluate("682/1-*"));
		System.out.println(postfixEvaluate("85*742+*+"));    
		System.out.println(postfixEvaluate("23+45*+")); 		       

	}

	public static int postfixEvaluate(String s) 
	{	
		String equation = s; //sets string s to variable equation so it reads better
		Stack<Integer> stk = new Stack<Integer> (); //stack declaration for the operations
		Scanner input = new Scanner(equation); 

		for(int i=0; i<equation.length(); i++)
		{
			char operator = equation.charAt(i); //takes each index from the string and casts it as an individual character 

			if(Character.isDigit(operator))
			{
				stk.push(operator + 0); //pushes the operation symbols to the stack
			}

			else
			{	
				//pops the two operands off the stack
				int operand1 = stk.pop();
				int operand2 = stk.pop();

				switch(operator)
				{
				case '+':
					stk.push(operand2 + operand1); //addition (adds result to stack)
					break;

				case '-':
					stk.push(operand2 - operand1); //subtraction (adds result to stack)
					break;

				case '/':
					stk.push(operand2 / operand1); //multiplication (adds result to stack)
					break;

				case '*':
					stk.push(operand2 * operand1); //division (adds result to stack)
					break;

				}

			}

		}

		return stk.pop();

	} 
}


