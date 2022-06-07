public class CuttleFish implements Animal
{
	// data
	String tentacles;

	public CuttleFish()
	{
		tentacles = "Davy Jones";
	}


	public void eat()
	{
		System.out.println("Spongebob eats fish, crabs and everything!");
	}

  	public void travel()
  	{
		System.out.println("Flying Dutchman!!!!!!!!!!");
	}

	public String getTentacles()
	{
		return tentacles;
	}
}
