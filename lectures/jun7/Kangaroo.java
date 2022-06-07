public class Kangaroo implements Animal
{
	String name;

	public Kangaroo()
	{
		name = "Joey";
	}

	public void eat()
	{
		System.out.println(name + " eats");
	}

	public void travel()
  	{
  	  System.out.println(name + " travels");
  	}

  	public String getName()
  	{
		return name;
	}
}
