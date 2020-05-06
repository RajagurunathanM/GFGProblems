import java.util.*;

class SortOrder
{
	static void specificSort(int[] a)
	{
		int[] b = new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
		
		int j=0;
		for(int i=b.length-1;i>=0;i--)
		{
			if(b[i]%2!=0)
			{
				a[j]=b[i];
				j++;
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				a[j]=b[i];
				j++;
			}
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
			System.out.println();
			
			specificSort(a);
			
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			T--;
		}
	}
}
