import java.util.*;

class CountDistinct
{
	static void count(int[] a,int K)
	{
		for(int i=0;i<=a.length-K;i++)
		{
			int count = 0;
			int start = i;
			int end = i+K-1;
			
			while(start <= end)
			{
				for(int j=start+1;j<=end;j++)
				{
					if(a[start]==a[j])
					{
						count++;
					}
				}
				
				start++;
			}
			System.out.print(Math.abs(K-count) + " ");
			
		}
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T>0)
		{
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[] a = new int[N];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			count(a,K);
			
			T--;
		}
	}
}