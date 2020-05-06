import java.util.*;

class LeftRotate
{
	static void leftrotate(int[] a,int d)
	{
		int start = 0;
		int end = d-1;
		
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		
		start = d;
		end = a.length-1;
		
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		
		start = 0;
		end = a.length-1;
		
		while(start < end)
		{
			int temp = a[start];
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
			for(int i=0;i<N;i++)
			{
				a[i]=scan.nextInt();
			}
			int d = scan.nextInt();
			
			leftrotate(a,d);
			
			for(int i=0;i<N;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			T--;
		}
	}
}