import java.util.*;

class OccurenceCount
{
	static void count(int[] a,int k)
	{
		int c =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				c++;
			}
		}
		
		if(c>0)
		{
			System.out.println(c);
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
			
			count(a,k);
			
			System.out.println();
			
			t--;
		}
	}
}