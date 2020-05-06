import java.util.*;

class QueueDemo
{
	Node front;
	Node rear;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
	}
	
	void insert(int val,Node front,Node tail)
	{
		Node temp = new Node(val);
		
		if(front == null)
		{
			this.front = temp;
			this.tail = temp;
		}
		else
		{
			this.tail.next = temp;
			this.tail = temp;
		}
	}
	
	
	void display(Node front,Node tail)
	{
		if(front == null && tail == null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			Node p = front;
			while(p != tail)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
		}
	}
		
		
	
	
	public static void main(String args[])
	{
		QueueDemo obj = new QueueDemo();
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(1,obj.front,obj.rear);
		obj.enqueue(1,obj.front,obj.rear);
		
		
		obj.display(obj.front,obj.rear);
	}
}
		