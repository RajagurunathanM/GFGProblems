import java.util.*;

class InsertNode
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
	
	void insert(int val,int pos)
	{
		Node temp = new Node(val);
		
		if(this.head == null)
		{
			this.head = temp;
		}
		else
		{
			if(pos==0)
			{
				this.insertAtBeg(temp);
				
			}
		    else
			{
				this.insertAtEnd(temp,this.head);
			}
			 
		}
	}
	
	void insertAtBeg(Node temp)
	{
		temp.link = this.head;
		this.head = temp;
	}
	
	void insertAtEnd(Node temp,Node p)
	{
		while(p.link!=null)
		{
			p = p.link;
		}
		
		p.link = temp;
	}
	
	
	
	void display(Node p)
	{
		while(p.link!=null)
		{
			System.out.print(p.data+" ");
			p = p.link;
		}
		System.out.println(p.data);
		
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int t = x.nextInt();
		
		while(t>0)
		{
			InsertNode l = new InsertNode();
			
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				int pos = x.nextInt();
				
				l.insert(val,pos);
				
			}
			
			
			l.display(l.head);
			
			t--;
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		