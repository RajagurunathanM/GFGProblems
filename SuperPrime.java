import java.util.*;

class SuperPrime
{
	static void primefun(int n)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		int count=0;
		
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				l.add(i);
			}
		}
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				int sum= l.get(i)+l.get(j);
				
				if(search(l,sum))
				{
					System.out.println("Super prime  "+sum);
					count++;
				}
			}
		}
		
		System.out.println("TOTAL SUPER PRIME UPTO N  "+count);
		
		
		
	}
	
	static boolean search(ArrayList<Integer> l,int k)
	{
		boolean result = false;
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==k)
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	static boolean isPrime(int n)
	{
		int flag=0;
		
		boolean result = false;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}
			
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			
			primefun(n);
			
			System.out.println();
			
			t--;
		}
	}
}