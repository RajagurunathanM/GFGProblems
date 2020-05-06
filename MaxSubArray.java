import java.util.*;

class MaxSubArray
{
	static void maxsub(int[] a,int K)
	{
		for(int i=0;i<a.length-K+1;i++)
		{
			int end = i+K;
			
			int max1 = a[i];
			
			for(int j=i;j<end-1;j++)
			{
				if(a[j]<a[j+1])
				{
					if(a[j+1]>max1)
					{
						max1=a[j+1];
					}
				}
				
			}
			
			System.out.print(max1+" ");
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
			
			maxsub(a,K);
			
			System.out.println();
			
			T--;
		}
	}
}
	