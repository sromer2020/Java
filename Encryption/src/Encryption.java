/**@author Stephen Romer && Brandon
//@version 27-11-2017
Encrytion Class
*/

import java.util.*;

public class Encryption
{
    //Field
    private static String plainAlph = "abcdefghijklmnopqrstuvwxyz";
    private String cipherAlph;

    //Constructor
    public Encryption()
    {
        cipherAlph = "bcdefghijklmnopqrstuvwxyza";
    }

    //Methods
    public static Message encrypt(Message theMessage)
    {  
        //theMessage.printMessage(); //tests for whether the input is registered from the driver
        //System.out.println(theMessage.getStatus()); //TESTSS     
        //System.out.println(theMessage.getMessage().length()); //tests whether to the length get method works

        for (int i = 0; i < theMessage.getMessage().length(); i++)
        {
            char ch = theMessage.getMessage().charAt(i);

            if('a' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("a","b"));
            if('b' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("b","c"));
            if('c' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("c","d"));
            if('d' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("d","e"));
            if('e' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("e","f"));
            if('f' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("f","g"));
            if('g' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("g","h"));
            if('h' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("h","i"));
            if('i' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("i","j"));
            if('j' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("j","k"));
            if('k' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("k","l"));
            if('l' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("l","m"));
            if('m' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("m","n"));
            if('n' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("n","o"));
            if('o' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("o","p"));
            if('p' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("p","q"));
            if('q' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("q","r"));
            if('r' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("r","s"));
            if('s' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("s","t"));
            if('t' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("t","u"));
            if('u' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("u","v"));
            if('v' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("v","w"));
            if('w' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("w","x"));
            if('x' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("x","y"));
            if('y' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("y","z"));
            if('z' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("z","a"));
        }

        return theMessage;      
    }

    public static Message decrypt(Message theMessage)
    {
        //theMessage.printMessage(); //tests for whether the input is registered from the driver
        //System.out.println(theMessage.getStatus());

        for (int i = 0; i < theMessage.getMessage().length(); i++)
        {
            char ch = theMessage.getMessage().charAt(i);

            if('a' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("a","z"));
            if('b' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("b","a"));
            if('c' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("c","b"));
            if('d' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("d","c"));
            if('e' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("e","d"));
            if('f' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("f","e"));
            if('g' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("g","f"));
            if('h' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("h","g"));
            if('i' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("i","h"));
            if('j' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("j","i"));
            if('k' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("k","j"));
            if('l' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("l","k"));
            if('m' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("m","l"));
            if('n' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("n","m"));
            if('o' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("o","n"));
            if('p' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("p","o"));
            if('q' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("q","p"));
            if('r' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("r","q"));
            if('s' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("s","r"));
            if('t' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("t","s"));
            if('u' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("u","t"));
            if('v' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("v","u"));
            if('w' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("w","v"));
            if('x' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("x","w"));
            if('y' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("y","x"));
            if('z' == ch ) theMessage.changeMessage(theMessage.getMessage().replaceAll("z","y"));      
        }
        
        return theMessage;
    }
}