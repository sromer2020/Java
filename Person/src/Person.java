//Stephen Romer & Bourou
//Creating the identity of a new person
//8-10-2106

import java.util.Random;

public class Person
{   
    //Arrays containing multiple first names, last names, and jobs
    private static String[] firstNames = {"Sam", "Nathan", "Joe", "Ian", "Steve"}; 
    private static String[] lastNames = {"Cancel", "Brill", "Cacsire", "Walls", "Romer"};
    private static String[] jobs = {"Teacher", "Pilot", "Cop", "Executive", "Student"};
    private static String[] roads = {"Street", "School", "Hill", "Tree", "Lake"};
    private static String[] roadTypes = {"ST", "RD", "LN", "WAY", "BLVD"};
    //Indexes
    private static Random rand = new Random();    
    private int firstIndex = new Random().nextInt(firstNames.length); //chooses first name form array
    private int lastIndex = new Random().nextInt(lastNames.length); //chooses last name from array
    private int jobIndex = new Random().nextInt(jobs.length); //chooses job from array
    private int roadIndex = new Random().nextInt(roads.length); //chooses road from array
    private int roadTypeIndex = new Random().nextInt(roadTypes.length); //chooses road type from array
    
    //FIELDS
    private String firstName; 
    private String lastName;
    private int age;
    private String job; 
    private int houseNum;
    private String road; 
    private String roadType;
    
    //CONSTRUCTORS--------------------------------------------------------------------
    
    public Person() 
    {   
        //Initialized fields
        firstName = (firstNames[firstIndex]); //assigns first name 
        lastName = (lastNames[lastIndex]); //assigns first name
        age = (rand.nextInt(81) + 18); //assigns age
        job = (jobs[jobIndex]);    //assigns job
        houseNum = (rand.nextInt(998) + 1); //assigns house number
        road = (roads[roadIndex]); //assigns road
        roadType = (roadTypes[roadTypeIndex]); //assigns road type
    }  

    public Person(String first, String last, int myAge, String occupation, int number, String street, String streetType)
    {
        firstName = first; 
        lastName = last;
        age = myAge;
        job = occupation;
        houseNum = number;
        road = street;
        roadType = streetType;
    }

    //METHODS-------------------------------------------------------------------------

    //ACCESSORS
    public String getFirst()
    {
        return firstName;
    }

    public String getLast()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getJob()
    {
        return job;
    }   
    
    public void printSummary()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Address: " + houseNum + " " + road + " " + roadType + "\n");
    }
    
    //MUTATORS
    public void changeFirst(String newFirst)
    {
        firstName = newFirst;
    }

    public void changeLast(String newLast)
    {
        lastName = newLast;
    }

    public void changeAge(int newAge)
    {
        age = newAge;
    }   

    public void changeJob(String newJob)
    {
        job = newJob;
    }   
}
