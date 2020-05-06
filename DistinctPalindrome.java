import java.util.*;

class DistinctPalindrome
{
	static void check(String s)
	{
		char[] ch = s.toCharArray();
		int k =0;
		
		ArrayList<String> l = new ArrayList<String>();
		
		while(k<ch.length)
		{
			for(int i=0;i<ch.length-k;i++)
			{
				String a ="";
				
				for(int j=i;j<=i+k;j++)
				{
					a=a+ch[j];
				}
				
				if(palindrome(a))
				{
					if(!(l.contains(a)))
					{
						l.add(a);
					}
				}
			}
			
			k++;
		}
			
			System.out.println(l);
			
	}
			
			
		
	
	static boolean palindrome(String s)
	{
		boolean result = false;
		
		char[] ch = s.toCharArray();
		int start=0,end=ch.length-1;
		
		while(start<end)
		{
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		
		String sb = new String(ch);
		
		if(sb.equals(s))
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		
		return result;
	}
		
		
		
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			check(s);
			
			
			t--;
		}
	}
}