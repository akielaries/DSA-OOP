//This implements a Binary Search Tree and various methods.

public class BTree
{
	//data
	private BTNode root;

	//constructor
	public BTree()
	{
		root = null;
	}

	//methods
	//insert - to insert new data into the tree (called from "outside")
	public void insert(Comparable whatToInsert)
	{
		if (root == null)     //empty
			root = new BTNode(whatToInsert);
		else
			insert(root, whatToInsert);   //"you (whoever the root point at) handle it"
	}

	//private, recursive version of insert to actually do the work
	private void insert(BTNode subTree, Comparable whatToInsert)
	{
		int direction = whatToInsert.compareTo(subTree.data);   //what compareTo returns

		if (direction > 0)     //whatToInsert belongs on the right
		{
			if (subTree.right == null)     //there is room
				subTree.right = new BTNode(whatToInsert);
			else
				insert(subTree.right, whatToInsert);    //recursive call to let the subTree do the same logic
		}
		else if (direction < 0)     //whatToInsert belongs on the left
		{
			if (subTree.left == null)     //there is room
				subTree.left = new BTNode(whatToInsert);
			else
				insert(subTree.left, whatToInsert);    //recursive call to let the subTree do the same logic
		}
		else     //data already exists in the tree
			throw new DuplicateNodeException(whatToInsert + " already exists in the tree");
	}

	//inorder -  the public version that is called from "outside"
	public String inorder()      //return the String that is the inorder traversal
	{
		return "[" + inorder(root) + " ]";
	}

	//private, recursive version of inorder
	private String inorder(BTNode subTree)
	{
		if (subTree == null)
			return "";
		else
			return inorder(subTree.left) + " " + subTree + inorder(subTree.right);
	}

		//printTree methods - prints the tree in RNL order, with indents.  Called from "outside"
		public void printTree()
		{
			if (root == null)
				System.out.println("The tree is empty");
			else
				printTree(root, 0);    //start with the root with 0 indentations
		}

		//recursive, private version of printTree
		private void printTree(BTNode subTree, int indents)
		{
			//if there is a right side, handle it first (with 1 more indent)
			if (subTree.right != null)
				printTree(subTree.right, indents+1);

			//then print the node itself (first move over the right amount of indents)
			System.out.println("\n\n\n");
			for (int i=0; i<indents; i++)
				System.out.print("\t");
			System.out.println(subTree);

			//if there is a left side, handle it first (with 1 more indent)
			if (subTree.left != null)
				printTree(subTree.left, indents+1);
	}

	//contains - called from "outside."  They ask the tree if it contains a certain Comparable
	public boolean contains(Comparable searchee)
	{
		if (root == null)   //empty
			return false;   //so doesn't contain anything
		else
		{
			if (find(root, searchee) == null)
				return false;   //to the outside
			else     //it returned a reference to where it was
				return true;   //but I just return true to the outside
		}
	}

	//contains - private recursive version to search a subtree, return a reference to it
	private BTNode find(BTNode subTree, Comparable searchee)
	{
		if (subTree == null)   //if I am empty then my subTree does not contain it
			return null;    //means did not find it
		else
		{
			int amIIt = searchee.compareTo(subTree.data);    //how do I compare to searchee?
			if (amIIt == 0)      //found it!
				return subTree;    //I am it
			else if (amIIt < 0)   //seachee would belong on the left side (if it exists)
			{
				if (subTree.left == null)     //there is no left side, so....
					return null;					//return null (not contained)
				else
					return find(subTree.left, searchee);    //have the left side look for searchee
			}
			else   //must be > 0 so belongs on right side (if it exists)
			{
				if (subTree.right == null)     //there is no right side, so....
					return null;					//return null (not contained)
				else
					return find(subTree.right, searchee);    //have the right side look for searchee
			}
		}
	}

}

class BTNode
{
	//data
	public Comparable data;
	public BTNode left;
	public BTNode right;

	//constructor
	public BTNode(Comparable theData)
	{
		data = theData;
		left = right = null;
	}

	//toString - returns its representation as a String
	public String toString()
	{
		return "" + data;   //or data.toString();
	}
}








