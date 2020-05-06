import java.util.*;

class BubbleSort
{
	static void bubble(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=scan.nextInt();
		}
		bubble(a);
		
		for(int i=0;i<N;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
		