//Stephen Romer
//PP 9.1
//Driver


public class Driver
{
    public static void main(String args[])
    {
        //delcared coins
        MonetaryCoin coin1 = new MonetaryCoin(25);
        MonetaryCoin coin2 = new MonetaryCoin(10);
        
        //testing flip method inheritance functionality
        coin1.flip();
        coin2.flip();
        
        //outputs
        System.out.print("Coin 1 Face Value: " + coin1.faceValue()); 
        System.out.print("Coin 2 Face Value: " + coin2.faceValue());
        
        System.out.println("Coin 1 " + coin1.toString());     
        System.out.println("Coin 2 " + coin2.toString());
        
        System.out.println("Coin 1 + Coin 2 = " + (coin1.getValue() + coin2.getValue()));
    }
}