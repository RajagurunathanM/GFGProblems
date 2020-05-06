import java.util.*;

class CommonString
{
	static void common(String s1,String s2)
	{
		char[] ch1 = s1.toCharArray();
		
		int k=0;
		String result="";
		
		while(k<ch1.length)
		{
			
			for(int i=0;i<ch1.length-k;i++)
			{
				String str ="";
				
				for(int j=i;j<=i+k;j++)
				{
					str = str+ch1[j];
				}
				
				//System.out.print(str+" ");
				
				if(check(str,s2))
				{
					if(str.length() >= result.length())
					{
						result = str;
					}
				}
				
				
				
			}
			
			//System.out.println();
			
			k++;
		}
		
		System.out.println(result.length());
		
	}
	
	static boolean check(String s,String s2)
	{
		char[] ch = s2.toCharArray();
		
		int k = s.length()-1;
		
		boolean result = false;
		
		for(int i=0;i<ch.length-k;i++)
		{
			String a ="";
			
			for(int j=i;j<=i+k;j++)
			{
				a = a+ch[j];
			}
			
			if(a.equals(s))
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
			
		
		
		
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int l1 = x.nextInt();
			int l2 = x.nextInt();
			
			String s1 = x.next();
			String s2 = x.next();
			
			common(s1,s2);
			
			t--;
		}
	}
}