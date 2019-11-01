/**
 * @author kaustavmanna
 *
 */

package com.tree;

public class TreeImpl
{
	public static void main(String[] args)
	{
		BinaryTree<Integer> tree1 = new BinaryTree<Integer>();
		
		tree1.insertRoot(5);
		tree1.insertRight(5, 7);
		tree1.insertLeft(5, 3);
		
		/*Depth Of the Tree*/
		System.out.println("The depth of the Tree is: " + tree1.depth(tree1.getRoot()));
		
		/*Number of Leaves in The Tree*/
		System.out.println("The number of Leave Nodes in the Tree is: " + tree1.countLeaveNode(tree1.getRoot()));
		
		/*Number of Parent Nodes in the Tree*/
		System.out.println("The number of Parent Nodes in the Tree is: " + tree1.countParentNode(tree1.getRoot()));
		
		/*Number of Half Nodes in the Tree*/
		System.out.println("The number of Half Nodes in the Tree is: " + tree1.countHalfNode(tree1.getRoot()));
		
		/*BinarySearchTree tree2 = new BinarySearchTree();
		tree2.insert(5);
		tree2.insert(10);
		tree2.insert(17);
		tree2.insert(12);
		tree2.insert(3);
		*/
		
		//System.out.println("Maximum element in the tree is: " + Tree.maximum(tree1.getRoot()).getData());
		
		System.out.println("\nCurrent Preorder Tree Structure is: ");		
		tree1.preorder(tree1.getRoot());
		
		//Tree.nonrecursivepreorder(tree1.getRoot());
		
		System.out.println("\nCurrent Inorder Tree Structure is: ");
		//Tree.inorder(tree1.getRoot());
		
		//Tree.nonrecursiveinorder(tree1.getRoot());
		
		System.out.println("\nCurrent Postorder Tree Structure is: ");
		//Tree.postorder(tree1.getRoot());
		
		//Tree.nonrecursivepostorder(tree1.getRoot());
	}
}
