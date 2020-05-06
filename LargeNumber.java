import java.util.*;

class LargeNumber
{
	static void number(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				String s1 = String.valueOf(a[j]);
				String s2 = String.valueOf(a[j+1]);
				
				String temp1 = s1+s2;
				String temp2 = s2+s1;
				
				//System.out.println(temp1+" "+temp2);
				
				if(Integer.valueOf(temp1) < Integer.valueOf(temp2))
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
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
			
			number(a,n);
			
			t--;
		}
		
		
	}
}