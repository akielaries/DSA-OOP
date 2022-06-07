//Hashcodes are semi-unique indices into data structures.  They are used behind the
//scenes to decide where in a data structure to store something.  The explanation on
//the board showed how they can be used.

//In OOP, things can generate their own hashcodes and data structures automatically
//can ask for them.  This is all done without the programmer doing anything.

//This demo shows how a String can generate its own hashcode.  Then a new type
//of data structure (HashMap) stores an Object with a unique key (which is internally
//converted to a hashcode and used)

import java.util.*;

public class GetHash
{
	public static void main(String[ ] args)
	{
		//find the hash code associated with "pat";
		//(ask the String what its hash code is)
		//you can look at the java.sun.com documentation to see how it is determined
		//   (but remember, it is in the "who cares" category as far as having to know it to use it
		System.out.println("pat".hashCode());

		//hash codes are used in data structures.  Here a HashMap stores a value and
		//its associated key.  Behind the scenes, the key is changed to its hashcode and
		//used internally in the HashMap...
		HashMap<Integer, String> myHM = new HashMap<Integer, String>();
		myHM.put(0,"Daniel");    //puts in "Daniel" with a key of 0
		System.out.println("Does it contain \"Daniel\"? " + myHM.containsValue("Daniel"));
		System.out.println("Does it contain key number 0? " + myHM.containsKey(0));
		System.out.println("Does it contain key number 42? " + myHM.containsKey(42));
		}
}
