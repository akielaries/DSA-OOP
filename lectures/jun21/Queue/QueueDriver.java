public class QueueDriver
{
	public static void main(String[] args)
	{
		//create a new Queue that will hold Strings
		Queue<String> myQ = new Queue<String>();

		//tell it to do things
		try
		{
			System.out.println("peeked at queue, saw " + myQ.peek());
		}
		catch(Throwable ex)
		{
			System.out.println(ex);    //.getMessage());
			ex.printStackTrace();
		}
			myQ.insert("Brad");
			myQ.insert("Claudia");
			System.out.println("peeked at queue, saw " + myQ.peek());
			String removed = myQ.remove();
			System.out.println("we removed " + removed);
			System.out.println("peeked at queue, saw " + myQ.peek());


	}
}







