import java.util.*;

class ReverseWords
{
	static void reverse(String s)
	{
		ArrayList l = new ArrayList();
		
		char[] ch = s.toCharArray();
		
		int i=0;
		
		while(i<ch.length)
		{
			
		String str = "";
		while('.'!=ch[i])
		{
			str = str+ch[i];
			i++;
			
			if(i>ch.length-1)
			{
				break;
			}
		}
		
		l.add(str);
		i++;
		
		}
		
		//System.out.println(l);
		
		String a ="";
		
		for(int j=l.size()-1;j>=0;j--)
		{
			if(j==0)
			{
				a=a+l.get(j);
			}
			else
			{
				a =a+l.get(j)+".";
			}
				
			
		}
		
		s = a;
		
		System.out.println(s);
		
		
		
		
		
	}
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t= x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			reverse(s);
			
			System.out.println();
			t--;
		}
	}
}