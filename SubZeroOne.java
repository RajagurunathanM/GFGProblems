import java.util.*;

class SubZeroOne
{
	static void subArray(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i] == 0)
			{
				a[i] = -1;
			}
		}
		
		int max = 0;
		
		int k = n;
		
		while(k >= 2)
		{
			int sum = a[0];
			
			for(int i=1;i<k;i++)
			{
				sum = sum + a[i];
			}
			
			if(sum == 0)
			{
				System.out.print(k+" ");
				return;
			}
			
			for(int i=k;i<n;i++)
			{
				sum = sum - a[i-k];
				sum = sum + a[i];
				
				if(sum == 0)
				{
					System.out.print(k+" ");
					return;
					
				}
				
			}
			k--;
		}
			
		System.out.println(max);	
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			subArray(a,n);
			
			t--;
		}
		
		
	}
}