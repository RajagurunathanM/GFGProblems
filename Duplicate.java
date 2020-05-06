/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Duplicate {
    
    static void removeDuplicate(String s)
    {
        char[] ch = s.toCharArray();
		
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]='0';
					break;
				}
				
			}
        }
        
        for(int i=0;i<ch.length;i++)
        {
			if(ch[i]!='0')
			{
				System.out.print(ch[i]);
			}
        }
        
        
        
        
    }
    
    
	public static void main (String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    int t = x.nextInt();
	    
	    while(t>0)
	    {
	        String a = System.console().readLine();
	        
	        removeDuplicate(a);
	        
	        t--;
	        
	    }
	   
	}
}