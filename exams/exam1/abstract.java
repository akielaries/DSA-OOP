public abstract class Base{
    public Base(){
        System.out.println("Base Constructor Called");
    }
    public abstract void fun();
}
class Derived extends Base{
    public Derived(){
        System.out.println("Derived Constructor Called");
    }
    public void fun(){
        System.out.println("Derived fun() called");
    }
}
public class Main{
    public static void main(String args[]){
        Derived d = new Derived();
    }
}
