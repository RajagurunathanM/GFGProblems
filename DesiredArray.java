import java.util.*;

class DesiredArray
{
	static void MinimumStep(int[] a)
	{
		int[] b = new int[a.length];
		
		
		for(int i=0;i<b.length;i++)
		{
			b[i] = b[i]+1;
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
			
			MinimumStep(a);
			
			t--;
		}
	}
}