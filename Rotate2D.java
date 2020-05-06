import java.util.*;

class Rotate2D
{
	static void rotate(int[][] a)
	{
		int[][] b = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=a[j][i];
					
			}
			
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				a[i][j]=b[i][j];
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=b.length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");	
			}
		}
		
					
		
		
	}
				
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
		
		int[][] a = new int[n][n];
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = x.nextInt();
			}
		}
		
		rotate(a);
		
		System.out.println();
		
		t--;
		}
		
		
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				