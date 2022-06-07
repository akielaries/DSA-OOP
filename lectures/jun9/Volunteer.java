//Volunteer will be a subclass of the (abstract) class Employee.  So it MUST
//implement calculatePaycheck() itself
import java.util.*;

public class Volunteer extends Employee
{
	//data?   all will be inherited

	//constructor
	public Volunteer(int theID)
	{
		super("Volunteer", theID);

		//OR.....could have these.  OR could call super and then call these.
		//id = theID;
		//jobTitle = "Volunteer";
		//active = true;
		//startDate = new Date();    //now
	}

	//methods?    most inherited, but must define calculatePaycheck (the abstract one)
	public double calculatePaycheck()
	{
		return 0;
	}

	//toString - returns its representation as a String
	public String toString()
	{
		return "A Volunteer with id = " + id;
	}







}