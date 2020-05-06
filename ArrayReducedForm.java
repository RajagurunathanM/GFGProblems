import java.util.*;

class ArrayReducedForm
{
	static void reduce(int[] a)
	{
		int[] b = new int[a.length];
		
		for(int i=0;i<b.length;i++)
		{
			b[i] = a[i];
		}
		
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++)
		{
			int val = search(a[i],b);
			a[i] = val;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	static int search(int val , int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==val)
			{
				return i;
			}
		}
		
		return -1;
	}
			
			
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int t = x.nextInt();
		
		while(t>0)
		{
		
		int n = x.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = x.nextInt();
		}
		
		reduce(a);		
		
		System.out.println();
		
		t--;
		
		}
	}
}
		