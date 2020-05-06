import java.util.*;

class CountSubArrays
{
	static void count(int[] a,int val)
	{
		int k =0,c=0;
		
		while(k<a.length)
		{
			for(int i=0;i<a.length-k;i++)
			{
				for(int j=i;j<i+k+1 && j<a.length;j++)
				{
					if(a[j] > val)
					{
						c++;
						break;
					}
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
			int k = x.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			count(a,k);
			
			t--;
		}
	}
}