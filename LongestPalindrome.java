import java.util.*;

class LongestPalindrome
{
	static void longPalindrome(String s)
	{
		char[] ch = s.toCharArray();
		
		int k=ch.length-1;
		String result ="";
		
		while(k>=1)
		{
			for(int i=0;i<ch.length-k;i++)
			{
				String str ="";
				
				for(int j = i;j<=i+k;j++)
				{
					str=str+ch[j];
				}
				
				
				if(palindrome(str))
				{
					if(str.length() > result.length())
					{
						result = str;
					}
				}
				
				
			}
			
			k--;
		}
		
		
		
		
		System.out.println(result);
		
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
		int t= x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			longPalindrome(s);
			
			t--;
		}
	}
}