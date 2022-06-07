// compile with java -Xmx128M -Xms16M CollectionsDemo
import java.util.*;
public class CollectionsDemo {

    public static void main(String[] args) {
        Map cars = new HashMap(); 
        Map fruit = new HashMap(); 
        Map candy = new HashMap();

        cars.put("Car1", 1);
        fruit.put("Fruit1", 2);
        cars.put("Car2",3);
        fruit.put("Fruit2", 4);
        candy.put("Lolipop", 5);
        candy.put("Chocolate", 6);

        Map everything = new HashMap();
        everything.putAll(cars);
        everything.putAll(fruit);
        everything.putAll(candy);
      
      

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + everything);
   }
}
