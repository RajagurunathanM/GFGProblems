import java.util.*;

class DeleteAlternateNode
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
		
	}
	
	
	static void insert(int val)
	{
		Node temp = new Node(val);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node p = head;
			
			while(p.next != null)
			{
				p = p.next;
			}
			
			p.next = temp;
		}
	}
	
	static void print()
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node p = head;
			
			while(p.next != null)
			{
				System.out.print(p.data+" ");
				p = p.next;
			}
			System.out.println(p.data);
		}
	}
	
	
	static void deleteAlternate()
	{
        Node p = head;
		
		Node l = head;
		int len = 1;
		
		while(l.next != null)
		{
			len++;
			l = l.next;
		}
		
		if(len%2!=0)
		{
		
			while(p.next!=null)
			{
				p.next = p.next.next;
				p = p.next;
			}
		
		}
		else
		{
			while(p.next.next!=null)
			{
				p.next = p.next.next;
				p = p.next;
			}
			p.next = null;
			
		}
		
			
			
        
        
    }
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int val = x.nextInt();
				insert(val);
			}
			
			
			
			deleteAlternate();
			print();
			
			t--;
		}
		
	}
}