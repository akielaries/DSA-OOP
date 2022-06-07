// https://www.awesomeinventions.com/wp-content/uploads/2020/03/baby-Platypus-stone.jpg
public class PlataTux implements Animal
{
    // data
    String glows;
    boolean glowsBright;

    // default constructor
    public PlataTux()
    {
      glows = "Bright like a diamond";
      glowsBright = true;
    }

    // interace methods
    public void eat()
    {
      System.out.println("Sushi and caviar!");
    }

    public void travel()
    {
      System.out.println("Flies like a G6 plane");
    }

    public String getGlows()
    {
      return glows;
    }

    public boolean getGlowsBright()
    {
      return glowsBright;
    }
}
