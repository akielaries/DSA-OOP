// Tacos Goku
// https://www.meme-arsenal.com/memes/3fc967437324cda10b94461725a532fa.jpg
// 4-2-20
// CSC 110 Spring 2020 TR 12-2

public class TacosGoku
{
  // data
  private String sombrero;
  private int tacos;
  private long powerLevel;
  private String mustache;

  // default constructor
  public TacosGoku()
  {
    sombrero = "Green-Chile-hat-salsa-dish";
    tacos = 9000*30; // 30 tacos * minimum powerLevel
    powerLevel = 9001;
    mustache = "Captain Hook";
  }

  // overloaded/parameterized constructor
  public TacosGoku(long newPowerLevel)
  {
    sombrero = "Green-Chile-hat-salsa-dish";
    tacos = 9000*30; // 30 tacos * minimum powerLevel
    powerLevel = newPowerLevel;
    mustache = "Captain Hook";
  }

  // getter methods
  public String getSombrero()
  {
    return sombrero;
  }

  public int getTacos()
  {
    return tacos;
  }

  public long getPowerLevel()
  {
    return powerLevel;
  }

  public String getMustache()
  {
    return mustache;
  }

  // setters
  public void setSombrero(String newSombrero)
  {
    sombrero = newSombrero;
  }

  public void setTacos(int muchosTacos)
  {
    tacos = muchosTacos;
  }

  public void setPowerLevel(long over9000)
  {
    powerLevel = over9000;
  }

  public void setMustache(String newMustache)
  {
    mustache = newMustache;
  }

  public String toString()
  {
    return "Sombrero=" + sombrero + "\nTacos=" + tacos + "\nPower Level=" + powerLevel + "\nMustache=" + mustache;
  }

}
