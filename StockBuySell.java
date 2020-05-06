import java.util.*;

class StockBuySell
{
	static void stock(int[] a)
	{
		int count = 0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i] < a[i+1])
			{
				count++;
			}
			else
			{
				if(count>0)
				{
					System.out.print("("+(i-count)+" "+i+")"+" " );
				}
				count = 0;
			}
		}
		
		if(count > 0)
		{
			System.out.println("("+(a.length-count-1)+" "+(a.length-1)+")");
		}
		else
		{
			if(!(a[a.length-2] > a[a.length-1]))
			{
				System.out.print("No Profit");
			}

		}
			
		
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