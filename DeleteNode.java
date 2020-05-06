import java.util.*;

class DeleteNode
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
		
		if(this.head == null)
		{
			this.head = temp;
		}
		else
		{
			Node p = this.head;
			
			while(p.link!=null)
			{
				p = p.link;
			}
			
			p.link = temp;
			
		}
	}
		
		void delete(Node p,int pos)
		{
			if(this.head==null)
			{
				System.out.println("Empty List");
			}
			else if(pos == 1)
			{
				this.head = p.link;
			}
			else
			{
				Node old = p;
				
				for(int i=1;i<pos;i++)
				{
					old = p;
					p=p.link;
				}
				
				old.link = p.link;
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
		
		
		public static void main(String args[])
		{
			Scanner x = new Scanner(System.in);
			int t = x.nextInt();
			
			while(t>0)
			{
				DeleteNode l = new DeleteNode();
				
				int n = x.nextInt();
				
				for(int i=0;i<n;i++)
				{
					int val = x.nextInt();
					l.insert(val);
				}
				int pos = x.nextInt();
				
				l.delete(l.head,pos);
				l.display(l.head);
				
				
				t--;
			}
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		