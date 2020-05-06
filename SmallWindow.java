import java.util.*;

class SmallWindow
{
	static void minWindow(String s)
	{	
		
		char[] ch = s.toCharArray();
		ArrayList<Character> l = new ArrayList<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			if( !(l.contains(ch[i])) )
			{
				l.add(ch[i]);
			}
		}
		
		int k = l.size()-1;
		
		while(k < s.length())
		{
			
			for(int i=0;i<s.length()-k;i++)
			{
				ArrayList<Character> temp = new ArrayList<Character>();
				
				for(int j=i;j<i+k+1 && j<s.length();j++)
				{
					temp.add(ch[j]);
					
				}
				
				if(check(l,temp) )
				{
					System.out.println(temp);
					System.out.println(k+1);
					return;
				}
								
			}
			
			k++;
			
		}
		
		
		
	}
	
	static boolean check(ArrayList<Character> l,ArrayList<Character> temp)
	{
		for(int i=0;i<l.size();i++)
		{
			if( !(temp.contains(l.get(i))) )
			{
				return false;
			}
		}
		
		return true;
	}
		
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			minWindow(s);
			
			t--;
		}
	}
}