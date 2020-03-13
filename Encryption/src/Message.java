/**@author Stephen Romer && Brandon
//@version 27-11-2017
Message Class
*/

public class Message
{   
    //Fields
    public String messageText;
    public boolean isEncrypted;
    
    //Constructors
    public Message()
    {
        messageText = "This is the starting message";
        isEncrypted = false;
    }
    
    public Message(String myMessage, boolean myStatus)
    {
        messageText = myMessage;
        isEncrypted = myStatus;
    }
    
    //Methods-------------------------------------------------------------------------
    
    //Getters
    public void printMessage()
    {
        System.out.println(messageText); //prints String stored in message
    }
    
    public boolean getStatus()
    {
        return isEncrypted; //gets status stored in message
    }
    
    public String getMessage()
    {
        return messageText; //gets whats stored in the string of message
    }
    //Setters
    public void changeMessage(String newMessage)
    {
        messageText = newMessage; //sets the message entered in the driver
    }
    
    public void changeStatus(boolean newStatus)
    {
        isEncrypted = newStatus; //sets the status entered in the driver
    }
}