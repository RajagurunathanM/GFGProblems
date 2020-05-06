import java.util.*;

class MiddleNode
{
	static Node head;
	
	static class Node
	{
		int data;
		Node link;
		
		Node(int d)
		{
			data = d;
		}
		
	}
	
	
	static void insert(int d)
	{
		Node temp = new Node(d);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node p = head;
			
			while(p.link!=null)
			{
				p = p.link;
			}
			
			p.link = temp;
		}
	}
	
	
	static void display()
	{
		Node p = head;
		
		if(head == null)
		{
			System.out.println("empty list");
		}
		else
		{
			while(p.link!=null)
			{
				System.out.println(p.data);
				p=p.link;
			}
			System.out.println(p.data);
		}
	}
		
		
		
		
		
		
	
	public static void main(String args[])
	{
		MiddleNode m = new MiddleNode();
		
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		
		display();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		