import java.util.*;

class Occurence
{
	static void occur(int[] a,int k)
	{
		int first=-1,last=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				first = i;
				break;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				last = i;
			}
		}
		
		if(first!=-1 && last!=-1)
		{
			System.out.println(first+" "+last);
		}
		else
		{
			System.out.println(-1);
		}
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			
			int k = scan.nextInt();
			
			occur(a,k);
			
			System.out.println();
			
			t--;
		}
	}
}