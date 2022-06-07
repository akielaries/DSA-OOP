public class Cat implements Animal{
    int legs;
    
    public Cat(){
        legs = 4;
    }
    
    public void Eat(){
        System.out.println("Cat eats");
    }

    public void travel(){
        System.out.println("Cat travels");
    }

    public int getNumOfLegs(){
        return legs;
    }
}
