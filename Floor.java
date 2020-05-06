import java.util.*;

class Floor
{
	static void floorValue(int[] a,int k)
	{
		int result = -1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=k)
			{
				result = i;
			}
		}
		
		System.out.println(result);
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
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			floorValue(a,k);
		
			System.out.println();
			
			t--;
		
		}
	}
}