/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxIndex {
    
    static int maximum(int[] a)
    {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
        int max = 0;
        
        for(int i=0;i<a.length-1;i++)
        {
            for(int j =i+1;j<a.length;j++)
            {
            
                if(a[i] <= a[j])
                 {
                    l.add(Math.abs(i-j));
                 }
                
            }
        }
            
        Collections.sort(l);
		
		//System.out.println(l);
        
        return l.get(l.size()-1);

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
	        
	        int result = maximum(a);
	        
	        System.out.println(result);
	        
	        t--;
	    }
	    
	    
	    
	}
}