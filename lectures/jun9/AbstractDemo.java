//This is the driver for the showing how an abstract class (and inheritance)
//work.
public class AbstractDemo
{
	public static void main(String[ ] args)
	{
		//cannot create an instance of the abstract class
		//Employee myEmployee = new Employee("MTS", 471301);

		Volunteer myVol = new Volunteer(42);
		System.out.println(myVol.calculatePaycheck());    //automatically calls toString
	}
}