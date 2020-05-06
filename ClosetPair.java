import java.util.*;

class ClosetPair
{
	static void pair(int[] a,int[] b,int x)
	{
		int diff1=500;
		int pos1 =0;
		int pos2 =0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int sum = a[i]+b[j];
				int diff2 = Math.abs(sum - x);
				
				//System.out.println(diff2);
				
				if(diff2 < diff1)
				{
					diff1 = diff2;
					pos1 = i;
					pos2 = j;
				}
				
			}
		}
		
		System.out.println(a[pos1]+"   "+b[pos2]);
	}
		
		
		
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			int[] a = new int[n1];
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			
			int[] b = new int[n2];
			for(int i=0;i<b.length;i++)
			{
				b[i]=scan.nextInt();
			}
			
			int x = scan.nextInt();
			
			
			pair(a,b,x);
		
			System.out.println();
			
			t--;
		
		}
	}
}