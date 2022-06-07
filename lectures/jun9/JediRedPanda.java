// Jedi Red Panda
// https://i.imgur.com/TGBpsWs.jpg

public class JediRedPanda implements Animal
{
  // data
  int numOfArms;
  String lightsabers;

  // default constructor
  public JediRedPanda()
  {
    numOfArms = 4;
    lightsabers = "Ninja Knives Yea";
  }

  public void eat()
  {
    System.out.println("Messy?");
  }

  public void travel()
  {
    System.out.pritln("Force flying with an X-Wing - Red 5 Standing By");
  }

  public int getNumOfArms()
  {
    return numOfArms;
  }

  public String getLightsabers()
  {
    return lightsabers;
  }
}
