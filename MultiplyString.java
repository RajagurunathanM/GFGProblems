import java.util.*;

class MultiplyString
{
	static String mul(String s1,String s2)
	{
		int result = Integer.valueOf(s1) * Integer.valueOf(s2);
		return String.valueOf(result);
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t=x.nextInt();
		
		while(t>0)
		{
			String s1 = x.next();
			String s2 = x.next();
			
			String result = mul(s1,s2);
			System.out.println(result);
			
			t--;
		}
	}
}