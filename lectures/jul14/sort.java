//This shows all 3 sorting methods - bubbleSort, quickSort, and mergeSort.

public class sort
{
	private static boolean explain = true;

	public static void main(String[] args)
	{
		//reminder message about explain facility
		System.out.println("(to get more/less quicksort information change explain flag and recompile...\n)");

		//create an array and fill it with random numbers between 1-100
		//int randArray[] = {1,8,2,6,5,4,7,9,4};
		int randArray[] = new int[20];
		for (int i=0; i<randArray.length; i++)
			randArray[i] = (int)(1+Math.random()*100);

		//print it unsorted
		System.out.println("Unsorted array:");
		for (int i=0; i<randArray.length; i++)
			System.out.print(randArray[i] + " ");

		//now sort it using one of the sort routines
		//quickSort(randArray);
		//bubbleSort(randArray);
		mergeSort(randArray);


		//print it sorted
		System.out.println("\n\nSorted array:");
		for (int i=0; i<randArray.length; i++)
			System.out.print(randArray[i] + " ");

		System.out.println("\n\n");
	}

	//*****************************************************************
	//bubbleSort - uses the bubblesort algorithm to sort the array that
	//             is passed in.
	public static void bubbleSort(int[] theArray)
	{
		//find the largest remaining value and place into theArray[i]
		for (int i=theArray.length-1; i>0; i--)
		{
			//move large values to the top
			for (int j=0; j<i; j++)
				if (theArray[j] > theArray[j+1])  //if out of order
				{
					int temp = theArray[j];	  //then swap
					theArray[j] = theArray[j+1];
					theArray[j+1] = temp;
				}
		}
	}

	//***************************************************************
	//mergeSort - uses the mergesort algorithm to sort the array that
	//            is passed in.
	public static void mergeSort(int[] theArray)
	{
		//call the recursive version and tell it to sort the whole thing
		mergeSort(theArray, 0, theArray.length-1);
	}

	//mergeSort - recursive version which looks at the first and last
	//            indexes, calls itself recursively to sort 2 halves,
	//            and then calls merge to merge them together.
	private static void mergeSort(int[] theArray, int low, int high)
	{
		if (low < high)
		{
			int pivot = (low+high)/2;		    //midpoint is the pivot
			mergeSort(theArray, low, pivot);    //sort first half
			mergeSort(theArray, pivot+1, high); //sort second half

			//System.out.print("\nready to merge from " + low + " to " + high + "\t");
			//for (int i=0; i<theArray.length; i++)
			//System.out.print(theArray[i] + " ");

			merge(theArray, low, high);         //merge together

			//System.out.print("\nsorted from " + low + " to " + high + "\t");
			//for (int i=0; i<theArray.length; i++)
			//System.out.print(theArray[i] + " ");


		}
	}

	//merge - keeps taking the smallest elements from the halves into
	//        a temporary array.  When finished, copies the temporary
	//        array back to theArray.
	private static void merge(int[] theArray, int first, int last)
	{
		//create a temporary array
		int[] temp = new int[last-first+1];

		//figure out the midpoint and the starting places for
		//temp and the 2 halves of the array to be merged
		int mid = (first + last) / 2;
		int i1 = 0;
		int i2 = first;
		int i3 = mid + 1;

		//compare next values of the 2 halves - merge the smallest into
		//temp as long as they both halves have elements to merge
		while (i2<=mid && i3<=last)
		{
			if (theArray[i2] < theArray[i3])
				temp[i1++] = theArray[i2++];
			else
				temp[i1++] = theArray[i3++];

			// System.out.pintln("i1 = " + i1);
			// System.out.pintln("i2 = " + i2);
			// System.out.pintln("i3 = " + i3);
		}

		//if the first half has finished merging, then fill in the 2nd half
		if (i2>mid)
			while (i3<=last)
				temp[i1++] = theArray[i3++];
		//otherwise the 2nd half has finished so fill in the first half
		else
			while (i2<=mid)
				temp[i1++] = theArray[i2++];

		//copy the contents of temp back into the correct place in theArray
		int j=0;
		for (int i=first; i<=last; i++)
			theArray[i] = temp[j++];
	}

	//***************************************************************
	//quickSort - calls its recursive version to sort the whole array
	public static void quickSort(int theArray[])
	{
		quickSort(theArray, 0, theArray.length - 1);
	}

	//qSort - 	recursive version that sorts an array between indices
	//						minIndex and maxIndex.
	public static void quickSort(int[ ] data, int minIndex, int maxIndex)
	{
		int indexOfPartition;

		if (explain)
		{
			System.out.print("\nsorting [ ");
			for (int i=0; i<data.length; i++)
			{
				if (i>=minIndex && i<=maxIndex)   //if within the part being sorted
				{
					if(data[i] < 10)
						System.out.print(" " + data[i]);   //1 digit number - print space, then number
					else
						System.out.print(data[i]);   //2 digit number - print the whole thing
				}
				else
					System.out.print("   ");
				System.out.print(" ");    //separate them with a space
			}
			System.out.println(" ]");
		}

		if (maxIndex - minIndex > 0)
		{
			//Create partitions
			indexOfPartition = findPartition(data, minIndex, maxIndex);

			//sort the left side
			quickSort(data, minIndex, indexOfPartition-1);

			//sort the right side
			quickSort(data, indexOfPartition+1, maxIndex);
		}
	}

	//findPartition: rearranges the elements in the sort area into two partitions
	private static int findPartition(int[ ] data, int minIndex, int maxIndex)
	{
		int left, right;
		int temp, partitionElement;

		//use the first element as the partition element
		partitionElement = data[minIndex];
		left = minIndex;
		right = maxIndex;

		if (explain)
		{
			System.out.println("partition element starts at: " + partitionElement);
			System.out.println("left starts at: " + left);
			System.out.println("right starts at: " + right + "\n");
		}

		while(left < right)
		{
			//move left up until an element > the partition element is found
			//(it will belong on the other side).   Don't go past right.
			while(data[left] <= partitionElement && left < right)
			{
				left++;
				if (explain)
					System.out.println("left is now: " + left);
			}

			//move right down until an element < the partition element is found
			//(it will belong on the other side).
			while(data[right] > partitionElement)
			{
				right--;
				if (explain)
					System.out.println("right is now: " + right);
			}

			//left has stopped at an element that is > partitionElement and right has
			//stopped at an element that is < partitionElement.  They each belong on
			//the other side, so swap them.
			if (left < right)
			{
				if (explain)
					System.out.println("swapping : " + data[left] + " with " + data[right] + "\n");

				temp = data[left];
				data[left] = data[right];
				data[right] = temp;

				if (explain)
				{
					System.out.print("now is  [ ");
					for (int i=0; i<data.length; i++)
					{
						if(data[i] < 10)
							System.out.print(" " + data[i]);   //1 digit number - print space, then number
						else
							System.out.print(data[i]);   //2 digit number - print the whole thing
						System.out.print(" ");
					}
					System.out.println(" ]");
				}
			}
		}

		//move partitionElement to partition index
		if (explain)
			System.out.println("swapping partition: " + data[minIndex] + " with " + data[right]);

		temp = data[minIndex];
		data[minIndex] = data[right];
		data[right] = temp;

		return right;
	}

}