import java.util.*;

class FreqSort
{
	static void sort(int[] a)
	{
		ArrayList<Integer> freq = new ArrayList<Integer>();
		ArrayList<Integer> element = new ArrayList<Integer>();
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			
			if( !(element.contains(a[i])) )
			{
				
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			
			element.add(a[i]);
			
			freq.add(count);
			
			}
			
		}
		
		
		System.out.println(element);
		System.out.println(freq);
		
		for(int j=0;j<element.size();j++)
		{
			
		int max = 0;
		
		for(int i=0;i<freq.size();i++)
		{
			if(freq.get(i) > max)
			{
				max = i;
			}
		}
		
		for(int i=0;i<=max;i++)
		{
			System.out.print(element.get(max));
		}
		
		max = 0;
		
		
		}
		
		
		
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int n = x.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
		
		sort(a);
	}
}