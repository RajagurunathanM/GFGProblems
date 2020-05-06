import java.util.*;

class LeaderArray
{
	static void leaderfun(int[] a)
	{
		int flag=0;
		
		for(int i=0;i<a.length;i++)
		{
			flag=0;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.print(a[i]+" ");
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
			
			leaderfun(a);
			System.out.println();
			T--;
		}
	}
}