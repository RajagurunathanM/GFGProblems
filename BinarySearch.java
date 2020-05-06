import java.util.*;

class BinarySearch
{
	static int bsearch(int[] a,int l,int r,int key)
	{
		if(r>=l)
		{
			int m = (l+r)/2;
			
			if(a[m]== key)
			{
				return m;
			}
			else if(a[m]>key)
			{
				return bsearch(a,0,m-1,key);
			}
			else
			{
				return bsearch(a,m+1,a.length-1,key);
			}
		}
		return -1;
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			
			int result = bsearch(a,0,a.length-1,k);
			System.out.println(result);
			t--;
		}
	}
}