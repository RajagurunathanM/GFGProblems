import java.util.*;

class MaxOfMin
{
	static void fun(int[] a)
	{
		int k = 0;
		
		while(k<a.length)
		{
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=0;i<a.length-k;i++)
		{
			int min = a[i];
			
			for(int j=i;j<=i+k;j++)
			{
				if(a[j] < min)
				{
					min = a[j];
				}
				
			}
			
			l.add(min);
			
		}
		
		System.out.print(max(l)+" ");
		k++;
		
		}
		
		
		
	}
	
	
	static int max(ArrayList<Integer> l)
	{
		int m = l.get(0);
		
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(j) > l.get(i))
				{
					if(l.get(j) > m)
					{
						m = l.get(j);
					}
				}
			}
		}
		
	
		return m;
		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t= x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=x.nextInt();
			}
			
			fun(a);
			
			System.out.println();
			t--;
		}
	}
}
			
