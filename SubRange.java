import java.util.*;

class SubRange
{
	static void count(int[] a,int l,int r)
	{
		int k=0;
		int c = 0;
		
		while(k < a.length)
		{
			for(int i=0;i<a.length-k;i++)
			{
				int max = a[i];
				
				for(int j=i;j<i+k+1 && j<a.length;j++)
				{
					if(a[j] > max)
					{
						max = a[j];
					}
				}
				
					if(max>= l && max<=r)
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
			int l = x.nextInt();
			int r = x.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			count(a,l,r);
			
			t--;
		}
	}
}