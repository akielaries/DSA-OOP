//This will implement a "singly linked list" that is set up to hold whatever
//the user defines it to hold at run time (using Generics)

import java.util.*;

public class SLList<E>
{
	//data
	private SLLNode<E> head, tail;

	//constructor
	public SLList()
	{
		head = tail = null;
	}

	//methods
	//-----------------------------------
	//addLast - adds theElement to the end of the list in its own node
	public void addLast(E theElement)
	{
		//create a node to hold it
		SLLNode<E> newNode = new SLLNode<E>(theElement);

		//if the list is empty, then it becomes the only node
		if (head == null)
			head = tail = newNode;

		//otherwise, change the links so it is the last node
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	//-----------------------------------
	//addFirst - adds theElement to the front of the list in its own node
	public void addFirst(E theElement)
	{
		//create a node to hold it
		SLLNode<E> newNode = new SLLNode<E>(theElement);

		//if the list is empty, then it becomes the only node
		if (head == null)
			head = tail = newNode;

		//otherwise, change the links so it is the first node
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}

	//-----------------------------------
	//toString - returns its representation as a String
	public String toString()
	{
		String outString = "[";
		SLLNode<E> ptr = head;
		while (ptr != null)
		{
			if (ptr != head)    //only put in , if not the head
				outString = outString + ", " + ptr;
			else
				outString = outString + " " + ptr;    //just a blank, then data pointed to by ptr
			ptr = ptr.next;
		}
		outString = outString + " ]";

		return outString;
	}

	//-----------------------------------
	//size - traverses the list, counting how many elements there are.  Returns size
	public int size()
	{
		int total = 0;
		SLLNode<E> ptr = head;
		while (ptr != null)   //walks through the linked list,
		{
			total++;				//counting up how many nodes there are
			ptr = ptr.next;
		}
		return total;
	}

	//-----------------------------------
	//isEmpty - returns if it is empty
	public boolean isEmpty()
	{
		return head == null;
	}

	//-----------------------------------
	//clear - "clears" the list by resetting head and tail to null
	public void clear()
	{
		head = tail = null;
	}

	//-----------------------------------
	//getFirst - returns the first element on the list without removing it
	public E getFirst()
	{
		if (head == null)    //empty
			throw new NoSuchElementException("the list is empty");
		return head.data;
	}

	//-----------------------------------
	//getLast - returns the last element on the list without removing it
	public E getLast()
	{
		if (tail == null)    //empty
			throw new NoSuchElementException("the list is empty");
		return tail.data;
	}

	//-----------------------------------
	//removeFirst - removes and returns the first element on the list
	public E removeFirst()
	{
		//case 1: is it empty?
		if (head == null)
			throw new NoSuchElementException("the list is empty");

		//case 2: if there is only 1 element on the list
		else if (head == tail)    //already handled the case where they were both null
		{
			E dataToReturn = head.data;    //store the data that will be returned
			head = tail = null;     //make the list empty
			return dataToReturn;   //return the data
		}

		//case 3: if there are lots of elements on the list
		else
		{
			E dataToReturn = head.data;    //store the data that will be returned
			head = head.next;   //move head over

			return dataToReturn;
		}
	}

	//-----------------------------------
	//removeLast - removes and returns the last element on the list
	public E removeLast()
	{
		//case 1: is it empty?
		if (head == null)
			throw new NoSuchElementException("the list is empty");

		//case 2: if there is only 1 element on the list
		else if (head == tail)    //already handled the case where they were both null
		{
			E dataToReturn = tail.data;    //store the data that will be returned
			head = tail = null;     //make the list empty
			return dataToReturn;   //return the data
		}

		//case 3: if there are lots of elements on the list
		else
		{
			//must traverse the whole list and stop at the node BEFORE the tail
			SLLNode<E> ptr = head;
			while (ptr.next != tail)
				ptr = ptr.next;

			//ptr has stopped at the node BEFORE the tail
			E dataToReturn = tail.data;    //store the data that will be returned
			tail = ptr;
			tail.next = null;     //last element no longer points at anything

			return dataToReturn;
		}
	}

	//-----------------------------------
	//remove - removes the first instance of the "doomed" element
	public boolean remove(E doomed)
	{
		//case 1: list is empty
		if (head == null)
			return false;    //means it did not find it

		//case2: list only has 1 element
		else if (head == tail)
			if (head.data.equals(doomed))
			{
				removeFirst();
				return true;
			}
			else
				return false;

		//case3: doomed is at the front of the list
		else if (head.data.equals(doomed))
		{	removeFirst();   //don't do anything with what it returned
			return true;
		}

		//case4: doomed is at the end of the list
		else if (tail.data.equals(doomed))
		{	removeLast();   //don't do anything with what it returned
			return true;
		}

		//case5: doomed is in the middle of the list somewhere
		else
		{
			SLLNode<E> ptr = head;
			while (ptr.next != null && !ptr.next.data.equals(doomed))
			{
				ptr = ptr.next;
			}

			//should stop at the node right before doomed
			if (ptr == tail)   //if if did not find it
				return false;
			else   //found it!
			{
				ptr.next = ptr.next.next;    //move the link so it goes around the doomed node
				return true;
			}
		}
	}

	//-----------------------------------
	//recursiveToString() - "starting" method for recursively traversing a list and returning its contents
	//                                   it just calls the recursive version.
	public String recursiveToString()
	{
		return recursiveToString2(head);
	}

	//-----------------------------------
	//recursiveToString2 - recursively traverses whatever list is is passed by calling itself
	private String recursiveToString2(SLLNode start)
	{
		if (start == null)
			return "";
		else
		{
			//this way returns the contents backwards
			return recursiveToString2(start.next) + "  " + start.data;	//backwards - recursion then data
			//return start.data + "  " + recursiveToString2(start.next);	//forwards - data then recursion
		}
	}



}

	//-----------------------------------
	//This is the SLLNode class which will implement the nodes that make up an SLList
	class SLLNode<E>
{
	//data
	public E data;
	public SLLNode<E> next;

	//constructor
	public SLLNode(E theData)
	{
		data = theData;
		next = null;
	}

	//methods
	//toString - returns its representation as a String
	public String toString()
	{
		return "" + data;
	}



}
