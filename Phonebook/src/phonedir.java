//Stephen Romer
//CS 220
//Prof. Duan
//Extra Credit #2
//phonedir class

import java.util.*;

public class phonedir
{	

	public static void main(String args[]) //main method
	{	
		LinkedList<Person> directory = new LinkedList<Person>(); //linked list declaration
		Scanner input = new Scanner(System.in); 			//scanner declaration

		int runTime = 1;

		String recordMenu = "WELECOME TO THE PHONE DIRECTORY PROGRAM! " +
				"\na Show all records" +
				"\nd Delete the current record" +
				"\nf Change the first name in the current record" +
				"\nl Change the last name in the current record" +
				"\nn Add a new record" +
				"\np Change the phone number in the current record" +
				"\nq Quit" +
				"\ns Select a record from the record list to become the current record";



		while(runTime == 1)
		{
			System.out.println(recordMenu); //prints the record menu/interface	
			System.out.print("Enter the letter of the option you want: "); //asks for user-input
			String option = input.next(); //assigns input to variable option

			try
			{
				switch(option)
				{
				case "a":

					for(Person person: directory) 
					{
						System.out.println(person);

						if(directory.peekFirst() == null)
						{
							System.out.println("There are no records currently");
						}
					}
					break;

				case "d":

					directory.remove(0);
					
					break;

				case "f":

					break;

				case "l":

					break;

				case "n":

					System.out.println("Enter the First Name");
					String fName = input.next();

					System.out.println("Enter the Last Name");
					String lName = input.next();

					System.out.println("Enter the Phone Number");
					String pNum = input.next();

					Person newPerson = new Person(fName, lName, pNum); //creates a new person

					directory.add(newPerson); //adds the new person to the list

					break;

				case "p":

					break;

				case "q":

					runTime = 0; //found this nifty way to terminate a program on Stack overflow

					break;

				case "s":
					
					
					
					break;

				}


			}
			catch(Exception e)
			{
				System.out.println("That is an invalid selection, please choose a letter from the list above");
			}
		}
	}
}