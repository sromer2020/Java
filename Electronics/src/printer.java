/** Electronics Project: printer
 *  @author Stephen Romer, romer@hartford.edu
 *  @version 20-02-2018
 *  @version 1.0
 */

public class printer extends homeAppliances
{
    protected int percentageOfInk;
    protected int dpi;
    protected boolean paperLoaded;
    
    public printer(double priceOf, double weightOf, String manuOf, String roomOf, int inkOf, int dpiOf, boolean paperOf)
    {
        super(priceOf, weightOf, manuOf, roomOf);
        percentageOfInk = inkOf;
        dpi = dpiOf;
        paperLoaded = paperOf;
    }
    
    public void setPrinterPercentage(int newPercentage)
    {
        percentageOfInk = newPercentage;
    }
    
    public int getPrinterPercentage()
    {
        return percentageOfInk;
    }
    
    public void setDpi(int newDpi)
    {
        dpi = newDpi;
    }
    
    public int getDpi()
    {
        return dpi;
    }
    
    public boolean isPrinting()
    {
        return paperLoaded;
    }
    
    public boolean isEmpty(boolean paperLoaded)
    {
        return paperLoaded == false;
    }
    
    public String toString()
    {
        String Overview;
        
        Overview = "Price: " + price;
        Overview += "\nWeight: " + weight;
        Overview += "\nName of Manu: " + nameOfManu;
        Overview += "\nRoom: " + room;
        Overview += "\nInk Percentage: " + percentageOfInk;
        Overview += "\nDPI: " + dpi;
        Overview += "\nPaper Load Status " + paperLoaded + "\n";
        
        return Overview;
    }
}