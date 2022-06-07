public class RecursionQuiz
{
	public static void main(String args[])
	{
		System.out.println("\n---------- mystery1 output");
		mystery1(1);    //initial call to recursive method\

		System.out.println("\n---------- mystery2 output");
		mystery2(3);

		System.out.println("\n---------- mystery3 output");
		mystery3(4);
	}

	public static void mystery1(int i)
	{
		System.out.println(i);
		if (i<=2)
			mystery1(i+1);
		//when recursive call is finished, it returns HERE (after the recursive call)
	}

	public static void mystery2(int i)
	{
		if (i<=8)
			mystery2(i+2);
		//** when a recursive call takes place (above), control goes there.
		//    when the recursive call is finished, it returns to the next statment (HERE)
		System.out.println(i);
		System.out.println(i);
	}

	public static void mystery3(int i)
	{
		System.out.println(i);
		if (i<=5)
			mystery3(i+2);
		System.out.println(i*10);
	}
}





