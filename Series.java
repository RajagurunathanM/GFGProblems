import java.util.*;

class Series
{
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
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			t--;
		}
	}
}
	