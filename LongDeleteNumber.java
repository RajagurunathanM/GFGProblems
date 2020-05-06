import java.util.*;

class LongDeleteNumber
{
	static long reduce(long n)
	{
		String s = Long.toString(n);
		
		char[] ch = s.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			if( st.size()>0 && ch[i] == (char)(st.get(st.size()-1)) )
			{
				st.pop();
			}
			else
			{
				st.push(ch[i]);
			}
			
		}
		
		String a ="";
		
		for(int i=0;i<st.size();i++)
		{
			a = a + st.get(i);
		}
		
		
		System.out.println(a);
		
		return 0;
	}
		
		
		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
		    long n = x.nextLong();
		    
		    long val = reduce(n);
		    
		    System.out.println(val);
		   
		    t--;
		}
	}
}