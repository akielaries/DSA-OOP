// Big Yoshi's Lounge
// https://i.ytimg.com/vi/zbc2LUAP6G4/maxresdefault.jpg

public class BigYoshisLounge
{
	// data
	private String name;
	private int weight;
	private String instrument;
	private String color;

	// default constructor
	public BigYoshisLounge()
	{
		name = "Big Yoshi's Lounge";
		weight = 5;
		instrument = "saxophone-trombone";
		color = "green";
	}

	// overloaded/parameterized constructor
	public BigYoshisLounge(String newColor)
	{
		name = "Big Yoshi's Lounge";
		weight = 5;
		instrument = "saxophone-trombone";
		color = newColor;
	}

	// getter methods
	public String getName()
	{
		return name;
	}

	public int getWeight()
	{
		return weight;
	}

	public String getInstrument()
	{
		return instrument;
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

	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}

	public void setInstrument(String newInstrument)
	{
		instrument = newInstrument;
	}

	public void setColor(String newColor)
	{
		color = newColor;
	}

	// toString method
	public String toString()
	{
		return "Name=" + name + "\nColor=" + color + "\nWeight=" + weight + "\nInstrument=" + instrument;
	}
}






