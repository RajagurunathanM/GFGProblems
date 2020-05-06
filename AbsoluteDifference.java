import java.util.*;

class AbsoluteDifference
{
	static void difference(int[] a,int K)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<K && a[i]>10)
			{
				if(a[i]==rev(a[i]))
				{
					System.out.print(a[i]+" ");
				}
				
			}
		}
	}
	
	static int rev(int a)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		int n = a;
		int count=0;
		while(n>0)
		{
			int r1 = n%10;
			l.add(r1);
			n = n/10;
			count++;
		}
		
		int val =0;
		
		for(int i=0;i<l.size()-1;i++)
		{
			int diff = Math.abs(l.get(i) - l.get(i+1));
			val = val+diff;
			
		}
		
		int result = Math.abs(count-val);
		
		if(result==1)
		{
			result = a;
		}
		else
		{
			result =-1;
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
			
			difference(a,K);
			
			System.out.println();
			
			T--;
		}
	}
}
