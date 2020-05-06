/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Repeat {
    
    static void missrepeat(int[] a)
    {
        int miss = 0;
        int repeat = 0;
        
        for(int i=1;i<=a.length;i++)
        {
            if( search(i,a) )
			{
				continue;
			}
			else
			{
				miss = i;
			}
		}
        
        
        
    aa: for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    repeat = a[i];
                    break aa;
                }
            }
        }
        
        System.out.println(repeat+" "+miss);
        
        
    }
	
	static boolean search(int val,int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
				return true;
			}
		}
		
		return false;
		
	}
    
    
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
	    int t = x.nextInt();
	    
	    while(t>0)
	    {
	        int n = x.nextInt();
	        
	        int[] a = new int[n];
	        
	        
	        for(int i=0;i<n;i++)
	        {
	            a[i]=x.nextInt();
	        }
	        
	        missrepeat(a);
	        
	        
	        t--;
	    }
	    
		
	}
}