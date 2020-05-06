import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
class GfG
{
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
            LList myList = new LList();
			int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    myList.insertAtBeginning(a1);
                else
                    myList.insertAtEnd(a1);
            }
			myList.printList();
		}
	}
}




class LList
{
    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    Node temp = new Node(x);
	    
	    temp.next = head;
		head = temp;
	      
	}
	
	// Should insert a node at the end
	
	void insertAtEnd(int x)
	{
	    try
	    {
	    Node temp = new Node(x);
	    
	    Node p = head;
	    
	    while(p.next!=null)
		{
			p = p.next;
		}
		p.next = temp;
		
	    }
	    catch(Exception e)
	    {}

	}
	
	
	
	
	// Please do not delete this
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}
