import java.util.*;

class NextLarger
{
	static void large(int[] a)
	{
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			st.push(a[i]);
		}
		
		System.out.println(st);
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			large(a);
			
			t--;
		}
	}
}