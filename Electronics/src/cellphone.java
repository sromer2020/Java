/** Electronics Project: cellphone
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class cellphone extends portableElectronics
{
    protected int phoneNumber;
    
     /**
     * @param Main Constructor -- cellPhone
     */
    public cellphone(double priceOf, double weightOf, String manuOf, int batteryOf, int  numberOf)
    {
        super(priceOf, weightOf, manuOf, batteryOf);
        phoneNumber = numberOf;
    }
    
     /**
     * @param setNumber -- sets number
     */
    public void setNumber(int newNumber)
    {
        phoneNumber = newNumber;
    }
    
     /**
     * @param getNumber -- gets number
     */
    public int getNumber()
    {
        return phoneNumber;
    }
    
     /**
     * @param toString -- prints info
     */
        public String toString()
    {
        String Overview;
        
        Overview = "Price: " + price;
        Overview += "\nWeight: " + weight + "\n";
        Overview += "Name of Manu: " + nameOfManu;
        Overview += "\nBattery Life: " + batteryLife + "\n";
        Overview += "Phone Number: " + phoneNumber + "\n";
        
        return Overview;
    }
}