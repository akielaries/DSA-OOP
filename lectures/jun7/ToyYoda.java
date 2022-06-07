// ToyYoda
// https://cdn.vox-cdn.com/thumbor/2li0wimaBBugY31AmjCMOBdt4-A=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19733938/Bitty_Boomer_the_child.jpg
// 4-2-20
// CSC 110 Spring 2020 TR 5:20 to 7

public class ToyYoda
{
  // data
  private int forcePower;
  private String pinkEyes;
  private int age;
  private String head;

  // default constructor
  public ToyYoda()
  {
    // Rav 4
    forcePower = 9002;
    pinkEyes = "Black Eyed Peas";
    age = 50;
    head = "Bald Speaker";
  }

  // overloaded/parameterized constructor
  public ToyYoda(int newAge)
  {
    forcePower = 9002;
    pinkEyes = "Black Eyed Peas";
    age = newAge;
    head = "Bald Speaker";
  }

  // getter methods
  public int getForcePower()
  {
    return forcePower;
  }

  public String getPinkEyes()
  {
    return pinkEyes;
  }

  public int getAge()
  {
    return age;
  }

  public String getHead()
  {
    return head;
  }

  // setter methods
  public void setForcePower(int newForcePower)
  {
    forcePower = newForcePower;
  }

  public void setPinkEyes(String newPinkEyes)
  {
    pinkEyes = newPinkEyes;
  }

  public void setAge(int newAge)
  {
    age = newAge;
  }

  public void setHead(String newHead)
  {
    head = newHead;
  }

  // toString method
  public String toString()
  {
    String str = "Force Power=" + forcePower + "\nPink Eyes=" + pinkEyes + "\nAge=" + age + "\nHead=" + head;

    return str;
  }

}
