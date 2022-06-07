public class BTDriver
{
	public static void main(String[ ] args)
	{
		//create a new BTree to hold Strings
		BTree myTree = new BTree();

		//ask the tree if it contains ("Eric");
		System.out.println("Does it contain \"Eric\"? " + myTree.contains("Eric"));

		//tell it to insert some Strings
		myTree.insert("Juan");
		myTree.insert("Patrick");
		myTree.insert("Josh");
		myTree.insert("Eric");
		myTree.insert("Ken");
		//myTree.insert(new Employee());
		//myTree.insert(new Card(10, '\u0003'));    //10 of hearts

		//see what it looks like in "inorder" traversal and "postorder" traversal
		System.out.println(myTree.inorder());

		//tell it to do a printTree
		myTree.printTree();

		//ask the tree if it contains ("Eric");
		System.out.println("Does it contain \"Eric\"? " + myTree.contains("Eric"));
		//ask the tree if it contains ("Matt");
		System.out.println("Does it contain \"Matt\"? " + myTree.contains("Matt"));

	}

}





