import java.util.*;

class ReverseGroups11
{
	
	
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
			
			int x = reversegroup(a,K);
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			T--;
		}
	}
}