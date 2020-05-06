import java.util.*;

class DoublyLL
{
	Node head;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	void insert(Node head,int val)
	{
		Node temp = new Node(val);
		
		if(head==null)
		{
			temp.prev = null;
			temp.next = null;
			head = temp;
		}
		else
		{
			temp.prev = null;
			temp.next = head;
			head = temp;
		}
	}
		
		
	void print(Node head)
	{
		if(head==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			while(head.next!=null)
			{
				System.out.print(head.data+" ");
				head = head.next;
			}
			System.out.println(head.data+" ");
			
		}
	}
	
	
	public static void main(String args[])
	{
		DoublyLL l = new DoublyLL();
		l.insert(l.head,1);
		l.insert(l.head,2);
		l.insert(l.head,3);
		l.insert(l.head,4);
		l.insert(l.head,5);
		
		l.print(l.head);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		