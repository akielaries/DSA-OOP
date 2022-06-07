// https://lifejellysidedown.files.wordpress.com/2010/10/mean-ostrich.jpg
public class ViciousOstrich implements Animal
{
	// data
	String teeth;
	String name;

	// default constructor
	public ViciousOstrich()
	{
		name = "Chompy Boy!?!?";
		teeth = "Dentist approved!";
	}

	// interface methods
	public void eat()
	{
		System.out.println("MURDER!!!");
	}

  	public void travel()
  	{
		System.out.println("2 Fast 2 Furious!");
	}

	// getter methods
	public String getName()
	{
		return name;
	}

	public String getTeeth()
	{
		return teeth;
	}

}