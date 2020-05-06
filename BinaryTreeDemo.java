import java.util.*;

class BinaryTreeDemo
{
	Node root;
	
	static class Node
	{
		int data;
		
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	public static void main(String args[])
	{
		BinaryTreeDemo bt = new BinaryTreeDemo();
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		bt.root = first;
		
		System.out.println(bt.root.data);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	