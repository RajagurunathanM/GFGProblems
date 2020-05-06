import java.util.*;

class Duplicates
{
	Node head;
	
	static class Node
	{
		int data;
		Node link;
		
		Node(int d)
		{
			data = d;
		}
		
	}
	
	
	void insert(Node head,int d)
	{
		Node temp = new Node(d);
		
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			while(head.link!=null)
			{
				head = head.link;
			}
			
			head.link = temp;
		}
	}
	
	
	void display(Node head)
	{
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			while(head.link!=null)
			{
				System.out.print(head.data+" ");
				head = head.link;
			}
			System.out.println(head.data);
			
		}
		
	}
	
	void removeDuplicates(Node head)
	{
		Node result = head;
		
		Node p = head;
		
		while(p.link!=null)
		{
			head = result;
			
			while(head.link!=null)
			{
				if(head.data == p.data)
				{
					head = head.link;
				}
				
				head = head.link;
			}
			
			p = p.link;
			
		}
		
	}
			
			
		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			Duplicates l = new Duplicates();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				
				l.insert(l.head,val);
			}
			
			l.display(l.head);
			l.removeDuplicates(l.head);
			
			l.display(l.head);
			t--;
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		