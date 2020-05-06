import java.util.*;

class Anagram
{
	public static void main(String args[])
	{
		String s1 = "allergy";
		String s2 = "allergic";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		for(int i = 0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					ch2[j]='0';
					break;
				}
			}
		}
		
		int flag=0;
		
		for(int i=0;i<ch2.length;i++)
		{
			if(ch2[i]=='0')
			{
				continue;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
		
		
	}
}
