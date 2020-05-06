/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LG{
    
    static void lcm(long a,long b)
    {
        for(long i=b;i<100000000;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.print(i+" ");
                break;
            }
        }
    }
	
		
	
	static void gcd(long a,long b)
	{
		long min = 0;
		
		if(a<b)
		{
			min = a;
		}
		else
		{
			min = b;
		}
		
		for(long i = min;i>0;i--)
		{
			if(a<b)
			{
				
			if(min%a==0 && b%min==0)
			{
				System.out.print(i);
				break;
			}
			
			}
			else
			{
				if(a%min==0 && min%b==0)
				{
					System.out.print(i);
					break;
				}
			}
				
		}
	}
	
	
    
    
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
		    long a = x.nextInt();
		    long b = x.nextInt();
		    
		    lcm(a,b);
		    gcd(a,b);
		    
		    System.out.println();
		    
		    t--;
		    
		}
		
	}
}