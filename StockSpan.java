import java.util.*;

class StockSpan
{
	static void stock(int[] a)
	{
		System.out.print(1+" ");
		
		for(int i=1;i<a.length;i++)
		{
			int c = count(a,a[i],i);
			System.out.print(c+" ");
			
		}
	}
	
	static int count(int[] a,int val,int index)
	{
		int c = 1;
		
		for(int i=index-1;i>=0;i--)
		{
			if(val < a[i])
			{
				return c;
			}
			else
			{
				c++;
			}
		}
		
		return c;
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			stock(a);
			
			t--;
		}
	}
}