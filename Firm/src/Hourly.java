/**
* Hourly Class - Sub Class
* @author Stephen Romer
* @author romer@hartford.edu
* @version 28-02-2018
* @since 28-02-2018
*/
public class Hourly extends Employee
{
   private int hoursWorked;

      /**
    *  @param Hourly() - constructor
    */
   public Hourly(String eName, String eAddress, String ePhone,
                 String socSecNumber, double rate, int vacations)
   {
      super(eName, eAddress, ePhone, socSecNumber, rate, vacations);

      hoursWorked = 0;
   }

      /**
    *  @param addHours() -adds hours
    */
   public void addHours(int moreHours)
   {
      hoursWorked += moreHours;
   }

      /**
    *  @param pay() -  computes and returns pay
    */
   public double pay()
   {
      double payment = payRate * hoursWorked;

      hoursWorked = 0;

      return payment;
   }

      /**
    *  @param timeOFf() - computees and retruns timeOff
    */
      public int timeOff()
   {
	   int daysOff = 14;
       
	   vacationDays += daysOff;
	   
       return vacationDays;
   }
   
      /**
    *  @param toString()  outputs info
    */
   public String toString()
   {
      String result = super.toString();

      result += "\nCurrent hours: " + hoursWorked;

      return result;
   }
}
