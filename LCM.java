import java.util.*;

class LCM
{
	static void lcm(long a,long b)
	{
		long max = 0;
		if(a>b)
		{
			max = a;
			for(long i=max;i<10000;i++)
			{
				if(max % b==0 && max % a==0)
				{
					System.out.print(max+" ");
					return;
					
				}
				max++;
				
			}
		}
		else
		{
			max = b;
			
			for(long i=max;i<10000;i++)
			{
				if(max % a==0 && max % b==0)
				{
					System.out.print(max+" ");
					return;
				}
				max++;
				
			}
		}
		
		
	}
	

	static void gcd(long a,long b)
	{
		if(a < b)
		{
			for(long i=a;i>=1;i--)
			{
				if(a%i==0 && b%i==0)
				{
					System.out.println(i);
					return;
				}
			}
		}
		else
		{
			for(long i=b;i>=1;i--)
			{
				if(a%i==0 && b%i==0)
				{
					System.out.println(i);
					return;
				}
			}
			
		}
		
		System.out.println(1);
	}
			
		
		
		
		
		
		

	
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		long a = x.nextLong();
		long b = x.nextLong();
		
		lcm(a,b);
		gcd(a,b);
	}
}