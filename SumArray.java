import java.util.*;

class SumArray
{
	static void sum(int[] a,int K)
	{
		int pos1=-1;
		int pos2=-1;
		
		int x = 2;
		while(x<a.length)
		{
			
		for(int i=0;i<a.length-x+1;i++)
		{
			int sum = 0;
			
			int end = i+x;
			
			for(int j=i;j<end;j++)
			{
				sum=sum+a[j];
				//System.out.print(a[j]+" ");
			}
			
			if(sum==K)
			{
				pos1 = i+1;
				pos2 = end;
				break;
			}
				
		}
		
		x++;
		}
		
		if(pos1!=-1 && pos2!=-1)
		{
			System.out.println(pos1+"   "+pos2);
		}
		else
		{
			System.out.println(-1);
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
			
			sum(a,K);
			
			System.out.println();
			
			T--;
		}
	}
}
