import java.util.*;

class ListLength
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
	
	
	void insert(int val)
	{
		Node temp = new Node(val);
		
		if(this.head==null)
		{
			this.head = temp;
		}
		else
		{
			Node p = this.head;
			
			while(p.link != null)
			{
				p = p.link;
			}
			
			p.link = temp;
		}
	}
	
	void isLengthEvenOrOdd(Node p)
	{
		int c = 1;
		
		if(this.head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			while(p.link!=null)
			{
				c++;
				p = p.link;
			}
			
			if(c%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		
		
		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			ListLength l = new ListLength();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				
				l.insert(val);
			}
			
			l.isLengthEvenOrOdd(l.head);
			
			t--;
			
		}
	}
}
				
		
		
		
		
		
		
		
		
		
		
		
		