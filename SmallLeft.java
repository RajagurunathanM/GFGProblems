import java.util.*;

class SmallLeft
{	
	static void small(int[] a)
	{
		int min = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.print(-1+" ");
		
		for(int i=0;i<a.length;i++)
		{
			if(st.size() == 0)
			{
				st.push(a[i]);
			}
			else if(a[i] > st.get(st.size()-1))
			{
				if(st.get(st.size()-1) > min)
				{
					min = st.get(st.size()-1);
				}
				//else
				//{
					
				
				System.out.print(min+" ");
				st.push(a[i]);
			}
			else if(a[i] < st.get(st.size()-1) && a[i] > min)
			{
				System.out.print(min+" ");
				st.push(a[i]);
			}
			else
			{
				System.out.print(-1+" ");
			}
				
		}
		
		System.out.println();
		
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
			
			small(a);
			
			t--;
		}
	}
}