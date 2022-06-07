//A Queue is a FIFO (First in first out) data structure that works like a "line"

import java.util.*;

public class Queue<E>   //the user can define what type when they create it
{
	//data - just the ArrayList which will actually hold each element
	private ArrayList<E> data;

	//constructor
	public Queue()
	{
		data = new ArrayList<E>();     //the constructor will actually create the aggregate class instance
	}

	//methods

	//insert - inserts the obj into the back of the queue
	public boolean insert(E obj)
	{
		return data.add(obj);
	}

	public E remove()
	{
		if (data.isEmpty())
			throw new NoSuchElementException("tried to remove from empty queue");
		return data.remove(0);   //the ArrayList method will remove and return it,
												//so we just returned what it gave to us.
	}

	//look at the first thing in the queue without removing it
	public E peek()
	{
		if (data.isEmpty())
			throw new NoSuchElementException("tried to peek at empty queue");
		return data.get(0);   //the ArrayList method will remove and return it,
												//so we just returned what it gave to us.
	}
}
















