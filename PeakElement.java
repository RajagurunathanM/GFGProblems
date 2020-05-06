import java.util.*;

class PeakElement
{
	static void peakfun(int[] a)
	{
		int count=0;
		
		if(a[0] > a[1])
		{
			count++;
			System.out.println("peak at 0");
		}
		if(a[a.length-1] > a[a.length-2])
		{
			count++;
			System.out.println("peak at "+ (a.length -1 ));
		}
		
		for(int i=1;i<a.length-2;i++)
		{
			int end = i+2;
			
			for(int j=i+1;j<end;j++)
			{
				if(a[j]>a[i] && a[j]>a[j+1])
				{
					count++;
					System.out.println(j+"th position");
				}
			}
		}
		
		System.out.println("TOTAL PEAK ELEMENTS "+count);
		
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
			
			peakfun(a);
		
			System.out.println();
			
			t--;
		
		}
	}
}