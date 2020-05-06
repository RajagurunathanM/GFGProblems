import java.util.*;
import java.lang.*;
import java.io.*;

class SubZero 
{
	static void check(ArrayList<Integer> a,int n)
	{
		if(a.contains(0))
		{
			System.out.println("Yes");
			return;
		}
		
		int k=2;
		
		while(k <= n)
		{
			int sum = a.get(0);
			
			for(int i=1;i<k;i++)
			{
				sum = sum + a.get(i);
			}
			
			if(sum == 0)
			{
				System.out.println("Yes");
				return;
			}
			
			
			for(int i=k;i<n;i++)
			{
				sum = sum - a.get(i-k);
				sum = sum + a.get(i);
				
				if(sum == 0)
				{
					System.out.println("Yes");
					return;
				}
				
			}
			
			k++;
		}
			
		System.out.println("No");	
		
	}
	
	public static void main (String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++)
			{
				a.add(x.nextInt());
			}
			
			check(a,n);
			
			t--;
		}
		
		
	}
}