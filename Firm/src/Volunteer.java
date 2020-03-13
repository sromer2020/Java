/**
* Volunteer Class - Sub Class
* @author Stephen Romer
* @author romer@hartford.edu
* @version 28-02-2018
* @since 28-02-2018
*/

public class Volunteer extends StaffMember
{
      /**
    *  @param Volunteer() - constructor
    */
   public Volunteer(String eName, String eAddress, String ePhone)
   {
      super(eName, eAddress, ePhone);
   }

      /**
    *  @param pay() - return 0 days
    */
   public double pay()
   {
      return 0.0;
   }
   
      /**
    *  @param timeOff() - returns -1 as a place holder
    */
   public int timeOff()
   {
       return -1;
   }
}
