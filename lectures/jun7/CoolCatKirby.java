// Cool Cat Kirby
// https://res.cloudinary.com/teepublic/image/private/s--uNyk3K1---/t_Resized%20Artwork/c_fit,g_north_west,h_954,w_954/co_36538b,e_outline:48/co_36538b,e_outline:inner_fill:48/co_ffffff,e_outline:48/co_ffffff,e_outline:inner_fill:48/co_bbbbbb,e_outline:3:1000/c_mpad,g_center,h_1260,w_1260/b_rgb:eeeeee/c_limit,f_jpg,h_630,q_90,w_630/v1465268971/production/designs/535337_1.jpg

public class CoolCatKirby
{
	// data
	private String name;
	// https://www.ssbwiki.com/images/7/73/Kirby_Palette_%28SSBB%29.png
	private String color;
	private String shape;
	private String brand;

	// default constructor
	public CoolCatKirby()
	{
		name = "Cool Cat Kirby";
		color = "pink";
		shape = "Cool Round Ball";
		brand = "Nintendo";
	}

	// overloaded constructor
	public CoolCatKirby(String newColor)
	{
		name = "Cool Cat Kirby";
		color = newColor;
		shape = "Cool Round Ball";
		brand = "Nintendo";
	}

	// getter methods
	public String getName()
	{
		return name;
	}

	public String getColor()
	{
		return color;
	}

	public String getShape()
	{
		return shape;
	}

	public String getBrand()
	{
		return brand;
	}

	// setter methods
	public void setName(String newName)
	{
		name = newName;
	}

	public void setColor(String newColor)
	{
		color = newColor;
	}

	public void setShape(String newShape)
	{
		shape = newShape;
	}

	public void setBrand(String newBrand)
	{
		brand = newBrand;
	}

	// toString method
	public String toString()
	{
		return "Name=" + name + "\nColor=" + color + "\nShape=" + shape + "\nBrand=" + brand;
	}
}






