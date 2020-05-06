import java.util.*;

class PrintLL
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
	
	
	void insert(int d)
	{
		Node temp = new Node(d);
		
		if(this.head == null)
		{
			this.head = temp;
		}
		else
		{
			Node p = this.head;
			
			while(p.link!=null)
			{
				p=p.link;
			}
			
			p.link = temp;
		}
	}
	
	
	void display(Node p)
	{
		if(this.head ==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			while(p.link!=null)
			{
				System.out.print(p.data+" ");
				p = p.link;
			}
			
			System.out.println(p.data);
			
		}
		
	}
			
	
	
	
	public static void main(String args[])
	{	
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			PrintLL l = new PrintLL();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				l.insert(val);
				
			}
			
			
			l.display(l.head);
			
			t--;
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			