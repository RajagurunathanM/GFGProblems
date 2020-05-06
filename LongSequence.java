import java.util.*;

class LongSequence
{
	static void checkSeq(int[] a)
	{
		int max = -1;
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			int c = 0;
			
			for(int j=i;j<a.length-1;j++)
			{
				if( (a[j]+1 == a[j+1]) || (a[j] == a[j+1] && ( a[j-1]!= a[j]) && a.length>2)  )
				{
					c++;
				}
				else if(a[j] == a[j+1])
				{
				    
				}
				else
				{
				    break;
				}
					
			}
			
			if(c > max)
			{
				max = c;
			}
			
		}
		
		
		if(	max > 0)
		{			
			System.out.println(max+1);
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			checkSeq(a);
			
			t--;
		}
	}
}
		