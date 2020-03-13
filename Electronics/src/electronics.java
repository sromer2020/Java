/** Electronics Project: Inheritance
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class electronics
{
    protected double price;
    protected double weight;
    protected String nameOfManu;
    
    /**
     * @param Main Constructor -- electronics
     */
    public electronics(double priceOf, double weightOf, String manuOf)
    {
        price = priceOf;
        weight = weightOf;
        nameOfManu = manuOf;
    }
    
    /**
     * @param setPrice -- sets price
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
        /**
     * @param getPrice -- gets price
     */
    public double getPrice()
    {
        return price;
    }
    
        /**
     * @param setWeight -- sets weight
     */
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }
    
        /**
     * @param getWeight-- gets weight
     */
    public double getWeight()
    {
        return weight;
    }
    
        /**
     * @param setName -- sets name
     */
    public void setName(String newName)
    {
        nameOfManu = newName;
    }
    
        /**
     * @param getName -- gets name
     */
    public String getName()
    {
        return nameOfManu;
    }
    
        /**
     * @param toStrin -- prints info
     */
    public String toString()
    {
        String Overview;
        
        Overview = "Price: " + price;
        Overview += "\nWeight: " + weight + "\n";
        Overview += "Name of Manu: " + nameOfManu + "\n";
        
        return Overview;
    }
}
