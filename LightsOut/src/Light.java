/**
 * Driver Class for LightsOut Program
 * @author Stephen Romer
 * @author romer@hartford.edu
 * @version 18-12-2017
 * @since 16-12-2017
 */

import java.util.*;

/**
 *  This class handles the light structures and implements them into the game class when called upon
 */
public class Light
{   
    //fields
    private boolean[] lights;
    private Random random = new Random();
    private Scanner choice = new Scanner(System.in);

    /**
     *  @param The Main Light Constrcutor
     */

    //Constructors
    public Light(int numLights)
    {
        lights = new boolean[numLights];

        for (int i = 0; i < lights.length; i++) 
        {
            lights[i] = random.nextBoolean(); //assigns random boolean variables for the array
        }
    }

    /**
     *  @param Print Light Method, handles the formatting of the visible lights
     */
    public void printLights() //prints the lights out
    {   
        String[] allLights;
        allLights = new String[]{"","","","","","","","","","","","","","",""};

        for(int i = 0; i < lights.length; i++)

            if(lights[i] == true)
            {
                String theLight = "|X|";
                allLights[i] = theLight;
            }
            else //assigns the boolean variables to their string counterparts (x=true/on, o=false/off)
            {
                String theLight = "|O|";
                allLights[i] = theLight;
            } 

        System.out.println(allLights[0] + allLights[1] + allLights[2] + allLights[3] + allLights[4] + allLights[5] + allLights[6] + allLights[7] + allLights[8] + allLights[9] + allLights[10] + allLights[11] + allLights[12] + allLights[13] + allLights[14]);
        System.out.println(" 0  1  2  3  4  5  6  7  8  9  10  11  12  13  14 "); //displys rows made
    }

    /**
     *  @param Flip method, handles the algorithim of changing the lights, certain pattern
     */
    public void flip(int numLights) //method that changes the boolean value of the lights
    {
        System.out.println("Choose a light to toggle: ");
        int lightChosen = choice.nextInt();

       
        try
        {
            lights[lightChosen] = !lights[lightChosen]; //swaps the values
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            //null
        }   
        try
        {
            lights[lightChosen+1] = !lights[lightChosen+1]; //swaps the values
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            //null
        }   
        try
        {
            lights[lightChosen-1] = !lights[lightChosen-1]; //swaps the values
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            //null
        }    
    }

    /**
     * @param Win method which watches and returns when the game has been won.
     */
    public void hasWon()
    {
        try
        {
            if((lights[0] == false && lights[1] == false && lights[2] == false && lights[3] == false && lights[4] == false && lights[5] == false && lights[6] == false && lights[7] == false && lights[8] == false && lights[9] == false && lights[10] == false && lights[11] == false && lights[12] == false && lights[13] == false && lights[14] ==false))
            {
                //IO Exception is needed
            }
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("YOU WIN");
        }    
    }
}