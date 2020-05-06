import java.util.*;

class SpiralMatrix
{
	/*
	static void firstrow(int[][] a,int r,int c,int fixed,int start,int end)
	{
		for(int i = start;i<end;i++)
		{
			System.out.print(a[fixed][i]+" ");
		}
		
	}
	
	
	static void lastcolumn(int[][] a,int r,int c,int fixed,int start,int end)
	{
		for(int i=start;i<end;i++)
		{
			System.out.print(a[i][fixed]+" ");
		}
		
	} 
	
	static void lastrow(int[][] a,int r,int c,int fixed,int start,int end)
	{
		for(int i=start;i>=end;i--)
		{
			System.out.print(a[fixed][i]+" ");
		}
		
	} 	
	
	static void firstcolumn(int[][] a,int r,int c,int fixed,int start,int end)
	{
		for(int i=start;i>=end;i--)
		{
			System.out.print(a[i][fixed]+" ");
		}
	}	

	*/
	static void spiral(int[][] a,int r,int c)
	{
		/*int end = 0;
		if(r %2 == 0)
		{
			end = r/2;
		}
		else
		{
			end = (r/2)+1;
		}
		
		for(int k=0;k<end;k++)
		{
			if(k == r/2)
			{
				firstrow(a , r , c , k , k , c-k);
				break;
			}
			
			firstrow(a , r , c , k , k , c-k);
			lastcolumn(a , r , c , c-k-1 , k+1 , r-k);
			lastrow(a , r , c , r-k-1 , c-k-2 , k);
			firstcolumn(a ,r , c , k , r-k-2 , k+1);
		}*/
		
		int lowrow = 0,lowcolumn = 0,highrow = r-1,highcoulmn = c-1;
		
		while(lowrow <= highrow && lowcolumn <= highcoulmn)
		{
			
			for(int i=lowcolumn;i<=highcoulmn;i++)
			{
				System.out.print(a[lowrow][i]+" ");
			}
			lowrow++;
			
			for(int i=lowrow;i<=highrow;i++)
			{
				System.out.print(a[i][highcoulmn]+" ");
			}
			highcoulmn--;
			
			if(lowrow <= highrow)
			{
				for(int i=highcoulmn;i>=lowcolumn;i--)
				{
					System.out.print(a[highrow][i]+" ");
				}
				
				highrow--;
			}
			
			if(lowcolumn <= highcoulmn)
			{
				for(int i=highrow;i>=lowrow;i--)
				{
					System.out.print(a[i][lowcolumn]+" ");
				}
				lowcolumn++;
			}
			
		}
				
	}
		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int r = x.nextInt();
			int c = x.nextInt();
			
			int[][] a = new int[r][c];
			
			int z = 1;
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j] = z;
					z++;
				}
			}
			
			spiral(a,r,c);
			
			System.out.println();
			
			t--;
		}
	}
	
}