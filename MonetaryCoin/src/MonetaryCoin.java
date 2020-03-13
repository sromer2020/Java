//Stephen Romer
//PP 9.1
//Monetary Coin

public class MonetaryCoin extends Coin
{
    //field
    private int coinValue;
    
    //Constructor
    public MonetaryCoin(int value)
    {
        coinValue = value;
    }
    
    //Getter
    public int getValue()
    {
        return coinValue;
    }
    
    //Setter
    public void setValue(int newValue)
    {
        coinValue = newValue;
    }
    
    //toString
    public String toString()
    {
        String overview;
        
        overview = "Monetary value: " + coinValue;

        return overview;
    }
}