/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BracketsCheck {
    
    static void check(String s)
    {
        char[] ch = s.toCharArray();
        
        Stack<Character> st = new Stack<Character>();
        
        for(int i=0;i<ch.length;i++)
        {
			if(st.size() == 0)
			{
				st.push(ch[i]);
			}
			else
			{
				if(ch[i] == ')' && st.get(st.size()-1) == '(')          
				{
					st.pop();
				}
				else if(ch[i] == '}' && st.get(st.size()-1) == '{')          
				{
					st.pop();
				}
				else if(ch[i] == ']' && st.get(st.size()-1) == '[')          
				{
					st.pop();
				}
				else 
				{
					st.push(ch[i]);
				}
				
			}
			
        }
		
		if(st.size() == 0)
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}
		
        
        System.out.println(st);
        
    }
    
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
		    String s = x.next();
		    
		    check(s);
		    
		    t--;
		}
		
		
	}
}