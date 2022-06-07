//This program runs a series of tests for doubly linked lists in CSC205.

import java.util.*;
import java.io.*;

public class TesterSLList
{
	public static void main(String[] args) throws IOException
	{
		//declare objects to hold test data
		SLList<Integer> myList = null;
		int x;
		boolean boolResult;

		System.out.println("\n\n----------------------------------------------------");
		System.out.println("Part 0: Testing a linked list's addLast and toString()");
		System.out.println("        Other tests depend on these results so these MUST work");
		System.out.println("----------------------------------------------------");

//--------------------------------------------------------
		System.out.println("\nTest 0a: adding 3 4 5 6 all addLast and then calling toString");
		try
		{
			System.out.println("expected: ---" + "\texpected contents: " + "[ 3, 4, 5, 6 ]");

			myList = new SLList<Integer>();
			myList.addLast(3);
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);

			System.out.println("got:      ---" + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------

		System.out.println("\n\n----------------------------------------------------");
		System.out.println("Part 1: Testing an empty SLList<Integer>");
		System.out.println("----------------------------------------------------");

//--------------------------------------------------------
		System.out.println("\nTest 1a: testing size()");
		try
		{
			System.out.println("expected: " + 0);

			myList = new SLList<Integer>();

			System.out.println("got:      " + myList.size());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1b: testing isEmpty()");
		try
		{
			System.out.println("expected: " + true);

			myList = new SLList<Integer>();

			System.out.println("got:      " + myList.isEmpty());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1c: testing getFirst()");
		try
		{
			System.out.println("expected: java.util.NoSuchElementException: <your message>");

			myList = new SLList<Integer>();
			x = myList.getFirst();

			System.out.println("got:       no exception!");
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1d: testing getLast()");
		try
		{
			System.out.println("expected: java.util.NoSuchElementException: <your message>");

			myList = new SLList<Integer>();
			x = myList.getLast();

			System.out.println("got:       no exception...");
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1e: testing addFirst(0)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 0 ]");

			myList = new SLList<Integer>();
			myList.addFirst(0);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1f: testing addLast(100)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 100 ]");

			myList = new SLList<Integer>();
			myList.addLast(100);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1g: testing removeFirst()");
		try
		{
			System.out.println("expected: " + "java.util.NoSuchElementException: <your message>");

			myList = new SLList<Integer>();
			x = myList.removeFirst();

			System.out.println("got:      " + "no exception...");
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 1h: testing removeLast()");
		try
		{
			System.out.println("expected: " + "java.util.NoSuchElementException: <your message>");

			myList = new SLList<Integer>();
			x = myList.removeLast();

			System.out.println("got:      " + "no exception...");
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}


//--------------------------------------------------------
		System.out.println("\nTest 1i: testing remove(7)");
		try
		{
			System.out.println("expected: false" + "\texpected contents: " + "[  ]");

			myList = new SLList<Integer>();

			System.out.println("got:      " + myList.remove(7) + "\tgot contents:      " + myList.toString());
			myList = new SLList<Integer>();

		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}


//--------------------------------------------------------

		System.out.println("\n\n----------------------------------------------------");
		System.out.println("Part 2: Testing an SLList<Integer> that has a single element (4)");
		System.out.println("----------------------------------------------------");

//--------------------------------------------------------
		System.out.println("\nTest 2a: testing size()");
		try
		{
			System.out.println("expected: " + 1);

			myList = new SLList<Integer>();
			myList.addLast(4);

			System.out.println("got:      " + myList.size());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2b: testing isEmpty()");
		try
		{
			System.out.println("expected: " + false);

			myList = new SLList<Integer>();
			myList.addLast(4);

			System.out.println("got:      " + myList.isEmpty());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}


//--------------------------------------------------------
		System.out.println("\nTest 2c: testing getFirst()");
		try
		{
			System.out.println("expected: " + 4 + "\texpected contents: " + "[ 4 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);

			System.out.println("got     : " + myList.getFirst() + "\tgot      contents: " + myList);
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2d: testing getLast()");
		try
		{
			System.out.println("expected: " + 4 + "\texpected contents: " + "[ 4 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);

			System.out.println("got     : " + myList.getLast() + "\tgot      contents: " + myList);
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2e: testing addFirst(0)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 0, 4 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addFirst(0);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2f: testing addLast(100)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 4, 100 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(100);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2g: testing removeFirst()");
		try
		{
			System.out.println("expected: " + 4 + "\texpected contents: " + "[  ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			x = myList.removeFirst();

			System.out.println("got:      " + x + "\t         contents: " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2h: testing removeLast()");
		try
		{
			System.out.println("expected: " + 4 + "\texpected contents: " + "[  ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			x = myList.removeLast();

			System.out.println("got:      " + x + "\t         contents: " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2i: testing remove(4) - it exists");
		try
		{
			System.out.println("expected: " + true + "\texpected contents: " + "[  ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			boolResult = myList.remove(4);

			System.out.println("got:      " + boolResult + "\t         contents: " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 2j: testing remove(7) - not there");
		try
		{
			System.out.println("expected: " + false + "\texpected contents: " + "[ 4 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			boolResult = myList.remove(7);

			System.out.println("got:      " + boolResult + "\t         contents: " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}


//--------------------------------------------------------

		System.out.println("\n\n----------------------------------------------------");
		System.out.println("Part 3: Testing a SLList<Integer> that has many elements (4 5 6 7)");
		System.out.println("----------------------------------------------------");


//--------------------------------------------------------
		System.out.println("\nTest 3a: testing size()");
		try
		{
			System.out.println("expected: " + 4);

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.size());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3b: testing isEmpty()");
		try
		{
			System.out.println("expected: " + false);

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.isEmpty());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}



//--------------------------------------------------------
		System.out.println("\nTest 3c: testing getFirst()");
		try
		{
			System.out.println("expected: 4" + "\texpected contents: " + "[ 4, 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.getFirst() + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3d: testing getLast()");
		try
		{
			System.out.println("expected: 7" + "\texpected contents: " + "[ 4, 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.getLast() + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3e: testing addFirst(0)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 0, 4, 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);
			myList.addFirst(0);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3f: testing addLast(100)");
		try
		{
			System.out.println("....called toString()");
			System.out.println("expected: [ 4,  5,  6,  7,  100 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);
			myList.addLast(100);

			System.out.println("got:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3g: testing removeFirst()");
		try
		{
			System.out.println("expected: 4" + "\texpected contents: " + "[ 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.removeFirst() + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3h: testing removeLast()");
		try
		{
			System.out.println("expected: 7" + "\texpected contents: " + "[ 4, 5, 6 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.removeLast() + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3i: testing remove(4) - front of list");
		try
		{
			System.out.println("expected: true" + "\texpected contents: " + "[ 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.remove(4) + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3j: testing remove(6) - middle of list");
		try
		{
			System.out.println("expected: true" + "\texpected contents: " + "[ 4, 5, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.remove(6) + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3k: testing remove(7) - end of list");
		try
		{
			System.out.println("expected: true" + "\texpected contents: " + "[ 4, 5, 6 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.remove(7) + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
		}

//--------------------------------------------------------
		System.out.println("\nTest 3l: testing remove(9) - not on list");
		try
		{
			System.out.println("expected: false" + "\texpected contents: " + "[ 4, 5, 6, 7 ]");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.remove(9) + "\tgot contents:      " + myList.toString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
			e.printStackTrace();
		}

//--------------------------------------------------------
		System.out.println("\nTest 3m: testing recursiveToString");
		try
		{
			System.out.println("expected: 7  6  5  4");

			myList = new SLList<Integer>();
			myList.addLast(4);
			myList.addLast(5);
			myList.addLast(6);
			myList.addLast(7);

			System.out.println("got:      " + myList.recursiveToString());
		}
		catch (Throwable e)
		{
			System.out.println("got:      " + e);
			e.printStackTrace();
		}
	}
}
