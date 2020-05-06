import java.util.*;

class ValidBrackets
{
	static void valid(String s)
	{
		char[] ch = s.toCharArray();
		System.out.println(s.length());
		
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
				else
				{
					st.push(ch[i]);
				}
			}	
		}
		
		
		//System.out.println(st);
		System.out.println(ch.length - st.size());
		
		
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			String s = x.next();
			
			valid(s);
			
			t--;
		}
	}
}