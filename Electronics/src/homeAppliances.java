/** Electronics Project: homeAppliances
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class homeAppliances extends electronics
{
    protected String room;
    
     /**
     * @param Main Constructor -- homeAppliances
     */
    public homeAppliances(double priceOf, double weightOf, String manuOf, String roomOf)
    {
        super(priceOf, weightOf, manuOf);
        room  = roomOf;
    }
    
     /**
     * @param setRoom -- sets room
     */
    public void setRoom(String newRoom)
    {
        room = newRoom;
    }
    
     /**
     * @param getRoom -- getsRoom
     */
    public String getRoom()
    {
        return room;
    }
    
     /**
     * @param toString -- prints info
     */
    public String toString()
    {
        String Overview;
        
        Overview = "Price: " + price;
        Overview += "\nWeight: " + weight;
        Overview += "\nName of Manu: " + nameOfManu;
        Overview += "\nRoom: " + room + "\n";
        
        return Overview;
    }
}