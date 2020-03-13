/**
* StaffMember Class - Parent Class
* @author Stephen Romer
* @author romer@hartford.edu
* @version 28-02-2018
* @since 28-02-2018
*/
abstract public class StaffMember
{
   protected String name;
   protected String address;
   protected String phone;

      /**
    *  @param StaffMember() - constructor
    */
   public StaffMember(String eName, String eAddress, String ePhone) 
   {
      name = eName;
      address = eAddress;
      phone = ePhone;
   }

      /**
    *  @param toString - outputs info
    */
   public String toString()
   {
      String result = "Name: " + name + "\n";

      result += "Address: " + address + "\n";
      result += "Phone: " + phone;

      return result;
   }

      /**
    *  @param pay() - abstract
    */
   public abstract double pay();
   
      /**
    *  @param timeOff() - abstract
    */
   public abstract int timeOff();
}
