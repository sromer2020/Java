//Stephen Romer
//CS-220
//Prof. Duan
//Extra Credit #2
//Person Class

public class Person
{
	private String firstName;
	private String lastName;
	private String phoneNum;
	
	//-----------------------------------------------------------------------(Default Constructor)
	public Person(String firstN, String lastN, String phoneN) 
	{

		firstName = firstN;
		lastName = lastN;
		phoneNum = phoneN;

	}

	//----------------------------(Getter Methods)
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhoneNum()
	{
		return phoneNum;
	}
	
	
	//-------------------------------------------(Setter Methods)
	public void setFirstName(String newFirst)
	{
		firstName = newFirst;
	}
	
	public void setLastName(String newLast)
	{
		lastName = newLast;
	}
	
	public void setPhoneNum(String newNum)
	{
		phoneNum = newNum;
	}
	
	//-------------------------------(toString method)	
	public String toString()
	{
		String personInfo;
	
		personInfo = "First Name: " + firstName +
					 "Last Name: " + lastName +
					 "Phone Number : " + phoneNum;
		
		return personInfo;
	}
}
