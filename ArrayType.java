import java.util.*;

class ArrayType
{
	static void type(int[] a)
	{
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					if(a[j]>max)
					{
						max=a[j];
					}
				}
			}
		}
		
		
		
		if(0==ascendingfun(a))
		{
			System.out.println(max+" "+"1");
		}
		else if(0==descendingfun(a))
		{
			System.out.println(max+" "+"2");
		}
		else if(ascendingRotate(a).equals("ascending rotated"))
		{
			System.out.println(max+" "+"4");
		}
		else          //if(descendingRotate(a).equals("descending rotated"))
		{
			System.out.println(max+" "+"3");
		}
		
	}
	
		static String descendingRotate(int[] a)
		{
		String result="";
		
		if(a[0] < a[a.length-1])
		{
		aa: for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						result = "descending rotated";
						break aa;
					}
				}
			}
		}
		
		return result;
		}
		
		
		
		static String ascendingRotate(int[] a)
		{
		String result="";
		
		if(a[0] > a[a.length-1])
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						result = "ascending rotated";
						break;
					}
				}
			}
		}
		
		return result;
		}
		
		
	static int ascendingfun(int[] a)
	{
		int flag=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		
		return flag;
	}
	
	static int descendingfun(int[] a)
	{
		int flag=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		return flag;
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
			
			type(a);
			
			System.out.println();
			
			T--;
		}
	}
}


