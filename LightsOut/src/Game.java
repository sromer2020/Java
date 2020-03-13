/**
 * Game Class for LightsOut Program
 * @author Stephen Romer
 * @author romer@hartford.edu
 * @version 18-12-2017
 * @since 16-12-2017
 */

import java.util.*;

/**
 *  This class handles the basic input from the user and calls methods from the appropriate classes 
 */
public class Game
{
    Game()
    {   
        Scanner input = new Scanner(System.in);
        int numLights = -1;
        
        do //loop to prompt how many lights are chosen, doesnt end unless
        {
            System.out.println("Please enter the number of lights you wish to play with! (enter 0 to stop)");
            numLights = input.nextInt();
            Light theLights = new Light(numLights); //creates light object

            if(numLights > 5 && numLights <= 15)
            {   
                for(int i = 0; i < 100; i++)
                {
                    theLights.printLights(); //prints lights
                    theLights.flip(numLights); //toggles the chosen lights
                    theLights.hasWon();   // ends the game when winning conditions have been met
                }
                System.out.println("GAME OVER"); //displayed when game is won
            }
            else if(numLights != 0)
            {
                System.out.println("Please choose an integer between 6-15\n"); //catches wrong inputs
            }
            else
            {          
                System.out.println("GAME OVER"); //stops program
            }
        }
        while(numLights != 0 && numLights < 6 || numLights > 15); //conditions for the loop
    }
}
