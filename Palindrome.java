import java.util.*;

class Palindrome
{
	static void check(String s)
	{
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length/2;i++)
		{
			char temp = ch[ch.length-i-1];
			ch[ch.length-i-1] = ch[i];
			ch[i]=temp;
		}
		
		String str = new String(ch);
		
		
		if(str.equals(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
		
		
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		
		while(t>0)
		{
			int n = scan.nextInt();
			
			String s = scan.next();
			
			check(s);
			
			System.out.println();
			t--;
		}
	}
}