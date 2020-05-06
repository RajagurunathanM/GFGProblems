import java.util.*;

class InOut
{
	static void find(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		for(int i=0;i<a.size();i++)
		{
			if( !(b.contains(a.get(i))) )
			{
				System.out.print(a.get(i)+" ");
			}
		}
		
		System.out.println();
	}
	
	public static void main(String arg[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n1 = x.nextInt();
			int n2 = x.nextInt();
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			
			for(int i=0;i<n1;i++)
			{
				int val = x.nextInt();
				a.add(val);
			}
			
			for(int i=0;i<n2;i++)
			{
				int val = x.nextInt();
				b.add(val);
			}
			
			find(a,b);
			
			t--;
		}
	}
}
			
			