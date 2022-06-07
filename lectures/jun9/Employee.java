import java.util.*;

//An abstract class is not meant to actually be created.  It is just there for
//subclass to inherit their data and methods and the subclasses MUST implement
//the abstract methods
public abstract class Employee
{
	//data
	protected Date startDate;    //protected so its inheritable
	protected String jobTitle;
	protected int id;
	protected boolean active;

	//constructor
	public Employee()
	{     	//it has to be here so all things get their assigned default values if they
			//are not set anywhere else.
	}

	//parameterized constructor - sets jobTitle and id to what is passed in, and
	//     does the same thing with startDate and active every time.
	public Employee(String theJobTitle, int theID)
	{
		startDate = new Date();
		jobTitle = theJobTitle;
		id = theID;
		active = true;
	}

	//methods
	//setTitle- sets the title to whatever is passed in
	public void setTitle(String newTitle)
	{
		jobTitle = newTitle;
	}

	//terminate - "terminates" itself by setting active to false
	public void terminate()
	{
		active = false;
	}

	//abstract method calculatePaycheck - the subclasses are responsible for defining this
	public abstract double calculatePaycheck();

}

