import java.util.*;

class SubSumZero
{
	static void sum(int[] a)
	{
		int k=0,c=0;
		
		while(k<a.length)
		{
			for(int i=0;i<a.length-k;i++)
			{
				int sum=-1;
				
				for(int j=i;j<i+k+1 && j<a.length;j++)
				{
					sum = sum+a[j];
				}
				
				if(sum+1 == 0)
				{
					c++;
				}
				
			}
			
			k++;
		}
		
		System.out.println(c);
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
			
			sum(a);
			
			t--;
		}
	}
}