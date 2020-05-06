import java.util.*;

class LongestCommonPrefix
{
	static void common(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			String[] a = new String[n];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.next();
			}
			
			common(a);
			
			t--;
		}
	}
}
