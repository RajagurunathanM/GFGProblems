import java.util.*;

class IPAddress
{
	static void ipCheck(String s)
	{
		char[] ch = s.toCharArray();
		
		int i=0;
		int flag =0;
		while(i<ch.length)
		{
			
		
		int count=0;
		String str ="";
		
		while('.'!=ch[i])
		{
			count++;
			str = str+ch[i];
			i++;
			
			if(i>ch.length-1)
			{
				break;
			}
		}
		
		int val = Integer.valueOf(str);
		
		if(count==3 && (val>=0 && val<=255))
		{
			flag=0;
		}
		else
		{
			flag=1;
			break;
		}
		
		i++;
		}
		
		if(flag==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
		
		
		
		
	}
	
	
	public static void main(String args[])
	{
		
		Scanner x = new Scanner(System.in);
		int t= x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			ipCheck(s);
			
			t--;
		}
	}
}