import java.util.*;

class LoopNode
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
			
			p.link = this.head.link;
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
		
		 void countNodesinLoop(Node head,int x)
		 {
			 int count =1;
			 Node p = head;
			 
			 while(head.link!=null)
			 {
				count++;
				head = head.link;
				
			 }
			 
			 //System.out.println(count);
			 
			 
			 
			 for(int i=1;i<x;i++)
			 {
				 p = p.link;
			 }
			 
			 //System.out.println(p.data);
			 
			 int l=0;
			 
			 while(p==p.link)
			 {
				 l++;
				 p = p.link;
			 }
				
			 System.out.println(l);
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String args[])
	   {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			LoopNode l = new LoopNode();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				
				l.insert(val);
			}
			
			
			int s = x.nextInt();
			
			//l.display(l.head);
			
			l.countNodesinLoop(l.head,s);
			
			t--;
			
		}
	   }
}
	
		
		
		
		
		
		
		
		
		
	