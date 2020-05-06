import java.util.*;

class ReverseArray
{
	static void reverse(int[] a)
	{
		int start = 0;
		int end = a.length-1;
		
		while(start<end)
		{
			int temp =a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
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
			
			reverse(a);
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			T--;
		}
	}
}