import java.util.*;

class SecondLargest
{
	static void second(int[] a)
	{
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			second(a);
			
			System.out.println();
			
			t--;
		}
	}
}


/*
int max1 = 0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					if(a[j]>max1)
					{
						max1= a[j];
					}
				}
			}
		}
		
		int max2=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i] && a[j]<max1)
				{
					if(a[j]>max2 && a[j]<max1)
					{
						max2= a[j];
					}
				}
			}
		}
		
		System.out.println(max2);
		
		*/
		
		