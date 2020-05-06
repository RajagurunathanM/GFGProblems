import java.util.*;
class Pendulum
{
	static void penfun(int[] a)
	{
		Arrays.sort(a);
		int[] b = new int[a.length];
		int point=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				b[point]=a[i];
				point++;
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				b[point]=a[i];
				point++;
				
			}
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			a[i]=b[i];
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
			
			penfun(a);
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			T--;
		}
	}
}