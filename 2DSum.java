/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class 2DSum {
    
    static int sum(int[][] a,int n1,int n2,int x1,int y1,int x2,int y2)
    {
        int sum = 0;
        
        for(int i= x1-1;i <= x2-1 && i<n1;i++)
        {
            for(int j= y1-1;j <= y2-1 && j<n2;j++)
            {
                sum = sum + a[i][j];
            }
        }
        
        return sum;
        
    }
    
    
	public static void main (String[] args) {
		
		
		Scanner x = new Scanner(System.in);
		
		int t = x.nextInt();
		
		while(t>0)
		{
		    int n1 = x.nextInt();
		    int n2 = x.nextInt();
		    
		    int[][] a = new int[n1][n2];
		    
		    for(int i=0;i<n1;i++)
		    {
		        for(int j=0;j<n2;j++)
		        {
		            a[i][j] = x.nextInt();
		        }
		    }
		    
		    int x1 = x.nextInt();
		    int y1 = x.nextInt();
		    int x2 = x.nextInt();
		    int y2 = x.nextInt();
		    
		    int result = sum(a,n1,n2,x1,y1,x2,y2);
		    
		    System.out.println(result);
		    
		    
		}
	}
}