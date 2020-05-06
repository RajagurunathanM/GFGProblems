import java.util.*;

class Closet
{
	static int closetval(int[] a,int K)
	{
		int result =-1;
		
		for(int i=1;i<=a.length;i++)
		{
			if((K+i)==search(a,(K+i)))
			{
				result = K+i;
				break;
			}
			if((K-i)==search(a,(K-i)))
			{
				result = K-i;
				break;
			}
		}
			
		return result;
	}
					

	static int search(int[] a,int K)
	{
		int result=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==K)
			{
				result=K;
				break;
			}
		}
		
		return result;
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
			
		
			int result = closetval(a,K);
			
			System.out.println(result);
			
			T--;
		}
	}
}
