/**@author Stephen Romer && Brandon
//@version 27-11-2017
Driver Class
*/
import java.util.*;

public class Driver
{
    public static void main(String args[])
    {   
        //Fields
        Message theMessage = new Message();
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        //Start of Program (title and input selections)
        System.out.println("---------------------------------");
        System.out.println("Welecome to the Message Machine!");
        System.out.println("---------------------------------\n");
        System.out.print("Type 1 to begin encrypting a message or 2 to decrypt a message: ");
        int myChoice = input.nextInt();
        
        //If statements that are registered depending on choice for e or d
        if(myChoice == 1)
        {   
            System.out.print("\nPlease enter your message to encrypt: ");
            String words = scan.nextLine();
            
            theMessage.changeMessage(words.toLowerCase()); //sets string stored in message to the input
            theMessage.changeStatus(false); //sets boolean status stored in message based on the choice
            
            Encryption.encrypt(theMessage); //calls to the encrypt funtion
            theMessage.printMessage();
        }
        else if(myChoice == 2)
        {   
            System.out.print("\nPlease enter your message to decrypt: ");
            String words = scan.nextLine();
            
            theMessage.changeMessage(words.toLowerCase()); //sets string stored in message to the input
            theMessage.changeStatus(true); //sets boolean status stored in message based on the choice
            
            
            Encryption.decrypt(theMessage); //calls to the decrypt function
            theMessage.printMessage();
        }      
        else
        {
            System.out.println("That is not a valid choice, try again"); //default deterent from wrong inputs
        }
    }
}