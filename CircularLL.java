import java.util.*;

class CircularLL
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	void insert(Node head,int d)
	{
		Node temp = new Node(d);
		
		if(this.head==null)
		{
			this.head = temp;
			temp.next = this.head;
		}
		else
		{
			Node p = head;
			
			while(p.next!= this.head)
			{
				p = p.next;
			}
			p.next = this.head;
		}
	}
	
	
	void print(Node head)
	{
		if(this.head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node p = head;
			
			while(p.next!= this.head)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			System.out.print(p.data+" ");
		}
	}
		
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	public static void main(String args[])
	{
		CircularLL obj = new CircularLL();
		
		obj.insert(obj.head,1);
		obj.insert(obj.head,2);
		obj.insert(obj.head,3);
		obj.insert(obj.head,4);
		obj.insert(obj.head,5);
		obj.insert(obj.head,6);
		
		obj.print(obj.head);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		