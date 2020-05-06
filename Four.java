import java.util.*;

class Four
{
	static void elements(int[] a,int n,int val)
	{
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						sum = a[i]+a[j]+a[k]+a[l];
						
						if(sum == val)
						{
							System.out.println(1);
						}
						
					}
				}
			}
		}
		
		
		System.out.println(0);
		
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
			
			int k = x.nextInt();
			
			elements(a,n,k);
			
			t--;
		}
		
		
	}
}