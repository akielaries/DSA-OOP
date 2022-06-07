// Driver for the Student class
// This driver tests every method and construtor in the Student class

public class StudentDriver
{
  public static void main(String args[])
  {
    // create a new instance of the Student class
    Student soccerStud = new Student("Soccer Stud", 18, 4.0);

    soccerStud.print();

    System.out.println(soccerStud.getName());
    System.out.println(soccerStud.getAge());
    System.out.println(soccerStud.getGPA());

    soccerStud.print(3);

    // use the default construtor
    Student proGamer = new Student();

    // https://en.wikipedia.org/wiki/Jason_Zimmerman
    proGamer.setName("Jason Zimmerman");
    proGamer.setAge(29);
    proGamer.setGPA(3.6);

    proGamer.print();
    proGamer.setName("Mew2King");
    proGamer.print();

    System.out.println();

    // soccerStud has the better GPA
    System.out.println("soccerStud has the better GPA.");
    soccerStud.betterGPA(proGamer).print();

    System.out.println();

    // proGamer is older
    System.out.println("proGamer is older.");
    soccerStud.olderStudent(proGamer).print();

    // secret bonus unlockable
    // https://www.youtube.com/watch?v=KGnEqdo22gM
  }
}
