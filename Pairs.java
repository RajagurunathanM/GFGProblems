/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pairs {
    
    static void pairs(int[] a,int[] b)
    {
        int count =0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(Math.pow(a[i],b[j])  >  Math.pow(b[j],a[i]))
                {
                    count++;
                }
            }
        }
		
		System.out.println(count);
    }
    
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
		    int n1 = x.nextInt();
		    int n2 = x.nextInt();
		    
		    int[] a = new int[n1];
		    int[] b = new int[n2];
			
			for(int i=0;i<n1;i++)
			{
				a[i] = x.nextInt();
			}
			
			for(int j=0;j<n2;j++)
			{
				b[j] = x.nextInt();
			}
		    
		    pairs(a,b);
		    
		    t--;
		}
		
		
		
	}
}