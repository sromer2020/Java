/** Electronics Project: portableElectronics
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class portableElectronics extends electronics
{
    protected int batteryLife;
    
     /**
     * @param Main Constructor -- portableElectronics
     */
    public portableElectronics(double priceOf, double weightOf, String nameOf, int batteryOf)
    {
        super(priceOf, weightOf, nameOf);
        batteryLife = batteryOf;
    }
    
     /**
     * @param setBatteryLife -- sets battery life
     */
    public void setBatteryLife(int newBattery)
    {
        batteryLife = newBattery;
    }
    
     /**
     * @param getBatteryLife -- gets battery life
     */
    public int getBatteryLife()
    {
        return batteryLife;
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
        
        return Overview;
    }
}

