import java.util.*;

class EquilibriumPoint
{
	static void equPoint(int[] a)
	{
		int result=-1;
		
		if(a.length==1)
		{
			result=1;
		}
		else
		{
			
		for(int i=0;i<a.length;i++)
		{
			int sum1=0,sum2=0;
			
			for(int j=0;j<i;j++)
			{
				sum1=sum1+a[j];
			}
			
			for(int j=i+1;j<a.length;j++)
			{
				sum2=sum2+a[j];
			}
			
			if(sum1==sum2)
			{
				result=i+1;
				
				//System.out.println(i+1);
				break;
			}
		}
		
		}
		
		if(result>-1)
		{
			System.out.println(result);
		}
		else
		{
			System.out.println(-1);
		}
		
		
		
	}
			
			
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T>0)
		{
			int N = scan.nextInt();
			
			int[] a = new int[N];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			equPoint(a);
			
			System.out.println();
			
			T--;
		}
	}
}
