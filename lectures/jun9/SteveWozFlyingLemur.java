// Steve Woz Flying Lemur
// https://i.pinimg.com/originals/4d/46/34/4d4634107a9a31e4d165f91bb8c6eb07.jpg

public class SteveWozFlyingLemur implements Animal
{
  // data
  String clothes;
  String hobbies;
  String job;

  // default constructor
  public SteveWozFlyingLemur()
  {
    clothes = "thread count on that fabulous sweater";
    hobbies = "Flying from coffee shops/surfing the net";
    job = "Apple Genius Bar";
  }

  // interface methods
  public void eat()
  {
    System.out.println("SMOOTHIE!!!!!!!!!!!!!!!!11! and GREEN GUMMi BEARS");
  }

  public void travel()
  {
    System.out.println("Swims, flies, fire nation!, sings in the rain, instant transmission (Chevy transmission), Chicago, Pittsburgh, Eqypt, 4th DIMENSION?");
  }

  // getter methods
  public String getClothes()
  {
    return clothes;
  }

  public String getHobbies()
  {
    return hobbies;
  }

  public String getJob()
  {
    return job;
  }
}
