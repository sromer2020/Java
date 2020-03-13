/**
* Staff Class - Array Class
* @author Stephen Romer
* @author romer@hartford.edu
* @version 28-02-2018
* @since 28-02-2018
*/

public class Staff
{
   private StaffMember[] staffList;

   /**
    *  @param Staff() - Constructor of Arrays
    */
   public Staff()
   {
      staffList = new StaffMember[6];

      staffList[0] = new Executive("Sam", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07, 0);

      staffList[1] = new Employee("Carla", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15, 0);
      staffList[2] = new Employee("Woody", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23, 0);

      staffList[3] = new Hourly("Diane", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55, 0);

      staffList[4] = new Volunteer("Norm", "987 Suds Blvd.",
         "555-8374");
      staffList[5] = new Volunteer("Cliff", "321 Duds Lane",
         "555-7282");

      ((Executive)staffList[0]).awardBonus(500.00);

      ((Hourly)staffList[3]).addHours(40);
   }

      /**
    *  @param payday() - pays employees
    */
   public void payday ()
   {
      double amount;

      for (int count=0; count < staffList.length; count++)
      {
         System.out.println(staffList[count]);

         amount = staffList[count].pay();  // polymorphic

         if (amount == 0.0)
            System.out.println("Thanks!");
         else
            System.out.println("Paid: " + amount);

         System.out.println("-----------------------------------");
      }
   }
   
      /**
    *  @param vacationTime() - assigns vacation days
    */
   public void vacationTime()
   {
      double days;

      for (int count=0; count < staffList.length; count++)
      {
         System.out.println(staffList[count]);

         days = staffList[count].timeOff();  // polymorphic
         
         if(days == 0)
            System.out.println("Talk to HR to recieve your designated vacationd days");
         else if (days == -1)
            System.out.println("You are a volunteer, you get no days");   
         else if (days < 14)
            System.out.println("You have " + days + " vacation days");
         else
            System.out.println("Days off: " + days);

         System.out.println("-----------------------------------");
      }
   }
}

