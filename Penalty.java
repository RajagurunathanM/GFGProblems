import java.util.*;

class Penalty
{
	static int penaltyfun(int[] p,int[] c,int d)
	{
		int value=0;
			
		if(d%2==0)
		{
			
			for(int i=0;i<p.length;i++)
			{
				if(p[i]%2!=0)
				{
					value=value+c[i];
				}
			}
		}
		else
		{
			
			for(int i=0;i<p.length;i++)
			{
				if(p[i]%2==0)
				{
					value=value+c[i];
				}
			}
		}
		
		return value;
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T>0)
		{
			int N = scan.nextInt();
			int d = scan.nextInt();
			int[] p = new int[N];
			
			for(int i=0;i<N;i++)
			{
				p[i]=scan.nextInt();
			}
			
			int[] c = new int[N];
			
			for(int i=0;i<N;i++)
			{
				c[i]=scan.nextInt();
			}
			
			int result = penaltyfun(p,c,d);
			
			System.out.println(result);
			
			T--;
		}
	}
}
			
			