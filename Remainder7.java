import java.util.*;

class Remainder7
{
	static int remainder(String s)
	{
		int result = 0;
		
		int val = Integer.valueOf(s);
		
		if(val<7)
		{
			result = val;
		}
		else
		{
			result = val%7;
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
			
			int result = remainder(s);
			
			System.out.println(result);
			
			t--;
		}
	}
}