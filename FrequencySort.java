import java.util.*;

class FrequencySort
{
	static void freqSort(int[] a)
	{
		ArrayList<Integer> ulist = new ArrayList<Integer>();
		ArrayList<Integer> freq = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if( !(ulist.contains(a[i])) )
			{
				ulist.add(a[i]);
				
				int c = 1;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						c++;
					}
				}
				
				freq.add(c);
			}
		}
		
		sort(ulist,freq);
	}
	
	
	static void sort(ArrayList<Integer> A, ArrayList<Integer> F)
	{
		for(int i=0;i<F.size();i++)
		{
			for(int j=0;j<F.size()-1;j++)
			{
				if(F.get(j) < F.get(j+1) )
				{
					Collections.swap(F,j,j+1);
					
					Collections.swap(A,j,j+1);
					
				}
				if( (F.get(j) == F.get(j+1) ) && (A.get(j) > A.get(j+1)) )
				{
					Collections.swap(F,j,j+1);
					
					Collections.swap(A,j,j+1);
					
				}
			}
		}
		
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<F.get(i);j++)
			{
				System.out.print(A.get(i)+" ");
			}
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
			
			freqSort(a);
			
			t--;
		}
		
	}
}