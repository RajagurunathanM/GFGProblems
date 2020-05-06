/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxSum {
    
    static void maxsum(int[] a)
    {
		int max = a[0];
		
        for(int i=0;i<a.length;i++)
		{
			int presum = 0;
			
			for(int j=i;j<a.length;j++)
			{
				int current_sum = presum + a[j];
				
				if(current_sum > max)
				{
					max = current_sum;
				}
				
				presum = current_sum;
				
			}
			
		}
		
		System.out.println(max);		
        
        
        
    }
    
    
    
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
		    int n = x.nextInt();
		    int[] a = new int[n];
		    
		    for(int i=0;i<a.length;i++)
		    {
		        a[i]= x.nextInt();
		        
		    }
		    
		    maxsum(a);
		    
		    t--;
		}
		
		
		
	}
}