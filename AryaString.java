import java.util.*;

class AryaString
{
	static void indexCheck(String s,int k,int l,char c)
	{
		String a = "";
		
		for(int i=0;i<k;i++)
		{
			a= a+s;
		}
		
		char[] ch = a.toCharArray();
		
		int count =0;
		
		for(int i=0;i<l;i++)
		{
			if(c==ch[i])
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			int k = x.nextInt();
			int l = x.nextInt();
			char c = x.next().charAt(0);
			
			indexCheck(s,k,l,c);
			t--;
		}
	}
}