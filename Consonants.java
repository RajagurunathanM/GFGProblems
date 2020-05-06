import java.util.*;
import java.io.*;

class Consonants
{
	static void remove(String s)
	{
		char[] ch = s.toCharArray();
		String str = "";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U' || ch[i]==' ')
			{
				str=str+ch[i];
			}
		}
		
		
		if(str.length()>0)
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("No Vowel");
		}
		
		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			String s= System.console().readLine();
			
			remove(s);
			
			System.out.println();
			t--;
		}
	}
	
}