import java.util.*;

class ExtraIndex
{
	static void extra(int[] a ,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=search(b,a[i]))
			{
				System.out.println(i+"th position");
				break;
			}
		}
		
	}
	
	static int search(int[] b,int k)
	{
		int result =-1;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==k)
			{
				result=k;
				break;
			}
		}
		
		return result;
	}
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			
			int[] a = new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			int[] b = new int[n-1];
			for(int i=0;i<b.length;i++)
			{
				b[i]=scan.nextInt();
			}
			
			extra(a,b);
			
			System.out.println();
			t--;
		}
	}
}
			
			