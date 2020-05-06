import java.util.*;

class BooleanMatrix
{
	static void change(int r,int c,int[][] a)
	{
		int[][] b = new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j] == 1)
				{
					modify(i,j,r,c,b);
				}
			}
			
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}
	
	static void modify(int x,int y,int r,int c,int[][] a)
	{
		for(int i=0;i<c;i++)
		{
			a[x][i]=1;
		}
		
		
		for(int i=0;i<r;i++)
		{
			a[i][y]=1;
		}
		
	}
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int r = x.nextInt();
			int c = x.nextInt();
			
			int[][] a = new int[r][c];
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j] = x.nextInt();
				}
			}
			
			change(r,c,a);
			
			t--;
		}
	}
}