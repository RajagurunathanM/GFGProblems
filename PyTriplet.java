import java.util.*;

class PyTriplet
{
	static void triplet(int[] a)
	{
		String str="";
		
		int[] b = new int[a.length];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=(a[i]*a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int val = (a[i]*a[i])+(a[j]*a[j]);
				
				if(val == search(b,val))
				{
					str = "Yes";
					//System.out.println(a[i]+"  "+a[j]);
					break;
				}
			}
		}
		
		if(str.equals("Yes"))
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("No");
		}
		
		
	}
	
	static int search(int[] b,int K)
	{
		int result =-1;
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==K)
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
			
			int[] a = new int[N];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			triplet(a);
			
			System.out.println();
			
			T--;
		}
	}
}
