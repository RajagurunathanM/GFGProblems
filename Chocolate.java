import java.util.*;

class Chocolate
{
	static void chocofun(int[] a,int m)
	{
		Arrays.sort(a);
		
		int result=100;
		
		for(int i=0;i<a.length-m+1;i++)
		{
			int low = a[i];
			int high =0;
			
			for(int j=i;j<i+m;j++)
			{
				high = a[j];
				
			}
			
			int diff = Math.abs(high-low);
			
			if(diff<result)
			{
				result = diff;
			}
			
		}
		
		System.out.println(result);
				
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t=x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			int m = x.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=x.nextInt();
			}
			
			chocofun(a,m);
			
			t--;
		}
		
		
		
	}
}