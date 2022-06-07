// Luigi Death Stare
// https://www.youtube.com/watch?v=PpxDuNFBVj8

public class LuigiDeathStare
{
	// data
	private String name;
	private String hat;
	private String face;
	private String color;

	// default constructor
	public LuigiDeathStare()
	{
		name = "Luigi Death Stare";
		hat = "big";
		face = "Iconic death stare";
		color = "green";
	}

	// overloaded/parameterized constructor
	public LuigiDeathStare(String newColor)
	{
		color = newColor;
	}

	// getter methods
	public String getName()
	{
		return name;
	}

	public String getHat()
	{
		return hat;
	}

	public String getFace()
	{
		return face;
	}

	public String getColor()
	{
		return color;
	}

	// setter methods
	public void setName(String newName)
	{
		name = newName;
	}

	public void setHat(String newHat)
	{
		hat = newHat;
	}

	public void setFace(String newFace)
	{
		face = newFace;
	}

	public void setColor(String newColor)
	{
		color = newColor;
	}

	// toString method
	public String toString()
	{
		return "Name=" + name + "\nHat=" + hat + "\nFace=" + face + "\nColor=" + color;
	}
}





