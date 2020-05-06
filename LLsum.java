import java.util.*;

class LLsum
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
			
	static void sum(int k)
	{
		Node l = head;
		int len = 1;
		
		while(l.next != null)
		{
			l = l.next;
			len++;
		}
		
		int sum = 0;
		
		if(k == len)
		{
			Node p = head;
			
			while(p != null)
			{
				sum = sum+p.data;
				p = p.next;
			}
		}
		
		if(k < len)
		{
			int i = 1;
			
			Node p = head;
			
			while(i<=len-k)
			{
				p= p.next;
				i++;
			}
			
			
			while(p != null)
			{
				sum = sum + p.data;
				p = p.next;
			}
		}
			
		
		System.out.println(sum);
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
			
			print();
			
			int k = x.nextInt();
			
			sum(k);
			
			t--;
		}
		
	}
}