// Programmer:
// Date:
// Description: This program explores the capabilities of Strings

public class AllAboutStrings
{
    public static void main(String[] args)
    {
        String welcomeMsg = "Hello World!";
		String name = "Glendale";
		String msg = welcomeMsg + " I'm " + name + "!";
		System.out.println(msg);
		// prints "Hello World! I’m Glendale!"

		int strLength = 0;
		int startStr = 6;

		strLength = msg.length();
		System.out.println("The length of the string is " + strLength);

		String subStr = msg.substring(startStr);
		System.out.println("The substring is " + subStr);

		startStr = msg.indexOf("World");
		subStr = msg.substring(startStr);
		System.out.println("The substring is " + subStr);

		System.out.println();

		char letter = msg.charAt(6);		// 6 should be the same as the value of startStr
		System.out.println("The char is " + letter);

		String allUpperCase = msg.toUpperCase();
		String allLowerCase = msg.toLowerCase();

		System.out.println("The String in upper case is " + allUpperCase);
		System.out.println("The String in lower case is " + allLowerCase);

		System.out.println();

		String compare1 = "tryMe";
		String compare2 = "tryMe";
		String compare3 = "abc";

		System.out.println(compare1.compareTo(compare2));		// should print 0 if both strings are the same
		System.out.println(compare1.compareTo(compare3));		// compare1 > compare3 also known as compare1 - compare3
		System.out.println(compare3.compareTo(compare1));		// compare3 < compare1 a.k.a. compare3 - compare1

		// compare1 + msg + compare2
		// "tryMe" + "Hello World! I’m Glendale!" + "tryMe"
		System.out.println(compare1.concat(msg.concat(compare2)));	// an example of something fancy



		// More options for Strings are at the following URL:
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    }
}
