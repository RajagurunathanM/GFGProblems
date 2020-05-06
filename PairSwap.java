import java.util.*;

class PairSwap
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
	
	    void display(Node p)
		{
			if(this.head == null)
			{
				System.out.println("empty list");
			}
			else
			{
			while(p.link != null)
			{
				System.out.print(p.data+" ");
				p = p.link;
			}
			
			System.out.println(p.data);
			
			}
		}
		
		
		void swap(Node head)
		{
			Node old = head;
			
			while(head.link!=null)
			{
				head = head.link;
				
				int temp = head.data;
				head.data = old.data;
				old.data = temp;
				
				System.out.println(old.data+"  "+head.data);
				
				if(head.link!=null && old.link!=null)
				{
				head = head.link;
				old = head;
				}
				
			}
			
		}
		
		
		
		
		
		
		public static void main(String args[])
	   {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			PairSwap l = new PairSwap();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				
				l.insert(val);
			}
			
			
			l.swap(l.head);
			l.display(l.head);
			
			t--;
			
		}
	   }
}