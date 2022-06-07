// https://i.kym-cdn.com/photos/images/newsfeed/001/353/315/bd1.jpg
public class Axolotl implements Animal
{
	// data
	String happy;

	// default constructor
	public Axolotl()
	{
		happy = "Kirby!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}

	// interface methods
	public void eat()
	{
		System.out.println("Pizza!!!!!");
	}

	public void travel()
	{
		System.out.println("Pogo sticks...!");
	}

	public String getHappy()
	{
		return happy;
	}
}